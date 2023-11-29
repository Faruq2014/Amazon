package com.amazon.locators;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.amazon.webDriver.BaseTest;

public class XpathIndexAxes extends BaseTest{
	@Test
	public void getIndexXpath() {
		driver.findElement(By.xpath("(//div[@id='pageFooter']/ul/li)[3]")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("(//*[@id='pageFooterChildren']/ul/li)[2]")).click();
		
	}
	
}
