package com.erk.erkantek.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {

	private static Properties configfile;
	
	static {
		
		try {
			String path="Configuration.properties";
			FileInputStream input = new FileInputStream(path);
			
			configfile = new Properties();
			configfile.load(input);
			
		}catch(Exception e) {
			
			e.printStackTrace();
		
		}
		
		
	}

	public static String getProperty(String keyName) {
		return configfile.getProperty(keyName);
	}
	
	
	
	
	
}
