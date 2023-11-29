package com.amazon.locators;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.amazon.webDriver.BaseTest;

public class XpathTextFunction extends BaseTest{
	@Test
	public void getText() {
		driver.findElement(By.xpath("//a[text()='Sign Up']")).click();
	}
	
}
