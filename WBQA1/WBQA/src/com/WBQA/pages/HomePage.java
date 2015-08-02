package com.WBQA.pages;

import java.util.HashMap;

import javax.swing.Spring;

import com.WBQA.Utils.WBy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.WBQA.base.Basepage;

public class HomePage<Webelements> extends Basepage {

	public HomePage(WebDriver driver) {
		super(driver);
		
	}
	
	public String[] getHomepageLinks() throws Exception
	{
		
		java.util.List<WebElement> homepagelinks =driver.findElements(WBy.getLocator("Wbqa.homepagelinks"));
		String[] links=new String[homepagelinks.size()];
		int count=0;
		for(WebElement link:homepagelinks)
		{
			links[count]=link.getAttribute("href");
			count++;
		}
		return links;
		
	}
	
	public HashMap<String,String> getslidesinfo() throws Exception
	{
		java.util.List<WebElement> slider =driver.findElements(WBy.getLocator("Wbqa.homepage.slider"));
		int slides=slider.size();
		HashMap<String,String> Allslides=new HashMap<String,String>();
		if(slides!=0)
				{
			
			      for(WebElement everyslide:driver.findElements(WBy.getLocator("Wbqa.homepage.sliderlinks")))
			         {
			    	  String title=everyslide.findElement(WBy.getLocator("Wbqa.homepage.title")).getText().trim();
			    	  String description=everyslide.findElement(WBy.getLocator("Wbqa.homepage.description")).getText().trim();
			    	  Allslides.put(title,description);
			         }
			
				}
		 
		return Allslides;
	}
	
	public String[] isLatestnewsinfo() throws Exception
	{
		if((driver.findElements(WBy.getLocator("Wbqa.homepage.news")).size())!=0)
		{
		
		java.util.List<WebElement> text =driver.findElements(WBy.getLocator("Wbqa.homepage.text"));
		String[] texts=new String[text.size()];
		int count=0;
		for(WebElement link:text)
		{
			texts[count]=link.findElement(WBy.getLocator("Wbqa.homepage.text")).getText().trim();
			count++;
		}
		return texts;
				
	}
	}
	
	public String isprmoboxpresent() throws Exception
	{
		String link=null;
		if((driver.findElements(WBy.getLocator("Wbqa.homepage.promobox")).size())!=0)
		{
		link=driver.findElement(WBy.getLocator("Wbqa.homepage.enrollink")).getAttribute("href");
			
	
		}
		return link;
	}
	public String[] getrecentclasses() throws Exception
	{
		
		java.util.List<WebElement> recentclasslinks =driver.findElements(WBy.getLocator("Wbqa.homepage.recentclasses"));
		String[] links=new String[recentclasslinks.size()];
		int count=0;
		for(WebElement link:recentclasslinks)
		{
			links[count]=link.getAttribute("href");
			count++;
		}
		return links;
		
	}
	
	public void playvedio() throws Exception{
		
	WebDriverWait wait = new WebDriverWait(driver, 20);
	WebElement playerIframe = wait.until(ExpectedConditions.visibilityOfElementLocated(WBy.getLocator("Wbqa.homepage.vediolink")));
	driver.switchTo().frame(playerIframe);

	driver.findElement(WBy.getLocator("Wbqa.homepage.vediobutton")).click();
	}
}
