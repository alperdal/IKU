<%@ page import="com.iku.odeme.bean.OdemeBean" %>
<%@page contentType="text/html;charset=UTF-8"%>



<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

   <html>
       <head>
           <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
           <title>3D Hosting Ödeme Sayfası</title>
       </head>
       <body>


    <%
    OdemeBean odemeB = new OdemeBean();

	String [] odemeparametreleri = new String[]{"AuthCode","Response","HostRefNum","ProcReturnCode","TransId","ErrMsg"};
    String hashparams = request.getParameter("HASHPARAMS");
    String hashparamsval = request.getParameter("HASHPARAMSVAL");
    String storekey="xxxxxx";
    String paramsval="";
    int index1=0,index2=0;
    // hash hesaplamada kullanılacak değerler ayrıştırılıp değerleri birleştiriliyor.

   if(hashparams!=null)
   {
        do
        {
            index2 = hashparams.indexOf(":",index1);
            String val = request.getParameter(hashparams.substring(index1,index2)) == null ? "" : request.getParameter(hashparams.substring(index1,index2));
            paramsval += val;
            index1 = index2 + 1;
        }
        while(index1<hashparams.length());
   }


    String hashval = paramsval + storekey;         //elde edilecek hash değeri için paramsval e store key ekleniyor. (işyeri anahtarı)
    String hashparam = request.getParameter("HASH");
    java.security.MessageDigest sha1 = java.security.MessageDigest.getInstance("SHA-1");
        
    String hash = (new sun.misc.BASE64Encoder()).encode(sha1.digest(hashval.getBytes()));




     odemeB.setAuthCode(request.getParameter("AuthCode"));
     odemeB.setResponse(request.getParameter("Response"));
     odemeB.setHostRefNum(request.getParameter("HostRefNum"));
     odemeB.setProcReturnCode(request.getParameter("ProcReturnCode"));
     odemeB.setTransId(request.getParameter("TransId"));
     odemeB.setErrMsg(request.getParameter("ErrMsg"));
	 odemeB.setOdemeID(request.getParameter("oid"));
	 odemeB.setsetMdStatus(request.getParameter("mdStatus"));
	 
	 String mdStatus = request.getParameter("mdStatus"); // 3D işleminin sonucunu gösterir (1,2,3,4) ise başarılı, (5,6,7,8,9,0) işe başarısıdır
	 if(mdStatus!=null && (mdStatus.equals("1") || mdStatus.equals("2") || mdStatus.equals("3")|| mdStatus.equals("4"))) //Başarılı ve ödeme gerçekleştiriliyor
	 {

	     %>
	        <h5>3D İşlemi Başarılı</h5><br/>
	        <h3> Ödeme Sonucu</h3>
	        <table border="1">
	            <tr>
	                <td><b>Parametre İsmi</b></td>
	                <td><b>Parameter Değeri</b></td>
	            </tr>
	            <%
	                for(int i=0;i<odemeparametreleri.length;i++)
	                {
	                    String paramname = odemeparametreleri[i];
	                    String paramval = request.getParameter(paramname);
	                    out.println("<tr><td>"+paramname+"</td><td>"+paramval+"</td></tr>");
	                }
	            
	            %>
	        </table>
	        
	    <%
	    if("Approved".equalsIgnoreCase(request.getParameter("Response")))
	    {
            odemeB.setStatus("S");
	    %>
	        <h6>Ödeme İşlemi Başarılı</h6>
	    <%
	    }else{
            odemeB.setStatus("E");
	        %>
	           <h6>Ödeme İşlemi Başarısız</h6>
	        <%
	    }

	 }else{
            odemeB.setStatus("E");
	     %>
	        <h5>3D İşlemi Başarısız</h5>
	     <%
	 }

	  if(!paramsval.equals(hashparamsval)|| !hash.equals(hashparam)) //oluşturulan hash ile gelen hash ve hash parametreleri değerleri ile ayrıştırılıp edilen edilen aynı olmalı.
	  {
          odemeB.setGuvenlikUyarisi(true);
	        out.println("<h4>Güvenlik Uyarısı. Sayısal İmza Geçerli Değil</h4>");
	  }

      session.setAttribute("odeme",odemeB);
    
    %>       
           
       </body>
       
   </html>