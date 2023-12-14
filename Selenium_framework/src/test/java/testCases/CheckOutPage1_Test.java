package testCases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.CartPage;
import pages.CheckOutPage1;
import pages.Inventory_page_2;
import pages.LoginPage;

public class CheckOutPage1_Test extends TestBase
{
	LoginPage login;
	Inventory_page_2 invent;
	CartPage cart;
	CheckOutPage1 check;
	
	@BeforeMethod
	public void setUp() throws InterruptedException
	{
		   initialization();
		   login=new LoginPage();
		   invent=new Inventory_page_2();
		   cart=new CartPage();
		   check=new CheckOutPage1();
		   login.LoginToApplication();
		   invent.add6products();
		   cart.goToCartPage();
		   cart.verifyCheckoutBtn();
	}
@Test
    public void verifyURLofcheckoutpage1()
    {
	String expURL="https://www.saucedemo.com/checkout-step-one.html";
	String actURL=check.verifyURLofcheckoutpage1();
	Assert.assertEquals(expURL,actURL);
	Reporter.log("URL of checkoutpage1="+actURL);
    }

@Test
public void verifytitleofcheckoutpage1()
{
	String expTitle="Checkout: Your Information";
	String actTitle=check.verifytitleofcheckoutpage1();
	Assert.assertEquals(expTitle,actTitle);
	Reporter.log("Title of checkoutpage1 ="+actTitle);
}

@Test
public void inputinformation()
{
String expURL="https://www.saucedemo.com/checkout-step-two.html";
String actURL=check.inputinformation();
Assert.assertEquals(expURL,actURL);
Reporter.log("URL of checkout page 2 ="+actURL);
}
@AfterMethod
public void CloseBrowser()
{
	   driver.close();
}

}


