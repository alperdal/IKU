package com.iku.odeme.data.ZCA_F011;
public class Zher_BankaType extends com.sap.aii.proxy.framework.core.AbstractType{

    private  static final com.sap.aii.proxy.framework.core.BaseTypeDescriptor staticDescriptor ;

    private  static final com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo = new com.sap.aii.proxy.framework.core.GenerationInfo("2.0", 1395222531636L) ;

    private  Zher_BankaType.MetaData metadata = new MetaData(this) ;

    static {
        com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor = createNewBaseTypeDescriptor(com.sap.aii.proxy.framework.core.XsdlConstants.XSDL_COMPLEX_TYPE, "urn:sap-com:document:sap:rfc:functions", "ZHER_BANKA", 10, 0, com.iku.odeme.data.ZCA_F011.Zher_BankaType.class, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO, "ZHER_BANKA", 199, 398, -1, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<s0:type name=\"ZHER_BANKA\" xmlns:s0=\"urn:sap-com:document:sap:rfc:functions\"><ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"TR\">Banka Tablosu</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>100</ifr:sourceClient><ifr:release>702 </ifr:release><ifr:category>structure</ifr:category><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2><ifr:isFlatStructure>false</ifr:isFlatStructure></ifr:properties><ifr:definition><ifr:internalLength1>199</ifr:internalLength1><ifr:internalLength2>398</ifr:internalLength2></ifr:definition></ifr:container></s0:type>");
        descriptorSetElementProperties(descriptor, 0, "MANDT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Mandt", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "MANDT", 0, 0, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"MANDT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"TR\">Üst birim</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:checkTable>T000</ifr:checkTable><ifr:offset1>0</ifr:offset1><ifr:offset2>0</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"MANDT\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CLNT</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 1, "CLIENTID", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Clientid", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "20"}}, "CLIENTID", 3, 6, -1, 20, 40, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"CLIENTID\" category=\"simple\"><ifr:descriptor><ifr:description language=\"TR\">Client Id</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>3</ifr:offset1><ifr:offset2>6</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"ZCLIENTID\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>20</ifr:length><ifr:internalLength1>20</ifr:internalLength1><ifr:internalLength2>40</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>20</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 2, "STOREKEY", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Storekey", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "20"}}, "STOREKEY", 23, 46, -1, 20, 40, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"STOREKEY\" category=\"simple\"><ifr:descriptor><ifr:description language=\"TR\">Store Key</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>23</ifr:offset1><ifr:offset2>46</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"ZSTOREKEY\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>20</ifr:length><ifr:internalLength1>20</ifr:internalLength1><ifr:internalLength2>40</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>20</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 3, "BANKKOD", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Bankkod", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "BANKKOD", 43, 86, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"BANKKOD\" category=\"simple\"><ifr:descriptor><ifr:description language=\"TR\">3 baytlık alan</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>43</ifr:offset1><ifr:offset2>86</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"CHAR3\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 4, "BANKTEXT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Banktext", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "20"}}, "BANKTEXT", 46, 92, -1, 20, 40, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"BANKTEXT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"TR\">Banka</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>46</ifr:offset1><ifr:offset2>92</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"ZBANKTEXT\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>20</ifr:length><ifr:internalLength1>20</ifr:internalLength1><ifr:internalLength2>40</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>20</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 5, "POSTURL", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Posturl", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "100"}}, "POSTURL", 66, 132, -1, 100, 200, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"POSTURL\" category=\"simple\"><ifr:descriptor><ifr:description language=\"TR\">Banka POST URL</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>66</ifr:offset1><ifr:offset2>132</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"ZPOSTURL\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>true</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>100</ifr:length><ifr:internalLength1>100</ifr:internalLength1><ifr:internalLength2>200</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>100</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 6, "FITEXT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Fitext", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "FITEXT", 166, 332, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"FITEXT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"TR\">FI Kaydi atilirken kullanilacak text</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>166</ifr:offset1><ifr:offset2>332</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 7, "HKONT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Hkont", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "HKONT", 176, 352, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"HKONT\" category=\"simple\"><ifr:descriptor><ifr:description language=\"TR\">Defteri kebir muhasebesi ana hesabı</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>176</ifr:offset1><ifr:offset2>352</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"HKONT\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength><ifr:conversionExit>ALPHA</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 8, "HKONT2", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Hkont2", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "HKONT2", 186, 372, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"HKONT2\" category=\"simple\"><ifr:descriptor><ifr:description language=\"TR\">Defteri kebir muhasebesi ana hesabı</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>186</ifr:offset1><ifr:offset2>372</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType name=\"HKONT\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength><ifr:conversionExit>ALPHA</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        descriptorSetElementProperties(descriptor, 9, "VADE", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Vade", java.lang.String.class, null, new java.lang.String[][]{{"pattern", "\\d+"}, {"maxLength", "3"}}, "VADE", 196, 392, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_NUM, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:field name=\"VADE\" category=\"simple\"><ifr:descriptor><ifr:description language=\"TR\">Vade Gün Sayısı</ifr:description></ifr:descriptor><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>196</ifr:offset1><ifr:offset2>392</ifr:offset2></ifr:properties><ifr:definition><ifr:scalarType><ifr:definition><ifr:type>NUMC</ifr:type><ifr:abapType>N</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals></ifr:definition></ifr:scalarType></ifr:definition></ifr:field>");
        staticDescriptor = descriptor;
    }
    protected  Zher_BankaType (com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor, com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo, int connectionType) {
        super(descriptor, staticGenerationInfo, connectionType);
    }

    public  Zher_BankaType () {
        super(staticDescriptor, staticGenerationInfo, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    public java.lang.String getMandt() {
        return (java.lang.String)baseTypeData().getElementValueAsString(0);
    }

    public java.lang.String getBankkod() {
        return (java.lang.String)baseTypeData().getElementValueAsString(3);
    }

    public void setStorekey(java.lang.String Storekey) {
        baseTypeData().setElementValue(2, Storekey);
    }

    public void setBanktext(java.lang.String Banktext) {
        baseTypeData().setElementValue(4, Banktext);
    }

    public java.lang.String getHkont() {
        return (java.lang.String)baseTypeData().getElementValueAsString(7);
    }

    public void setMandt(java.lang.String Mandt) {
        baseTypeData().setElementValue(0, Mandt);
    }

    public void setPosturl(java.lang.String Posturl) {
        baseTypeData().setElementValue(5, Posturl);
    }

    public void setHkont2(java.lang.String Hkont2) {
        baseTypeData().setElementValue(8, Hkont2);
    }

    public java.lang.String getHkont2() {
        return (java.lang.String)baseTypeData().getElementValueAsString(8);
    }

    public void setFitext(java.lang.String Fitext) {
        baseTypeData().setElementValue(6, Fitext);
    }

    public java.lang.String getFitext() {
        return (java.lang.String)baseTypeData().getElementValueAsString(6);
    }

    public void setVade(java.lang.String Vade) {
        baseTypeData().setElementValue(9, Vade);
    }

    public java.lang.String getVade() {
        return (java.lang.String)baseTypeData().getElementValueAsString(9);
    }

    public java.lang.String getBanktext() {
        return (java.lang.String)baseTypeData().getElementValueAsString(4);
    }

    public java.lang.String getPosturl() {
        return (java.lang.String)baseTypeData().getElementValueAsString(5);
    }

    public java.lang.String getClientid() {
        return (java.lang.String)baseTypeData().getElementValueAsString(1);
    }

    public void setBankkod(java.lang.String Bankkod) {
        baseTypeData().setElementValue(3, Bankkod);
    }

    public void setHkont(java.lang.String Hkont) {
        baseTypeData().setElementValue(7, Hkont);
    }

    public MetaData metadata() {
        return metadata;
    }

    public void setClientid(java.lang.String Clientid) {
        baseTypeData().setElementValue(1, Clientid);
    }

    public java.lang.String getStorekey() {
        return (java.lang.String)baseTypeData().getElementValueAsString(2);
    }

    public static class MetaData implements java.io.Serializable {
    
        private  Zher_BankaType parent ;
    
        private  static final long serialVersionUID = -386313361L ;
    
        protected  MetaData (Zher_BankaType parent) {
            this.parent = parent;
            
        }
    
        public com.sap.aii.proxy.framework.core.JcoMetaData getPosturl() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(5);
        }
    
        public com.sap.aii.proxy.framework.core.JcoMetaData getBankkod() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(3);
        }
    
        public com.sap.aii.proxy.framework.core.JcoMetaData getMandt() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(0);
        }
    
        public com.sap.aii.proxy.framework.core.JcoMetaData getHkont() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(7);
        }
    
        public com.sap.aii.proxy.framework.core.JcoMetaData getClientid() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(1);
        }
    
        public com.sap.aii.proxy.framework.core.TypeMetaData typeMetadata() {
            return (com.sap.aii.proxy.framework.core.TypeMetaData)parent.baseTypeMetaData();
        }
    
        public com.sap.aii.proxy.framework.core.JcoMetaData getHkont2() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(8);
        }
    
        public com.sap.aii.proxy.framework.core.JcoMetaData getFitext() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(6);
        }
    
        public com.sap.aii.proxy.framework.core.JcoMetaData getVade() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(9);
        }
    
        public com.sap.aii.proxy.framework.core.JcoMetaData getBanktext() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(4);
        }
    
        public com.sap.aii.proxy.framework.core.JcoMetaData getStorekey() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(2);
        }
    
    }

}
