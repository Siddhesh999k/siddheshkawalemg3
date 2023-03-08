package com.saucedemo.TESTPACK;

import org.testng.annotations.Test;

import com.saucedemo.POMPACK.HomePOM;

public class TC005Checkoutfunctionality extends TestBaseClass
{
	
	@Test
	public void checkoutFunctionality()
	{
		HomePOM hp= new HomePOM(driver);
		
		System.out.println("apply validation");
		
		hp.clickkartbutton();
		System.out.println("cart button clicked");
		
		hp.cliclcheckout();
		System.out.println("checkout button clicked");
		
		System.out.println("checkout button clicked test case pass");

	}

}
