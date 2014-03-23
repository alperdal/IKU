<%@ page import="com.iku.odeme.bean.OgrenciBean" %>
<%@ page import="com.iku.odeme.data.banka.BankaData" %>
<%@ page import="com.iku.odeme.data.ZCA_F012.Zher_BankaType" %>
<%@ page import="com.iku.odeme.bean.OdemeBean" %>
<%@page contentType="text/html;charset=UTF-8"%>
<%

    OgrenciBean ob = null;

    if(session.getAttribute("ogrenci")!=null)
    {
        ob = (OgrenciBean)session.getAttribute("ogrenci");
    }
    /************************     GEREKLİ ALANLAR       *****************/

    BankaData bd = new BankaData();

    Zher_BankaType zbanka = bd.getBankaDetay(ob.getBankaClientID());
    ob.setBankaKod(zbanka.getBankkod());
    session.setAttribute("ogrenci",ob);
	

    String clientId = zbanka.getClientid();
    String amount = ob.getOdemeTutar();
    String oid = ob.getPartnerNo()+":"+ob.getBelgeNo();
    String okUrl = "http://sapportdev.iku.edu.tr:50000/odeme/odemesayfasi.jsp";
    String failUrl = "http://sapportdev.iku.edu.tr:50000/odeme/odemesayfasi.jsp?fail";
    String rnd = new java.util.Date().toString();
	

    String taksit = "";
    String islemtipi = "Auth";
    String storekey= zbanka.getStorekey(); //"123456";
	
    String hashstr = clientId + oid + amount + okUrl + failUrl + islemtipi + taksit + rnd + storekey;
    java.security.MessageDigest sha1 = java.security.MessageDigest.getInstance("SHA-1");

    String hash = (new sun.misc.BASE64Encoder()).encode(sha1.digest(hashstr.getBytes()));

%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>3D Hosting</title>
        <script src="js/min/jquery-1.11.0.min.js" type="text/javascript"></script>
        <script type="text/javascript">
            $(document).ready(function() {
               $('#formSanalPos').submit();
            });
        </script>
    </head>
    <body>

        <form id="formSanalPos" method="post" action="<%=zbanka.getPosturl()%>">
            <input type="hidden" name="clientid" value="<%=clientId%>">
            <input type="hidden" name="amount" value="<%=amount%>">

            <input type="hidden" name="oid" value="<%=oid%>">
            <input type="hidden" name="okUrl" value="<%=okUrl%>" >
            <input type="hidden" name="failUrl" value="<%=failUrl%>" >
            <input type="hidden" name="islemtipi" value="<%=islemtipi%>" >
            <input type="hidden" name="taksit" value="<%=taksit%>">
            <input type="hidden" name="rnd" value="<%=rnd%>" >
            <input type="hidden" name="hash" value="<%=hash%>" >

            <input type="hidden" name="storetype" value="3d_pay_hosting" >

            <input type="hidden" name="refreshtime" value="5" >

            <input type="hidden" name="lang" value="tr">
            <input type="hidden" name="firmaadi" value="Kültür Üniversitesi">
            <input type="hidden" name="currency" value="949" >

            <input type="hidden" name="Fismi" value="is">
            <input type="hidden" name="faturaFirma" value="faturaFirma">
            <input type="hidden" name="Fadres" value="XXX">
            <input type="hidden" name="Fadres2" value="XXX">
            <input type="hidden" name="Fil" value="XXX">

            <input type="hidden" name="Filce" value="XXX">
            <input type="hidden" name="Fpostakodu" value="postakod93013">
            <input type="hidden" name="tel" value="XXX">
            <input type="hidden" name="fulkekod" value="tr">

            <input type="hidden" name="nakliyeFirma" value="na fi">
            <input type="hidden" name="tismi" value="XXX">
            <input type="hidden" name="tadres" value="XXX">
            <input type="hidden" name="tadres2" value="XXX">

            <input type="hidden" name="til" value="XXX">
            <input type="hidden" name="tilce" value="XXX">
            <input type="hidden" name="tpostakodu" value="ttt postakod93013">
            <input type="hidden" name="tulkekod" value="usa">

            <input type="hidden" name="itemnumber1" value="a1">
            <input type="hidden" name="productcode1" value="a2">
            <input type="hidden" name="qty1" value="3">
            <input type="hidden" name="desc1" value="a4 desc">
            <input type="hidden" name="id1" value="a5">

            <input type="hidden" name="price1" value="6.25">
            <input type="hidden" name="total1" value="7.50">

            <input type="submit" value="Devam" />

        </form>

    </body>
</html>
