package com.crm.test.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.allpages.Pages.CasePage;
import com.crm.allpages.Pages.HomePage;
import com.crm.allpages.Pages.LoginPage;
import com.crm.allpages.Pages.NewPerson;
import com.crm.base.BasePage.BasePage;

public class CasePageTest extends BasePage
{

	LoginPage loginPage = null;
	HomePage homePage = null;
	NewPerson newPerson = null;
	CasePage casePage = null;
	
	public CasePageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp()throws Exception
	{
		initialise();
		loginPage = new LoginPage();
		homePage = loginPage.logIn(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority=1)
	public void addPersonDetails()
	{
		newPerson = homePage.clickPersonImage();
		newPerson.addPersonDetails(prop.getProperty("firstName"),prop.getProperty("lastName"),prop.getProperty("organisation"));
		homePage.clickImage();
	}
	
	@Test(priority=2)
	public void verifyAddedPerson()
	{
		newPerson = homePage.clickImage();
		boolean value = newPerson.verifyAddedPersonDetails();
		Assert.assertTrue(value);
	}
	
	@Test(priority=3)
	public void addCase()throws Exception
	{
		casePage = homePage.clickCase();
		casePage.addCase();
	}
	
	@Test(priority=4)
	public void verifyAddedCase()
	{
		casePage = homePage.clickCaseLink();
		boolean value = casePage.verifyCorrectCaseAndStatus(prop.getProperty("firstName"),prop.getProperty("lastName"),prop.getProperty("organisation"));
		Assert.assertTrue(value);
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
