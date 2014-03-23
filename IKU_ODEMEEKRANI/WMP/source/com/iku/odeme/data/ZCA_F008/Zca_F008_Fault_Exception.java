package com.iku.odeme.data.ZCA_F008;
public class Zca_F008_Fault_Exception extends com.sap.aii.proxy.framework.core.ApplicationFaultException implements java.io.Serializable {

    private  static final long serialVersionUID = 1635821516L ;

    public com.iku.odeme.data.ZCA_F008.Zca_F008_Fault getZca_F008_Fault() {
        return (com.iku.odeme.data.ZCA_F008.Zca_F008_Fault)fault;
    }

    public void setZca_F008_Fault(com.iku.odeme.data.ZCA_F008.Zca_F008_Fault fault) {
        this.fault = fault;
    }

}
