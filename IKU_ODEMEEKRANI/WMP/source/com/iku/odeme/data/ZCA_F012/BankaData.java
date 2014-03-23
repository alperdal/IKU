/*
 * Created on 19.Mar.2014
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.iku.odeme.data.ZCA_F012;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.iku.odeme.util.SapDBUtil;
import com.sap.aii.proxy.framework.core.ApplicationFaultException;
import com.sap.aii.proxy.framework.core.SystemFaultException;
import com.sap.mw.jco.JCO;

/**
 * @author Özkan
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class BankaData {
	Log log = LogFactory.getLog(BankaData.class);
	
	public Zher_BankaType getBankaDetay(String clientid)
	{
		ZCA_F012_PortType zport = new ZCA_F012_PortType();
		
		Zca_F012_Input zin = new Zca_F012_Input();
		zin.setClientid(clientid);
		
		SapDBUtil sutil = new SapDBUtil();
		JCO.Client client = sutil.getJcoCon();
		
		zport.messageSpecifier.setJcoClient(client);
		
		try 
		{
			Zca_F012_Output zout = zport.zca_F012(zin);
			
			sutil.disconnect();
			
			return zout.getEs_Banka();
			
		} catch (SystemFaultException e) {
			
			if(client!=null && client.isAlive())
				sutil.disconnect();
			
			log.error(e);
		} catch (ApplicationFaultException e) {
			
			if(client!=null && client.isAlive())
				sutil.disconnect();
			
			log.error(e);
		}
		
		return null;
		
	}
	
}
