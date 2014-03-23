package com.iku.odeme.data.odemeKayit;
public class Zca_Odeme_Denklestirme_Output extends com.sap.aii.proxy.framework.core.AbstractType{

    private  static final com.sap.aii.proxy.framework.core.BaseTypeDescriptor staticDescriptor ;

    private  static final com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo = new com.sap.aii.proxy.framework.core.GenerationInfo("2.0", 1394712836374L) ;

    private  Zca_Odeme_Denklestirme_Output.MetaData metadata = new MetaData(this) ;

    static {
        com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor = createNewBaseTypeDescriptor(com.sap.aii.proxy.framework.core.XsdlConstants.WSDL_MESSAGE_FOR_JCO, "urn:sap-com:document:sap:rfc:functions", "ZCA_ODEME_DENKLESTIRME.Output", 3, 0, com.iku.odeme.data.odemeKayit.Zca_Odeme_Denklestirme_Output.class, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO, "ZCA_ODEME_DENKLESTIRME", 0, 0, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"TR\">Ödeme Denkleştirme (Portal Tarafında Kullanılan)</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>100</ifr:sourceClient><ifr:release>702 </ifr:release><ifr:package>ZHER</ifr:package><ifr:akhNode /><ifr:released>no</ifr:released><ifr:outbound>false</ifr:outbound><ifr:synchronous>true</ifr:synchronous><ifr:asynchronous>false</ifr:asynchronous><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2></ifr:properties><ifr:definition /></ifr:container>");
        descriptorSetElementProperties(descriptor, 0, "DOC_NO", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Doc_No", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "12"}}, "DOC_NO", 0, 0, -1, 12, 24, -1, com.sap.mw.jco.JCO.TYPE_CHAR, com.sap.mw.jco.JCO.EXPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"DOC_NO\"><ifr:descriptor><ifr:description language=\"TR\">Sözleşme cari hesabının belge sayısı</ifr:description></ifr:descriptor><ifr:definition><ifr:scalarType name=\"OPBEL_KK\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>12</ifr:length><ifr:internalLength1>12</ifr:internalLength1><ifr:internalLength2>24</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>12</ifr:outputLength><ifr:conversionExit>ALPHA</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition><ifr:properties><ifr:direction>out</ifr:direction><ifr:class>export</ifr:class><ifr:type>scalar</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 1, "RETURN", null, null, "unqualified", "urn:sap-com:document:sap:rfc:functions:BAPIRET2", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Return", com.iku.odeme.data.odemeKayit.Bapiret2Type.class, new com.iku.odeme.data.odemeKayit.Bapiret2Type(), new java.lang.String[][]{}, "RETURN", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_STRUCTURE, com.sap.mw.jco.JCO.EXPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"RETURN\"><ifr:descriptor><ifr:description language=\"TR\">Dönüş parametresi</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"BAPIRET2\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=BAPIRET2\" /></ifr:definition><ifr:properties><ifr:direction>out</ifr:direction><ifr:class>export</ifr:class><ifr:type>structure</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 2, "ODEMETAB", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Odemetab", com.iku.odeme.data.odemeKayit.util.Zca_Banka_OdemeType_List.class, new com.iku.odeme.data.odemeKayit.Zca_Banka_OdemeType(), new java.lang.String[][]{}, "ODEMETAB", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"ODEMETAB\"><ifr:descriptor><ifr:description language=\"TR\">Banka Ödeme Bilgisi</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"ZCA_BANKA_ODEME\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=ZCA_BANKA_ODEME\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>false</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        staticDescriptor = descriptor;
    }
    protected  Zca_Odeme_Denklestirme_Output (com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor, com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo, int connectionType) {
        super(descriptor, staticGenerationInfo, connectionType);
    }

    public  Zca_Odeme_Denklestirme_Output () {
        super(staticDescriptor, staticGenerationInfo, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    public java.lang.String getDoc_No() {
        return (java.lang.String)baseTypeData().getElementValueAsString(0);
    }

    public void setDoc_No(java.lang.String Doc_No) {
        baseTypeData().setElementValue(0, Doc_No);
    }

    public MetaData metadataZca_Odeme_Denklestirme_Output() {
        return metadata;
    }

    public com.iku.odeme.data.odemeKayit.Bapiret2Type getReturn() {
        return (com.iku.odeme.data.odemeKayit.Bapiret2Type)baseTypeData().getElementValue(1);
    }

    public void setOdemetab(com.iku.odeme.data.odemeKayit.util.Zca_Banka_OdemeType_List Odemetab) {
        baseTypeData().setElementValue(2, Odemetab);
    }

    public com.iku.odeme.data.odemeKayit.util.Zca_Banka_OdemeType_List get_as_listOdemetab() {
        return (com.iku.odeme.data.odemeKayit.util.Zca_Banka_OdemeType_List)baseTypeData().getElementValue(2);
    }

    public void setOdemetab(com.iku.odeme.data.odemeKayit.Zca_Banka_OdemeType[] Odemetab) {
        baseTypeData().setElementValue(2, new com.iku.odeme.data.odemeKayit.util.Zca_Banka_OdemeType_List());
        com.iku.odeme.data.odemeKayit.util.Zca_Banka_OdemeType_List list$ = get_as_listOdemetab();
        for (int  i$ = 0; i$ < Odemetab.length; i$++){
         list$.addZca_Banka_OdemeType(Odemetab[ i$]);
        }
    }

    public void setReturn(com.iku.odeme.data.odemeKayit.Bapiret2Type Return) {
        baseTypeData().setElementValue(1, Return);
    }

    public com.iku.odeme.data.odemeKayit.Zca_Banka_OdemeType[] getOdemetab() {
        com.iku.odeme.data.odemeKayit.util.Zca_Banka_OdemeType_List i$ = (com.iku.odeme.data.odemeKayit.util.Zca_Banka_OdemeType_List)baseTypeData().getElementValue(2);
        if ( i$ == null){return null;}
        return  i$.toArrayZca_Banka_OdemeType();
    }

    public static class MetaData implements java.io.Serializable {
    
        private  Zca_Odeme_Denklestirme_Output parent ;
    
        private  static final long serialVersionUID = -386313361L ;
    
        protected  MetaData (Zca_Odeme_Denklestirme_Output parent) {
            this.parent = parent;
            
        }
    
        public com.sap.aii.proxy.framework.core.JcoMetaData getDoc_No() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(0);
        }
    
        public com.sap.aii.proxy.framework.core.JcoMetaData getReturn() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(1);
        }
    
        public com.sap.aii.proxy.framework.core.TypeMetaData typeMetadata() {
            return (com.sap.aii.proxy.framework.core.TypeMetaData)parent.baseTypeMetaData();
        }
    
        public com.sap.aii.proxy.framework.core.JcoMetaData getOdemetab() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(2);
        }
    
    }

}
