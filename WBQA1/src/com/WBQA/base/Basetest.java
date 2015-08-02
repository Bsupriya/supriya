package com.WBQA.base;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.util.Properties;

	import org.junit.BeforeClass;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.*;

	public class Basetest {
		
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
				
				Basepageclass Bc=new Basepageclass(driver);
				try {
					Bc.loginlink();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			
				
			}
			
	}

