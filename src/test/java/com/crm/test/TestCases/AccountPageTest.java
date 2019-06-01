package com.crm.test.TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.allpages.Pages.AccountSetting;
import com.crm.allpages.Pages.HomePage;
import com.crm.allpages.Pages.LoginPage;
import com.crm.base.BasePage.BasePage;

import junit.framework.Assert;

public class AccountPageTest extends BasePage 
{
	LoginPage loginPage = null;
	HomePage homePage = null;
	AccountSetting accountSetting = null;
	
	public AccountPageTest()
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
	
	/*@Test(priority=1)
	public void verifyAccountSettingsPageHeader()
	{
		accountSetting = homePage.getAccountSettingPage();
		String title = accountSetting.verifyHeader();
		Assert.assertEquals("Account Settings Page Not Displayed : Header Mismatched...", "Account Settings", title);
	}
	
	@Test(priority=2)
	public void clickOnAccountLink()
	{
		accountSetting = homePage.getAccountSettingPage();
		String title = accountSetting.accountLink();
		Assert.assertEquals("Account Header Mismatched...", "Account", title);
	}
	
	@Test(priority=3)
	public void clickOnInvoicesLink()
	{
		accountSetting = homePage.getAccountSettingPage();
		String title = accountSetting.invoiceLink();
		Assert.assertEquals("Invoices Header Mismatched...", "Invoices", title);
	}
	
	@Test(priority=4)
	public void clickOnExportLink()
	{
		accountSetting = homePage.getAccountSettingPage();
		String title = accountSetting.exportLink();
		Assert.assertEquals("Export Header Mismatched...", "Export", title);
	}
	
	@Test(priority=5)
	public void clickOnAppearanceLink()
	{
		accountSetting = homePage.getAccountSettingPage();
		String title = accountSetting.appearanceLink();
		Assert.assertEquals("Export Header Mismatched...", "Appearance", title);
	}
	
	@Test(priority=6)
	public void clickOnMailDropBoxLink()
	{
		accountSetting = homePage.getAccountSettingPage();
		String title = accountSetting.mailDropBoxLink();
		Assert.assertEquals("Mail Drop Box Header Mismatched...", "Mail Drop Box", title);
	}
	
	@Test(priority=7)
	public void clickOnUsersLink()
	{
		accountSetting = homePage.getAccountSettingPage();
		String title = accountSetting.usersLink();
		Assert.assertEquals("Users Header Mismatched...", "Users", title);
	}*/
	
	@Test(priority=8)
	public void clickOnOpportunitesLink()
	{
		accountSetting = homePage.getAccountSettingPage();
		String title = accountSetting.opportunitiesLink();
		Assert.assertEquals("Opportunities Header Mismatched...", "Opportunities", title);
	}
	
/*	@Test(priority=9)
	public void clickOnTrackLink()
	{
		accountSetting = homePage.getAccountSettingPage();
		String title = accountSetting.trackLink();
		Assert.assertEquals("Tracks Header Mismatched...", "Tracks", title);
	}*/
	
	@Test(priority=10)
	public void clickOnTaskCategoriesLink()
	{
		accountSetting = homePage.getAccountSettingPage();
		String title = accountSetting.taskCategoriesLink();
		Assert.assertEquals("Task Categories Header Mismatched...", "Task Categories", title);
	}
	
	/*@Test(priority=11)
	public void clickOnCustomFiledsLink()
	{
		accountSetting = homePage.getAccountSettingPage();
		String title = accountSetting.customFieldsLink();
		Assert.assertEquals("Custom Fields Header Mismatched...", "Custom Fields", title);
	}
	
	@Test(priority=12)
	public void clickOnTagsLink()
	{
		accountSetting = homePage.getAccountSettingPage();
		String title = accountSetting.tagsLink();
		Assert.assertEquals("Tags Link Header Mismatched...", "Tags and DataTags", title);
	}
	
	@Test(priority=12)
	public void clickOnIntegrationsLink()
	{
		accountSetting = homePage.getAccountSettingPage();
		String title = accountSetting.integrationsLink();
		Assert.assertEquals("Integrations Header Mismatched...", "Integrations", title);
	}
	
	@Test(priority=13)
	public void clickOnTrashLink()
	{
		accountSetting = homePage.getAccountSettingPage();
		String title = accountSetting.trashLink();
		Assert.assertEquals("Trash Header Mismatched...", "Trash", title);
	}
	*/
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
