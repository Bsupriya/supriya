package com.WBQA.base;

import com.WBQA.Utils.WBy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.WBQA.Utils.WBy;

public class Basepage {
	
	protected WebDriver driver;
	
	
	public Basepage (WebDriver driver)
	 {
		 this.driver=driver;
		 
	 }
	  
	 
	   public void checklogo() throws Exception
	 {
		
	 WebElement logo=driver.findElement(WBy.getLocator("WBQA.header.logo")); 

	 }
	 
	 public void loginlink() throws Exception
	 {
		 
		 WebElement loginButton=driver.findElement(WBy.getLocator("WBQA.header.loginButton"));
		// loginButton.click();
		 
	 }
	public void gotoavatar() throws Exception
	{
		 
		 WebElement avatarlink=driver.findElement(WBy.getLocator("WBQA.header.avatarlink"));
		//avatarlink.click();
		
	}
	public void checkphno() throws Exception
	{
	
		 WebElement phno=driver.findElement(WBy.getLocator("WBQA.Footer.phno"));
		//phno.click();
	}
	public void checkemailid() throws Exception
	{
		 
		 WebElement mailid=driver.findElement(WBy.getLocator("WBQA.Footer.mailid"));
		//mailid.click();
	}
}


