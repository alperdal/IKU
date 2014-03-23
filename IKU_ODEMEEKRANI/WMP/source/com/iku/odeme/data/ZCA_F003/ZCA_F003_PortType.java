package com.iku.odeme.data.ZCA_F003;
public class ZCA_F003_PortType extends com.sap.aii.proxy.framework.core.AbstractProxy{

    private  static final com.sap.aii.proxy.framework.core.BaseProxyDescriptor staticDescriptor = com.sap.aii.proxy.framework.core.BaseProxyDescriptorFactory.createNewBaseProxyDescriptor("urn:sap-com:document:sap:rfc:functions:ZCA_F003.PortType", new java.lang.Object[][][]{{{"ZCA_F003", "zca_F003", "ZCA_F003"}, {"urn:sap-com:document:sap:rfc:functions:ZCA_F003.Input", "com.iku.odeme.data.ZCA_F003.Zca_F003_Input"}, {"urn:sap-com:document:sap:rfc:functions:ZCA_F003.Output", "com.iku.odeme.data.ZCA_F003.Zca_F003_Output"}, {"urn:sap-com:document:sap:rfc:functions:ZCA_F003.Exception", "com.iku.odeme.data.ZCA_F003.Zca_F003_Fault_Exception", "com.iku.odeme.data.ZCA_F003.Zca_F003_Fault"}}}, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO, com.iku.odeme.data.ZCA_F003.ZCA_F003_PortType.class) ;

    private  static final com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo = new com.sap.aii.proxy.framework.core.GenerationInfo("2.0", 1394712396391L) ;

    public  ZCA_F003_PortType () {
        super(staticDescriptor, staticGenerationInfo, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    public com.iku.odeme.data.ZCA_F003.Zca_F003_Output zca_F003(com.iku.odeme.data.ZCA_F003.Zca_F003_Input Zca_F003_Input) throws com.iku.odeme.data.ZCA_F003.Zca_F003_Fault_Exception, com.sap.aii.proxy.framework.core.SystemFaultException, com.sap.aii.proxy.framework.core.ApplicationFaultException{
        com.sap.aii.proxy.framework.core.BaseType $result = null;
        try {
        $result = send$(Zca_F003_Input, "urn:sap-com:document:sap:rfc:functions", "ZCA_F003.PortType", "ZCA_F003", new com.iku.odeme.data.ZCA_F003.Zca_F003_Output());
        }catch (com.sap.aii.proxy.framework.core.ApplicationFaultException e){
        if (e instanceof com.iku.odeme.data.ZCA_F003.Zca_F003_Fault_Exception) { throw (com.iku.odeme.data.ZCA_F003.Zca_F003_Fault_Exception)e;}
         throw createExceptionWrongExceptionType$(e);}
        if (($result == null) || ($result instanceof com.iku.odeme.data.ZCA_F003.Zca_F003_Output)){
        return (com.iku.odeme.data.ZCA_F003.Zca_F003_Output)$result;
        } else { throw createExceptionWrongType$($result);}
    }

}
