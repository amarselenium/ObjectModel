package com.Myproject.PageObjectModel.utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Myproject.PageObjectModel.pageobjects.Login;

public class Waits {

	
		
		public static void ExplicitWait(WebElement wb, int time)
		{
			WebDriverWait wait = new WebDriverWait(Login.wd, time);
			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(wb));
	    }
		
		
	}


