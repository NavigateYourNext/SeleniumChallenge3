package com.crm.test.TestCases;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.allpages.Pages.HomePage;
import com.crm.allpages.Pages.LoginPage;
import com.crm.base.BasePage.BasePage;

public class LoginPageTest extends BasePage
{

	LoginPage loginPage = null;
	HomePage homePage = null;
	Logger logger = Logger.getLogger(LoginPageTest.class);
	
	public LoginPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp()throws Exception
	{
		initialise();
		loginPage = new LoginPage();
	}
	
	
	@Test
	public void logIn()
	{
		homePage = loginPage.logIn(prop.getProperty("username"), prop.getProperty("password"));
		logger.info("Login Successful ... ");
		
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
}
