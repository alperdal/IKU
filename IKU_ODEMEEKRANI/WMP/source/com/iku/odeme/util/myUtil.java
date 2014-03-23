/***********************************************************************
*&B:Utility Class                               *
*                                                                      *
*&G: �zkan �nay - 30.7.2008                                            *
*                                                                      *
*                                                                      *
*&K: 																   *
*                                                                      *
*&A: Util class
***********************************************************************/

package com.iku.odeme.util;

import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.CharacterIterator;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.text.StringCharacterIterator;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.TimeZone;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.json.simple.JSONObject;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.sap.security.api.IUser;
import com.sap.security.api.UMFactory;


public class myUtil {
	Log log = LogFactory.getLog(myUtil.class);
	
	public myUtil()
	{
		
	}		
	
	public static String convertNullToEmpty(String value)
	{
		return (value==null ? "" : value);
	}
	
	public static boolean isStringParameterEmpty(String value)
	{
		return (value==null || "".equals(value) ? true : false);
	}
	
	public static String getInternalLinkURL(HttpServletRequest request, HttpServletResponse response) {

		String url = request.getRequestURL().toString();
		String sonuc = url.split("/")[2];
		
//		if (request.getRequestURL().toString().substring(7,15).equals("vesporpr"))
//			url = "http://vesporpr.zh.corp:50000";
//		else if (request.getRequestURL().toString().substring(7,15).equals("vespordv"))
//			url = "http://vespordv.zh.corp:50000";
//		else
//			url = "https://portal.vestel.com.tr";	 
		
		return sonuc;
	}		 
	 
	
	public static String getAy(int ay)
	{

		String[] aylar={"Ocak","Şubat","Mart","Nisan","Mayıs","Haziran","Temmuz","Ağustos","Eylül","Ekim","Kasım","Aralık"};
		String sonuc="";
	
		if(ay>=1 && ay <=12)
		{
			sonuc= aylar[ay-1].toString();
		}
		else
		{
			sonuc= ""; 
		} 
	
		return sonuc;
	}
	public static String getStackTrace(StackTraceElement[] se)
	{
		StringBuffer sb=new StringBuffer();
			    
		for(int s=0;s<se.length;s++)
		{			
			sb.append(se[s].toString());
		}
	    
		return sb.toString();
	}
	
	public static String getFormatDateddmmyyyy(Date date)
	{
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return sdf.format(date);
	}
	/**
	 * 
	 * @param strDate
	 * @param format ( null => dd/MM/yyyy)
	 * @return
	 */
	public static Date getFormatStrToDate(String strDate,String format)
	{
		if(format==null || "".equals(format)) format = "dd/MM/yyyy";
		
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		Date date = null;
		
		try { date = new Date(sdf.parse(strDate).getTime()); }
		catch (ParseException e) { date = null; }
		
		return date;
	}
	
	
	public static String getFormatDate(Date date)
	{
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return sdf.format(date);
	}
	
	public static String getFormatDate(Date date,String format)
	{
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.format(date);
	}	
	
	public static String getFormatDate(java.util.Date date,String format)
	{
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.format(date);
	}	
	
	public static String getFormatTime(Timestamp ts)
	{
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
		return sdf.format(ts);
	}
		

	public static String getFormatDecimal(String str,int digit)
	{
		if(str==null || "".equals(str)) 
			return "0";
		
		String sonuc = "";
		DecimalFormat money = new DecimalFormat("0.000");
		double amount = Double.parseDouble(str);
		sonuc = (money.format(amount).toString());
		
		NumberFormat nf2 = NumberFormat.getInstance(Locale.GERMAN);
		nf2.setMaximumFractionDigits(digit);
		nf2.setMinimumFractionDigits(digit);
		sonuc = nf2.format(amount);
		
		return sonuc;
	}
	

	public static String[] getTurkishAlphabet()
	{
		String[] alph={"a", "b","c", "ç", "d", "e", "f", "g", "ğ", "h", "ı", "i", "j", "k", "l", "m", "n","o", "ö", "p", "r", "s", "ş", "t", "u", "ü", "v", "y", "z"};
		
		return alph;
	}

	
	public static String getFormatSapDate(java.sql.Date date)
	{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		return sdf.format(date);
	}
	
	public static String getFormatSapTime(java.sql.Date date)
	{
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:dd");
		return sdf.format(date);
	}
	
	public static String getLatinToTurkish(String str) {
		try {	    
   		  
			 return (new String(str.getBytes("ISO-8859-1"),"UTF-8"));
   		  
		 }catch (Exception e) {			   
		   return str;
		 }
   }
   
