package com.crm.allpages.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.base.BasePage.BasePage;

public class HomePage extends BasePage
{

	@FindBy(xpath="//a[@id='ember18']")
	WebElement personImage;
	
	@FindBy(xpath="//a[contains(text(),'Add Person')]")
	WebElement addPersonButton;
	
	@FindBy(xpath="//a[@id='ember24']")
	WebElement caseImage;
	
	@FindBy(xpath="//a[contains(text(),'Add Case')]")
	WebElement addCase;
	
	@FindBy(xpath="//div[@id='ember41']")
	WebElement accountInfo;
	
	@FindBy(xpath="//a[@id='ember95']")
	WebElement accountSetting;
	
	@FindBy(xpath="//a[contains(text(),'Log out')]")
	WebElement logOut;
	
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public NewPerson clickPersonImage()
	{
		personImage.click();
		addPersonButton.click();
		return new NewPerson();
	}
	
	public NewPerson clickImage()
	{
		personImage.click();
		return new NewPerson();
	}
	
	public CasePage clickCase()
	{
		caseImage.click();
		addCase.click();
		return new CasePage();
	}
	
	public CasePage clickCaseLink()
	{
		caseImage.click();
		return new CasePage();
	}
}
