package com.earnautomation.utility;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Helper 
{

	public static void takeScreenshot(WebDriver driver,String screenshotname) throws IOException
	{
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		org.openqa.selenium.io.FileHandler.copy(src, new File("./Screenshots/"+screenshotname+".png"));
		
	}
	
	
	
	
	
	
}
