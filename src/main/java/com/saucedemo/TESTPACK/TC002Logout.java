package com.saucedemo.TESTPACK;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucedemo.POMPACK.HomePOM;

public class TC002Logout extends TestBaseClass
{
	@Test
	public void logoutfunctionality()
	{
		HomePOM hp = new HomePOM(driver);
		
		hp.clickmenue();
		System.out.println("menue button clicked");
		
		hp.clicklogout();
		System.out.println("logout button clicked");
		
		String expectedTittle = "Swag Labs";
		String actualTittle = driver.getTitle();
		
		Assert.assertEquals(actualTittle, expectedTittle);

				
				
	}
}