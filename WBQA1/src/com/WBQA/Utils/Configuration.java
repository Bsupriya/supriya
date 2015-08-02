package com.WBQA.Utils;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Properties;

public class Configuration<Static> {
	Properties prop=new Properties();
	public HashMap<String, String> getconfig()throws Exception
	{
	
	HashMap<String, String> config=new HashMap<String,String>();
	config.put("driver",prop.getProperty("driver"));
	config.put("url",prop.getProperty("url"));
	config.put("wait",prop.getProperty("wait"));
	return config;
	}
	
	
	
	public enum Browsers
	{
		 InternetExplorer,
	        Firefox,
	        Chrome,
	        SimpleBrowser;
		
	}
	
	public String

}
