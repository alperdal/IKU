package com.iku.odeme.action.odeme.banka;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.sql.Time;
import java.util.Iterator;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.iku.odeme.action.odeme.init.BankalarGet;
import com.iku.odeme.bean.OdemeBean;
import com.iku.odeme.bean.OgrenciBean;
import com.iku.odeme.data.ZCA_F013.Zher_Banka_LogType;
import com.iku.odeme.data.ZCA_F013.util.Zher_Banka_LogType_List;
import com.iku.odeme.data.banka.BankaData;
import com.iku.odeme.util.epUtil;
import com.iku.odeme.util.myUtil;
import com.sap.security.api.IUser;

public class BankaOdemeKontrol extends HttpServlet {
	protected void doPost(
		HttpServletRequest request,
		HttpServletResponse response)
		throws ServletException, IOException {
		//TODO : Implement
		
		request.setCharacterEncoding("UTF-8");	
		response.setContentType("application/json;charset=utf-8");		
		request.setCharacterEncoding("UTF-8");
		response.setHeader("Cache-Control","no-cache");
		response.setHeader("Pragma","no-cache");
		response.setDateHeader ("Expires", 0);
		
		PrintWriter pw = response.getWriter();
		JSONObject joIn = new JSONObject();
		JSONObject joOut = new JSONObject();
		JSONArray ja = new JSONArray();
		JSONParser jparse = new JSONParser();
		myUtil myutil = new myUtil();
		HttpSession session = request.getSession();
		IUser user = epUtil.getUser(request,response);
		
		if(user==null || session.getAttribute("ogrenci")==null) 
		{
			response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
			response.sendError(HttpServletResponse.SC_UNAUTHORIZED);
			return;
		}
		
		String userid = user.getUniqueName();
		if(userid.equalsIgnoreCase("xoonay"))
			userid = "1399019931";
		
		String lang = user.getLocale()==null ? "TR" : user.getLocale().getLanguage().toUpperCase();
		OgrenciBean ob = (OgrenciBean)session.getAttribute("ogrenci");
		
		try {
			joIn = (JSONObject)jparse.parse(request.getReader());
		} catch (IOException e1) {
			joOut.put("sonuc","E");
			joOut.put("sonucmsg","Veri Okunamadı:"+e1.getMessage());
			pw.write(joOut.toJSONString());
			return;
		} catch (ParseException e1) {
			joOut.put("sonuc","E");
			joOut.put("sonucmsg","Veri Okunamadı:"+e1.getMessage());
			pw.write(joOut.toJSONString());
			return;
		}
		
		
		
		
		
		
		OdemeBean odemeB = null;
		if(session.getAttribute("odeme")!=null)
		{
			odemeB = (OdemeBean)session.getAttribute("odeme");
			
			
			
			JSONObject joTaksit = null;
			ja = (JSONArray)joIn.get("taksitler");
			Zher_Banka_LogType_List zlist = new Zher_Banka_LogType_List();
			for(Iterator itr = ja.iterator();itr.hasNext();)
			{
				 joTaksit = (JSONObject)itr.next();
				 Zher_Banka_LogType zlog = (Zher_Banka_LogType)myutil.convertFromJSONtoInput(joTaksit,Zher_Banka_LogType.class);
				 
				 zlog.setAuthcode(odemeB.getAuthCode());
				 zlog.setErrmsg(odemeB.getErrMsg());
				 zlog.setHostrefnum(odemeB.getHostRefNum());
				 zlog.setOdemeid(odemeB.getOdemeID());
				 zlog.setProcreturncode(odemeB.getProcReturnCode());
				 zlog.setResponse(odemeB.getResponse());
				 zlog.setSaat(new Time(System.currentTimeMillis()));
				 zlog.setTarih(new Date(System.currentTimeMillis()));
				 zlog.setTransid(odemeB.getTransId());
				 zlog.setStatus(odemeB.getStatus());
				 
				 zlist.add(zlog);
			}
			
			BankaData bd = new BankaData();
			bd.logKayit(zlist);
			
			joOut.put("odeme",myutil.convertFromOutputtoJSON(odemeB));
			joOut.put("sonuc",odemeB.getStatus());
		}
		else
		{
			joOut.put("sonuc","0");
		}
		
		pw.write(joOut.toJSONString());
	}

}

