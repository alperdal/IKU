package com.iku.odeme.bean;

import org.json.simple.JSONAware;
import org.json.simple.JSONObject;

public class ComboBean implements JSONAware {
	private String id;
	private String label;
	
	public ComboBean(String ID,String LABEL)
	{
		this.id = ID;
		this.label = LABEL;
	}
	
	public String toJSONString() {
		JSONObject jo = new JSONObject();
		jo.put("value",id);
		jo.put("text",label);
		
		return jo.toString();
	}

}