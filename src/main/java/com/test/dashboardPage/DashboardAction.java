package com.test.dashboardPage;

import org.openqa.selenium.WebDriver;

import com.test.BaseClass.BaseClass;
import com.test.commanFunctions.Commanfunctions;

public class DashboardAction extends BaseClass {
	DashboardRepo dashboardrepo;
	public DashboardAction(WebDriver driver)
	{
		dashboardrepo = new DashboardRepo(driver);
	}
	public void clickOnNewComapny()
	{
		Commanfunctions.moveToAnElement(dashboardrepo.getCompanies(), driver);
		dashboardrepo.getNewCompany().click();
	}
	public String validateHeaderText()
	{
		driver.switchTo().frame("mainpanel");
		String[] s1 = dashboardrepo.getHeaderText().getText().trim().split(" ");
		return s1[1]+" "+s1[2];
	}
}
