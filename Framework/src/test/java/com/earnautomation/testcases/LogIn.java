package com.earnautomation.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.earnautomation.pages.BaseClass;
import com.earnautomation.pages.LogInPOM;
import com.earnautomation.utility.ExcelDataReader;
import com.earnautomation.utility.Helper;

public class LogIn extends BaseClass 
{
	
	
   
	@Test
	public void loginApp() throws InterruptedException, Exception
	{
		
		
		LogInPOM loginpom=PageFactory.initElements(driver, LogInPOM.class);

		loginpom.loginToApp(excel.getStringData("LogIn", 0, 0), excel.getStringData("LogIn", 0, 1));
		
		
    }

}
