package Bustle.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Bustle.Base.BaseClass;
public class LoginPage extends BaseClass{
	
	By emailID = By.xpath("//input[@name='email-id']");
	By password = By.xpath("//input[@name='password']");
	By login =  By.xpath("//button[text()='Login']");
	By SuccessMsg = By.xpath("//div[@class='message-sec']/p");
	By ErrorrMsg = By.xpath("//div[@class='message-sec']/p");
	By loginMsg= By.xpath("//div[@class='message-sec']/p");	
	By requiredErrorMsg = By.xpath("//label[.='Required']");
	By emailerrorMsg= By.xpath("//label[.='Required']");
	By passwordErrorMsg = By.xpath("//label[.='Required']");
	By continuewithgooglebutton = By.xpath("//span[.='Continue with Google']");
	

	public void loginToApplication()
	{
		loginToApplication("Arun.havale@softsuave.com","Havale@1994");
	}
		
	
	public void loginToApplication(String email ,String Pwd)
	{	
		WebElement EmailID = driver.findElement(emailID);
		WebElement Password = driver.findElement(password);
		WebElement Login = driver.findElement(login);
		EmailID.sendKeys(email);
		Password.sendKeys(Pwd);
		Login.click();	
		
	}
	
     public String  verifysuccessMsg()
     {
    		 waitForElement(SuccessMsg);
    	 		WebElement successmsg = driver.findElement(SuccessMsg);
    	 		String actualSuccessMsg = successmsg.getText();
    	 		System.out.println(actualSuccessMsg);
    	         Assert.assertEquals( actualSuccessMsg , "SUCCESS!");	
				return actualSuccessMsg;
      }
     
     
     public String verifyErrorMsg()
    	 {
    	 String expectedErrorMsg ="ERROR!";
			waitForElement(ErrorrMsg);
			 WebElement errormsg = driver.findElement(ErrorrMsg);
			String actualErrorMsg =errormsg.getText();
			System.out.println(actualErrorMsg);
			Assert.assertEquals(actualErrorMsg,expectedErrorMsg);
			return actualErrorMsg;
		 }
     
     
     public void verifyNoEmailpasswordErrorMsg()
     {
    	String noEmailErrorMsg = driver.findElement(emailerrorMsg).getText();
    	 Assert.assertEquals(noEmailErrorMsg,"Required");
    	 String noPasswordErrorMsg = driver.findElement(passwordErrorMsg).getText();
    	 Assert.assertEquals(noPasswordErrorMsg,"Required");
     }
     
     public void clickOnContinueWithGoogle()
     {
    	 
    	 driver.findElement(continuewithgooglebutton).click();
     }
    
     
}
     

 
	
