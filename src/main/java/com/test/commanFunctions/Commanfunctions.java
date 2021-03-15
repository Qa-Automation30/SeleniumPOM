package com.test.commanFunctions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.test.BaseClass.BaseClass;

public class Commanfunctions extends BaseClass {
	static Actions action;
	static Select select;
	public static void moveToAnElement(WebElement element, WebDriver driver)
	{
		action = new Actions(driver);
		action.moveToElement(element).build().perform();
	}
	public static void swithToFrame(String frameName, WebDriver driver)
	{
		driver.switchTo().frame(frameName);
	}
	public static void JavascriptExecutor(WebDriver driver, String script, WebElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(script, element);
	}
	public static void selectByVisibleText(WebElement element, String text)
	{
		select = new Select(element);
		select.selectByVisibleText(text);
	}
	public static void selectByIndex(WebElement element, int index)
	{
		select = new Select(element);
		select.selectByIndex(index);
	}
	public static void selectByValue(WebElement element, String value)
	{
		select = new Select(element);
		select.selectByValue(value);
	}
	public static void deselectByIndex(WebElement element, int index)
	{
		select = new Select(element);
		select.selectByIndex(index);
	}
}
