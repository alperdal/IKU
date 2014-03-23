package com.iku.odeme.data.ZCA_F006;
public class Zca_F006_Fault_Exception extends com.sap.aii.proxy.framework.core.ApplicationFaultException implements java.io.Serializable {

    private  static final long serialVersionUID = -1070797878L ;

    public com.iku.odeme.data.ZCA_F006.Zca_F006_Fault getZca_F006_Fault() {
        return (com.iku.odeme.data.ZCA_F006.Zca_F006_Fault)fault;
    }

    public void setZca_F006_Fault(com.iku.odeme.data.ZCA_F006.Zca_F006_Fault fault) {
        this.fault = fault;
    }

}
