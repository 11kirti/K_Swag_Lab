package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class CartPage extends TestBase
{
	@FindBy(xpath="//a[@class='shopping_cart_link']") private WebElement Cartbtn;
	@FindBy(xpath="//div[@class='app_logo']") private WebElement Swaglablable;
	@FindBy(xpath="//span[@class='title']") private WebElement Yourcartlable;
	@FindBy(xpath="//a[text()='Twitter']") private WebElement twitterlogo ;
	@FindBy(xpath="//a[text()='Facebook']") private WebElement facebooklogo ;
	@FindBy(xpath="//a[text()='LinkedIn']") private WebElement linkedinlogo ;
	@FindBy(xpath="//div[@class='footer_copy']") private WebElement footertext ;
	@FindBy(xpath="//button[@id='checkout']") private WebElement CheckoutBtn;
	@FindBy(xpath="//button[@id='continue-shopping']") private WebElement ContinueShoppingBtn;
	@FindBy(xpath="//div[@class='cart_desc_label']") private WebElement Description;
	@FindBy(xpath="//div[@class='cart_quantity_label']") private WebElement QTY;
	@FindBy(xpath="//a[@id='item_4_title_link']") private WebElement BackPacklable;
	@FindBy(xpath="//a[@id='item_0_title_link']") private WebElement BikeLightlable;
	@FindBy(xpath="//div[@class='inventory_item_desc']") private WebElement BackPackDescr;
	@FindBy(xpath="//button[@id='react-burger-menu-btn']") private WebElement BurgerMenuBar;

	


public CartPage()
{
	PageFactory.initElements(driver, this);
	
}
public String verifycartURLPage()
{
return driver.getCurrentUrl();	
}

public void goToCartPage()
{
Cartbtn.click();	
}


public String verifySwaglablable()
{
	return Swaglablable.getText();
}

public String verifyYourcartlable()
{
	return Yourcartlable.getText();
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

public String verifyFooterText()
{
	return footertext.getText();
}
public String verifyCheckoutBtn()
{
	
	CheckoutBtn.click();
	return driver.getCurrentUrl();
	
}
public String verifyContinueShoppingBtn()
{
	
	ContinueShoppingBtn.click();
	return driver.getCurrentUrl();
	
}

public String verifyDescription()
{
	return Description.getText();
}

public String verifyQTY()
{
	return QTY.getText();
}

public String verifyBackPacklable()
{
	return BackPacklable.getText();
}
public String verifycartdescrLable()
{
	return BackPackDescr.getText();
}

public String verifyBurgerMenuBar()
{
	
	BurgerMenuBar.click();
	return driver.getCurrentUrl();
	
}
 

}

