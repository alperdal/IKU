package com.iku.odeme.data.ZCA_F004;
public class Zca_F004_Fault_Exception extends com.sap.aii.proxy.framework.core.ApplicationFaultException implements java.io.Serializable {

    private  static final long serialVersionUID = 517550024L ;

    public com.iku.odeme.data.ZCA_F004.Zca_F004_Fault getZca_F004_Fault() {
        return (com.iku.odeme.data.ZCA_F004.Zca_F004_Fault)fault;
    }

    public void setZca_F004_Fault(com.iku.odeme.data.ZCA_F004.Zca_F004_Fault fault) {
        this.fault = fault;
    }

}
