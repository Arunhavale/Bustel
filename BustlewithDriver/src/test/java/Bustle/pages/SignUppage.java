package Bustle.pages;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Bustle.Base.BaseClass;
public class SignUppage extends BaseClass {
	
	By signuplink = By.xpath("//a[.='Sign Up']");
	By emailid = By.name("email-id");
	By fullname = By.name("first-name");
	By password = By.name("password");
	By confirmpassword = By.name("confirm-password");
	By signupbutton = By.xpath("//button[.='Sign Up']");
	By ErrorMsg = By.xpath("//p[.='Error!']");
	By errorUnderTb = By.xpath("//label[@class='jss77']");
	
	By TBContainserror = By.xpath("//label[@class='jss77']/../../label");
    	
	public void gotoSignUpPage()
	{
		
		WebElement SignUpLink = driver.findElement(signuplink);
		SignUpLink.click();
	}
		
	public void Signupapplication(String email,String name,String pwd,String Confirm_pwd)
	{
		WebElement EmailID = driver.findElement(emailid);
		WebElement FullName = driver.findElement(fullname);
	    WebElement Password = driver.findElement(password);
	    WebElement ConfirmPassword = driver.findElement(confirmpassword);
	    WebElement SIGNUP = driver.findElement(signupbutton);
	    EmailID.sendKeys(email);
	    FullName.sendKeys(name);
	    Password.sendKeys(pwd);
	    ConfirmPassword.sendKeys(Confirm_pwd);
	    SIGNUP.click();
	    
	 }
	
	public void verifyErrorMsg()
	{
		waitForElement(ErrorMsg);
		   String ErrorMsgText = driver.findElement(ErrorMsg).getText();
		   System.out.println(ErrorMsgText);
		  Assert.assertEquals(ErrorMsgText,"ERROR!" );
	}
	
	public void errorMsgUnderTextBox()
	{
		List<WebElement> requiredtext = driver.findElements(errorUnderTb);		
		for (WebElement required : requiredtext) 
			{
		System.out.println( required.getText());
			}
	}
  
}
