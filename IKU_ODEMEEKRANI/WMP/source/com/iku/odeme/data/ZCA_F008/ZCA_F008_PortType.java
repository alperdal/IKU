package com.iku.odeme.data.ZCA_F008;
public class ZCA_F008_PortType extends com.sap.aii.proxy.framework.core.AbstractProxy{

    private  static final com.sap.aii.proxy.framework.core.BaseProxyDescriptor staticDescriptor = com.sap.aii.proxy.framework.core.BaseProxyDescriptorFactory.createNewBaseProxyDescriptor("urn:sap-com:document:sap:rfc:functions:ZCA_F008.PortType", new java.lang.Object[][][]{{{"ZCA_F008", "zca_F008", "ZCA_F008"}, {"urn:sap-com:document:sap:rfc:functions:ZCA_F008.Input", "com.iku.odeme.data.ZCA_F008.Zca_F008_Input"}, {"urn:sap-com:document:sap:rfc:functions:ZCA_F008.Output", "com.iku.odeme.data.ZCA_F008.Zca_F008_Output"}, {"urn:sap-com:document:sap:rfc:functions:ZCA_F008.Exception", "com.iku.odeme.data.ZCA_F008.Zca_F008_Fault_Exception", "com.iku.odeme.data.ZCA_F008.Zca_F008_Fault"}}}, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO, com.iku.odeme.data.ZCA_F008.ZCA_F008_PortType.class) ;

    private  static final com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo = new com.sap.aii.proxy.framework.core.GenerationInfo("2.0", 1394712539494L) ;

    public  ZCA_F008_PortType () {
        super(staticDescriptor, staticGenerationInfo, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    public com.iku.odeme.data.ZCA_F008.Zca_F008_Output zca_F008(com.iku.odeme.data.ZCA_F008.Zca_F008_Input Zca_F008_Input) throws com.sap.aii.proxy.framework.core.SystemFaultException, com.iku.odeme.data.ZCA_F008.Zca_F008_Fault_Exception, com.sap.aii.proxy.framework.core.ApplicationFaultException{
        com.sap.aii.proxy.framework.core.BaseType $result = null;
        try {
        $result = send$(Zca_F008_Input, "urn:sap-com:document:sap:rfc:functions", "ZCA_F008.PortType", "ZCA_F008", new com.iku.odeme.data.ZCA_F008.Zca_F008_Output());
        }catch (com.sap.aii.proxy.framework.core.ApplicationFaultException e){
        if (e instanceof com.iku.odeme.data.ZCA_F008.Zca_F008_Fault_Exception) { throw (com.iku.odeme.data.ZCA_F008.Zca_F008_Fault_Exception)e;}
         throw createExceptionWrongExceptionType$(e);}
        if (($result == null) || ($result instanceof com.iku.odeme.data.ZCA_F008.Zca_F008_Output)){
        return (com.iku.odeme.data.ZCA_F008.Zca_F008_Output)$result;
        } else { throw createExceptionWrongType$($result);}
    }

}
