package com.amazon.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.amazon.webDriver.BaseTest;

public class ReferencialLocators extends BaseTest{
	
	@Test
	public void loginTest() {
	driver.navigate().refresh();
	
	
	driver.findElement(By.xpath("//div[@id='nav-tools']/a[2]")).click();
	
	//formula of xpath
	/*
	 *     //tag[@attributes=' ']
	 */
	
	//WebElement email=driver.findElement(By.xpath("//input[@id='ap_email']"));
	//WebElement email=driver.findElement(By.xpath("//input[@name='email']"));
	// double xpath-- two or more 
	              //by default and condition
	              //all xpath must be right
	//WebElement email=driver.findElement(By.xpath("//input[@id='ap_email'] [@name='email1']"));
	//one of the condition must be right
	WebElement email=driver.findElement(By.xpath("//input[@name='email'or @id='ap_email']"));
	email.clear();
	email.sendKeys("jj@jmail.com");
	
	
	
	
	}
}
