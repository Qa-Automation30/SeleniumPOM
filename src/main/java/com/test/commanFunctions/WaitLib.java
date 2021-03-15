package com.test.commanFunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.test.BaseClass.BaseClass;

public class WaitLib extends BaseClass {
	static WebDriverWait wait;
	
	public static void sendKeys(WebDriver driver,int time,String _sendKey,WebElement element)
	{
		wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.visibilityOf(element)).sendKeys(_sendKey);	
	}
	public static void elementIsClickable(WebDriver driver,int _time, WebElement element)
	{
		wait = new WebDriverWait(driver, _time);
		wait.until(ExpectedConditions.elementToBeClickable(element)).click();
	}

}
