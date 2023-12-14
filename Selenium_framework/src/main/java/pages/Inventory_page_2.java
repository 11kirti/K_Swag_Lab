package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import base.TestBase;

public class Inventory_page_2 extends TestBase

{
//object repository
	@FindBy(xpath="//span[@class='title']") private WebElement productlable;
	@FindBy(xpath="//span[@class='shopping_cart_badge']") private WebElement cartcount;
	@FindBy(xpath="//select[@class='product_sort_container']") private WebElement dropdown;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']") private WebElement backpackproduct;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-bike-light']") private WebElement bikelightproduct;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']") private WebElement bolttshirt;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-fleece-jacket']") private WebElement fleecejacket;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-onesie']") private WebElement onesie;
	@FindBy(xpath="//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']") private WebElement redtshirt;
	@FindBy(xpath="//a[text()='Twitter']") private WebElement twitterlogo ;
	@FindBy(xpath="//a[text()='Facebook']") private WebElement facebooklogo ;
	@FindBy(xpath="//a[text()='LinkedIn']") private WebElement linkedinlogo ;
	@FindBy(xpath="//div[@class='footer_copy']") private WebElement footertext ;
	@FindBy(xpath="//button[@id='react-burger-menu-btn']") private WebElement menubutton ;
	@FindBy(xpath="//a[@id='inventory_sidebar_link']") private WebElement allitems;


	//constructor
	public Inventory_page_2()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifyProductLable()
	{
		return productlable.getText();
	}
	
	public boolean verifyTwitterLogo()
	{
		return twitterlogo.isDisplayed();
	}
	
	public boolean verifyFacebookLogo()
	{
		return facebooklogo.isDisplayed();
	}
	public boolean verifyLinkedInLogo()
	{
		return linkedinlogo.isDisplayed();
	}
	public String add6products()
	{
      Select sc=new Select(dropdown);
      sc.selectByVisibleText("Price (low to high)");
      backpackproduct.click();
      bikelightproduct.click();
      bolttshirt.click();
      fleecejacket.click();
      onesie.click();
      redtshirt.click();
      return cartcount.getText();
	}
	public String verifyFooterText()
	{
		return footertext.getText();
	}
	
	
	
	
}
