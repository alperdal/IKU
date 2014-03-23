/*
 * Created on 20.Ara.2011
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.iku.odeme.util;

import java.rmi.RemoteException;
import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.sap.mw.jco.IFunctionTemplate;
import com.sap.mw.jco.JCO;
import com.sap.security.core.server.destinations.api.DestinationException;
import com.sap.security.core.server.destinations.api.DestinationService;
import com.sap.security.core.server.destinations.api.RFCDestination;

/**
 * @author oonay
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class SapDBUtil {
	Log log = LogFactory.getLog(SapDBUtil.class);
	
	private JCO.Repository mRepository;
	private JCO.Client jcoCon;
	private JCO.Function function;
	static final String POOL_NAME = "OdemePool";
	
	public SapDBUtil(String sapid)
	{
		
		String system = System.getProperty("SAPSYSTEMNAME").toString();
		
		if (sapid.equals("EAD"))
		{
			 			
			 this.jcoCon = JCO.createClient("111", // SAP client
				 "rfcusereks", // userid
				 "qwer1234", // password
				 null, // language
				 "10.23.2.150",// application server host name						
				 "00");				   
		}		
		else if (sapid.equals("YSP"))
		{
			this.jcoCon = JCO.createClient("111", // SAP client
				 "rfcusereks", // userid
				 "qwer1234", // password
				 null, // language
				 "10.23.2.24",// application server host name						
				 "01");	
		}
		
	}	
	
	public SapDBUtil()
	{	
		String system = System.getProperty("SAPSYSTEMNAME").toString();
		JCO.Pool pool = JCO.getClientPoolManager().getPool(POOL_NAME);
		
		if (pool == null) 
		{
			if("PJD".equals(system))
			{	
				
				JCO.addClientPool(POOL_NAME, // pool name
									100, // maximum number of  connections
								  "400", // SAP client
								  "RFCPORTAL", // userid
								  "123456", // password
								  null, // language
								  "10.83.10.110",// application server host name						
								  "00"); // properties
				
			}
			else
			{
//				this.jcoCon = JCO.createClient("400", // SAP client
//					 "RFCPORTAL", // userid
//					 "pva4y9jP", // password
//					 null, // language
//					 "10.83.10.114",// application server host name						
//					 "00");			
				
//				JCO.addClientPool(POOL_NAME, // pool name
//								  1000, // maximum number of  connections
//								  "400", // SAP client
//								  "RFCPORTAL", // userid
//								  "pva4y9jP", // password
//								  null, // language
//								  "10.83.10.114",// application server host name						
//								  "00",//sysnr
//								  "EAP",//
//								  "KULTUR"); // properties
				RFCDestination dest = getPropertiesFromDest();
				
				JCO.addClientPool(POOL_NAME,dest.getMaxPoolSize(),dest.getJCoProperties());
			}		
		}
		JCO.setProperty("session_timeout", "400");
		
		jcoCon = JCO.getClient(POOL_NAME);
		
	}
	
	private RFCDestination getPropertiesFromDest() 
	{
		Context ctx = null;
		
		DestinationService dstService=null;
		try {
			ctx  = new InitialContext();
			dstService = (DestinationService) ctx.lookup(DestinationService.JNDI_KEY);
				
 			
			RFCDestination dst = (RFCDestination) dstService.getDestination("RFC", "ZHER_CONNECTION");
			return dst;
			
		} 
		catch (NamingException e) {			
			log.error(e.getMessage()+"\n\r"+myUtil.getStackTrace(e.getStackTrace()));	
		}
		catch (DestinationException e) {
			log.error(e.getMessage()+"\n\r"+myUtil.getStackTrace(e.getStackTrace()));
		}
		catch (RemoteException e) {	
			log.error(e.getMessage()+"\n\r"+myUtil.getStackTrace(e.getStackTrace()));
		}
		
		return null;
	}
	
	/**
	 * 
	 * @param funcName: Fonksiyon Adı
	 */
	public void connect(String funcName)
	{
		//this.jcoCon.connect();
		
		this.mRepository = new JCO.Repository("Repository",POOL_NAME);
		IFunctionTemplate ft = getMRepository().getFunctionTemplate(funcName.toUpperCase());
		
		if (ft != null)
			this.function = ft.getFunction();
		
	}
	
	public void disconnect()
	{
		//this.jcoCon.disconnect();
		JCO.releaseClient(jcoCon);
	}
	
	public void execute()
	{
		this.jcoCon.execute(getFunction());
	}
	
	/**
	 * @return
	 */
	public JCO.Function getFunction() {
		return function;
	}
	
	/**
	 * @return
	 */
	public JCO.Client getJcoCon() {	
		return jcoCon;
	}

	/**
	 * @return
	 */
	public JCO.Repository getMRepository() {
		return mRepository;
	}

	/**
	 * @param repository
	 */
	public void setMRepository(JCO.Repository repository) {
		mRepository = repository;
	}

}
