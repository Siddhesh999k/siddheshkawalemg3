package com.saucedemo.TESTPACK;

import org.testng.annotations.Test;

import com.saucedemo.POMPACK.HomePOM;

public class TC007finishfunctionality extends TestBaseClass
{
	
	@Test
	public void finishfunctionality()
	{
		HomePOM hp= new HomePOM(driver);

		System.out.println("apply validation");
		
		hp.clickfinish();
		System.out.println("finish button clicked");
		
		System.out.println("TC007 pass");
	}
}
