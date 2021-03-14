package com.test.testLayers;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.test.BaseClass.BaseClass;
import com.test.LoginPage.LoginPageRepo;

public class LoginTest extends BaseClass {
	LoginPageRepo loginrepo;
	
	@BeforeMethod
	public void setUp()
	{
		setUpWebDriver();
		loginrepo = new LoginPageRepo();
	}
	
	@Test
	public void loginTest()
	{
		loginrepo.getUserName().sendKeys("vivek");
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
