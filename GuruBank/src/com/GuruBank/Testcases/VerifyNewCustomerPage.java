/**
 * 
 */
package com.GuruBank.Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.GuruBank.Webpages.LoginPage;
import com.GuruBank.Webpages.NewCustomerPage;

/**
 * @author shubham
 *
 */
public class VerifyNewCustomerPage {
	
	@Test
	public void Customerdetails() {
		//Initialize Chrome
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\shubham\\Downloads\\chromedriver_win32\\chromedriver.exe");
		        WebDriver driver = new ChromeDriver();
		        
		        //LaunchURL
		        driver.get("http://www.demo.guru99.com/V4/");
		        driver.manage().window().maximize();
		        
		        LoginPage login = new LoginPage(driver);
		        
		        login.EnterUserID();
		        login.EnterPassword();
		        login.ClickLoginButton();
		        
		        //Enter Customer Details
		        
		        
		        NewCustomerPage custdetails = new NewCustomerPage(driver);
		        
		        custdetails.EnterCustDetails();
	}

}
