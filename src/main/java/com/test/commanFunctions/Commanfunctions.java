package com.test.commanFunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.test.BaseClass.BaseClass;

public class Commanfunctions extends BaseClass {
	static Actions action;
	public static void moveToAnElement(WebElement element, WebDriver driver)
	{
		action = new Actions(driver);
		action.moveToElement(element).build().perform();
	}
}
