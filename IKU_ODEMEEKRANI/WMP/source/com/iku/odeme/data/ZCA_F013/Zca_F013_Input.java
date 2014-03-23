package com.iku.odeme.data.ZCA_F013;
public class Zca_F013_Input extends com.sap.aii.proxy.framework.core.AbstractType{

    private  static final com.sap.aii.proxy.framework.core.BaseTypeDescriptor staticDescriptor ;

    private  static final com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo = new com.sap.aii.proxy.framework.core.GenerationInfo("2.0", 1395328634016L) ;

    private  Zca_F013_Input.MetaData metadata = new MetaData(this) ;

    static {
        com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor = createNewBaseTypeDescriptor(com.sap.aii.proxy.framework.core.XsdlConstants.WSDL_MESSAGE_FOR_JCO, "urn:sap-com:document:sap:rfc:functions", "ZCA_F013.Input", 1, 0, com.iku.odeme.data.ZCA_F013.Zca_F013_Input.class, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO, "ZCA_F013", 0, 0, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:container xmlns:ifr=\"urn:sap-com:ifr:v2:metamodel\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><ifr:descriptor><ifr:description language=\"TR\">Banka log fonksiyonu</ifr:description></ifr:descriptor><ifr:properties><ifr:sourceSystem /><ifr:sourceClient>100</ifr:sourceClient><ifr:release>702 </ifr:release><ifr:package>ZFI</ifr:package><ifr:akhNode /><ifr:released>no</ifr:released><ifr:outbound>false</ifr:outbound><ifr:synchronous>true</ifr:synchronous><ifr:asynchronous>false</ifr:asynchronous><ifr:unicode1>true</ifr:unicode1><ifr:unicode2>true</ifr:unicode2></ifr:properties><ifr:definition /></ifr:container>");
        descriptorSetElementProperties(descriptor, 0, "IT_BANKALOG", null, null, "unqualified", null, "urn:sap-com:document:sap:rfc:functions", false, 0, -1, false, null, "It_Bankalog", com.iku.odeme.data.ZCA_F013.util.Zher_Banka_LogType_List.class, new com.iku.odeme.data.ZCA_F013.Zher_Banka_LogType(), new java.lang.String[][]{}, "IT_BANKALOG", 0, 0, -1, -1, -1, -1, com.sap.mw.jco.JCO.TYPE_TABLE, 0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<ifr:parameter name=\"IT_BANKALOG\"><ifr:descriptor><ifr:description language=\"TR\">Ödeme ekranı Banka Log</ifr:description></ifr:descriptor><ifr:definition><ifr:complexType name=\"ZHER_BANKA_LOG\" type=\"structure\" xlink:role=\"type\" xlink:href=\"/Content?TYPE=type&amp;NAME=ZHER_BANKA_LOG\" /></ifr:definition><ifr:properties><ifr:direction>inout</ifr:direction><ifr:class>tables</ifr:class><ifr:type>structure</ifr:type><ifr:optional>false</ifr:optional><ifr:basedOnDictionaryReference>true</ifr:basedOnDictionaryReference></ifr:properties></ifr:parameter>");
        staticDescriptor = descriptor;
    }
    public  Zca_F013_Input () {
        super(staticDescriptor, staticGenerationInfo, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    protected  Zca_F013_Input (com.sap.aii.proxy.framework.core.BaseTypeDescriptor descriptor, com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo, int connectionType) {
        super(descriptor, staticGenerationInfo, connectionType);
    }

    public com.iku.odeme.data.ZCA_F013.util.Zher_Banka_LogType_List get_as_listIt_Bankalog() {
        return (com.iku.odeme.data.ZCA_F013.util.Zher_Banka_LogType_List)baseTypeData().getElementValue(0);
    }

    public com.iku.odeme.data.ZCA_F013.Zher_Banka_LogType[] getIt_Bankalog() {
        com.iku.odeme.data.ZCA_F013.util.Zher_Banka_LogType_List i$ = (com.iku.odeme.data.ZCA_F013.util.Zher_Banka_LogType_List)baseTypeData().getElementValue(0);
        if ( i$ == null){return null;}
        return  i$.toArrayZher_Banka_LogType();
    }

    public MetaData metadataZca_F013_Input() {
        return metadata;
    }

    public void setIt_Bankalog(com.iku.odeme.data.ZCA_F013.util.Zher_Banka_LogType_List It_Bankalog) {
        baseTypeData().setElementValue(0, It_Bankalog);
    }

    public void setIt_Bankalog(com.iku.odeme.data.ZCA_F013.Zher_Banka_LogType[] It_Bankalog) {
        baseTypeData().setElementValue(0, new com.iku.odeme.data.ZCA_F013.util.Zher_Banka_LogType_List());
        com.iku.odeme.data.ZCA_F013.util.Zher_Banka_LogType_List list$ = get_as_listIt_Bankalog();
        for (int  i$ = 0; i$ < It_Bankalog.length; i$++){
         list$.addZher_Banka_LogType(It_Bankalog[ i$]);
        }
    }

    public static class MetaData implements java.io.Serializable {
    
        private  Zca_F013_Input parent ;
    
        private  static final long serialVersionUID = -386313361L ;
    
        protected  MetaData (Zca_F013_Input parent) {
            this.parent = parent;
            
        }
    
        public com.sap.aii.proxy.framework.core.TypeMetaData typeMetadata() {
            return (com.sap.aii.proxy.framework.core.TypeMetaData)parent.baseTypeMetaData();
        }
    
        public com.sap.aii.proxy.framework.core.JcoMetaData getIt_Bankalog() {
            return (com.sap.aii.proxy.framework.core.JcoMetaData)parent.baseTypeMetaData().getElement(0);
        }
    
    }

}
