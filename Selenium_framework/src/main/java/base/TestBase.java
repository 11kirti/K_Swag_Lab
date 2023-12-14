package base;

import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.ExtentReportManager;

public class TestBase 
{
	public ExtentReports report = ExtentReportManager.getReportInstance();
	public ExtentTest logger;
	public static ChromeDriver driver;
    public void initialization() throws InterruptedException
    {
    	WebDriverManager.chromedriver().setup();
    	driver=new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("https://www.saucedemo.com/");
    	Thread.sleep(3000);
    	
    }
}
