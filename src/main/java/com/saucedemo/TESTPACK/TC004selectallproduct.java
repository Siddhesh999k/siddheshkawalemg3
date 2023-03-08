package com.saucedemo.TESTPACK;

import org.testng.annotations.Test;

import com.saucedemo.POMPACK.HomePOM;

public class TC004selectallproduct extends TestBaseClass
{
	@Test
	public void verifyproduct()	
	{
		HomePOM hp= new HomePOM(driver);
		

		System.out.println("apply validation");
		
		hp.clickaddallproducttocart();
		
	
//		String expectedproductselected="6";
//		String actualproductselected=hp.gettextaddtocart();
//		
//		if(expectedproductselected.equals(actualproductselected))
//		{
//			System.out.println("all product add to cart test case is passed");
//		}
//		else
//		{
//			System.out.println("all product add to cart test case is failed");
//		}

}
}
