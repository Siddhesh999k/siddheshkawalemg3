package com.saucedemo.POMPACK;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePOM 
{
WebDriver driver;
	
	@FindBy(xpath = "(//button[text()='Add to cart'])[1]")WebElement addkart;
	@FindBy(xpath = "//button[text()='Add to cart']") List <WebElement> allproductaddtocart;
	@FindBy(xpath = "//a[@class='shopping_cart_link']")WebElement kartbtn;
	@FindBy(xpath = "//button[text()='Checkout']")WebElement checkoutbtn;
	@FindBy(xpath = "//input[@id='first-name']")WebElement firstname;
	@FindBy(xpath = "//input[@id='last-name']")WebElement lastname;
	@FindBy(xpath = "//input[@id='postal-code']")WebElement postalcode;
	@FindBy(xpath = "//input[@id='continue']")WebElement continuebtn;
	@FindBy(xpath = "//button[text()='Finish']")WebElement finishbtn;
	@FindBy(xpath = "//button[@id='react-burger-menu-btn']")WebElement menuebtn;
	@FindBy(xpath = "//a[@id='logout_sidebar_link']")WebElement logoutbtn;
	
	public void clickaddtokart()
	{
		addkart.click();
	}
	
	public void clickaddallproducttocart()
	{
		for(int i=0;i<allproductaddtocart.size();i++)
		allproductaddtocart.get(i).click();
	}
	
	public void clickkartbutton()
	{
		kartbtn.click();
	}
	
	public void cliclcheckout()
	{
		checkoutbtn.click();
	}
	
	public void sendfirstname()
	{
		firstname.sendKeys("siddhesh");
	}
	
	public void sendlastname()
	{
		lastname.sendKeys("kawale");
	}
	
	public void sendpostalcode()
	{
		postalcode.sendKeys("20000");
	}
	
	public void clickcontinue() 
	{
		continuebtn.click();
	}
	
	public void clickfinish()
	{
		finishbtn.click();
	}
	
	public void clickmenue()
	{
		menuebtn.click();
	}
	
	public void clicklogout()
	{
		logoutbtn.click();
	}
	
	public HomePOM(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	

}
