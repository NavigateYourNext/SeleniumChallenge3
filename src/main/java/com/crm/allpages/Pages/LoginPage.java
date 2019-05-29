package com.crm.allpages.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.base.BasePage.BasePage;

public class LoginPage extends BasePage 
{
	@FindBy(xpath="//input[@id='login:usernameDecorate:username']")
	WebElement username;
	
	@FindBy(xpath="//input[@id='login:passwordDecorate:password']")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement login;
	
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public HomePage logIn(String uname, String pass)
	{
		username.sendKeys(uname);
		password.sendKeys(pass);
		
		login.click();
		
		return new HomePage();
		
	}
}
