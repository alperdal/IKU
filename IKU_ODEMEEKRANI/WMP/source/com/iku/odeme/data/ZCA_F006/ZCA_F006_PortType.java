package com.iku.odeme.data.ZCA_F006;
public class ZCA_F006_PortType extends com.sap.aii.proxy.framework.core.AbstractProxy{

    private  static final com.sap.aii.proxy.framework.core.BaseProxyDescriptor staticDescriptor = com.sap.aii.proxy.framework.core.BaseProxyDescriptorFactory.createNewBaseProxyDescriptor("urn:sap-com:document:sap:rfc:functions:ZCA_F006.PortType", new java.lang.Object[][][]{{{"ZCA_F006", "zca_F006", "ZCA_F006"}, {"urn:sap-com:document:sap:rfc:functions:ZCA_F006.Input", "com.iku.odeme.data.ZCA_F006.Zca_F006_Input"}, {"urn:sap-com:document:sap:rfc:functions:ZCA_F006.Output", "com.iku.odeme.data.ZCA_F006.Zca_F006_Output"}, {"urn:sap-com:document:sap:rfc:functions:ZCA_F006.Exception", "com.iku.odeme.data.ZCA_F006.Zca_F006_Fault_Exception", "com.iku.odeme.data.ZCA_F006.Zca_F006_Fault"}}}, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO, com.iku.odeme.data.ZCA_F006.ZCA_F006_PortType.class) ;

    private  static final com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo = new com.sap.aii.proxy.framework.core.GenerationInfo("2.0", 1394791190137L) ;

    public  ZCA_F006_PortType () {
        super(staticDescriptor, staticGenerationInfo, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    public com.iku.odeme.data.ZCA_F006.Zca_F006_Output zca_F006(com.iku.odeme.data.ZCA_F006.Zca_F006_Input Zca_F006_Input) throws com.sap.aii.proxy.framework.core.SystemFaultException, com.sap.aii.proxy.framework.core.ApplicationFaultException, com.iku.odeme.data.ZCA_F006.Zca_F006_Fault_Exception{
        com.sap.aii.proxy.framework.core.BaseType $result = null;
        try {
        $result = send$(Zca_F006_Input, "urn:sap-com:document:sap:rfc:functions", "ZCA_F006.PortType", "ZCA_F006", new com.iku.odeme.data.ZCA_F006.Zca_F006_Output());
        }catch (com.sap.aii.proxy.framework.core.ApplicationFaultException e){
        if (e instanceof com.iku.odeme.data.ZCA_F006.Zca_F006_Fault_Exception) { throw (com.iku.odeme.data.ZCA_F006.Zca_F006_Fault_Exception)e;}
         throw createExceptionWrongExceptionType$(e);}
        if (($result == null) || ($result instanceof com.iku.odeme.data.ZCA_F006.Zca_F006_Output)){
        return (com.iku.odeme.data.ZCA_F006.Zca_F006_Output)$result;
        } else { throw createExceptionWrongType$($result);}
    }

}
