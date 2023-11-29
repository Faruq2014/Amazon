package com.amazon.locators;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.amazon.webDriver.BaseTest;

public class XpathStartWith extends BaseTest{
	@Test
	public void getText() {
		driver.findElement(By.xpath("//button[starts-with(@id,'u_0_5_')]")).click();
	}
	
}
