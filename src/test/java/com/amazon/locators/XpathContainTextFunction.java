package com.amazon.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.amazon.webDriver.BaseTest;

public class XpathContainTextFunction extends BaseTest{
	@Test
	public void containText() {
		WebElement ConnectText=driver.findElement(By.xpath("//h2[contains(text(),'Connect with friends')]"));
		System.out.println(ConnectText.getText());
		
	}

}
