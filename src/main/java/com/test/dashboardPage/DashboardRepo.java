package com.test.dashboardPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.BaseClass.BaseClass;

public class DashboardRepo extends BaseClass {
	public DashboardRepo(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Companies']")
	private WebElement companies;
	@FindBy(xpath="//a[@title='Calendar']")
	private WebElement calendra;
	@FindBy(xpath="//a[@title='New Company']")
	private WebElement newCompany;
	@FindBy(xpath="(//td[@class='headertext'])[1]")
	private WebElement headerText;
	@FindBy(id="company_name")
	private WebElement companyName;
	@FindBy(xpath="//strong[contains(text(),'Status')]/parent::td/following-sibling::td/select")
	private WebElement status;
	@FindBy(xpath="//select[@name='category']")
	private WebElement category;
	@FindBy(xpath="//select[@name='source']")
	private WebElement source;
	
	public WebElement getSource() {
		return source;
	}
	public WebElement getStatus() {
		return status;
	}
	public WebElement getCategory() {
		return category;
	}
	public WebElement getCompanyName() {
		return companyName;
	}
	public WebElement getHeaderText() {
		return headerText;
	}
	public WebElement getCompanies() {
		return companies;
	}
	public WebElement getCalendra() {
		return calendra;
	}
	public WebElement getNewCompany() {
		return newCompany;
	}

}
