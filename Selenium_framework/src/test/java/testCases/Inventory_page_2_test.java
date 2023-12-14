package testCases;

import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.Inventory_page_2;
import pages.LoginPage;

public class Inventory_page_2_test extends TestBase 
{
	
	LoginPage login;
	Inventory_page_2 invent;
	

@BeforeMethod (alwaysRun = true)
public void setUp() throws InterruptedException
{
	   initialization();
	   login=new LoginPage();
	   invent=new Inventory_page_2();
	   login.LoginToApplication();
	   
}

@Test(groups = "Sanity")
public void verifyProductLable()
{
	String expLable="Products";
	String actLable=invent.verifyProductLable();
	AssertJUnit.assertEquals(expLable, actLable);
	Reporter.log("Lable Of Inventory Page="+actLable);
}
@Test(groups = "Retesting")
public void verifyTwitterLogo()
{

	boolean result=invent.verifyTwitterLogo();
	AssertJUnit.assertEquals(result, true);
	Reporter.log("Visibility Of Twitter Logo="+result);
}
@Test(groups = {"Retesting","Regression"})
public void verifyFacebookLogo()
{

	boolean result=invent.verifyTwitterLogo();
	AssertJUnit.assertEquals(result, true);
	Reporter.log("Visibility Of Facebook Logo="+result);
}
@Test(groups = "Retesting")
public void verifyLinkedIdLogo()
{

	boolean result=invent.verifyTwitterLogo();
	AssertJUnit.assertEquals(result, true);
	Reporter.log("Visibility Of LinkedIn Logo="+result);
}
@Test(groups = {"Retesting","Regression"})
public void add6products()
{
String expCount="6";
String actCount=invent.add6products();
AssertJUnit.assertEquals(expCount, actCount);
Reporter.log("Total Products added to Cart="+actCount);
}
@Test(groups = "Sanity")
public void verifyFooterText()
{
	String expLable="© 2023 Sauce Labs. All Rights Reserved. Terms of Service | Privacy Policy";
	String actLable=invent.verifyFooterText();
	AssertJUnit.assertEquals(expLable, actLable);
	Reporter.log("Footer Page Text="+actLable);
}


@AfterMethod (alwaysRun = true)
public void CloseBrowser()
{
	   driver.close();
}

}
