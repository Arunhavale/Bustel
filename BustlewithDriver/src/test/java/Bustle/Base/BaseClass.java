package Bustle.Base;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
public class BaseClass {
	
	@BeforeMethod
	public void  driveninitialisation()
	{
		initialisation();
	}
	
	public static WebDriver driver = null;
  
	public void initialisation()
	{
		System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://bustle-spot.com/login");
	}
	
	
	public void waitForElement(By locator){
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	
	public WebElement returnWebElement(By locator){
		WebElement ele = driver.findElement(locator);
		return ele;
	}
	
	 public void verifyPage(String expectedUrl)
	 {
	     Assert.assertEquals(driver.getCurrentUrl(), expectedUrl,expectedUrl+": page is not displayed.");
	 }

	
	
	
//	@AfterClass
//	public void logoutoftheapplication() throws InterruptedException
//	{
//		Thread.sleep(5000);
//		By usericon =By.xpath("//div[@class='MuiAvatar-root MuiAvatar-circle acc-pro-pic MuiAvatar-colorDefault']");
//		By signout = By.xpath("//div[.='Signout']");
//		WebElement Usericon = driver.findElement(usericon);
//		
//		Usericon.click();
//		waitForElement(signout);
//		WebElement Signout = driver.findElement(signout);
//		Signout.click();
//		}
	
	
}
	

