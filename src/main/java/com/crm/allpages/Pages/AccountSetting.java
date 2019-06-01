package com.crm.allpages.Pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.base.BasePage.BasePage;

public class AccountSetting extends BasePage
{

	@FindBy(xpath="//span[text()='Account Settings']")
	WebElement header;
	
	@FindBy(xpath="//a[text()='Account']")
	WebElement accountLink;
	
	@FindBy(xpath="//a[text()='Invoices']")
	WebElement invoicesLink;
	
	@FindBy(xpath="//a[text()='Export']")
	WebElement exportLink;
	
	@FindBy(xpath="//a[text()='Users']")
	WebElement usersLink;
	
	@FindBy(xpath="//a[text()='Appearance']")
	WebElement appearanceLink;
	
	@FindBy(xpath="//a[text()='Mail Drop Box']")
	WebElement mailDropBoxLink;
	
	@FindBy(xpath="//a[text()='Opportunities']")
	WebElement opportunitiesLink;
	
	@FindBy(xpath="//a[text()='Tracks']")
	WebElement tracksLink;
	
	@FindBy(xpath="//a[text()='Task Categories']")
	WebElement taskCategoriesLink;
	
	@FindBy(xpath="//a[text()='Custom Fields']")
	WebElement customFieldsLink;
	
	@FindBy(xpath="//a[text()='Tags']")
	WebElement tagsLink;
	
	@FindBy(xpath="//a[text()='Integrations']")
	WebElement integrationsLink;
	
	@FindBy(xpath="//a[text()='Trash']")
	WebElement trashLink;
	
	@FindBy(xpath="//h1")
	WebElement accountHeader;
	
	@FindBy(xpath="//header")
	WebElement invoicesHeader;
	
	@FindBy(xpath="//h1")
	WebElement exportHeader;
	
	@FindBy(xpath="//h1")
	WebElement appearanceHeader;
	
	@FindBy(xpath="//input[@id='appearance:uploadDecorate:logoImage']")
	WebElement uploadFile;
	
	@FindBy(xpath="//a[text()='Save']")
	WebElement saveButton;
	
	@FindBy(xpath="//h2")
	WebElement mailDropBoxHeader;
	
	@FindBy(xpath="//h2[text()='Users']")
	WebElement usersHeader;
	
	@FindBy(xpath="//a[text()='Add new User']")
	WebElement addNewUserButton;
	
	@FindBy(xpath="//input[@id='register:firstnameDecorate:firstName']")
	WebElement firstUserName;
	
	@FindBy(xpath="//input[@id='register:lastNameDecorate:lastName']")
	WebElement lastUserName;
	
	@FindBy(xpath="//input[@id='register:emailDecorate:email']")
	WebElement userEmail;
	
	@FindBy(xpath="//input[@id='register:usernameDecorate:username']")
	WebElement usersUsername;
	
	@FindBy(xpath="//input[@id='register:save']")
	WebElement inviteUserButton;
	
	@FindBy(xpath="//header[@text='Opportunities']")
	WebElement opportunitiesHeader;
	
	@FindBy(xpath="//h2")
	WebElement trackHeader;
	
	@FindBy(xpath="//h2")
	WebElement taskCategoriesHeader;
	
	@FindBy(xpath="//a[text()='Add new Category']")
	WebElement addCategory;
	
	@FindBy(xpath="//input[@id='editCategoryForm:taskCategoryNameDecorate:taskCategoryName']")
	WebElement categoryName;
	
	@FindBy(xpath="//input[@id='editCategoryForm:j_id175']")
	WebElement saveCategory;
	
	@FindBy(xpath="//h2")
	WebElement customFiledsHeader;
	
	@FindBy(xpath="//h2")
	WebElement tagsHeader;
	
	@FindBy(xpath="//h2")
	WebElement integrationsHeader;
	
	@FindBy(xpath="//a[text()='Configure']")
	WebElement configureButtons;
	
	@FindBy(xpath="//h2")
	WebElement trashHeader;
	
	public AccountSetting()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHeader()
	{
		return header.getText();
	}
	
	public String accountLink()
	{
		accountLink.click();
		return accountHeader.getText();
		
	}
	
	public String invoiceLink()
	{
		invoicesLink.click();
		return invoicesHeader.getText();
		
	}
	
	public String exportLink()
	{
		exportLink.click();
		return exportHeader.getText();
		
	}
	
	public String appearanceLink()
	{
		appearanceLink.click();
		uploadFile.sendKeys(System.getProperty("user.dir")+"/resources/earth_PNG8.png");
		saveButton.click();
		return appearanceHeader.getText();
		
	}
	
	public String mailDropBoxLink()
	{
		mailDropBoxLink.click();
		
		return mailDropBoxHeader.getText();
		
	}
	
	public String usersLink()
	{
		usersLink.click();
		
		String header = usersHeader.getText();
		
		addNewUserButton.click();
		
		firstUserName.sendKeys(prop.getProperty("firstName"));
		lastUserName.sendKeys(prop.getProperty("lastName"));
		userEmail.sendKeys(prop.getProperty("email"));
		usersUsername.sendKeys(prop.getProperty("usersUsername"));
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", inviteUserButton);
		
		inviteUserButton.click();
		
		return header;
		
	}
	
	public String opportunitiesLink()
	{
		
		opportunitiesLink.click();
		
		return opportunitiesHeader.getText();
		
	}
	
	public String trackLink()
	{
		tracksLink.click();
		return trackHeader.getText();
		
	}
	
	public String taskCategoriesLink()
	{
		taskCategoriesLink.click();
		return taskCategoriesHeader.getText();
	}
	
	public String customFieldsLink()
	{
		customFieldsLink.click();
		return customFiledsHeader.getText();
		
	}
	
	public String tagsLink()
	{
		tagsLink.click();
		return tagsHeader.getText();
		
	}
	
	public String integrationsLink()
	{
		integrationsLink.click();
		List<WebElement> configureButtons = driver.findElements(By.xpath("//a[text()='Configure']"));
		System.out.println("Total No.Of. Configure Buttons Are : "+configureButtons.size());
		return integrationsHeader.getText();
		
	}
	
	public String trashLink()
	{
		trashLink.click();
		return trashHeader.getText();
		
	}
	
	
}
