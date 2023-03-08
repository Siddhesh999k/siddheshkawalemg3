package com.saucedemo.TESTPACK;

import org.testng.annotations.Test;

import com.saucedemo.POMPACK.HomePOM;

public class TC003addtokart extends TestBaseClass
{
	
	@Test
	public void addtokart()
	{
		HomePOM hp = new HomePOM(driver);
		
		hp.clickaddtokart();
		System.out.println("Add to cart succesfull");
	}

}
