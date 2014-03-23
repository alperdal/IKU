package com.iku.odeme.data.ZCA_F001;
public class Zca_F001_Fault_Exception extends com.sap.aii.proxy.framework.core.ApplicationFaultException implements java.io.Serializable {

    private  static final long serialVersionUID = 752588229L ;

    public void setZca_F001_Fault(com.iku.odeme.data.ZCA_F001.Zca_F001_Fault fault) {
        this.fault = fault;
    }

    public com.iku.odeme.data.ZCA_F001.Zca_F001_Fault getZca_F001_Fault() {
        return (com.iku.odeme.data.ZCA_F001.Zca_F001_Fault)fault;
    }

}
