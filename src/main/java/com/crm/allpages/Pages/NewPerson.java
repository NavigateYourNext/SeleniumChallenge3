package com.crm.allpages.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.base.BasePage.BasePage;

public class NewPerson extends BasePage
{
	@FindBy(xpath="//select[@name='party:j_id108:j_id116']")
	WebElement title;
	
	@FindBy(xpath="//input[@name='party:fnDecorate:fn']")
	WebElement firstName;
	
	@FindBy(xpath="//input[@name='party:lnDecorate:ln']")
	WebElement lastName;
	
	@FindBy(xpath="//input[@id='party:orgDecorate:org']")
	WebElement organisation;
	
	@FindBy(xpath="//input[@name='party:save']")
	WebElement save;
	
	@FindBy(xpath="//table[@class='simple-table list-results-table with-hover-effect']")
	WebElement table;
	
	public NewPerson()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void addPersonDetails(String fname, String lname, String org)
	{
		Select s = new Select(title);
		s.selectByIndex(1);
		
		firstName.sendKeys(fname);
		lastName.sendKeys(lname);
		organisation.sendKeys(org);
		
		save.click();
		
	}
	
	public boolean verifyAddedPersonDetails()
	{
		boolean value = false;
		
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		for(WebElement row : rows)
		{
			List<WebElement> cols = row.findElements(By.tagName("td"));
			for(WebElement col : cols)
			{
				if(col.getText().contains(prop.getProperty("firstName")+" "+prop.getProperty("lastName")));
				value = true;
				break;
			}
		}
	
		
		return value;
	}
}
