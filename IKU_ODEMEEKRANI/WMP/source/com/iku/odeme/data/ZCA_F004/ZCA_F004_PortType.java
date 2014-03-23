package com.iku.odeme.data.ZCA_F004;
public class ZCA_F004_PortType extends com.sap.aii.proxy.framework.core.AbstractProxy{

    private  static final com.sap.aii.proxy.framework.core.BaseProxyDescriptor staticDescriptor = com.sap.aii.proxy.framework.core.BaseProxyDescriptorFactory.createNewBaseProxyDescriptor("urn:sap-com:document:sap:rfc:functions:ZCA_F004.PortType", new java.lang.Object[][][]{{{"ZCA_F004", "zca_F004", "ZCA_F004"}, {"urn:sap-com:document:sap:rfc:functions:ZCA_F004.Input", "com.iku.odeme.data.ZCA_F004.Zca_F004_Input"}, {"urn:sap-com:document:sap:rfc:functions:ZCA_F004.Output", "com.iku.odeme.data.ZCA_F004.Zca_F004_Output"}, {"urn:sap-com:document:sap:rfc:functions:ZCA_F004.Exception", "com.iku.odeme.data.ZCA_F004.Zca_F004_Fault_Exception", "com.iku.odeme.data.ZCA_F004.Zca_F004_Fault"}}}, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO, com.iku.odeme.data.ZCA_F004.ZCA_F004_PortType.class) ;

    private  static final com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo = new com.sap.aii.proxy.framework.core.GenerationInfo("2.0", 1394712434574L) ;

    public  ZCA_F004_PortType () {
        super(staticDescriptor, staticGenerationInfo, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    public com.iku.odeme.data.ZCA_F004.Zca_F004_Output zca_F004(com.iku.odeme.data.ZCA_F004.Zca_F004_Input Zca_F004_Input) throws com.sap.aii.proxy.framework.core.SystemFaultException, com.iku.odeme.data.ZCA_F004.Zca_F004_Fault_Exception, com.sap.aii.proxy.framework.core.ApplicationFaultException{
        com.sap.aii.proxy.framework.core.BaseType $result = null;
        try {
        $result = send$(Zca_F004_Input, "urn:sap-com:document:sap:rfc:functions", "ZCA_F004.PortType", "ZCA_F004", new com.iku.odeme.data.ZCA_F004.Zca_F004_Output());
        }catch (com.sap.aii.proxy.framework.core.ApplicationFaultException e){
        if (e instanceof com.iku.odeme.data.ZCA_F004.Zca_F004_Fault_Exception) { throw (com.iku.odeme.data.ZCA_F004.Zca_F004_Fault_Exception)e;}
         throw createExceptionWrongExceptionType$(e);}
        if (($result == null) || ($result instanceof com.iku.odeme.data.ZCA_F004.Zca_F004_Output)){
        return (com.iku.odeme.data.ZCA_F004.Zca_F004_Output)$result;
        } else { throw createExceptionWrongType$($result);}
    }

}
