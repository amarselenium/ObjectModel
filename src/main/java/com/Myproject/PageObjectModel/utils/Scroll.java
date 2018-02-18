package com.Myproject.PageObjectModel.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.Myproject.PageObjectModel.pageobjects.Login;

public class Scroll {

	public static void scroll(WebElement wb)
	{
		JavascriptExecutor js = (JavascriptExecutor)Login.wd;
		js.executeScript("arguments[0].scrollIntoView();",wb);
	}
	
	
	
}
