package com.iku.odeme.data.ZCA_F007;
public class Zca_F007_Fault_Exception extends com.sap.aii.proxy.framework.core.ApplicationFaultException implements java.io.Serializable {

    private  static final long serialVersionUID = 282511819L ;

    public com.iku.odeme.data.ZCA_F007.Zca_F007_Fault getZca_F007_Fault() {
        return (com.iku.odeme.data.ZCA_F007.Zca_F007_Fault)fault;
    }

    public void setZca_F007_Fault(com.iku.odeme.data.ZCA_F007.Zca_F007_Fault fault) {
        this.fault = fault;
    }

}
