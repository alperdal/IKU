package com.iku.odeme.data.ZCA_F001;
public class ZCA_F001_PortType extends com.sap.aii.proxy.framework.core.AbstractProxy{

    private  static final com.sap.aii.proxy.framework.core.BaseProxyDescriptor staticDescriptor = com.sap.aii.proxy.framework.core.BaseProxyDescriptorFactory.createNewBaseProxyDescriptor("urn:sap-com:document:sap:rfc:functions:ZCA_F001.PortType", new java.lang.Object[][][]{{{"ZCA_F001", "zca_F001", "ZCA_F001"}, {"urn:sap-com:document:sap:rfc:functions:ZCA_F001.Input", "com.iku.odeme.data.ZCA_F001.Zca_F001_Input"}, {"urn:sap-com:document:sap:rfc:functions:ZCA_F001.Output", "com.iku.odeme.data.ZCA_F001.Zca_F001_Output"}, {"urn:sap-com:document:sap:rfc:functions:ZCA_F001.Exception", "com.iku.odeme.data.ZCA_F001.Zca_F001_Fault_Exception", "com.iku.odeme.data.ZCA_F001.Zca_F001_Fault"}}}, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO, com.iku.odeme.data.ZCA_F001.ZCA_F001_PortType.class) ;

    private  static final com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo = new com.sap.aii.proxy.framework.core.GenerationInfo("2.0", 1394712157231L) ;

    public  ZCA_F001_PortType () {
        super(staticDescriptor, staticGenerationInfo, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    public com.iku.odeme.data.ZCA_F001.Zca_F001_Output zca_F001(com.iku.odeme.data.ZCA_F001.Zca_F001_Input Zca_F001_Input) throws com.sap.aii.proxy.framework.core.SystemFaultException, com.iku.odeme.data.ZCA_F001.Zca_F001_Fault_Exception, com.sap.aii.proxy.framework.core.ApplicationFaultException{
        com.sap.aii.proxy.framework.core.BaseType $result = null;
        try {
        $result = send$(Zca_F001_Input, "urn:sap-com:document:sap:rfc:functions", "ZCA_F001.PortType", "ZCA_F001", new com.iku.odeme.data.ZCA_F001.Zca_F001_Output());
        }catch (com.sap.aii.proxy.framework.core.ApplicationFaultException e){
        if (e instanceof com.iku.odeme.data.ZCA_F001.Zca_F001_Fault_Exception) { throw (com.iku.odeme.data.ZCA_F001.Zca_F001_Fault_Exception)e;}
         throw createExceptionWrongExceptionType$(e);}
        if (($result == null) || ($result instanceof com.iku.odeme.data.ZCA_F001.Zca_F001_Output)){
        return (com.iku.odeme.data.ZCA_F001.Zca_F001_Output)$result;
        } else { throw createExceptionWrongType$($result);}
    }

}
