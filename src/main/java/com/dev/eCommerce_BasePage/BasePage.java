package com.dev.eCommerce_BasePage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BasePage {

	private Properties prop;
	public static String FilePath = System.getProperty("user.dir")+"//Resources//application.properties";
	
	public Properties setProperty()
	{
		prop = new Properties();
		try{
			FileInputStream file = new FileInputStream(new File(FilePath));
			prop.load(file);
		}	
		catch (FileNotFoundException e) { e.printStackTrace(); }
		catch(IOException e) { e.printStackTrace() ;}		
		
		return prop;
	}
	
	public String getProperty(String property)
	{
		if(property.isEmpty() || property==null)
			  return property = " ";
		
		return setProperty().getProperty(property);
	}
}
