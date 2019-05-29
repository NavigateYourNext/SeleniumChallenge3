package com.crm.base.BasePage;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.crm.utilities.BasicUtility.BasicUtility;

public class BasePage 
{
	
	public static WebDriver driver;
	public static Properties prop;
	
	public BasePage()
	{
		try
		{
			prop = new Properties();
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\config\\config.properties");
			prop.load(fis);
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	
	public void initialise()throws Exception
	{
		String browser = prop.getProperty("browser");
		
		if(browser.equals("chrome"))
		{
			Runtime.getRuntime().exec("taskkill /f /im chrome.exe");
			
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\resources\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browser.equals("firefox"))
		{
			Runtime.getRuntime().exec("taskkill /f /im firefox.exe");
			
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\resources\\geckodriver.exe");
			//driver = new FirefoxDriver();

		}
		else if(browser.equals("ie"))
		{
			Runtime.getRuntime().exec("taskkill /f /im iedriver.exe");
			
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\resources\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		else
		{
			System.out.println("Please Enter Proper Driver ...");
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(BasicUtility.implicit_wait, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(BasicUtility.page_load_timeout, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
	}
	
	
}
