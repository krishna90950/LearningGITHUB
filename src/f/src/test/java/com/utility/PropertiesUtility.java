package com.utility;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;


public class PropertiesUtility {
	
	public static String getData(String key) throws IOException {
		
		File file = new File ("C:\\Users\\Krishna\\Desktop\\TestData1.properties");
		FileReader reader = new FileReader (file);
		Properties prop = new Properties();
		prop.load(reader);
		return (String) prop.get(key);
	}

}
