package com.test.testLayers;

import org.junit.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.test.BaseClass.BaseClass;
import com.test.LoginPage.LoginPageRepo;

public class LoginTest extends BaseClass {
	LoginPageRepo loginrepo;
	public LoginTest() {
		loginrepo = new LoginPageRepo();
	}
	
	@BeforeMethod
	public void setUp()
	{
		getWebDriver(prop.getProperty("browser"), prop.getProperty("url"));
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
