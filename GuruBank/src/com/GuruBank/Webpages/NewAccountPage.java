/**
 * 
 */
package com.GuruBank.Webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * @author shubham
 *
 *This page will store all the locators and methods of new account page
 */
public class NewAccountPage {
	
	WebDriver driver;
	
	By Cust_ID = By.name("cusid");
	By Cust_AccountType = By.name("selaccount");
	By Cust_Deposite = By.name("inideposit");
	By Account_Submitbtn = By.name("button2");
	By Account_Resetbtn = By.name("reset");
	
	public NewAccountPage(WebDriver driver) {
		this.driver=driver;
		
	}
	
	public void EnterCustID () {
		
		driver.findElement(Cust_ID).sendKeys("7890");
		
		}
	
	public void SelectAccountType() {
		Select dropdown = new Select(driver.findElement(Cust_AccountType));
		dropdown.selectByVisibleText("Savings");
	}
	
	public void EnterDepositeAmt() {
		driver.findElement(Cust_Deposite).sendKeys("78000");
	}
	
	public void ClickSubmit() {
		driver.findElement(Account_Submitbtn).click();
	}
	
	
	
	

}
