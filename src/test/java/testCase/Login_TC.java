package testCase;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import org.apache.log4j.Logger;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.Myproject.PageObjectModel.utils.*;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import reports.ExtentReport;

import com.Myproject.PageObjectModel.core.Core_Basic;
import com.Myproject.PageObjectModel.core.Log;
import com.Myproject.PageObjectModel.pageobjects.Login;

public class Login_TC extends Log{

	
	static final Logger logger2 = Logger.getLogger(Login_TC.class.getName());
	

	
    @Test
	public void Login_user() throws IOException
	{
    	
	    Login.wd.get("http://opensource.demo.orangehrmlive.com/index.php/auth/login");
	    Login.wd.manage().window().maximize();
	   
		Login.Usertextbox().sendKeys(Readproperties.readproperty("Username"));
		Login.password_textbox().sendKeys(Readproperties.readproperty("Password"));
		Login.login_button().click();
		
		String actual_page_title = "OrangeHRM";
		
		String expected_title = Login.wd.getTitle();
	
		try {
			 Assert.assertEquals(actual_page_title,expected_title);
			 logger2.info("Pagetitle has successfully verified");
			 ExtentReport.test.log(LogStatus.PASS, "Pagetitle Verified");
			 
		   } 
		catch (Exception e) 
		   {
			 
			   Screnshot.getscreenshot(Login.wd,"C:\\Users\\Amaresh\\Desktop\\test2.png");
				
			
	     	}
		
		
		
   
			
			//
		
		//ExtentReport.test.log(LogStatus.PASS, "Pagetitle has successfully verified");
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
    
    
 
   


