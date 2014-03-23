package com.iku.odeme.data.ZCA_F006;
public class Zca_F006_Output extends com.sap.aii.proxy.framework.core.AbstractType{

    private  static final com.sap.aii.proxy.framework.core.BaseTypeDescriptor staticDescriptor ;

    private  static final com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo = new com.sap.aii.proxy.framework.core.GenerationInfo("2.0", 1394791190151L) ;

    private  Zca_F006_Output.MetaData metadata = new MetaData(this) ;

    static {
        com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor = createNewBaseTypeDescriptor(com.sap.aii.proxy.framework.core.XsdlConstants.WSDL_MESSAGE_FOR_JCO, "urn:sap-com:document:sap:rfc:functions", "ZCA_F006.Output", 1, 0, com.iku.odeme.data.ZCA_F006.Zca_F006_Output.class, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO, "ZCA_F006", 0, 0, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"TR\">Öğrenci açık kalemleri döndürür</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>100</ifr:sourceClient><ifr:release>702 </ifr:release><ifr:package>ZFI</ifr:package><ifr:akhNode /><ifr:released>no</ifr:released><ifr:outbound>false</ifr:outbound><ifr:synchronous>true</ifr:synchronous><ifr:asynchronous>false</ifr:asynchronous><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2></ifr:properties><ifr:definition /></ifr:container>");
        descriptorSetElementProperties(descriptor, 0, "T_DATA", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "T_Data", com.iku.odeme.data.ZCA_F006.util.Zca_S_F006Type_List.class, new com.iku.odeme.data.ZCA_F006.Zca_S_F006Type(), new java.lang.String[][]{}, "T_DATA", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"T_DATA\"><ifr:descriptor><ifr:description language=\"TR\">ZCA_PORTAL: F006 func. için struc.</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"ZCA_S_F006\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=ZCA_S_F006\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>true</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        staticDescriptor = descriptor;
    }
    public  Zca_F006_Output () {
        super(staticDescriptor, staticGenerationInfo, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    protected  Zca_F006_Output (com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor, com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo, int connectionType) {
        super(descriptor, staticGenerationInfo, connectionType);
    }

    public MetaData metadataZca_F006_Output() {
        return metadata;
    }

    public com.iku.odeme.data.ZCA_F006.Zca_S_F006Type[] getT_Data() {
        com.iku.odeme.data.ZCA_F006.util.Zca_S_F006Type_List i$ = (com.iku.odeme.data.ZCA_F006.util.Zca_S_F006Type_List)baseTypeData().getElementValue(0);
        if ( i$ == null){return null;}
        return  i$.toArrayZca_S_F006Type();
    }

    public void setT_Data(com.iku.odeme.data.ZCA_F006.util.Zca_S_F006Type_List T_Data) {
        baseTypeData().setElementValue(0, T_Data);
    }

    public com.iku.odeme.data.ZCA_F006.util.Zca_S_F006Type_List get_as_listT_Data() {
        return (com.iku.odeme.data.ZCA_F006.util.Zca_S_F006Type_List)baseTypeData().getElementValue(0);
    }

    public void setT_Data(com.iku.odeme.data.ZCA_F006.Zca_S_F006Type[] T_Data) {
        baseTypeData().setElementValue(0, new com.iku.odeme.data.ZCA_F006.util.Zca_S_F006Type_List());
        com.iku.odeme.data.ZCA_F006.util.Zca_S_F006Type_List list$ = get_as_listT_Data();
        for (int  i$ = 0; i$ < T_Data.length; i$++){
         list$.addZca_S_F006Type(T_Data[ i$]);
        }
    }

    public static class MetaData implements java.io.Serializable {
    
        private  Zca_F006_Output parent ;
    
        private  static final long serialVersionUID = -386313361L ;
    
        protected  MetaData (Zca_F006_Output parent) {
            this.parent = parent;
            
        }
    
        public com.sap.aii.proxy.framework.core.JcoMetaData getT_Data() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(0);
        }
    
        public com.sap.aii.proxy.framework.core.TypeMetaData typeMetadata() {
            return (com.sap.aii.proxy.framework.core.TypeMetaData)parent.baseTypeMetaData();
        }
    
    }

}
