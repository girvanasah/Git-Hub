package com.github.base;

import org.openqa.selenium.WebElement;

public class BaseClass
{
	public void enterText(WebElement element, String text) 
	{
		element.sendKeys(text);
	}
	
	public void enter(WebElement element) 
	{
		element.click();
	}
}
