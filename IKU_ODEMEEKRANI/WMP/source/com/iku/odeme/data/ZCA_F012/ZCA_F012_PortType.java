package com.iku.odeme.data.ZCA_F012;
public class ZCA_F012_PortType extends com.sap.aii.proxy.framework.core.AbstractProxy{

    private  static final com.sap.aii.proxy.framework.core.BaseProxyDescriptor staticDescriptor = com.sap.aii.proxy.framework.core.BaseProxyDescriptorFactory.createNewBaseProxyDescriptor("urn:sap-com:document:sap:rfc:functions:ZCA_F012.PortType", new java.lang.Object[][][]{{{"ZCA_F012", "zca_F012", "ZCA_F012"}, {"urn:sap-com:document:sap:rfc:functions:ZCA_F012.Input", "com.iku.odeme.data.ZCA_F012.Zca_F012_Input"}, {"urn:sap-com:document:sap:rfc:functions:ZCA_F012.Output", "com.iku.odeme.data.ZCA_F012.Zca_F012_Output"}}}, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO, com.iku.odeme.data.ZCA_F012.ZCA_F012_PortType.class) ;

    private  static final com.sap.aii.proxy.framework.core.GenerationInfo staticGenerationInfo = new com.sap.aii.proxy.framework.core.GenerationInfo("2.0", 1395224462978L) ;

    public  ZCA_F012_PortType () {
        super(staticDescriptor, staticGenerationInfo, com.sap.aii.proxy.framework.core.FactoryConstants.CONNECTION_TYPE_JCO);
        
    }

    public com.iku.odeme.data.ZCA_F012.Zca_F012_Output zca_F012(com.iku.odeme.data.ZCA_F012.Zca_F012_Input Zca_F012_Input) throws com.sap.aii.proxy.framework.core.SystemFaultException, com.sap.aii.proxy.framework.core.ApplicationFaultException{
        com.sap.aii.proxy.framework.core.BaseType $result = null;
        try {
        $result = send$(Zca_F012_Input, "urn:sap-com:document:sap:rfc:functions", "ZCA_F012.PortType", "ZCA_F012", new com.iku.odeme.data.ZCA_F012.Zca_F012_Output());
        }catch (com.sap.aii.proxy.framework.core.ApplicationFaultException e){
         throw createExceptionWrongExceptionType$(e);}
        if (($result == null) || ($result instanceof com.iku.odeme.data.ZCA_F012.Zca_F012_Output)){
        return (com.iku.odeme.data.ZCA_F012.Zca_F012_Output)$result;
        } else { throw createExceptionWrongType$($result);}
    }

}
