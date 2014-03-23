package com.iku.odeme.data.odemeKayit;
public class ZCA_ODEME_DENKLESTIRME_PortType extends com.sap.aii.proxy.framework.core.AbstractProxy{

    private  static final com.sap.aii.proxy.framework.core.BaseProxyDescriptor staticDescriptor = com.sap.aii.proxy.framework.core.BaseProxyDescriptorFactory.createNewBaseProxyDescriptor("urn:sap-com:document:sap:rfc:functions:ZCA_ODEME_DENKLESTIRME.PortType", new java.lang.Object[][][]{{{"ZCA_ODEME_DENKLESTIRME", "zca_Odeme_Denklestirme", "ZCA_ODEME_DENKLESTIRME"}, {"urn:sap-com:document:sap:rfc:functions:ZCA_ODEME_DENKLESTIRME.Input", "com.iku.odeme.data.odemeKayit.Zca_Odeme_Denklestirme_Input"}, {"urn:sap-com:document:sap:rfc:functions:ZCA_ODEME_DENKLESTIRME.Output", "com.iku.odeme.data.odemeKayit.Zca_Odeme_Denklestirme_Output"}}}, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO, com.iku.odeme.data.odemeKayit.ZCA_ODEME_DENKLESTIRME_PortType.class) ;

    private  static final com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo = new com.sap.aii.proxy.framework.core.GenerationInfo("2.0", 1394712836372L) ;

    public  ZCA_ODEME_DENKLESTIRME_PortType () {
        super(staticDescriptor, staticGenerationInfo, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    public com.iku.odeme.data.odemeKayit.Zca_Odeme_Denklestirme_Output zca_Odeme_Denklestirme(com.iku.odeme.data.odemeKayit.Zca_Odeme_Denklestirme_Input Zca_Odeme_Denklestirme_Input) throws com.sap.aii.proxy.framework.core.SystemFaultException, com.sap.aii.proxy.framework.core.ApplicationFaultException{
        com.sap.aii.proxy.framework.core.BaseType $result = null;
        try {
        $result = send$(Zca_Odeme_Denklestirme_Input, "urn:sap-com:document:sap:rfc:functions", "ZCA_ODEME_DENKLESTIRME.PortType", "ZCA_ODEME_DENKLESTIRME", new com.iku.odeme.data.odemeKayit.Zca_Odeme_Denklestirme_Output());
        }catch (com.sap.aii.proxy.framework.core.ApplicationFaultException e){
         throw createExceptionWrongExceptionType$(e);}
        if (($result == null) || ($result instanceof com.iku.odeme.data.odemeKayit.Zca_Odeme_Denklestirme_Output)){
        return (com.iku.odeme.data.odemeKayit.Zca_Odeme_Denklestirme_Output)$result;
        } else { throw createExceptionWrongType$($result);}
    }

}
