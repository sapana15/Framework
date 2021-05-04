package com.earnautomation.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.earnautomation.utility.BrowserFactory;
import com.earnautomation.utility.ConfigDataReader;
import com.earnautomation.utility.ExcelDataReader;
import com.earnautomation.utility.Helper;

public class BaseClass {

	public static WebDriver driver;
	public static ExcelDataReader excel;
	public static ConfigDataReader config;

	@BeforeSuite
	public void setUpSuit() {
		excel = new ExcelDataReader();
		config = new ConfigDataReader();
	}

	@BeforeClass
	public void setUp() {
		driver = BrowserFactory.startBrowserAndUrl(driver, config.getBrowser(), config.getStagingURL());
	}

	@AfterClass
	public void quitBrowser() {
		BrowserFactory.quitBrowser(driver);
	}

	@AfterMethod
	public void tearDown(ITestResult result) {

		if (ITestResult.FAILURE == result.getStatus()) {
			try {
				Helper.takeScreenshot(driver, result.getName());
			} catch (Exception e) {

				e.getMessage();
			}
		}

	}

}
