package com.Myproject.PageObjectModel.core;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.Myproject.PageObjectModel.pageobjects.Login;
import com.relevantcodes.extentreports.LogStatus;

import reports.ExtentReport;

public class Core_Basic {
	

	
	private static final Logger log= Logger.getLogger(Core_Basic.class.getName());
	
@BeforeTest
public void beforetest() 
{
ExtentReport.test=ExtentReport.extent.startTest("smoke test");
}


	@Parameters({"browser"})
	@Test
	public static void launchBrowser(String browser) throws IOException
	{
		Log.loadlog4j();
		
	//FIREFOX BROWSER LAUNCHING	
	if(browser.equalsIgnoreCase("FF"))
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Study\\Drivers\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		 Login.wd =new FirefoxDriver();
		 log.info("Luanching Firefox broeswer");
	}
	
	//CHROME BROWSER LAUNCHING
	else if (browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver","D:\\Study\\Essentials\\chromedriver.exe");
		Login.wd= new ChromeDriver();
		log.info("Chrome Browser Launched successfully");
		ExtentReport.test.log(LogStatus.PASS,"Browser launched successfully");
		
		
	}
		
	}
	

}
