package com.iku.odeme.data.ZCA_F005;
public class Zca_F005_Fault_Exception extends com.sap.aii.proxy.framework.core.ApplicationFaultException implements java.io.Serializable {

    private  static final long serialVersionUID = 1870859721L ;

    public void setZca_F005_Fault(com.iku.odeme.data.ZCA_F005.Zca_F005_Fault fault) {
        this.fault = fault;
    }

    public com.iku.odeme.data.ZCA_F005.Zca_F005_Fault getZca_F005_Fault() {
        return (com.iku.odeme.data.ZCA_F005.Zca_F005_Fault)fault;
    }

}
