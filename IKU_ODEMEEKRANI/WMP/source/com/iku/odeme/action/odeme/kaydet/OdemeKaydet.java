package com.iku.odeme.action.odeme.kaydet;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.iku.odeme.bean.OgrenciBean;
import com.iku.odeme.data.odemeKayit.ZCA_ODEME_DENKLESTIRME_PortType;
import com.iku.odeme.data.odemeKayit.Zca_Banka_OdemeType;
import com.iku.odeme.data.odemeKayit.Zca_Odeme_Denklestirme_Input;
import com.iku.odeme.data.odemeKayit.Zca_Odeme_Denklestirme_Output;
import com.iku.odeme.data.odemeKayit.util.Zca_Banka_OdemeType_List;
import com.iku.odeme.util.SapDBUtil;
import com.iku.odeme.util.epUtil;
import com.iku.odeme.util.myUtil;
import com.sap.aii.proxy.framework.core.ApplicationFaultException;
import com.sap.aii.proxy.framework.core.SystemFaultException;
import com.sap.mw.jco.JCO;
import com.sap.security.api.IUser;

public class OdemeKaydet extends HttpServlet {
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
				
		JSONObject joOdeme = (JSONObject)joIn.get("odemeBankaSonuc");
		
		
		ZCA_ODEME_DENKLESTIRME_PortType zport = new  ZCA_ODEME_DENKLESTIRME_PortType();
		
		Zca_Odeme_Denklestirme_Input zin = new Zca_Odeme_Denklestirme_Input();
		
		zin.setKanal("B");
		zin.setBldat(new Date(System.currentTimeMillis()));
		zin.setBudat(new Date(System.currentTimeMillis()));
		zin.setGpart(ob.getPartnerNo());
		zin.setTaksit("1");
		zin.setBanka(ob.getBankaKod());
		
		
		//Ödeme Verileri Input
		JSONObject joTaksit = null;
		ja = (JSONArray)joIn.get("taksitler");
		Zca_Banka_OdemeType_List zlist = new Zca_Banka_OdemeType_List();
		for(Iterator itr = ja.iterator();itr.hasNext();)
		{
			 joTaksit = (JSONObject)itr.next();
			 Zca_Banka_OdemeType zbodemeType = (Zca_Banka_OdemeType)myutil.convertFromJSONtoInput(joTaksit,Zca_Banka_OdemeType.class);
			 zlist.add(zbodemeType);
		}
		zin.setOdemetab(zlist);
		
		zin.setWaers(joTaksit.get("WAERS").toString());
		
		//Bitti
		
		SapDBUtil sutil = new SapDBUtil();
		JCO.Client client = sutil.getJcoCon();

		zport.messageSpecifier.setJcoClient(client);
		
		try {
			Zca_Odeme_Denklestirme_Output zout = zport.zca_Odeme_Denklestirme(zin);
			
			joOut.put("DOC_NO",zout.getDoc_No());
			joOut.put("RETURN",myutil.convertFromOutputtoJSON(zout.getReturn()));
			joOut.put("sonuc","S");
			
			session.removeAttribute("odeme");
			
		} catch (SystemFaultException e) {
			joOut.put("sonuc","E");
			joOut.put("sonucmsg",e.getMessage());
		} catch (ApplicationFaultException e) {
			joOut.put("sonuc","E");
			joOut.put("sonucmsg",e.getMessage());
		}
		
		pw.write(joOut.toJSONString());
		
	}

}

