package com.iku.odeme.data.ZCA_F009;
public class ZCA_F009_PortType extends com.sap.aii.proxy.framework.core.AbstractProxy{

    private  static final com.sap.aii.proxy.framework.core.BaseProxyDescriptor staticDescriptor = com.sap.aii.proxy.framework.core.BaseProxyDescriptorFactory.createNewBaseProxyDescriptor("urn:sap-com:document:sap:rfc:functions:ZCA_F009.PortType", new java.lang.Object[][][]{{{"ZCA_F009", "zca_F009", "ZCA_F009"}, {"urn:sap-com:document:sap:rfc:functions:ZCA_F009.Input", "com.iku.odeme.data.ZCA_F009.Zca_F009_Input"}, {"urn:sap-com:document:sap:rfc:functions:ZCA_F009.Output", "com.iku.odeme.data.ZCA_F009.Zca_F009_Output"}}}, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO, com.iku.odeme.data.ZCA_F009.ZCA_F009_PortType.class) ;

    private  static final com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo = new com.sap.aii.proxy.framework.core.GenerationInfo("2.0", 1394712687938L) ;

    public  ZCA_F009_PortType () {
        super(staticDescriptor, staticGenerationInfo, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    public com.iku.odeme.data.ZCA_F009.Zca_F009_Output zca_F009(com.iku.odeme.data.ZCA_F009.Zca_F009_Input Zca_F009_Input) throws com.sap.aii.proxy.framework.core.SystemFaultException, com.sap.aii.proxy.framework.core.ApplicationFaultException{
        com.sap.aii.proxy.framework.core.BaseType $result = null;
        try {
        $result = send$(Zca_F009_Input, "urn:sap-com:document:sap:rfc:functions", "ZCA_F009.PortType", "ZCA_F009", new com.iku.odeme.data.ZCA_F009.Zca_F009_Output());
        }catch (com.sap.aii.proxy.framework.core.ApplicationFaultException e){
         throw createExceptionWrongExceptionType$(e);}
        if (($result == null) || ($result instanceof com.iku.odeme.data.ZCA_F009.Zca_F009_Output)){
        return (com.iku.odeme.data.ZCA_F009.Zca_F009_Output)$result;
        } else { throw createExceptionWrongType$($result);}
    }

}
