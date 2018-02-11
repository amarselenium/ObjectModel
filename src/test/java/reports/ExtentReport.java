package reports;

import java.io.File;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class ExtentReport {

	
	public static ExtentReports extent;
	public static  ExtentTest test;
	
	@BeforeSuite
	public void Report()
	{
		extent = new ExtentReports("C:\\Users\\Amaresh\\Desktop\\extentreports.htm", true);
		extent.loadConfig(new File("C:\\Users\\Amaresh\\Desktop\\extent-config.xml"));
	    test=extent.startTest("smoke test");
	}
	
	  @AfterSuite
	    
	   public void Report_Close() {
		   ExtentReport.extent.endTest(ExtentReport.test);
		   ExtentReport.extent.flush();
		   ExtentReport.extent.close();
	   }
	   
	
	
}
