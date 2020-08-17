package Bustle.pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import Bustle.Base.BaseClass;

public class ForgotPassword extends BaseClass{
	
	By forgotpassword =By.xpath("//a[.='Forgot Password?']");
	By emailId = By.name("email-id");
	By submit = By.xpath("//button[.='Submit']");
	By verifymsg = By.className("message-sec");
	By errorMsg = By.xpath("//input[@name='email-id']/../label");
	By loginLink = By.xpath("//a[.='Login']");
	
	public void clickonForgotPassword()
	{
		
		WebElement ForgotPassword = driver.findElement(forgotpassword);
		ForgotPassword.click();
	}
	
	
	public void enterDataIntoForgotPasswordPage(String email)
	{
		//driver.get("http://bustle-spot.com/");
		WebElement EmailID = driver.findElement(emailId);
		WebElement SUBMIT = driver.findElement(submit);
		EmailID.sendKeys(email);
		SUBMIT.click();
			
	}
	
	
	public void verifyMsg()
	{
		waitForElement(verifymsg);
		System.out.println( driver.findElement(verifymsg).getText());
	}
	
	public void errorMsgforNoOrInmailEntered()
	{
		waitForElement(errorMsg);
	      String errortext = driver.findElement(errorMsg).getText();
	     if(errortext.equals("Required"))
	     {
	    	 System.out.println("Enter mailId");
	     }
	     else
	    	 System.out.println("Please enter a valid mail id.");
	}
	
	public void clickOnLoginLink()
	{
		driver.findElement(loginLink).click();
	}
}
