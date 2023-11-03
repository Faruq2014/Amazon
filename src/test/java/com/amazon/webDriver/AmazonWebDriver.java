package com.amazon.webDriver;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonWebDriver implements WebDriver{

	@Override
	public void get(String url) {
		// to open application
		
	}

	@Override
	public String getCurrentUrl() {
		// TODO get url from the web site
		return null;
	}

	@Override
	public String getTitle() {
		// TODO get title from the web site
		return null;
	}

	@Override
	public List<WebElement> findElements(By by) {
		// TODO to find list of locators
		return null;
	}

	@Override
	public WebElement findElement(By by) {
		// TODO to find one locator
		return null;
	}

	@Override
	public String getPageSource() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void close() {
		// TODO close current application/tab
		
	}

	@Override
	public void quit() {
		// TODO kill the whole browser
		
	}

	@Override
	public Set<String> getWindowHandles() {
		// TODO multiple tab
		return null;
	}

	@Override
	public String getWindowHandle() {
		// TODO one tab
		return null;
	}

	@Override
	public TargetLocator switchTo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Navigation navigate() {
		// TODO to traverse between tab/window
		return null;
	}

	@Override
	public Options manage() {
		// TODO interface method
		return null;
	}

}
