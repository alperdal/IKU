package com.iku.odeme.data.odemeKayit;
public class Zca_Odeme_Denklestirme_Input extends com.sap.aii.proxy.framework.core.AbstractType{

    private  static final com.sap.aii.proxy.framework.core.BaseTypeDescriptor staticDescriptor ;

    private  static final com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo = new com.sap.aii.proxy.framework.core.GenerationInfo("2.0", 1394712836373L) ;

    private  Zca_Odeme_Denklestirme_Input.MetaData metadata = new MetaData(this) ;

    static {
        com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor = createNewBaseTypeDescriptor(com.sap.aii.proxy.framework.core.XsdlConstants.WSDL_MESSAGE_FOR_JCO, "urn:sap-com:document:sap:rfc:functions", "ZCA_ODEME_DENKLESTIRME.Input", 8, 0, com.iku.odeme.data.odemeKayit.Zca_Odeme_Denklestirme_Input.class, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO, "ZCA_ODEME_DENKLESTIRME", 0, 0, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"TR\">Ödeme Denkleştirme (Portal Tarafında Kullanılan)</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>100</ifr:sourceClient><ifr:release>702 </ifr:release><ifr:package>ZHER</ifr:package><ifr:akhNode /><ifr:released>no</ifr:released><ifr:outbound>false</ifr:outbound><ifr:synchronous>true</ifr:synchronous><ifr:asynchronous>false</ifr:asynchronous><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2></ifr:properties><ifr:definition /></ifr:container>");
        descriptorSetElementProperties(descriptor, 0, "BANKA", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 1, 1, false, null, "Banka", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "3"}}, "BANKA", 0, 0, -1, 3, 6, -1, com.sap.mw.jco.JCO.TYPE_CHAR, com.sap.mw.jco.JCO.IMPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"BANKA\"><ifr:descriptor><ifr:description language=\"TR\">3 baytlık alan</ifr:description></ifr:descriptor><ifr:definition><ifr:scalarType name=\"CHAR3\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>3</ifr:length><ifr:internalLength1>3</ifr:internalLength1><ifr:internalLength2>6</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>3</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition><ifr:properties><ifr:direction>in</ifr:direction><ifr:class>import</ifr:class><ifr:type>scalar</ifr:type><ifr:optional>false</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 1, "BLDAT", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:date", "urn:sap-com:document:sap:rfc:functions", false, 1, 1, false, null, "Bldat", java.sql.Date.class, null, new java.lang.String[][]{}, "BLDAT", 0, 0, -1, 8, 16, -1, com.sap.mw.jco.JCO.TYPE_DATE, com.sap.mw.jco.JCO.IMPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"BLDAT\"><ifr:descriptor><ifr:description language=\"TR\">Belge tarihi</ifr:description></ifr:descriptor><ifr:definition><ifr:scalarType name=\"BLDAT\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DATS</ifr:type><ifr:abapType>D</ifr:abapType><ifr:length>8</ifr:length><ifr:internalLength1>8</ifr:internalLength1><ifr:internalLength2>16</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition><ifr:properties><ifr:direction>in</ifr:direction><ifr:class>import</ifr:class><ifr:type>scalar</ifr:type><ifr:optional>false</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 2, "BUDAT", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:date", "urn:sap-com:document:sap:rfc:functions", false, 1, 1, false, null, "Budat", java.sql.Date.class, null, new java.lang.String[][]{}, "BUDAT", 0, 0, -1, 8, 16, -1, com.sap.mw.jco.JCO.TYPE_DATE, com.sap.mw.jco.JCO.IMPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"BUDAT\"><ifr:descriptor><ifr:description language=\"TR\">Belgedeki kayıt tarihi</ifr:description></ifr:descriptor><ifr:definition><ifr:scalarType name=\"BUDAT_KK\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>DATS</ifr:type><ifr:abapType>D</ifr:abapType><ifr:length>8</ifr:length><ifr:internalLength1>8</ifr:internalLength1><ifr:internalLength2>16</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition><ifr:properties><ifr:direction>in</ifr:direction><ifr:class>import</ifr:class><ifr:type>scalar</ifr:type><ifr:optional>false</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 3, "GPART", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 1, 1, false, null, "Gpart", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "10"}}, "GPART", 0, 0, -1, 10, 20, -1, com.sap.mw.jco.JCO.TYPE_CHAR, com.sap.mw.jco.JCO.IMPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"GPART\"><ifr:descriptor><ifr:description language=\"TR\">Muhatap numarası</ifr:description></ifr:descriptor><ifr:definition><ifr:scalarType name=\"BU_PARTNER\"><ifr:properties><ifr:helpValuesSupported>true</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>10</ifr:length><ifr:internalLength1>10</ifr:internalLength1><ifr:internalLength2>20</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>10</ifr:outputLength><ifr:conversionExit>ALPHA</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition><ifr:properties><ifr:direction>in</ifr:direction><ifr:class>import</ifr:class><ifr:type>scalar</ifr:type><ifr:optional>false</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 4, "KANAL", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 1, 1, false, null, "Kanal", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "1"}}, "KANAL", 0, 0, -1, 1, 2, -1, com.sap.mw.jco.JCO.TYPE_CHAR, com.sap.mw.jco.JCO.IMPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"KANAL\"><ifr:descriptor><ifr:description language=\"TR\">Tek basamaklı gösterge</ifr:description></ifr:descriptor><ifr:definition><ifr:scalarType name=\"CHAR1\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>1</ifr:length><ifr:internalLength1>1</ifr:internalLength1><ifr:internalLength2>2</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>1</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition><ifr:properties><ifr:direction>in</ifr:direction><ifr:class>import</ifr:class><ifr:type>scalar</ifr:type><ifr:optional>false</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 5, "TAKSIT", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Taksit", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "2"}}, "TAKSIT", 0, 0, -1, 2, 4, -1, com.sap.mw.jco.JCO.TYPE_CHAR, com.sap.mw.jco.JCO.IMPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"TAKSIT\"><ifr:descriptor><ifr:description language=\"TR\">Versiyon numarası bileşenleri</ifr:description></ifr:descriptor><ifr:definition><ifr:scalarType name=\"CHAR2\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>2</ifr:length><ifr:internalLength1>2</ifr:internalLength1><ifr:internalLength2>4</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>2</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition><ifr:properties><ifr:direction>in</ifr:direction><ifr:class>import</ifr:class><ifr:type>scalar</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 6, "WAERS", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 1, 1, false, null, "Waers", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "5"}}, "WAERS", 0, 0, -1, 5, 10, -1, com.sap.mw.jco.JCO.TYPE_CHAR, com.sap.mw.jco.JCO.IMPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"WAERS\"><ifr:descriptor><ifr:description language=\"TR\">İşlem para birimi</ifr:description></ifr:descriptor><ifr:definition><ifr:scalarType name=\"BLWAE_KK\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CUKY</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>5</ifr:length><ifr:internalLength1>5</ifr:internalLength1><ifr:internalLength2>10</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>5</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition><ifr:properties><ifr:direction>in</ifr:direction><ifr:class>import</ifr:class><ifr:type>scalar</ifr:type><ifr:optional>false</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 7, "ODEMETAB", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Odemetab", com.iku.odeme.data.odemeKayit.util.Zca_Banka_OdemeType_List.class, new com.iku.odeme.data.odemeKayit.Zca_Banka_OdemeType(), new java.lang.String[][]{}, "ODEMETAB", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"ODEMETAB\"><ifr:descriptor><ifr:description language=\"TR\">Banka Ödeme Bilgisi</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"ZCA_BANKA_ODEME\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=ZCA_BANKA_ODEME\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>false</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        staticDescriptor = descriptor;
    }
    protected  Zca_Odeme_Denklestirme_Input (com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor, com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo, int connectionType) {
        super(descriptor, staticGenerationInfo, connectionType);
    }

    public  Zca_Odeme_Denklestirme_Input () {
        super(staticDescriptor, staticGenerationInfo, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    public void setBudat(java.sql.Date Budat) {
        baseTypeData().setElementValue(2, Budat);
    }

    public void setWaers(java.lang.String Waers) {
        baseTypeData().setElementValue(6, Waers);
    }

    public void setGpart(java.lang.String Gpart) {
        baseTypeData().setElementValue(3, Gpart);
    }

    public void setTaksit(java.lang.String Taksit) {
        baseTypeData().setElementValue(5, Taksit);
    }

    public void setOdemetab(com.iku.odeme.data.odemeKayit.util.Zca_Banka_OdemeType_List Odemetab) {
        baseTypeData().setElementValue(7, Odemetab);
    }

    public java.sql.Date getBldat() {
        return (java.sql.Date)baseTypeData().getElementValueAsDate(1);
    }

    public java.lang.String getWaers() {
        return (java.lang.String)baseTypeData().getElementValueAsString(6);
    }

    public void setBldat(java.sql.Date Bldat) {
        baseTypeData().setElementValue(1, Bldat);
    }

    public java.lang.String getBanka() {
        return (java.lang.String)baseTypeData().getElementValueAsString(0);
    }

    public java.sql.Date getBudat() {
        return (java.sql.Date)baseTypeData().getElementValueAsDate(2);
    }

    public void setKanal(java.lang.String Kanal) {
        baseTypeData().setElementValue(4, Kanal);
    }

    public java.lang.String getKanal() {
        return (java.lang.String)baseTypeData().getElementValueAsString(4);
    }

    public com.iku.odeme.data.odemeKayit.util.Zca_Banka_OdemeType_List get_as_listOdemetab() {
        return (com.iku.odeme.data.odemeKayit.util.Zca_Banka_OdemeType_List)baseTypeData().getElementValue(7);
    }

    public MetaData metadataZca_Odeme_Denklestirme_Input() {
        return metadata;
    }

    public void setOdemetab(com.iku.odeme.data.odemeKayit.Zca_Banka_OdemeType[] Odemetab) {
        baseTypeData().setElementValue(7, new com.iku.odeme.data.odemeKayit.util.Zca_Banka_OdemeType_List());
        com.iku.odeme.data.odemeKayit.util.Zca_Banka_OdemeType_List list$ = get_as_listOdemetab();
        for (int  i$ = 0; i$ < Odemetab.length; i$++){
         list$.addZca_Banka_OdemeType(Odemetab[ i$]);
        }
    }

    public java.lang.String getTaksit() {
        return (java.lang.String)baseTypeData().getElementValueAsString(5);
    }

    public void setBanka(java.lang.String Banka) {
        baseTypeData().setElementValue(0, Banka);
    }

    public java.lang.String getGpart() {
        return (java.lang.String)baseTypeData().getElementValueAsString(3);
    }

    public com.iku.odeme.data.odemeKayit.Zca_Banka_OdemeType[] getOdemetab() {
        com.iku.odeme.data.odemeKayit.util.Zca_Banka_OdemeType_List i$ = (com.iku.odeme.data.odemeKayit.util.Zca_Banka_OdemeType_List)baseTypeData().getElementValue(7);
        if ( i$ == null){return null;}
        return  i$.toArrayZca_Banka_OdemeType();
    }

    public static class MetaData implements java.io.Serializable {
    
        private  Zca_Odeme_Denklestirme_Input parent ;
    
        private  static final long serialVersionUID = -386313361L ;
    
        protected  MetaData (Zca_Odeme_Denklestirme_Input parent) {
            this.parent = parent;
            
        }
    
        public com.sap.aii.proxy.framework.core.JcoMetaData getBudat() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(2);
        }
    
        public com.sap.aii.proxy.framework.core.JcoMetaData getBanka() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(0);
        }
    
        public com.sap.aii.proxy.framework.core.JcoMetaData getKanal() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(4);
        }
    
        public com.sap.aii.proxy.framework.core.TypeMetaData typeMetadata() {
            return (com.sap.aii.proxy.framework.core.TypeMetaData)parent.baseTypeMetaData();
        }
    
        public com.sap.aii.proxy.framework.core.JcoMetaData getTaksit() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(5);
        }
    
        public com.sap.aii.proxy.framework.core.JcoMetaData getBldat() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(1);
        }
    
        public com.sap.aii.proxy.framework.core.JcoMetaData getWaers() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(6);
        }
    
        public com.sap.aii.proxy.framework.core.JcoMetaData getGpart() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(3);
        }
    
        public com.sap.aii.proxy.framework.core.JcoMetaData getOdemetab() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(7);
        }
    
    }

}
