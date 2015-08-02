package com.WBQA.Utils;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public interface  Elementscontainer {
	
	WebElement findelement(By by);
	
	List<WebElement> findfindelements(By by);
	
	String Getdescription();
	

}
