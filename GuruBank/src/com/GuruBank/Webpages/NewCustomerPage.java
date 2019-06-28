/**
 * 
 */
package com.GuruBank.Webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author shubham
 *
 *
 *This class will store all the locators and methods of the New Customer Page
 */
public class NewCustomerPage {
	
	WebDriver driver;
	
	By NewCust_Link = By.xpath("/html[1]/body[1]/div[3]/div[1]/ul[1]/li[2]/a[1]");
	By Cust_Name = By.name("name");
	By Cust_Gender_M = By.xpath("/html[1]/body[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[5]/td[2]/input[1]");
    By Cust_Gender_F = By.xpath("/html[1]/body[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[5]/td[2]/input[2]");
    By Cust_Address = By.name("addr");
    By Cust_City = By.name("city");
    By Cust_State = By.name("state");
    By Cust_Pin = By.name("pinno");
    By Cust_MobileNo = By.name("telephoneno");
    By Cust_EmailID = By.name("emailid");
    By Cust_Password = By.name("password");
    By Submit_btn = By.name("sub");
    By Reset_btn = By.name("res");
    
    public NewCustomerPage(WebDriver driver) {
    	
    	this.driver = driver;
    	
    	}
    
    public void EnterCustDetails() {
    	
    	driver.findElement(NewCust_Link).click();
    	driver.findElement(Cust_Name).sendKeys("Shubham Ahire");
    	driver.findElement(Cust_Gender_M).click();
    	driver.findElement(Cust_Address).sendKeys("Rakshak Nagar p2");
    	driver.findElement(Cust_City).sendKeys("Pune");
    	driver.findElement(Cust_State).sendKeys("Maharashtra");
    	driver.findElement(Cust_Pin).sendKeys("411014");
    	driver.findElement(Cust_MobileNo).sendKeys("7387904703");
    	driver.findElement(Cust_EmailID).sendKeys("shubhamahire277@gmail.com");
    	driver.findElement(Cust_Password).sendKeys("Shubham77");
    	driver.findElement(Reset_btn).click();
    	
    }
}




