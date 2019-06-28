/**
 * 
 */
package com.GuruBank.Webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author shubham
 *
 *This class will store all the locators and method of the Login Page
 *
 */
public class LoginPage {
	
	WebDriver driver;
	
	By UserID = By.name("uid");
	By Password = By.name("password");
	By LoginButton = By.name("btnLogin");
	By ResetButton = By.name("btnReset");
	
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	public void EnterUserID() {
		
		driver.findElement(UserID).sendKeys("mngr205073");
		
	}
	
	public void EnterPassword() {
		
		driver.findElement(Password).sendKeys("arUburA");
		
	}
	
	public void ClickLoginButton() {
		
		driver.findElement(LoginButton).click();
		
	}

}
