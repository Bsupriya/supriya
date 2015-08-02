package com.WBQA.Utils;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageDriver {
	WebDriver driver;
	
	public void get (String url)
	{
		driver.get(url);
	}
	
	public WebElement findelement(By by)
	{
		return driver.findElement(by);
		
	}
	
	public List<WebElement> findelements(By by)
	{
		return driver.findElements(by);
	}

}
