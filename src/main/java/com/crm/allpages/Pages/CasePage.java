package com.crm.allpages.Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.base.BasePage.BasePage;

public class CasePage extends BasePage
{
	
	@FindBy(xpath="//input[@id='partySearch']")
	WebElement associateWith;

	@FindBy(xpath="//input[@id='caseNameDecorate:name']")
	WebElement caseName;

	@FindBy(xpath="//textarea[@id='caseDescriptionDecorate:description']")
	WebElement description;

	@FindBy(xpath="//table[@class='simple-table list-results-table with-hover-effect']")
	WebElement tableOfCases;

	@FindBy(xpath="//a[contains(text(),'AmdQ')]//parent::td//following-sibling::td/span")
	WebElement findCaseStatus;

	@FindBy(xpath="//input[@id='save']")
	WebElement save;


	public CasePage()
	{
		PageFactory.initElements(driver, this);
	}

	public void addCase()throws Exception
	{
		Robot r = new Robot();

		char[] orgn = prop.getProperty("organisation").toCharArray();

		for(int i=0; i<orgn.length; i++)
		{

			r.keyPress(KeyEvent.getExtendedKeyCodeForChar(orgn[i]));
			Thread.sleep(2000);
		}

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		caseName.sendKeys(prop.getProperty("firstName")+" "+prop.getProperty("lastName"));
		description.sendKeys("This is for testing purpose");
		save.click();
	}

	public boolean verifyCorrectCaseAndStatus(String fname, String lname, String org)
	{
		
		boolean value = false;

		/*List<WebElement> rows = tableOfCases.findElements(By.tagName("tr"));
		for(WebElement row : rows)
		{
			List<WebElement> cols = row.findElements(By.tagName("td"));
			for(WebElement col : cols)
			{
				if((col.getText().contains(prop.getProperty("firstName")+" "+prop.getProperty("lastName"))) && (col.getText().contains("Open")))
						{

								value = true;
								break;

						}
			}
		}*/
		
		
		String status = driver.findElement(By.xpath("//a[contains(text(),'"+org+"')]//parent::td//following-sibling::td/span")).getText();
		if(status.equals("Open"))
		{
			value=true;
		}
		return value;
	}
}
