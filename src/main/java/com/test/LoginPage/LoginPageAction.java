package com.test.LoginPage;

import org.openqa.selenium.WebDriver;

import com.test.BaseClass.BaseClass;
import com.test.commanFunctions.Commanfunctions;
import com.test.commanFunctions.WaitLib;
import com.test.dashboardPage.DashboardAction;


public class LoginPageAction extends BaseClass {
	LoginPageRepo loginrepo;
	public LoginPageAction(WebDriver driver)
	{
		loginrepo = new LoginPageRepo(driver);
	}
	
	public DashboardAction loginFunction(String _userName, String _password)
	{
		WaitLib.sendKeys(driver, 10,_userName,loginrepo.getUserName());
		WaitLib.sendKeys(driver, 10, _password,loginrepo.getPassword());
		 Commanfunctions.JavascriptExecutor(driver, "arguments[0].click();", loginrepo.getLoginBtn());
		return new DashboardAction(driver);
	}
}
