package com.WBQA.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	WebDriver driver;
	
	 public LoginPage (WebDriver driver)
	 {
		 this.driver=driver;
		 
	 }
	
	public void loginpag()
	{
	 WebElement usernmae=driver.findElement(By.id("username"));
	 usernmae.sendKeys("supriya");
	 
	 WebElement pswd=driver.findElement(By.id("password"));
	 pswd.sendKeys("priyaudhi");
	 
	 WebElement login=driver.findElement(By.id("login"));
	 login.click();
	}
	
}
