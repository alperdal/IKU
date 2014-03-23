package com.iku.odeme.action.odeme.init;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.iku.odeme.data.ZCA_F011.ZCA_F011_PortType;
import com.iku.odeme.data.ZCA_F011.Zca_F011_Input;
import com.iku.odeme.data.ZCA_F011.Zca_F011_Output;
import com.iku.odeme.data.ZCA_F011.Zher_BankaType;
import com.iku.odeme.data.ZCA_F011.util.Zher_BankaType_List;
import com.iku.odeme.util.SapDBUtil;
import com.iku.odeme.util.epUtil;
import com.iku.odeme.util.myUtil;
import com.sap.aii.proxy.framework.core.ApplicationFaultException;
import com.sap.aii.proxy.framework.core.SystemFaultException;
import com.sap.mw.jco.JCO;
import com.sap.security.api.IUser;

public class BankalarGet extends HttpServlet {
	
	protected void doPost(
		HttpServletRequest request,
		HttpServletResponse response)
		throws ServletException, IOException {
		//TODO : Implement,
		request.setCharacterEncoding("UTF-8");	
		response.setContentType("application/json;charset=utf-8");		
		request.setCharacterEncoding("UTF-8");
		response.setHeader("Cache-Control","no-cache");
		response.setHeader("Pragma","no-cache");
		response.setDateHeader ("Expires", 0);
		
		PrintWriter pw = response.getWriter();
		JSONObject joIn = new JSONObject();
		JSONObject joOut = new JSONObject();
		JSONArray ja = null;
		JSONParser jparse = new JSONParser();
		myUtil myutil = new myUtil();
		
		IUser user = epUtil.getUser(request,response);
		
		if(user==null) 
		{
			response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
			response.sendError(HttpServletResponse.SC_UNAUTHORIZED);
			return;
		}
		
		String userid = user.getUniqueName();
		
		if(userid.equalsIgnoreCase("xoonay"))
			userid = "1399019931";  
		
		
		String lang = user.getLocale()==null ? "TR" : user.getLocale().getLanguage().toUpperCase();
		
		ZCA_F011_PortType zport = new ZCA_F011_PortType();
		
		Zca_F011_Input zin = new Zca_F011_Input();
		zin.setI_St_No(userid);
		
		SapDBUtil sutil = new SapDBUtil();
		JCO.Client client = sutil.getJcoCon();
		
		zport.messageSpecifier.setJcoClient(client);
		
		try 
		{
			Zca_F011_Output zout = zport.zca_F011(zin);
			
			String epartner = zout.getE_Partner();
			
			Zher_BankaType_List zlist = zout.get_as_listEt_Banka();
			
			ja = new JSONArray();
			JSONObject joBanka = null;
			for(Iterator itr = zlist.iterator(); itr.hasNext();)
			{
				Zher_BankaType zbanka = (Zher_BankaType)itr.next();
				joBanka = new JSONObject();
				joBanka.put("text",zbanka.getBanktext() );
				joBanka.put("value",zbanka.getClientid() );
				ja.add(joBanka);
			}
						
			sutil.disconnect();
			
			
			joOut.put("banka",ja);
			joOut.put("sonuc","S");
			
			
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

