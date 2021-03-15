package com.test.testLayers;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.test.BaseClass.BaseClass;
import com.test.LoginPage.LoginPageAction;
import com.test.dashboardPage.DashboardAction;

public class DashboardTest extends BaseClass {
	LoginPageAction loginpageaction;
	DashboardAction dashboradaction;
	@BeforeMethod
	public void setUp()
	{
		setUpWebDriver();
		loginpageaction = new LoginPageAction(driver);
		dashboradaction = new DashboardAction(driver);
		loginpageaction.loginFunction(prop.getProperty("userName"), prop.getProperty("password"));
	}
	
	@Test
	public void test() throws InterruptedException
	{
		dashboradaction.createNewCompany();
		Thread.sleep(3000);
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
//s
}
