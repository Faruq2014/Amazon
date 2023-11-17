package com.amazon.webDriver;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	public WebDriver driver;
	String browser="Chrome";
	
	@BeforeMethod
	public void openApplication() {
		
	if(browser.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();	
		 driver= new ChromeDriver();
		
	}
	else if(browser.equalsIgnoreCase("edge")) {
		WebDriverManager.edgedriver().setup();
		 driver= new EdgeDriver();
	}
	else if(browser.equalsIgnoreCase("firefox")) {
		WebDriverManager.firefoxdriver().setup();
		 driver = new FirefoxDriver();
	}
	else {
		WebDriverManager.chromedriver().setup();	
		 driver= new ChromeDriver();
	}
	driver.get("https://www.amazon.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	}
	
	@AfterMethod
	public void closeApplication() {
		if(driver !=null) {
			//driver.quit();
			}
	}
}
