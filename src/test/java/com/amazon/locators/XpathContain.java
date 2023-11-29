package com.amazon.locators;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.amazon.webDriver.BaseTest;

public class XpathContain extends BaseTest{
	
	@Test
	public void loginTest() {
		//used only part of the attribute values such as email==ema
		driver.findElement(By.xpath("//input[contains(@id, 'ema')]")).sendKeys("uu@umail.com");
		driver.findElement(By.xpath("//input[contains(@name, 'pas')]")).sendKeys("jlklkj");
		//dynamic part==u_0_0_CL
		driver.findElement(By.xpath("//a[contains(@id, 'u_0_0_')]")).click();
		
	}

}
