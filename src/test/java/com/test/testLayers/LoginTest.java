package com.test.testLayers;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.test.BaseClass.BaseClass;
import com.test.LoginPage.LoginPageAction;
import com.test.dashboardPage.DashboardAction;

public class LoginTest extends BaseClass {
	LoginPageAction loginpageaction;
	DashboardAction dashboradaction;
	@BeforeMethod
	public void setUp() {
		setUpWebDriver();
		loginpageaction = new LoginPageAction(driver);
		dashboradaction = new DashboardAction(driver);
	}

	@Test
	public void loginTest() {
		try {
			loginpageaction.loginFunction(prop.getProperty("userName"), prop.getProperty("password"));
			Assert.assertEquals(dashboradaction.validateHeaderText(),"group automation");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
