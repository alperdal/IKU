package com.iku.odeme.data.ZCA_F011;
public class Zca_F011_Input extends com.sap.aii.proxy.framework.core.AbstractType{

    private  static final com.sap.aii.proxy.framework.core.BaseTypeDescriptor staticDescriptor ;

    private  static final com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo = new com.sap.aii.proxy.framework.core.GenerationInfo("2.0", 1395222531633L) ;

    private  Zca_F011_Input.MetaData metadata = new MetaData(this) ;

    static {
        com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor = createNewBaseTypeDescriptor(com.sap.aii.proxy.framework.core.XsdlConstants.WSDL_MESSAGE_FOR_JCO, "urn:sap-com:document:sap:rfc:functions", "ZCA_F011.Input", 2, 0, com.iku.odeme.data.ZCA_F011.Zca_F011_Input.class, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO, "ZCA_F011", 0, 0, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"TR\">Öğrenci Bilgileri</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>100</ifr:sourceClient><ifr:release>702 </ifr:release><ifr:package>ZFI</ifr:package><ifr:akhNode /><ifr:released>no</ifr:released><ifr:outbound>false</ifr:outbound><ifr:synchronous>true</ifr:synchronous><ifr:asynchronous>false</ifr:asynchronous><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2></ifr:properties><ifr:definition /></ifr:container>");
        descriptorSetElementProperties(descriptor, 0, "I_ST_NO", null, null, "unqualified", "http://www.w3.org/2001/XMLSchema:string", "urn:sap-com:document:sap:rfc:functions", false, 1, 1, false, null, "I_St_No", java.lang.String.class, null, new java.lang.String[][]{{"maxLength", "12"}}, "I_ST_NO", 0, 0, -1, 12, 24, -1, com.sap.mw.jco.JCO.TYPE_CHAR, com.sap.mw.jco.JCO.IMPORT_PARAMETER, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"I_ST_NO\"><ifr:descriptor><ifr:description language=\"TR\">Öğrencinin numarası</ifr:description></ifr:descriptor><ifr:definition><ifr:scalarType name=\"PIQSTUDENT12\"><ifr:properties><ifr:helpValuesSupported>false</ifr:helpValuesSupported><ifr:fixedValuesListDefined>false</ifr:fixedValuesListDefined><ifr:mixedCaseSupported>false</ifr:mixedCaseSupported><ifr:signedNumber>false</ifr:signedNumber></ifr:properties><ifr:definition><ifr:type>CHAR</ifr:type><ifr:abapType>C</ifr:abapType><ifr:length>12</ifr:length><ifr:internalLength1>12</ifr:internalLength1><ifr:internalLength2>24</ifr:internalLength2><ifr:decimals>0</ifr:decimals><ifr:outputLength>12</ifr:outputLength><ifr:conversionExit>PIQST</ifr:conversionExit></ifr:definition></ifr:scalarType></ifr:definition><ifr:properties><ifr:direction>in</ifr:direction><ifr:class>import</ifr:class><ifr:type>scalar</ifr:type><ifr:optional>false</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        descriptorSetElementProperties(descriptor, 1, "ET_BANKA", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "Et_Banka", com.iku.odeme.data.ZCA_F011.util.Zher_BankaType_List.class, new com.iku.odeme.data.ZCA_F011.Zher_BankaType(), new java.lang.String[][]{}, "ET_BANKA", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"ET_BANKA\"><ifr:descriptor><ifr:description language=\"TR\">Banka Tablosu</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"ZHER_BANKA\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=ZHER_BANKA\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        staticDescriptor = descriptor;
    }
    public  Zca_F011_Input () {
        super(staticDescriptor, staticGenerationInfo, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    protected  Zca_F011_Input (com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor, com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo, int connectionType) {
        super(descriptor, staticGenerationInfo, connectionType);
    }

    public com.iku.odeme.data.ZCA_F011.Zher_BankaType[] getEt_Banka() {
        com.iku.odeme.data.ZCA_F011.util.Zher_BankaType_List i$ = (com.iku.odeme.data.ZCA_F011.util.Zher_BankaType_List)baseTypeData().getElementValue(1);
        if ( i$ == null){return null;}
        return  i$.toArrayZher_BankaType();
    }

    public void setI_St_No(java.lang.String I_St_No) {
        baseTypeData().setElementValue(0, I_St_No);
    }

    public void setEt_Banka(com.iku.odeme.data.ZCA_F011.Zher_BankaType[] Et_Banka) {
        baseTypeData().setElementValue(1, new com.iku.odeme.data.ZCA_F011.util.Zher_BankaType_List());
        com.iku.odeme.data.ZCA_F011.util.Zher_BankaType_List list$ = get_as_listEt_Banka();
        for (int  i$ = 0; i$ < Et_Banka.length; i$++){
         list$.addZher_BankaType(Et_Banka[ i$]);
        }
    }

    public com.iku.odeme.data.ZCA_F011.util.Zher_BankaType_List get_as_listEt_Banka() {
        return (com.iku.odeme.data.ZCA_F011.util.Zher_BankaType_List)baseTypeData().getElementValue(1);
    }

    public void setEt_Banka(com.iku.odeme.data.ZCA_F011.util.Zher_BankaType_List Et_Banka) {
        baseTypeData().setElementValue(1, Et_Banka);
    }

    public java.lang.String getI_St_No() {
        return (java.lang.String)baseTypeData().getElementValueAsString(0);
    }

    public MetaData metadataZca_F011_Input() {
        return metadata;
    }

    public static class MetaData implements java.io.Serializable {
    
        private  Zca_F011_Input parent ;
    
        private  static final long serialVersionUID = -386313361L ;
    
        protected  MetaData (Zca_F011_Input parent) {
            this.parent = parent;
            
        }
    
        public com.sap.aii.proxy.framework.core.JcoMetaData getEt_Banka() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(1);
        }
    
        public com.sap.aii.proxy.framework.core.TypeMetaData typeMetadata() {
            return (com.sap.aii.proxy.framework.core.TypeMetaData)parent.baseTypeMetaData();
        }
    
        public com.sap.aii.proxy.framework.core.JcoMetaData getI_St_No() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(0);
        }
    
    }

}
