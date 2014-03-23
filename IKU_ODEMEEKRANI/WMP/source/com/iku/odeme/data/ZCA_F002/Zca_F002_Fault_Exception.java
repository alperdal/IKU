package com.iku.odeme.data.ZCA_F002;
public class Zca_F002_Fault_Exception extends com.sap.aii.proxy.framework.core.ApplicationFaultException implements java.io.Serializable {

    private  static final long serialVersionUID = 2105897926L ;

    public com.iku.odeme.data.ZCA_F002.Zca_F002_Fault getZca_F002_Fault() {
        return (com.iku.odeme.data.ZCA_F002.Zca_F002_Fault)fault;
    }

    public void setZca_F002_Fault(com.iku.odeme.data.ZCA_F002.Zca_F002_Fault fault) {
        this.fault = fault;
    }

}
