/*
 * Created on 19.Mar.2014
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.iku.odeme.bean;

/**
 * @author Özkan
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class OdemeBean {
	private String AuthCode;
	private String Response;
	private String HostRefNum;
	private String ProcReturnCode;
	private String TransId;
	private String ErrMsg;
    private String status;
    private String mdStatus;   
    private String odemeID;    
    private boolean guvenlikUyarisi=false;

    public boolean isGuvenlikUyarisi() {
        return guvenlikUyarisi;
    }

    public void setGuvenlikUyarisi(boolean guvenlikUyarisi) {
        this.guvenlikUyarisi = guvenlikUyarisi;
    }



    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

	/**
	 * @return
	 */
	public String getAuthCode() {
		return AuthCode;
	}

	/**
	 * @return
	 */
	public String getErrMsg() {
		return ErrMsg;
	}

	/**
	 * @return
	 */
	public String getHostRefNum() {
		return HostRefNum;
	}

	/**
	 * @return
	 */
	public String getProcReturnCode() {
		return ProcReturnCode;
	}

	/**
	 * @return
	 */
	public String getResponse() {
		return Response;
	}

	/**
	 * @return
	 */
	public String getTransId() {
		return TransId;
	}

	/**
	 * @param string
	 */
	public void setAuthCode(String string) {
		AuthCode = string;
	}

	/**
	 * @param string
	 */
	public void setErrMsg(String string) {
		ErrMsg = string;
	}

	/**
	 * @param string
	 */
	public void setHostRefNum(String string) {
		HostRefNum = string;
	}

	/**
	 * @param string
	 */
	public void setProcReturnCode(String string) {
		ProcReturnCode = string;
	}

	/**
	 * @param string
	 */
	public void setResponse(String string) {
		Response = string;
	}

	/**
	 * @param string
	 */
	public void setTransId(String string) {
		TransId = string;
	}

	/**
	 * @return
	 */
	public String getOdemeID() {
		return odemeID;
	}

	/**
	 * @param string
	 */
	public void setOdemeID(String string) {
		odemeID = string;
	}

	/**
	 * @return
	 */
	public String getMdStatus() {
		return mdStatus;
	}

	/**
	 * @param string
	 */
	public void setMdStatus(String string) {
		mdStatus = string;
	}

}
