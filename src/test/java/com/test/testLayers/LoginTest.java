package com.test.testLayers;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.test.BaseClass.BaseClass;
import com.test.LoginPage.LoginPageRepo;
import com.test.commanFunctions.WaitLib;

public class LoginTest extends BaseClass {
	LoginPageRepo loginrepo;

	@BeforeMethod
	public void setUp() {
		setUpWebDriver();
		loginrepo = new LoginPageRepo(driver);
	}

	@Test
	public void loginTest() {
		try {
			WaitLib.sendKeys(driver, 30, prop.getProperty("userName"), loginrepo.getUserName());
			WaitLib.sendKeys(driver, 10, prop.getProperty("password"), loginrepo.getPassword());
			WaitLib.elementIsClickable(driver, 30, loginrepo.getLoginBtn());
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
