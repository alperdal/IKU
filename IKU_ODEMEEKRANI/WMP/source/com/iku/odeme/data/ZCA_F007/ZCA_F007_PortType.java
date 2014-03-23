package com.iku.odeme.data.ZCA_F007;
public class ZCA_F007_PortType extends com.sap.aii.proxy.framework.core.AbstractProxy{

    private  static final com.sap.aii.proxy.framework.core.BaseProxyDescriptor staticDescriptor = com.sap.aii.proxy.framework.core.BaseProxyDescriptorFactory.createNewBaseProxyDescriptor("urn:sap-com:document:sap:rfc:functions:ZCA_F007.PortType", new java.lang.Object[][][]{{{"ZCA_F007", "zca_F007", "ZCA_F007"}, {"urn:sap-com:document:sap:rfc:functions:ZCA_F007.Input", "com.iku.odeme.data.ZCA_F007.Zca_F007_Input"}, {"urn:sap-com:document:sap:rfc:functions:ZCA_F007.Output", "com.iku.odeme.data.ZCA_F007.Zca_F007_Output"}, {"urn:sap-com:document:sap:rfc:functions:ZCA_F007.Exception", "com.iku.odeme.data.ZCA_F007.Zca_F007_Fault_Exception", "com.iku.odeme.data.ZCA_F007.Zca_F007_Fault"}}}, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO, com.iku.odeme.data.ZCA_F007.ZCA_F007_PortType.class) ;

    private  static final com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo = new com.sap.aii.proxy.framework.core.GenerationInfo("2.0", 1394712487693L) ;

    public  ZCA_F007_PortType () {
        super(staticDescriptor, staticGenerationInfo, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    public com.iku.odeme.data.ZCA_F007.Zca_F007_Output zca_F007(com.iku.odeme.data.ZCA_F007.Zca_F007_Input Zca_F007_Input) throws com.iku.odeme.data.ZCA_F007.Zca_F007_Fault_Exception, com.sap.aii.proxy.framework.core.SystemFaultException, com.sap.aii.proxy.framework.core.ApplicationFaultException{
        com.sap.aii.proxy.framework.core.BaseType $result = null;
        try {
        $result = send$(Zca_F007_Input, "urn:sap-com:document:sap:rfc:functions", "ZCA_F007.PortType", "ZCA_F007", new com.iku.odeme.data.ZCA_F007.Zca_F007_Output());
        }catch (com.sap.aii.proxy.framework.core.ApplicationFaultException e){
        if (e instanceof com.iku.odeme.data.ZCA_F007.Zca_F007_Fault_Exception) { throw (com.iku.odeme.data.ZCA_F007.Zca_F007_Fault_Exception)e;}
         throw createExceptionWrongExceptionType$(e);}
        if (($result == null) || ($result instanceof com.iku.odeme.data.ZCA_F007.Zca_F007_Output)){
        return (com.iku.odeme.data.ZCA_F007.Zca_F007_Output)$result;
        } else { throw createExceptionWrongType$($result);}
    }

}
