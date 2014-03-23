package com.iku.odeme.data.ZCA_F013;
public class Zher_Banka_LogType extends com.sap.aii.proxy.framework.core.AbstractType{

    private  static final com.sap.aii.proxy.framework.core.BaseTypeDescriptor staticDescriptor ;

    private  static final com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo = new com.sap.aii.proxy.framework.core.GenerationInfo("2.0", 1395328634016L) ;

    private  Zher_Banka_LogType.MetaData metadata = new MetaData(this) ;

    static {
        com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor = createNewBaseTypeDescriptor(com.sap.aii.proxy.framework.core.XsdlConstants.XSDL_COMPLEX_TYPE, "urn:sap-com:document:sap:rfc:functions", "ZHER_BANKA_LOG", 13, 0, com.iku.odeme.data.ZCA_F013.Zher_Banka_LogType.class, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO, "ZHER_BANKA_LOG", 568, 1136, -1, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<s0:type name=\"ZHER_BANKA_LOG\" xmlns:s0=\"urn:sap-com:document:sap:rfc:functions\"><ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"TR\">Ödeme ekranı Banka Log</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>100</ifr:sourceClient><ifr:release>702 </ifr:release><ifr:category>structure</ifr:category><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2><ifr:isFlatStructure>false</ifr:isFlatStructure></ifr:properties><ifr:definition><ifr:internalLength1>568</ifr:internalLength1><ifr:internalLength2>1136</ifr:internalLength2></ifr:definition></ifr:container></s0:type>");
        descriptorSetElementProperties(descriptor, 0, "MANDT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Mandt", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "MANDT", 0, 0, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"MANDT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"TR\">Üst birim</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>0</ifr:offset1><ifr:offset2>0</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"MANDT\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CLNT</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 1, "OGRENCINO", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Ogrencino", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "12"}}, "OGRENCINO", 3, 6, -1, 12, 24, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"OGRENCINO\" category=\"simple\"><ifr:descriptor><ifr:description language=\"TR\">Öğrencinin numarası</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>3</ifr:offset1><ifr:offset2>6</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"PIQSTUDENT12\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>12</ifr:length><ifr:internalLength1>12</ifr:internalLength1><ifr:internalLength2>24</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>12</ifr:outputLength><ifr:conversionExit>PIQST</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 2, "BANKAKOD", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Bankakod", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "BANKAKOD", 15, 30, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"BANKAKOD\" category=\"simple\"><ifr:descriptor><ifr:description language=\"TR\">3 baytlık alan</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>15</ifr:offset1><ifr:offset2>30</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"CHAR3\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 3, "ODEMEID", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Odemeid", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "30"}}, "ODEMEID", 18, 36, -1, 30, 60, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"ODEMEID\" category=\"simple\"><ifr:descriptor><ifr:description language=\"TR\">30 karakter</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>18</ifr:offset1><ifr:offset2>36</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"CHAR30\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>30</ifr:length><ifr:internalLength1>30</ifr:internalLength1><ifr:internalLength2>60</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>30</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 4, "AUTHCODE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Authcode", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "50"}}, "AUTHCODE", 48, 96, -1, 50, 100, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"AUTHCODE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"TR\">Açıklama</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>48</ifr:offset1><ifr:offset2>96</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"CHAR50\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>50</ifr:length><ifr:internalLength1>50</ifr:internalLength1><ifr:internalLength2>100</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>50</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 5, "RESPONSE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Response", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "50"}}, "RESPONSE", 98, 196, -1, 50, 100, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"RESPONSE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"TR\">Açıklama</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>98</ifr:offset1><ifr:offset2>196</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"CHAR50\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>50</ifr:length><ifr:internalLength1>50</ifr:internalLength1><ifr:internalLength2>100</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>50</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 6, "STATUS", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Status", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "STATUS", 148, 296, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"STATUS\" category=\"simple\"><ifr:descriptor><ifr:description language=\"TR\">Tek basamaklı gösterge</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>148</ifr:offset1><ifr:offset2>296</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"CHAR1\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 7, "HOSTREFNUM", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Hostrefnum", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "50"}}, "HOSTREFNUM", 149, 298, -1, 50, 100, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"HOSTREFNUM\" category=\"simple\"><ifr:descriptor><ifr:description language=\"TR\">Açıklama</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>149</ifr:offset1><ifr:offset2>298</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"CHAR50\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>50</ifr:length><ifr:internalLength1>50</ifr:internalLength1><ifr:internalLength2>100</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>50</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 8, "PROCRETURNCODE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Procreturncode", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "50"}}, "PROCRETURNCODE", 199, 398, -1, 50, 100, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"PROCRETURNCODE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"TR\">Açıklama</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>199</ifr:offset1><ifr:offset2>398</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"CHAR50\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>50</ifr:length><ifr:internalLength1>50</ifr:internalLength1><ifr:internalLength2>100</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>50</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 9, "TRANSID", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Transid", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "50"}}, "TRANSID", 249, 498, -1, 50, 100, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"TRANSID\" category=\"simple\"><ifr:descriptor><ifr:description language=\"TR\">Açıklama</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>249</ifr:offset1><ifr:offset2>498</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"CHAR50\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>50</ifr:length><ifr:internalLength1>50</ifr:internalLength1><ifr:internalLength2>100</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>50</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 10, "ERRMSG", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Errmsg", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "255"}}, "ERRMSG", 299, 598, -1, 255, 510, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"ERRMSG\" category=\"simple\"><ifr:descriptor><ifr:description language=\"TR\">Char255</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>299</ifr:offset1><ifr:offset2>598</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"CHAR255\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>255</ifr:length><ifr:internalLength1>255</ifr:internalLength1><ifr:internalLength2>510</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>255</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 11, "TARIH", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:date", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Tarih", java.sql.Date.class, null, new java.lang.String[][]{}, "TARIH", 554, 1108, -1, 8, 16, -1, com.sap.mw.jco.JCO.TYPE_DATE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"TARIH\" category=\"simple\"><ifr:descriptor><ifr:description language=\"TR\">Tarih</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>554</ifr:offset1><ifr:offset2>1108</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"DATUM\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DATS</ifr:type><ifr:abapType>D</ifr:abapType><ifr:length>8</ifr:length><ifr:internalLength1>8</ifr:internalLength1><ifr:internalLength2>16</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 12, "SAAT", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:time", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Saat", java.sql.Time.class, null, new java.lang.String[][]{}, "SAAT", 562, 1124, -1, 6, 12, -1, com.sap.mw.jco.JCO.TYPE_TIME, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"SAAT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"TR\">Saat</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:offset1>562</ifr:offset1><ifr:offset2>1124</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"UZEIT\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>TIMS</ifr:type><ifr:abapType>T</ifr:abapType><ifr:length>6</ifr:length><ifr:internalLength1>6</ifr:internalLength1><ifr:internalLength2>12</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>8</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        staticDescriptor = descriptor;
    }
    public  Zher_Banka_LogType () {
        super(staticDescriptor, staticGenerationInfo, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    protected  Zher_Banka_LogType (com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor, com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo, int connectionType) {
        super(descriptor, staticGenerationInfo, connectionType);
    }

    public java.lang.String getOdemeid() {
        return (java.lang.String)baseTypeData().getElementValueAsString(3);
    }

    public void setMandt(java.lang.String Mandt) {
        baseTypeData().setElementValue(0, Mandt);
    }

    public void setTransid(java.lang.String Transid) {
        baseTypeData().setElementValue(9, Transid);
    }

    public void setOdemeid(java.lang.String Odemeid) {
        baseTypeData().setElementValue(3, Odemeid);
    }

    public java.lang.String getOgrencino() {
        return (java.lang.String)baseTypeData().getElementValueAsString(1);
    }

    public java.lang.String getHostrefnum() {
        return (java.lang.String)baseTypeData().getElementValueAsString(7);
    }

    public java.lang.String getErrmsg() {
        return (java.lang.String)baseTypeData().getElementValueAsString(10);
    }

    public java.lang.String getResponse() {
        return (java.lang.String)baseTypeData().getElementValueAsString(5);
    }

    public void setResponse(java.lang.String Response) {
        baseTypeData().setElementValue(5, Response);
    }

    public void setOgrencino(java.lang.String Ogrencino) {
        baseTypeData().setElementValue(1, Ogrencino);
    }

    public MetaData metadata() {
        return metadata;
    }

    public java.lang.String getProcreturncode() {
        return (java.lang.String)baseTypeData().getElementValueAsString(8);
    }

    public java.sql.Date getTarih() {
        return (java.sql.Date)baseTypeData().getElementValueAsDate(11);
    }

    public void setErrmsg(java.lang.String Errmsg) {
        baseTypeData().setElementValue(10, Errmsg);
    }

    public void setStatus(java.lang.String Status) {
        baseTypeData().setElementValue(6, Status);
    }

    public void setProcreturncode(java.lang.String Procreturncode) {
        baseTypeData().setElementValue(8, Procreturncode);
    }

    public java.lang.String getTransid() {
        return (java.lang.String)baseTypeData().getElementValueAsString(9);
    }

    public java.lang.String getMandt() {
        return (java.lang.String)baseTypeData().getElementValueAsString(0);
    }

    public void setBankakod(java.lang.String Bankakod) {
        baseTypeData().setElementValue(2, Bankakod);
    }

    public void setSaat(java.sql.Time Saat) {
        baseTypeData().setElementValue(12, Saat);
    }

    public java.lang.String getAuthcode() {
        return (java.lang.String)baseTypeData().getElementValueAsString(4);
    }

    public java.sql.Time getSaat() {
        return (java.sql.Time)baseTypeData().getElementValueAsTime(12);
    }

    public java.lang.String getBankakod() {
        return (java.lang.String)baseTypeData().getElementValueAsString(2);
    }

    public java.lang.String getStatus() {
        return (java.lang.String)baseTypeData().getElementValueAsString(6);
    }

    public void setTarih(java.sql.Date Tarih) {
        baseTypeData().setElementValue(11, Tarih);
    }

    public void setHostrefnum(java.lang.String Hostrefnum) {
        baseTypeData().setElementValue(7, Hostrefnum);
    }

    public void setAuthcode(java.lang.String Authcode) {
        baseTypeData().setElementValue(4, Authcode);
    }

    public static class MetaData implements java.io.Serializable {
    
        private  Zher_Banka_LogType parent ;
    
        private  static final long serialVersionUID = -386313361L ;
    
        protected  MetaData (Zher_Banka_LogType parent) {
            this.parent = parent;
            
        }
    
        public com.sap.aii.proxy.framework.core.JcoMetaData getMandt() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(0);
        }
    
        public com.sap.aii.proxy.framework.core.JcoMetaData getOdemeid() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(3);
        }
    
        public com.sap.aii.proxy.framework.core.JcoMetaData getAuthcode() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(4);
        }
    
        public com.sap.aii.proxy.framework.core.TypeMetaData typeMetadata() {
            return (com.sap.aii.proxy.framework.core.TypeMetaData)parent.baseTypeMetaData();
        }
    
        public com.sap.aii.proxy.framework.core.JcoMetaData getSaat() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(12);
        }
    
        public com.sap.aii.proxy.framework.core.JcoMetaData getBankakod() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(2);
        }
    
        public com.sap.aii.proxy.framework.core.JcoMetaData getOgrencino() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(1);
        }
    
        public com.sap.aii.proxy.framework.core.JcoMetaData getStatus() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(6);
        }
    
        public com.sap.aii.proxy.framework.core.JcoMetaData getHostrefnum() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(7);
        }
    
        public com.sap.aii.proxy.framework.core.JcoMetaData getErrmsg() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(10);
        }
    
        public com.sap.aii.proxy.framework.core.JcoMetaData getResponse() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(5);
        }
    
        public com.sap.aii.proxy.framework.core.JcoMetaData getProcreturncode() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(8);
        }
    
        public com.sap.aii.proxy.framework.core.JcoMetaData getTarih() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(11);
        }
    
        public com.sap.aii.proxy.framework.core.JcoMetaData getTransid() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(9);
        }
    
    }

}
