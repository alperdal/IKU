package com.iku.odeme.data.ZCA_F002;
public class ZCA_F002_PortType extends com.sap.aii.proxy.framework.core.AbstractProxy{

    private  static final com.sap.aii.proxy.framework.core.BaseProxyDescriptor staticDescriptor = com.sap.aii.proxy.framework.core.BaseProxyDescriptorFactory.createNewBaseProxyDescriptor("urn:sap-com:document:sap:rfc:functions:ZCA_F002.PortType", new java.lang.Object[][][]{{{"ZCA_F002", "zca_F002", "ZCA_F002"}, {"urn:sap-com:document:sap:rfc:functions:ZCA_F002.Input", "com.iku.odeme.data.ZCA_F002.Zca_F002_Input"}, {"urn:sap-com:document:sap:rfc:functions:ZCA_F002.Output", "com.iku.odeme.data.ZCA_F002.Zca_F002_Output"}, {"urn:sap-com:document:sap:rfc:functions:ZCA_F002.Exception", "com.iku.odeme.data.ZCA_F002.Zca_F002_Fault_Exception", "com.iku.odeme.data.ZCA_F002.Zca_F002_Fault"}}}, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO, com.iku.odeme.data.ZCA_F002.ZCA_F002_PortType.class) ;

    private  static final com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo = new com.sap.aii.proxy.framework.core.GenerationInfo("2.0", 1394712215883L) ;

    public  ZCA_F002_PortType () {
        super(staticDescriptor, staticGenerationInfo, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    public com.iku.odeme.data.ZCA_F002.Zca_F002_Output zca_F002(com.iku.odeme.data.ZCA_F002.Zca_F002_Input Zca_F002_Input) throws com.sap.aii.proxy.framework.core.SystemFaultException, com.iku.odeme.data.ZCA_F002.Zca_F002_Fault_Exception, com.sap.aii.proxy.framework.core.ApplicationFaultException{
        com.sap.aii.proxy.framework.core.BaseType $result = null;
        try {
        $result = send$(Zca_F002_Input, "urn:sap-com:document:sap:rfc:functions", "ZCA_F002.PortType", "ZCA_F002", new com.iku.odeme.data.ZCA_F002.Zca_F002_Output());
        }catch (com.sap.aii.proxy.framework.core.ApplicationFaultException e){
        if (e instanceof com.iku.odeme.data.ZCA_F002.Zca_F002_Fault_Exception) { throw (com.iku.odeme.data.ZCA_F002.Zca_F002_Fault_Exception)e;}
         throw createExceptionWrongExceptionType$(e);}
        if (($result == null) || ($result instanceof com.iku.odeme.data.ZCA_F002.Zca_F002_Output)){
        return (com.iku.odeme.data.ZCA_F002.Zca_F002_Output)$result;
        } else { throw createExceptionWrongType$($result);}
    }

}
