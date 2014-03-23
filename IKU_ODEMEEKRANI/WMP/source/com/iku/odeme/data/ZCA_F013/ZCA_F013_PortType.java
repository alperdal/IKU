package com.iku.odeme.data.ZCA_F013;
public class ZCA_F013_PortType extends com.sap.aii.proxy.framework.core.AbstractProxy{

    private  static final com.sap.aii.proxy.framework.core.BaseProxyDescriptor staticDescriptor = com.sap.aii.proxy.framework.core.BaseProxyDescriptorFactory.createNewBaseProxyDescriptor("urn:sap-com:document:sap:rfc:functions:ZCA_F013.PortType", new java.lang.Object[][][]{{{"ZCA_F013", "zca_F013", "ZCA_F013"}, {"urn:sap-com:document:sap:rfc:functions:ZCA_F013.Input", "com.iku.odeme.data.ZCA_F013.Zca_F013_Input"}, {"urn:sap-com:document:sap:rfc:functions:ZCA_F013.Output", "com.iku.odeme.data.ZCA_F013.Zca_F013_Output"}}}, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO, com.iku.odeme.data.ZCA_F013.ZCA_F013_PortType.class) ;

    private  static final com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo = new com.sap.aii.proxy.framework.core.GenerationInfo("2.0", 1395328634015L) ;

    public  ZCA_F013_PortType () {
        super(staticDescriptor, staticGenerationInfo, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    public com.iku.odeme.data.ZCA_F013.Zca_F013_Output zca_F013(com.iku.odeme.data.ZCA_F013.Zca_F013_Input Zca_F013_Input) throws com.sap.aii.proxy.framework.core.SystemFaultException, com.sap.aii.proxy.framework.core.ApplicationFaultException{
        com.sap.aii.proxy.framework.core.BaseType $result = null;
        try {
        $result = send$(Zca_F013_Input, "urn:sap-com:document:sap:rfc:functions", "ZCA_F013.PortType", "ZCA_F013", new com.iku.odeme.data.ZCA_F013.Zca_F013_Output());
        }catch (com.sap.aii.proxy.framework.core.ApplicationFaultException e){
         throw createExceptionWrongExceptionType$(e);}
        if (($result == null) || ($result instanceof com.iku.odeme.data.ZCA_F013.Zca_F013_Output)){
        return (com.iku.odeme.data.ZCA_F013.Zca_F013_Output)$result;
        } else { throw createExceptionWrongType$($result);}
    }

}
