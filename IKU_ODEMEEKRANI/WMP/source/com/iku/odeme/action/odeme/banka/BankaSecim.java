package com.iku.odeme.action.odeme.banka;
import java.io.IOException;
import java.io.PrintWriter;

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
import com.iku.odeme.util.epUtil;
import com.iku.odeme.util.myUtil;
import com.sap.security.api.IUser;

public class BankaSecim extends HttpServlet {
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
		
		
		ob.setBankaClientID(joIn.get("banka").toString());
		ob.setOdemeTutar(joIn.get("tutar").toString());
		ob.setBelgeNo(joIn.get("belgeNo").toString());
		
		session.removeAttribute("odeme");
		
		session.setAttribute("ogrenci",ob);
	}

}

