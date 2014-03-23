package com.iku.odeme.action.odeme.taksit;
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

import com.iku.odeme.data.ZCA_F006.ZCA_F006_PortType;
import com.iku.odeme.data.ZCA_F006.Zca_F006_Fault_Exception;
import com.iku.odeme.data.ZCA_F006.Zca_F006_Input;
import com.iku.odeme.data.ZCA_F006.Zca_F006_Output;
import com.iku.odeme.data.ZCA_F006.Zca_S_F006Type;
import com.iku.odeme.data.ZCA_F006.util.Zca_S_F006Type_List;
import com.iku.odeme.util.SapDBUtil;
import com.iku.odeme.util.epUtil;
import com.iku.odeme.util.myUtil;
import com.sap.aii.proxy.framework.core.ApplicationFaultException;
import com.sap.aii.proxy.framework.core.SystemFaultException;
import com.sap.mw.jco.JCO;
import com.sap.security.api.IUser;

public class TaksitHesapOzet extends HttpServlet {
	protected void doPost(
		HttpServletRequest request,
		HttpServletResponse response)
		throws ServletException, IOException {
		
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
		
		ZCA_F006_PortType zf6port = new ZCA_F006_PortType();
		
		Zca_F006_Input zin = new Zca_F006_Input();
		zin.setI_Uname(userid);
		
		SapDBUtil sutil = new SapDBUtil();
		JCO.Client client = sutil.getJcoCon();
		
		zf6port.messageSpecifier.setJcoClient(client);
		
		try 
		{
			Zca_F006_Output zout = zf6port.zca_F006(zin);
			
			Zca_S_F006Type_List zlist = zout.get_as_listT_Data();
			JSONObject josf6 = null; 
			
			for(Iterator itr = zlist.iterator();itr.hasNext();)
			{
				Zca_S_F006Type ztype = (Zca_S_F006Type)itr.next();
				ja.add(myutil.convertFromOutputtoJSON(ztype));
			}
			
			sutil.disconnect();
			
			joOut.put("taksitList",ja);
			joOut.put("sonuc","S");
			
		} catch (Zca_F006_Fault_Exception e) {
			joOut.put("sonuc","E");
			joOut.put("sonucmsg",e.getZca_F006_Fault().getText());
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

