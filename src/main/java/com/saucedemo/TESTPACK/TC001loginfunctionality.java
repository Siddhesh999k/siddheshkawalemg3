package com.saucedemo.TESTPACK;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TC001loginfunctionality extends TestBaseClass 
{
	
	@Test 
	public void loginfunctionality()
	{
		System.out.println("Apply verification");
		String expectedTittle ="Swag Labs";
		String actualTittle = driver.getTitle();
		
		Assert.assertEquals(actualTittle, expectedTittle);
	}
}