   public static String getXmlValue(Element el, String NodeName) {
	   String xmlValue = "";

	   if (el.getElementsByTagName(NodeName) != null) {
		   NodeList nodeAd = el.getElementsByTagName(NodeName);

		   if ((Element) nodeAd.item(0) != null) {
			   Element adelm = (Element) nodeAd.item(0);
			   NodeList nlad = adelm.getChildNodes();
			   if (((Node) nlad.item(0)) != null) {
				   xmlValue = ((Node) nlad.item(0)).getNodeValue().toString();
			   }
		   }
	   }
	   return xmlValue;
   }
	   
   public static String getToday()
   {		
	   java.util.Date now = new java.util.Date();	
		
	   java.text.Format formatter;
	   formatter = new java.text.SimpleDateFormat("dd/MM/yyyy");
	   String bugunTar = formatter.format(now);
		
	   return bugunTar;
   }  

      
   public static String decode(String str)

   {

	  str=str.replaceAll("%u0130","İ");

	  str=str.replaceAll("%u0131","ı");

	  str=str.replaceAll("%u015E","Ş");

	  str=str.replaceAll("%u015F","ş");

	  str=str.replaceAll("%u011E","Ğ");

	  str=str.replaceAll("%u011F","ğ");

	  return str;

   }
 
 
   public static String GetMagazaTip(String str){
	
	  String sonuc = "2";
	  String[] yolavalues = new String[] {"Nişantaşı Mağaza","Caddebostan Mağaza","Florya Mağaza","Ankara Mağaza","İzmir Mağaza","Adana Mağaza"}; 

	
	 for(int i=0;i<yolavalues.length;i++){
		if (str.equals(yolavalues[i]))
			sonuc = "1";
		}

	  return sonuc;

   }  
   
 
 
 



 
   public static IUser getPortalUser(HttpServletRequest req,HttpServletResponse res)
   {
	   com.sap.security.api.IUser sapUser = com.sap.security.api.UMFactory.getAuthenticator().getLoggedInUser(req,res);
	   return sapUser;
   }
  
   public static boolean userInRoleControl(String roleName,HttpServletRequest request,HttpServletResponse response)
   {
	   boolean inRole=false;		

	   IUser user =UMFactory.getAuthenticator().getLoggedInUser(request,response);

	   if(user!=null)				
	   {
		   inRole = user.isMemberOfRole(roleName,false);
	   }
		
	   return inRole;
   }	 
	
   /*------------------------------------------------------------------------*/
   public static String para2BigDecimal(String _str) {

	   BigDecimal bigDecimalSonuc = null;
	   StringTokenizer st = null;
	   String result = "";

	   if(_str == null) return result;

	   try {

		   st = new StringTokenizer(_str, ".");

		   while (st.hasMoreTokens()) {

			   result += st.nextToken();
		   }
            
	   } catch (NumberFormatException e) {

		   // e.printStackTrace();
	   }
        
	   return result.replace(',','.');
   }

   /*------------------------------------------------------------------------*/
   public static String bigDecimal2Para(BigDecimal _bigDecimalPara) {

   String ondalikKisim = null;
   if(_bigDecimalPara == null) return ondalikKisim;
	   
	   if(_bigDecimalPara.scale()>2)
		_bigDecimalPara = _bigDecimalPara.setScale(2,2);
	   
	   char[] arrTamSayiKisimRakamlar = null;
	   String bigDecimalParaToString = _bigDecimalPara.toString();
	   StringBuffer strBufTamSayiKisim = new StringBuffer();
        
	   int ondalikNoktaIndex = bigDecimalParaToString.indexOf(".");

	   if (ondalikNoktaIndex >= 0) {

		   ondalikKisim = bigDecimalParaToString.substring(ondalikNoktaIndex);
		   arrTamSayiKisimRakamlar = (bigDecimalParaToString.substring(0,
				   ondalikNoktaIndex)).toCharArray();
	   } else {

		   ondalikKisim = ".00";
		   arrTamSayiKisimRakamlar = bigDecimalParaToString.toCharArray();
	   }

	   int j = 0;

	   for (int i = arrTamSayiKisimRakamlar.length - 1; i >= 0; i--, j++) {

		   strBufTamSayiKisim.append(arrTamSayiKisimRakamlar[i]);

		   if ((((j - 2) % 3) == 0) & (i > 0)) {
			   strBufTamSayiKisim.append('.');
		   }
	   }
        
	   return strBufTamSayiKisim.reverse().toString() + ondalikKisim.replace('.',',');
   }
   
