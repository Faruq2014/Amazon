package com.amazon.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.amazon.webDriver.BaseTest;

public class CSSLocators extends BaseTest{

	@Test
	public void loginTest() {	
	driver.navigate().refresh();	
	driver.findElement(By.xpath("//div[@id='nav-tools']/a[2]")).click();
	       //id
	//WebElement email=driver.findElement(By.cssSelector("[id='ap_email']"));
	//WebElement email=driver.findElement(By.cssSelector("#ap_email"));
	       //name
	WebElement email=driver.findElement(By.cssSelector("[name='email']"));
	//WebElement email=driver.findElement(By.cssSelector(".email"));
	email.sendKeys("hh@hmail.com");
	
	
	}
	

}
