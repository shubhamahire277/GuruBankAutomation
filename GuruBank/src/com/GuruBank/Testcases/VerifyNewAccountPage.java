/**
 * 
 */
package com.GuruBank.Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.GuruBank.Webpages.LoginPage;
import com.GuruBank.Webpages.NewAccountPage;

/**
 * @author shubham
 *
 */
public class VerifyNewAccountPage {
	
	@Test
	public void NewAccount() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shubham\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        //LaunchURL
        driver.get("http://www.demo.guru99.com/V4/");
        driver.manage().window().maximize();
        
        LoginPage login = new LoginPage(driver);
        
        login.EnterUserID();
        login.EnterPassword();
        login.ClickLoginButton();
        
        //Open new account link
        driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/ul[1]/li[5]/a[1]")).click();
        
       NewAccountPage accountdetails = new NewAccountPage(driver);
       
       accountdetails.EnterCustID();
       accountdetails.SelectAccountType();
       accountdetails.EnterDepositeAmt();
       accountdetails.ClickSubmit();
       driver.switchTo().alert().accept();
        
        
        
	}

}
