package com.amazon.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.amazon.webDriver.BaseTest;

public class DirectLocaror extends BaseTest{
	
	@Test(priority=0)
	public void loginTest() {
		System.out.println("hello test one");
		driver.getTitle();
		
		driver.findElement(By.xpath("//div[@id='nav-tools']/a[2]")).click();
		//id--is the most unique one and best choice
		//driver.findElement(By.id("ap_email")).sendKeys("hhhk@nmail.com");
		
		//name--is the 2nd choice-- it may be unique 
		driver.findElement(By.name("email")).sendKeys("hhhk@nmail.com");
		
		//className--is the last choice-- it may not be unique 
		//driver.findElement(By.className("a-input-text a-span12 auth-autofocus auth-required-field")).sendKeys("hhhk@nmail.com");
		
		driver.findElement(By.id("continue")).click();
		//create a webElement variable
		WebElement createAccount=driver.findElement(By.id("createAccountSubmit"));
		System.out.println("the text is >>> "+createAccount.getText());
		System.out.println(createAccount.getAttribute("id"));
		System.out.println(createAccount.getAttribute("class"));
		createAccount.click();
		//link text
		  // start with a  and >link text<
		WebElement condition=driver.findElement(By.linkText("Conditions of Use"));
		System.out.println("the tag is >>> "+condition.getTagName()+
				"  is it enable  "+condition.isEnabled());
		condition.click();
		
		//partial text
		  //if original value is too long, then better use partial text
		
		WebElement terms=driver.findElement(By.partialLinkText("AMAZON INFLUENCER TERMS"));
		System.out.println("the text is  "+terms.getText());
		terms.click();
	}
	
	

}
