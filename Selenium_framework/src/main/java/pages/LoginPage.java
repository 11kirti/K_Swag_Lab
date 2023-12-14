package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;

import base.TestBase;

public class LoginPage extends TestBase

{
		@FindBy(xpath="//input[@name='user-name']") private WebElement userTxtBox;
		@FindBy(xpath="//input[@name='password']") private WebElement passwordTxtBox;
		@FindBy(xpath="//input[@name='login-button']") private WebElement loginBtn;
		
		public LoginPage()
		{
		PageFactory.initElements(driver, this);	
		}
		
		public String LoginToApplication()
		{
			logger = report.createTest("Login To Sauce Lab Application");
			userTxtBox.sendKeys("standard_user");
			logger.log(Status.INFO, "User Name is Entered");
			passwordTxtBox.sendKeys("secret_sauce");
			logger.log(Status.INFO, "Password is Entered");
			loginBtn.click();
			logger.log(Status.INFO, "Login Button Clicked");
			logger.log(Status.PASS, "Login Sucessfully");
			return driver.getCurrentUrl();
			
		}
		
		public String logintoAppWithMultiCreds(String un,String pass)
		{
			userTxtBox.sendKeys(un);
			passwordTxtBox.sendKeys(pass);
			loginBtn.click();
			return driver.getCurrentUrl();
			}
		
		
		public String VerifyTitleOfApplication()
		{
		  return driver.getTitle();
		}
		
		public String VerifyURLofApplication()
		{
			return driver.getCurrentUrl();
		}
}
