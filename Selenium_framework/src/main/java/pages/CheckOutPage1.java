package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class CheckOutPage1 extends TestBase 
{

	@FindBy (xpath="//span[@class='title']") private WebElement titleofcheckoutpage1;
	@FindBy (xpath="//input[@id='first-name']") private WebElement firstnametextbox;
	@FindBy (xpath="//input[@id='last-name']") private WebElement lastnametextbox;
	@FindBy (xpath="//input[@id='postal-code']") private WebElement zipcodetextbox;
	@FindBy (xpath="//input[@id='continue']") private WebElement continuebutton;
	
	
	public CheckOutPage1 ()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifyURLofcheckoutpage1()
	{
		return driver.getCurrentUrl();
	}
	
	public String verifytitleofcheckoutpage1()
	{
		return titleofcheckoutpage1.getText();
	}
	
	public String inputinformation()
	{
		firstnametextbox.sendKeys("saurav");
		lastnametextbox.sendKeys("ganguly");
		zipcodetextbox.sendKeys("412345");
		continuebutton.click();
		return driver.getCurrentUrl();
	}
	
}
