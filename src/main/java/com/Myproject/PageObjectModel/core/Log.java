package com.Myproject.PageObjectModel.core;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;




public class Log {

public static final Logger logger = Logger.getLogger(Log.class.getName());
	
	
	 protected static void  loadlog4j() throws IOException
	{
		Properties prop = new Properties();
		
		
		InputStream in = new FileInputStream(new File("D:\\Study\\workspace\\Selenium_dummy_project\\Log4j.properties"));
		prop.load(in);
		PropertyConfigurator.configure(prop);
	}
	
	

}
	
	
	
	

