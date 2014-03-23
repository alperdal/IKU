package com.iku.odeme.data.ZCA_F008;
public class Zca_F008_Output extends com.sap.aii.proxy.framework.core.AbstractType{

    private  static final com.sap.aii.proxy.framework.core.BaseTypeDescriptor staticDescriptor ;

    private  static final com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo = new com.sap.aii.proxy.framework.core.GenerationInfo("2.0", 1394712539495L) ;

    private  Zca_F008_Output.MetaData metadata = new MetaData(this) ;

    static {
        com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor = createNewBaseTypeDescriptor(com.sap.aii.proxy.framework.core.XsdlConstants.WSDL_MESSAGE_FOR_JCO, "urn:sap-com:document:sap:rfc:functions", "ZCA_F008.Output", 2, 0, com.iku.odeme.data.ZCA_F008.Zca_F008_Output.class, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO, "ZCA_F008", 0, 0, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"TR\">Ödeme planı kayıt</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>100</ifr:sourceClient><ifr:release>702 </ifr:release><ifr:package>ZFI</ifr:package><ifr:akhNode /><ifr:released>no</ifr:released><ifr:outbound>false</ifr:outbound><ifr:synchronous>true</ifr:synchronous><ifr:asynchronous>false</ifr:asynchronous><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2></ifr:properties><ifr:definition /></ifr:container>");
        descriptorSetElementProperties(descriptor, 0, "DOCNO", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 0, 1, false, null, "Docno", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "12"}}, "DOCNO", 0, 0, -1, 12, 24, -1, com.sap.mw.jco.JCO.TYPE_CHAR, com.sap.mw.jco.JCO.EXPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"DOCNO\"><ifr:descriptor><ifr:description language=\"TR\">Sözleşme cari hesabının belge sayısı</ifr:description></ifr:descriptor><ifr:definition><ifr:field name=\"BAPIINSTPLN_KEY.DOC_NO\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>0</ifr:offset1><ifr:offset2>0</ifr:offset2></ifr:properties></ifr:field><ifr:scalarType name=\"OPBEL_KK\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>12</ifr:length><ifr:internalLength1>12</ifr:internalLength1><ifr:internalLength2>24</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>12</ifr:outputLength><ifr:conversionExit>ALPHA</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition><ifr:properties><ifr:direction>out</ifr:direction><ifr:class>export</ifr:class><ifr:type>scalar</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 1, "T_DATA", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "T_Data", com.iku.odeme.data.ZCA_F008.util.Zca_S_F007Type_List.class, new com.iku.odeme.data.ZCA_F008.Zca_S_F007Type(), new java.lang.String[][]{}, "T_DATA", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"T_DATA\"><ifr:descriptor><ifr:description language=\"TR\">ZCA_PORTAL: F007 func.için strc.</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"ZCA_S_F007\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=ZCA_S_F007\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>false</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        staticDescriptor = descriptor;
    }
    public  Zca_F008_Output () {
        super(staticDescriptor, staticGenerationInfo, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    protected  Zca_F008_Output (com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor, com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo, int connectionType) {
        super(descriptor, staticGenerationInfo, connectionType);
    }

    public void setT_Data(com.iku.odeme.data.ZCA_F008.Zca_S_F007Type[] T_Data) {
        baseTypeData().setElementValue(1, new com.iku.odeme.data.ZCA_F008.util.Zca_S_F007Type_List());
        com.iku.odeme.data.ZCA_F008.util.Zca_S_F007Type_List list$ = get_as_listT_Data();
        for (int  i$ = 0; i$ < T_Data.length; i$++){
         list$.addZca_S_F007Type(T_Data[ i$]);
        }
    }

    public com.iku.odeme.data.ZCA_F008.Zca_S_F007Type[] getT_Data() {
        com.iku.odeme.data.ZCA_F008.util.Zca_S_F007Type_List i$ = (com.iku.odeme.data.ZCA_F008.util.Zca_S_F007Type_List)baseTypeData().getElementValue(1);
        if ( i$ == null){return null;}
        return  i$.toArrayZca_S_F007Type();
    }

    public java.lang.String getDocno() {
        return (java.lang.String)baseTypeData().getElementValueAsString(0);
    }

    public MetaData metadataZca_F008_Output() {
        return metadata;
    }

    public void setDocno(java.lang.String Docno) {
        baseTypeData().setElementValue(0, Docno);
    }

    public com.iku.odeme.data.ZCA_F008.util.Zca_S_F007Type_List get_as_listT_Data() {
        return (com.iku.odeme.data.ZCA_F008.util.Zca_S_F007Type_List)baseTypeData().getElementValue(1);
    }

    public void setT_Data(com.iku.odeme.data.ZCA_F008.util.Zca_S_F007Type_List T_Data) {
        baseTypeData().setElementValue(1, T_Data);
    }

    public static class MetaData implements java.io.Serializable {
    
        private  Zca_F008_Output parent ;
    
        private  static final long serialVersionUID = -386313361L ;
    
        protected  MetaData (Zca_F008_Output parent) {
            this.parent = parent;
            
        }
    
        public com.sap.aii.proxy.framework.core.JcoMetaData getT_Data() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(1);
        }
    
        public com.sap.aii.proxy.framework.core.JcoMetaData getDocno() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(0);
        }
    
        public com.sap.aii.proxy.framework.core.TypeMetaData typeMetadata() {
            return (com.sap.aii.proxy.framework.core.TypeMetaData)parent.baseTypeMetaData();
        }
    
    }

}
