package com.saucedemo.TESTPACK;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.saucedemo.POMPACK.LoginPOM;

public class TestBaseClass
{
	WebDriver driver;
	@Parameters("browsername")
	@BeforeMethod
	public void setUp(String browsername)
	{
		Logger log = Logger.getLogger("SauceDemo-mockgroup-3");
	
		if(browsername.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Siddhesh Kawale\\Documents\\Automation\\chromedriver.exe");
		
		driver = new ChromeDriver();
		log.info("Browser is opened");
		}
		else
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Siddhesh Kawale\\Documents\\Automation\\geckodriver.exe");
			driver=new FirefoxDriver();
			log.info("Browser is opened");


		}
		
		PropertyConfigurator.configure("Log4j.Properties");
		
		driver.manage().window().maximize();
		log.info("Driver maximize");
		
		driver.get("https://www.saucedemo.com/");
		log.info("site is opened");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		LoginPOM lp = new LoginPOM(driver);
		
		lp.sendusername();
		log.info("username send");
		
		lp.sendpassword();
		log.info("password send");
		
		lp.clickloginbtn();
		log.info("login button clicked");
		
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		
		log.info("browser close");
		log.info("End Oo Program");
	}

}
