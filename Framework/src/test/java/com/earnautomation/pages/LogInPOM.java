package com.earnautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPOM {
	public WebDriver driver;

	public LogInPOM(WebDriver ldriver) {
		this.driver = ldriver;
	}

	@FindBy(id ="txtUsername")
	WebElement username;

	@FindBy(id ="txtPassword")
	WebElement password;

	@FindBy(id ="btnLogin")
	WebElement loginbutton;

	/*
	 * @FindBy(xpath="//button[@class=\"_2KpZ6l _2doB4z\"]") WebElement cancelicon;
	 */

	public void loginToApp(String uname,String pwd) throws InterruptedException {
		
		Thread.sleep(5000);
		
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginbutton.click();
	}

	

}
