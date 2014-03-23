package com.iku.odeme.data.ZCA_F005;
public class ZCA_F005_PortType extends com.sap.aii.proxy.framework.core.AbstractProxy{

    private  static final com.sap.aii.proxy.framework.core.BaseProxyDescriptor staticDescriptor = com.sap.aii.proxy.framework.core.BaseProxyDescriptorFactory.createNewBaseProxyDescriptor("urn:sap-com:document:sap:rfc:functions:ZCA_F005.PortType", new java.lang.Object[][][]{{{"ZCA_F005", "zca_F005", "ZCA_F005"}, {"urn:sap-com:document:sap:rfc:functions:ZCA_F005.Input", "com.iku.odeme.data.ZCA_F005.Zca_F005_Input"}, {"urn:sap-com:document:sap:rfc:functions:ZCA_F005.Output", "com.iku.odeme.data.ZCA_F005.Zca_F005_Output"}, {"urn:sap-com:document:sap:rfc:functions:ZCA_F005.Exception", "com.iku.odeme.data.ZCA_F005.Zca_F005_Fault_Exception", "com.iku.odeme.data.ZCA_F005.Zca_F005_Fault"}}}, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO, com.iku.odeme.data.ZCA_F005.ZCA_F005_PortType.class) ;

    private  static final com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo = new com.sap.aii.proxy.framework.core.GenerationInfo("2.0", 1394712624505L) ;

    public  ZCA_F005_PortType () {
        super(staticDescriptor, staticGenerationInfo, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    public com.iku.odeme.data.ZCA_F005.Zca_F005_Output zca_F005(com.iku.odeme.data.ZCA_F005.Zca_F005_Input Zca_F005_Input) throws com.sap.aii.proxy.framework.core.SystemFaultException, com.iku.odeme.data.ZCA_F005.Zca_F005_Fault_Exception, com.sap.aii.proxy.framework.core.ApplicationFaultException{
        com.sap.aii.proxy.framework.core.BaseType $result = null;
        try {
        $result = send$(Zca_F005_Input, "urn:sap-com:document:sap:rfc:functions", "ZCA_F005.PortType", "ZCA_F005", new com.iku.odeme.data.ZCA_F005.Zca_F005_Output());
        }catch (com.sap.aii.proxy.framework.core.ApplicationFaultException e){
        if (e instanceof com.iku.odeme.data.ZCA_F005.Zca_F005_Fault_Exception) { throw (com.iku.odeme.data.ZCA_F005.Zca_F005_Fault_Exception)e;}
         throw createExceptionWrongExceptionType$(e);}
        if (($result == null) || ($result instanceof com.iku.odeme.data.ZCA_F005.Zca_F005_Output)){
        return (com.iku.odeme.data.ZCA_F005.Zca_F005_Output)$result;
        } else { throw createExceptionWrongType$($result);}
    }

}
