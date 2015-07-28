package com.testclass;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.junit.*;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.Test;

import com.pageclass.Baseclass;

public class bsepagetest {
	
		WebDriver driver;
		@BeforeClass
		 public void readlocators()
		 {
			Properties  alocators=new Properties();
				try {
					alocators.load(new FileInputStream("mapping.properties"));
				} 
				catch (FileNotFoundException e) {
					
					e.printStackTrace();
				} catch (IOException e) {
				
					e.printStackTrace();
				}
			
			
		 }
		@BeforeTest
		public void setup()
		{
			driver= new FirefoxDriver();
			driver.manage().window().maximize();
			
			driver.get("http://whiteboxqa.com/");
			
		}
		
		@Test
		public void logintest(){
			
			Baseclass Bc=new Baseclass(driver);
			Bc.loginlink();
			WebElement loginButton=driver.findElement(By.id("loginButton"));
		
			
		}
		
}