   public static String escapeForHTML(String aText){
		 final StringBuffer result = new StringBuffer();
		 final StringCharacterIterator iterator = new StringCharacterIterator(aText);
		 char character =  iterator.current();
		 while (character != CharacterIterator.DONE ){
		   if (character == '<') {
			 result.append("&lt;");
		   }
		   else if (character == '>') {
			 result.append("&gt;");
		   }
		   else if (character == '&') {
			 result.append("&amp;");
		  }
		   else if (character == '\"') {
			 result.append("&quot;");
		   }
		   else if (character == '\t') {
			 addCharEntity(9, result);
		   }
		   else if (character == '!') {
			 addCharEntity(33, result);
		   }
		   else if (character == '#') {
			 addCharEntity(35, result);
		   }
		   else if (character == '$') {
			 addCharEntity(36, result);
		   }
		   else if (character == '%') {
			 addCharEntity(37, result);
		   }
		   else if (character == '\'') {
			 addCharEntity(39, result);
		   }
		   else if (character == '(') {
			 addCharEntity(40, result);
		   }
		   else if (character == ')') {
			 addCharEntity(41, result);
		   }
		   else if (character == '*') {
			 addCharEntity(42, result);
		   }
		   else if (character == '+') {
			 addCharEntity(43, result);
		   }
		   else if (character == ',') {
			 addCharEntity(44, result);
		   }
		   else if (character == '-') {
			 addCharEntity(45, result);
		   }
		   else if (character == '.') {
			 addCharEntity(46, result);
		   }
		   else if (character == '/') {
			 addCharEntity(47, result);
		   }
		   else if (character == ':') {
			 addCharEntity(58, result);
		   }
		   else if (character == ';') {
			 addCharEntity(59, result);
		   }
		   else if (character == '=') {
			 addCharEntity(61, result);
		   }
		   else if (character == '?') {
			 addCharEntity(63, result);
		   }
		   else if (character == '@') {
			 addCharEntity(64, result);
		   }
		   else if (character == '[') {
			 addCharEntity(91, result);
		   }
		   else if (character == '\\') {
			 addCharEntity(92, result);
		   }
		   else if (character == ']') {
			 addCharEntity(93, result);
		   }
		   else if (character == '^') {
			 addCharEntity(94, result);
		   }
		   else if (character == '_') {
			 addCharEntity(95, result);
		   }
		   else if (character == '`') {
			 addCharEntity(96, result);
		   }
		   else if (character == '{') {
			 addCharEntity(123, result);
		   }
		   else if (character == '|') {
			 addCharEntity(124, result);
		   }
		   else if (character == '}') {
			 addCharEntity(125, result);
		   }
		   else if (character == '~') {
			 addCharEntity(126, result);
		   }
		   else {
			 //the char is not a special one
			 //add it to the result as is
			 result.append(character);
		   }
		   character = iterator.next();
		 }
		 return result.toString();
	  }  
	  
	private static void addCharEntity(int aIdx, StringBuffer aBuilder){
	   String padding = "";
	   if( aIdx <= 9 ){
		  padding = "00";
	   }
	   else if( aIdx <= 99 ){
		 padding = "0";
	   }
	   else {
		 //no prefix
	   }
	   String number = padding + Integer.toString(aIdx);
	   aBuilder.append("&#" + number + ";");
	 }
	 
	 public static String setParagraph(String string,boolean toHtml)
	 {
	 	if(toHtml)
	 		return string.replaceAll("\n","<br/>");
	 	else
			return string.replaceAll("<br/>","\n");
	 }
	 
