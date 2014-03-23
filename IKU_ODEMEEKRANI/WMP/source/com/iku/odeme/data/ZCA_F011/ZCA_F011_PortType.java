package com.iku.odeme.data.ZCA_F011;
public class ZCA_F011_PortType extends com.sap.aii.proxy.framework.core.AbstractProxy{

    private  static final com.sap.aii.proxy.framework.core.BaseProxyDescriptor staticDescriptor = com.sap.aii.proxy.framework.core.BaseProxyDescriptorFactory.createNewBaseProxyDescriptor("urn:sap-com:document:sap:rfc:functions:ZCA_F011.PortType", new java.lang.Object[][][]{{{"ZCA_F011", "zca_F011", "ZCA_F011"}, {"urn:sap-com:document:sap:rfc:functions:ZCA_F011.Input", "com.iku.odeme.data.ZCA_F011.Zca_F011_Input"}, {"urn:sap-com:document:sap:rfc:functions:ZCA_F011.Output", "com.iku.odeme.data.ZCA_F011.Zca_F011_Output"}}}, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO, com.iku.odeme.data.ZCA_F011.ZCA_F011_PortType.class) ;

    private  static final com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo = new com.sap.aii.proxy.framework.core.GenerationInfo("2.0", 1395222531623L) ;

    public  ZCA_F011_PortType () {
        super(staticDescriptor, staticGenerationInfo, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    public com.iku.odeme.data.ZCA_F011.Zca_F011_Output zca_F011(com.iku.odeme.data.ZCA_F011.Zca_F011_Input Zca_F011_Input) throws com.sap.aii.proxy.framework.core.SystemFaultException, com.sap.aii.proxy.framework.core.ApplicationFaultException{
        com.sap.aii.proxy.framework.core.BaseType $result = null;
        try {
        $result = send$(Zca_F011_Input, "urn:sap-com:document:sap:rfc:functions", "ZCA_F011.PortType", "ZCA_F011", new com.iku.odeme.data.ZCA_F011.Zca_F011_Output());
        }catch (com.sap.aii.proxy.framework.core.ApplicationFaultException e){
         throw createExceptionWrongExceptionType$(e);}
        if (($result == null) || ($result instanceof com.iku.odeme.data.ZCA_F011.Zca_F011_Output)){
        return (com.iku.odeme.data.ZCA_F011.Zca_F011_Output)$result;
        } else { throw createExceptionWrongType$($result);}
    }

}
