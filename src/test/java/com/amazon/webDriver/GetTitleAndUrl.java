package com.amazon.webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTitleAndUrl {

	@Test
	public void titleAndUrl() {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver= new EdgeDriver();
		driver.get("https://www.amazon.com/");
		
		//title test
	    String expectedTtile="Amazon.com. Spend less. Smile more.";
		String actualTitle=driver.getTitle();
		System.out.println("This is Amazon title  "+actualTitle);
		Assert.assertEquals(expectedTtile, actualTitle);
		
		//Url test
		String expectedUrl="https://www.amazon.com/";
		String actualUrl=driver.getCurrentUrl();
		System.out.println(actualUrl);
		Assert.assertEquals(expectedUrl, actualUrl);
		
		driver.quit();
	}
}
