package com.amazon.locators;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.amazon.webDriver.BaseTest;

public class XpathIndex extends BaseTest{
	@Test
	public void getIndexXpath() {
		driver.findElement(By.xpath("//a[contains(@id, 'u_0_0_')]")).click();
		driver.findElement(By.xpath("(//*[text()='Sign Up'])[3]")).click();
	}
	
}
