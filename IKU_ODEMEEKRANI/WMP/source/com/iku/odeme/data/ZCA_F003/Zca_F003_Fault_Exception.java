package com.iku.odeme.data.ZCA_F003;
public class Zca_F003_Fault_Exception extends com.sap.aii.proxy.framework.core.ApplicationFaultException implements java.io.Serializable {

    private  static final long serialVersionUID = -835759673L ;

    public com.iku.odeme.data.ZCA_F003.Zca_F003_Fault getZca_F003_Fault() {
        return (com.iku.odeme.data.ZCA_F003.Zca_F003_Fault)fault;
    }

    public void setZca_F003_Fault(com.iku.odeme.data.ZCA_F003.Zca_F003_Fault fault) {
        this.fault = fault;
    }

}
