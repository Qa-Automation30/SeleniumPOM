package com.test.dashboardPage;

import org.openqa.selenium.WebDriver;

import com.test.BaseClass.BaseClass;
import com.test.commanFunctions.Commanfunctions;
import com.test.commanFunctions.WaitLib;

public class DashboardAction extends BaseClass {
	DashboardRepo dashboardrepo;
	public DashboardAction(WebDriver driver)
	{
		dashboardrepo = new DashboardRepo(driver);
	}
	public void createNewCompany() throws InterruptedException
	{
		Commanfunctions.swithToFrame("mainpanel", driver);
		Commanfunctions.moveToAnElement(dashboardrepo.getCompanies(), driver);
		Commanfunctions.JavascriptExecutor(driver, "arguments[0].click();", dashboardrepo.getNewCompany());
		WaitLib.sendKeys(driver, 10, "Test123", dashboardrepo.getCompanyName());
		Commanfunctions.selectByVisibleText(dashboardrepo.getStatus(), "Inactive");
		Commanfunctions.selectByIndex(dashboardrepo.getCategory(), 2);
		Commanfunctions.selectByValue(dashboardrepo.getSource(), "Import");
		Thread.sleep(2000);
		Commanfunctions.deselectByIndex(dashboardrepo.getStatus(),0);
		Commanfunctions.deselectByIndex(dashboardrepo.getCategory(),0);
		Commanfunctions.deselectByIndex(dashboardrepo.getSource(), 0);
		Thread.sleep(2000);
	}
	public String validateHeaderText()
	{
		Commanfunctions.swithToFrame("mainpanel", driver);
		String[] s1 = dashboardrepo.getHeaderText().getText().trim().split(" ");
		return s1[1]+" "+s1[2];
	}
}
