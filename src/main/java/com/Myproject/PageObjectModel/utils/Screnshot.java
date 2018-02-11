package com.Myproject.PageObjectModel.utils;

import java.io.File;
import java.io.IOException;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screnshot {
	
	
	public static void getscreenshot(WebDriver wd,String filepath) throws IOException
    {
    	
    	TakesScreenshot ts =((TakesScreenshot)wd);
    	File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
    	File dest = new File(filepath);
        FileUtils.copyFile(screenshotAs, dest);
    	
    
}

}
