/**
 * 
 */
package com.GuruBank.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.GuruBank.Webpages.LoginPage;

/**
 * @author shubham
 *
 */
public class VerifyLoginPage {
	
	@Test
	public void verifyValidLogin() {
		
		//Initialize Chrome
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shubham\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        //LaunchURL
        driver.get("http://www.demo.guru99.com/V4/");
        
        LoginPage login = new LoginPage(driver);
        
        login.EnterUserID();
        login.EnterPassword();
        login.ClickLoginButton();
        
        //driver.quit();
        
	}

}
