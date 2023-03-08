package com.saucedemo.TESTPACK;

import org.testng.annotations.Test;

import com.saucedemo.POMPACK.HomePOM;

public class TC006InformationCheckoutpage extends TestBaseClass
{
	@Test
	public void InformationCheckoutpage()
	{
		HomePOM hp= new HomePOM(driver);

		System.out.println("apply validation");
		
		hp.sendfirstname();
		System.out.println("first name entered");
		
		hp.sendlastname();
		System.out.println("last name entered");
		
		hp.sendpostalcode();
		System.out.println("postal code entered");
		
		hp.clickcontinue();
		System.out.println("continue button clicked");
		
		
		System.out.println("test case InformationCheckoutpage pass");
		
	}

}
