package com.WBQA.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.WBQA.Utils.WBy;

public class LoginPage {
	WebDriver driver;
	
	 public LoginPage (WebDriver driver)
	 {
		 this.driver=driver;
		 
	 }
	
	public void loginpage() throws Exception
	{
	 WebElement usernmae=driver.findElement(WBy.getLocator("Wbqa.Loginpage.usernametextbox"));
	 usernmae.sendKeys("supriya");
	 
	 WebElement pswd=driver.findElement(WBy.getLocator("Wbqa.Loginpage.passwordtextbox"));
	 pswd.sendKeys("priyaudhi");
	 

	 WebElement login=driver.findElement(WBy.getLocator("Wbqa.Loginpage.loginbutton"));
	 WebElement register=driver.findElement(WBy.getLocator("Wbqa.Loginpage.registerbutton"));
	 
	}
	
}
