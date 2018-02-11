package testCase;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.Myproject.PageObjectModel.pageobjects.Login;
import com.Myproject.PageObjectModel.utils.Screnshot;
import com.relevantcodes.extentreports.LogStatus;

import reports.ExtentReport;

public class Pagetitle_TC {
	
	static final Logger logger2 = Logger.getLogger(Pagetitle_TC.class.getName());
	
	static String actual_page_title = "OrangeHRM";
	
	@Test
	public void pagetitle_verify() throws IOException
	{
		
		
		String expected_title = Login.wd.getTitle();
	
		try {
			 Assert.assertEquals(actual_page_title,expected_title);
			 logger2.info("Pagetitle has successfully verified");
			 ExtentReport.test.log(LogStatus.PASS, "Pagetitle Verified");
			 
		   } 
		catch (Exception e) 
		   {
			 logger2.error("pagetitle is incorrect");
			   Screnshot.getscreenshot(Login.wd,"C:\\Users\\Amaresh\\Desktop\\test2.png");
	     	}
	}
	
	@AfterTest
	public void aftertest()
	{
		Login.wd.close();
	    Login.wd.quit();
		ExtentReport.test.log(LogStatus.INFO, "browser closed successfully");
		ExtentReport.extent.endTest(ExtentReport.test);
		ExtentReport.extent.flush();
		ExtentReport.extent.close();
	}
    
	

}
