package com.Myproject.PageObjectModel.pageobjects;
import com.Myproject.PageObjectModel.core.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class Login {

	
	public static WebElement jc;
	public static WebDriver wd;
	
	//Username textbox
	public static WebElement Usertextbox()
	{
			jc=wd.findElement(By.id(Constants.username));
				return jc;
		
	}
	
	public static WebElement password_textbox()
	{
			jc=wd.findElement(By.id(Constants.password));
				return jc;
		
	}
	
	public static WebElement login_button()
	{
			jc=wd.findElement(By.id(Constants.login_btn));
				return jc;
		
	}
	
}