	public Object convertFromJSONtoInput(JSONObject job,Class inputcls)
	{
		String fieldname = "";		
		Time time = null; 
		Date date = null;
		Class noparams[] = {};
 				
		Class[] paramString = new Class[1];	
		paramString[0] = String.class;

		Class[] paramDate = new Class[1];	
		paramDate[0] = Date.class;
		
		
		Object obj = null;
		Method[] mtd = inputcls.getMethods();
		
		try {
			obj = inputcls.newInstance();
		} catch (InstantiationException e1) {	
			log.error(e1.getMessage()+ "\n\r" + myUtil.getStackTrace(e1.getStackTrace()));
			return null;		
		} catch (IllegalAccessException e1) {
			log.error(e1.getMessage()+ "\n\r" + myUtil.getStackTrace(e1.getStackTrace()));
			return null;			
		}
		BigDecimal bd = null;
		String strDate = "";
		for(int i=0;i<mtd.length;i++)
		{
			if(mtd[i].getName().startsWith("set"))
			{
				fieldname = mtd[i].getName().substring(3);
				fieldname = fieldname.toUpperCase(new Locale("EN"));
				
				try
				{
					
					Class param = mtd[i].getParameterTypes()[0];
					
					if(param.getName().equals(Date.class.getName()))
					{						
						if(job.get(fieldname)!=null)
						{
							
							strDate = job.get(fieldname).toString();
							if(job.get(fieldname).toString().indexOf("/")>-1)	
								date = myUtil.getFormatStrToDate(job.get(fieldname).toString().substring(0,10) + " 10:00:00","dd/MM/yyyy HH:mm:ss");								
							else
							{
								strDate = strDate.replaceAll("T", " ");
								strDate = strDate.replaceAll("Z", "");
								
								SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
								java.util.Date dtUtil = sdf.parse(strDate);							
								dtUtil.setHours(dtUtil.getHours()+2);
								date = new Date(dtUtil.getTime());
							}
							/*if(job.get(fieldname).toString().indexOf("/")>-1)							
								date = myUtil.getFormatStrToDate(job.get(fieldname).toString().substring(0,10) + " 10:00:00","dd/MM/yyyy HH:mm:ss");
							else if(job.get(fieldname).toString().length()==8)
								date = myUtil.getFormatStrToDate(job.get(fieldname).toString() + " 10:00","yyyyMMdd HH:mm:ss");
							else
								date = myUtil.getFormatStrToDate(job.get(fieldname).toString().substring(0,10) + " 10:00:00","yyyy-MM-dd HH:mm:ss");
							*/
							Object[] pobj = {date}; 
							mtd[i].invoke(obj,pobj);
						}
					}
					else if(param.getName().equals(java.sql.Time.class.getName()))
					{
						
						if(job.get(fieldname)!=null && job.get(fieldname).toString().indexOf(":")!=-1)
						{
							String[] timeStr = job.get(fieldname).toString().split(":");
							time = new Time(Integer.parseInt(timeStr[0]),Integer.parseInt(timeStr[1]),Integer.parseInt(timeStr[2]));
							Object[] pobj = {time}; 
							mtd[i].invoke(obj,pobj);
						}
						
					}
					else if(param.getName().equals(BigDecimal.class.getName()))
					{
						if(job.get(fieldname)!=null)
						{
							Object[] pobj = { new BigDecimal(job.get(fieldname).toString()) };
							mtd[i].invoke(obj,pobj);
						}
					}
					else if(param.getName().equals(String.class.getName()))
					{
						if(job.get(fieldname)!=null)
						{
							Object[] pobj = {new String(job.get(fieldname).toString())}; 
							mtd[i].invoke(obj,pobj);
						}
					}
					
					
				}
				catch(Exception e)
				{
					log.error(e.getMessage()+ "\n\r" + myUtil.getStackTrace(e.getStackTrace()));
				}
				
			}
			
		}
		
		
		return obj;
	}
	
	public JSONObject convertFromOutputtoJSON(Object objToConvert)
	{
			String fieldname = "";		
			JSONObject job = new JSONObject();
			Class noparams[] = {};
 					
			Class inputcls = objToConvert.getClass();			
			Method[] umtd = inputcls.getMethods();
			
			for(int i=0;i<umtd.length;i++)
			{
				if(umtd[i].getName().startsWith("get") && !"getClass".equals(umtd[i].getName()))
				{
					fieldname = umtd[i].getName().substring(3);
					fieldname = fieldname.toUpperCase(new Locale("EN"));
					
					try
					{
						Class param = umtd[i].getReturnType();
						if(param!=null)
						{
							
						
							Object obj = umtd[i].invoke(objToConvert,noparams);
							
							if(obj!=null && !job.containsKey(fieldname))
							{							
								if(param.getName().equals(Date.class.getName()))	
								{
									job.put(fieldname,myUtil.getFormatDate(((Date)obj),"dd/MM/yyyy"));	
								}
								else if(param.getName().equals(java.sql.Time.class.getName()))
								{
									
									job.put(fieldname,myUtil.getFormatDate((java.sql.Time)obj,"HH:mm:ss"));		
								}
								else if(param.getName().equals(BigDecimal.class.getName()))
								{
									job.put(fieldname,myUtil.bigDecimal2Para((BigDecimal)obj));									
								}
								else
								{	
									job.put(fieldname,obj); 
								} 
							}
						}
					}
					catch(Exception e)
					{
						log.error(e.getMessage()+ "\n\r" + myUtil.getStackTrace(e.getStackTrace()));
					}
					
				}
			
			}
			
		
		
			return job;
		}	
}
