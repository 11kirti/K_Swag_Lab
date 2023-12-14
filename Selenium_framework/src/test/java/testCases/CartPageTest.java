package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.CartPage;
import pages.Inventory_page_2;
import pages.LoginPage;

public class CartPageTest extends TestBase 
{

	LoginPage login;
	Inventory_page_2 invent;
	CartPage cart;
	
	@BeforeMethod
	public void setUp() throws InterruptedException
	{
		   initialization();
		   login=new LoginPage();
		   invent=new Inventory_page_2();
		   cart=new CartPage();
		   login.LoginToApplication();
		   invent.add6products();
		   cart.goToCartPage();
	}
	
	@Test
	public void verifySwaglablable()
	{
		String expLable="Swag Labs";
		String actLable=cart.verifySwaglablable();
		Assert.assertEquals(expLable, actLable);
		Reporter.log("Lable Of Inventory Page="+actLable);
	}
	
	@Test
	public void verifyYourcartlable()
	{
		String expLable="Your Cart";
		String actLable=cart.verifyYourcartlable();
		Assert.assertEquals(expLable, actLable);
		Reporter.log("Lable Of Inventory Page="+actLable);
	}
	@Test
	public void verifyTwitterLogo()
	{

		boolean result=cart.verifyTwitterLogo();
		Assert.assertEquals(result, true);
		Reporter.log("Visibility Of Twitter Logo="+result);
	}
	@Test
	public void verifyFacebookLogo()
	{

		boolean result=cart.verifyTwitterLogo();
		Assert.assertEquals(result, true);
		Reporter.log("Visibility Of Facebook Logo="+result);
	}
	@Test
	public void verifyLinkedIdLogo()
	{

		boolean result=cart.verifyTwitterLogo();
		Assert.assertEquals(result, true);
		Reporter.log("Visibility Of LinkedIn Logo="+result);
	}
	
	@Test
	public void verifyFooterText()
	{
		String expLable="© 2023 Sauce Labs. All Rights Reserved. Terms of Service | Privacy Policy";
		String actLable=cart.verifyFooterText();
		Assert.assertEquals(expLable, actLable);
		Reporter.log("Footer Page Text="+actLable);
	}
	
	 @Test
	   public void CheckoutBtn()
	   {
		   String expURL="https://www.saucedemo.com/checkout-step-one.html";
		   String actURL=cart.verifyCheckoutBtn();
		   Assert.assertEquals(expURL, actURL);
		   Reporter.log("CheckoutBtn="+actURL);
		   
	   }
	 
	 @Test
	   public void ContinueShoppingBtn()
	   {
		   String expURL="https://www.saucedemo.com/inventory.html";
		   String actURL=cart.verifyContinueShoppingBtn();
		   AssertJUnit.assertEquals(expURL, actURL);
		   Reporter.log("ContinueShoppingBtn="+actURL);
	   }

	 @Test
		public void verifyDescription()
		{
			String expLable="Description";
			String actLable=cart.verifyDescription();
			Assert.assertEquals(expLable, actLable);
			Reporter.log("Lable Of Inventory Page="+actLable);
		}
	 
	 @Test
		public void verifyQTY()
		{
			String expLable="QTY";
			String actLable=cart.verifyQTY();
			Assert.assertEquals(expLable, actLable);
			Reporter.log("Lable Of Inventory Page="+actLable);
		}
	 
	 @Test
		public void verifycartproductLableTest () throws IOException
		{
			String expCartlink = "Sauce Labs Backpack";
			String actCartlink = cart.verifyBackPacklable();
			Assert.assertEquals(expCartlink,actCartlink);
			Reporter.log("Lable of product="+actCartlink);
		}
		
	 
	 @Test
		public void verifycartdescrLable () throws IOException
		{
			String expCartlink ="carry.allTheThings() with the sleek, streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection.";
			String actCartlink = cart.verifycartdescrLable();
			Assert.assertEquals(expCartlink,actCartlink);
			Reporter.log("Description  Of backpack="+actCartlink);
		}
		
	
	
	@AfterMethod
	public void CloseBrowser()
	{
		   driver.close();
	}

	}

