/*
 * Created on 24.Eyl.2010
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.iku.odeme.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sap.security.api.IUser;
import com.sap.security.api.UMException;
import com.sap.security.api.UMFactory;


/**
 * @author oonay
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class epUtil {
	public static String getUserID(HttpServletRequest request,HttpServletResponse response)
	{
		IUser user =UMFactory.getAuthenticator().getLoggedInUser(request,response);
	
		String username=null;
		if(user!=null)				
		{
			username=user.getUniqueName();
		}
	
		return username;
	}

	public static IUser getUser(HttpServletRequest request,HttpServletResponse response)
	{
		IUser user = UMFactory.getAuthenticator().getLoggedInUser(request,response);
	
		return user;
	}

	public static String getDisplayName(HttpServletRequest request,HttpServletResponse response)
	{
		IUser user =UMFactory.getAuthenticator().getLoggedInUser(request,response);
	
		String username=null;
		if(user!=null)				
		{
			username=user.getDisplayName();
		}
	
		return username;
	}
	
	public static String getDisplayName(String userid)
	{
		String username="";
		try {
			IUser user = UMFactory.getUserFactory().getUserByLogonID(userid);
			
			if(user!=null)				
			{
				if(!"".equals(user.getFirstName()) && !"".equals(user.getLastName())) 
					username=user.getFirstName() + " " + user.getLastName();
				else
					username=user.getDisplayName();
			}
			
		} catch (UMException e) {
			username = "";
		}
	
		return username;
	}		
	
	public static boolean userRoleControl(HttpServletRequest request,HttpServletResponse response,String roleId)
	{
		IUser user =UMFactory.getAuthenticator().getLoggedInUser(request,response);
	
		boolean exist=false;
		if(user!=null && user.isMemberOfRole(roleId,false))				
		{
			exist = true;
		}
		else
		{
			exist = false;
		}
	
		return exist;
	}
	
	public static boolean userRoleControl(IUser user,String roleId)
	{
		
		boolean exist=false;
		if(user!=null && user.isMemberOfRole(roleId,false))				
		{
			exist = true;
		}
		else
		{
			exist = false;
		}

		return exist;
	}	
}
