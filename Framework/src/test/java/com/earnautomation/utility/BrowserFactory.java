package com.earnautomation.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {
	public WebDriver driver;

	public static WebDriver startBrowserAndUrl(WebDriver driver,String browser, String appURL) {

		if (browser.equals("Firefox")) {
			driver = new FirefoxDriver();

		} else if (browser.equals("Chrome")) {
            
			
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();

		}
		else if (browser.equals("IE")) {
			driver = new InternetExplorerDriver();

		}

		else {
			System.out.println(("Browser Not Found"));
		}
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(appURL);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;

	}

	public static void quitBrowser(WebDriver driver) 
	{
         driver.quit();
	}

}
