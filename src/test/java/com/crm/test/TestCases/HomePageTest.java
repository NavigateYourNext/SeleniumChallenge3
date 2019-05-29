package com.crm.test.TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.allpages.Pages.HomePage;
import com.crm.allpages.Pages.LoginPage;
import com.crm.allpages.Pages.NewPerson;
import com.crm.base.BasePage.BasePage;

public class HomePageTest extends BasePage
{
	LoginPage loginPage = null;
	HomePage homePage = null;
	NewPerson newPerson = null;
	
	public HomePageTest()
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
	
	@Test
	public void addPersonDetails()
	{
		newPerson = homePage.clickPersonImage();
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
}
