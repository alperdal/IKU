package com.iku.odeme.data.ZCA_F004;
public class Zca_F004_Input extends com.sap.aii.proxy.framework.core.AbstractType{

    private  static final com.sap.aii.proxy.framework.core.BaseTypeDescriptor staticDescriptor ;

    private  static final com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo = new com.sap.aii.proxy.framework.core.GenerationInfo("2.0", 1394712434574L) ;

    private  Zca_F004_Input.MetaData metadata = new MetaData(this) ;

    static {
        com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor = createNewBaseTypeDescriptor(com.sap.aii.proxy.framework.core.XsdlConstants.WSDL_MESSAGE_FOR_JCO, "urn:sap-com:document:sap:rfc:functions", "ZCA_F004.Input", 4, 0, com.iku.odeme.data.ZCA_F004.Zca_F004_Input.class, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO, "ZCA_F004", 0, 0, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"TR\">İndirim türlerinin gösterilmesi</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>100</ifr:sourceClient><ifr:release>702 </ifr:release><ifr:package>ZFI</ifr:package><ifr:akhNode /><ifr:released>no</ifr:released><ifr:outbound>false</ifr:outbound><ifr:synchronous>true</ifr:synchronous><ifr:asynchronous>false</ifr:asynchronous><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2></ifr:properties><ifr:definition /></ifr:container>");
        descriptorSetElementProperties(descriptor, 0, "I_PERSL", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 1, 1, false, null, "I_Persl", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "4"}}, "I_PERSL", 0, 0, -1, 4, 8, -1, com.sap.mw.jco.JCO.TYPE_CHAR, com.sap.mw.jco.JCO.IMPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"I_PERSL\"><ifr:descriptor><ifr:description language=\"TR\">Dönem tayini için anahtar</ifr:description></ifr:descriptor><ifr:definition><ifr:scalarType name=\"PERSL_KK\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>4</ifr:length><ifr:internalLength1>4</ifr:internalLength1><ifr:internalLength2>8</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>4</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition><ifr:properties><ifr:direction>in</ifr:direction><ifr:class>import</ifr:class><ifr:type>scalar</ifr:type><ifr:optional>false</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 1, "I_PSOBTYP", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 1, 1, false, null, "I_Psobtyp", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "4"}}, "I_PSOBTYP", 0, 0, -1, 4, 8, -1, com.sap.mw.jco.JCO.TYPE_CHAR, com.sap.mw.jco.JCO.IMPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"I_PSOBTYP\"><ifr:descriptor><ifr:description language=\"TR\">Sözleşme konusu türü</ifr:description></ifr:descriptor><ifr:definition><ifr:scalarType name=\"PSOBTYP_PS\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>4</ifr:length><ifr:internalLength1>4</ifr:internalLength1><ifr:internalLength2>8</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>4</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition><ifr:properties><ifr:direction>in</ifr:direction><ifr:class>import</ifr:class><ifr:type>scalar</ifr:type><ifr:optional>false</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 2, "I_UNAME", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 1, 1, false, null, "I_Uname", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "12"}}, "I_UNAME", 0, 0, -1, 12, 24, -1, com.sap.mw.jco.JCO.TYPE_CHAR, com.sap.mw.jco.JCO.IMPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"I_UNAME\"><ifr:descriptor><ifr:description language=\"TR\">R/3-Sistemi, kullanıcının bağlantı adı</ifr:description></ifr:descriptor><ifr:definition><ifr:field name=\"SYST.UNAME\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:offset1>791</ifr:offset1><ifr:offset2>1386</ifr:offset2></ifr:properties></ifr:field><ifr:scalarType name=\"SYUNAME\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>12</ifr:length><ifr:internalLength1>12</ifr:internalLength1><ifr:internalLength2>24</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>12</ifr:outputLength></ifr:definition></ifr:scalarType></ifr:definition><ifr:properties><ifr:direction>in</ifr:direction><ifr:class>import</ifr:class><ifr:type>scalar</ifr:type><ifr:optional>false</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 3, "T_DATA", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "T_Data", com.iku.odeme.data.ZCA_F004.util.Zca_S_F004Type_List.class, new com.iku.odeme.data.ZCA_F004.Zca_S_F004Type(), new java.lang.String[][]{}, "T_DATA", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"T_DATA\"><ifr:descriptor><ifr:description language=\"TR\">ZCA_PORTAL: F004 func. için strc.</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"ZCA_S_F004\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=ZCA_S_F004\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        staticDescriptor = descriptor;
    }
    public  Zca_F004_Input () {
        super(staticDescriptor, staticGenerationInfo, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    protected  Zca_F004_Input (com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor, com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo, int connectionType) {
        super(descriptor, staticGenerationInfo, connectionType);
    }

    public java.lang.String getI_Persl() {
        return (java.lang.String)baseTypeData().getElementValueAsString(0);
    }

    public void setT_Data(com.iku.odeme.data.ZCA_F004.Zca_S_F004Type[] T_Data) {
        baseTypeData().setElementValue(3, new com.iku.odeme.data.ZCA_F004.util.Zca_S_F004Type_List());
        com.iku.odeme.data.ZCA_F004.util.Zca_S_F004Type_List list$ = get_as_listT_Data();
        for (int  i$ = 0; i$ < T_Data.length; i$++){
         list$.addZca_S_F004Type(T_Data[ i$]);
        }
    }

    public com.iku.odeme.data.ZCA_F004.Zca_S_F004Type[] getT_Data() {
        com.iku.odeme.data.ZCA_F004.util.Zca_S_F004Type_List i$ = (com.iku.odeme.data.ZCA_F004.util.Zca_S_F004Type_List)baseTypeData().getElementValue(3);
        if ( i$ == null){return null;}
        return  i$.toArrayZca_S_F004Type();
    }

    public void setI_Psobtyp(java.lang.String I_Psobtyp) {
        baseTypeData().setElementValue(1, I_Psobtyp);
    }

    public java.lang.String getI_Psobtyp() {
        return (java.lang.String)baseTypeData().getElementValueAsString(1);
    }

    public java.lang.String getI_Uname() {
        return (java.lang.String)baseTypeData().getElementValueAsString(2);
    }

    public void setT_Data(com.iku.odeme.data.ZCA_F004.util.Zca_S_F004Type_List T_Data) {
        baseTypeData().setElementValue(3, T_Data);
    }

    public MetaData metadataZca_F004_Input() {
        return metadata;
    }

    public void setI_Persl(java.lang.String I_Persl) {
        baseTypeData().setElementValue(0, I_Persl);
    }

    public com.iku.odeme.data.ZCA_F004.util.Zca_S_F004Type_List get_as_listT_Data() {
        return (com.iku.odeme.data.ZCA_F004.util.Zca_S_F004Type_List)baseTypeData().getElementValue(3);
    }

    public void setI_Uname(java.lang.String I_Uname) {
        baseTypeData().setElementValue(2, I_Uname);
    }

    public static class MetaData implements java.io.Serializable {
    
        private  Zca_F004_Input parent ;
    
        private  static final long serialVersionUID = -386313361L ;
    
        protected  MetaData (Zca_F004_Input parent) {
            this.parent = parent;
            
        }
    
        public com.sap.aii.proxy.framework.core.JcoMetaData getI_Persl() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(0);
        }
    
        public com.sap.aii.proxy.framework.core.JcoMetaData getT_Data() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(3);
        }
    
        public com.sap.aii.proxy.framework.core.JcoMetaData getI_Psobtyp() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(1);
        }
    
        public com.sap.aii.proxy.framework.core.JcoMetaData getI_Uname() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(2);
        }
    
        public com.sap.aii.proxy.framework.core.TypeMetaData typeMetadata() {
            return (com.sap.aii.proxy.framework.core.TypeMetaData)parent.baseTypeMetaData();
        }
    
    }

}
