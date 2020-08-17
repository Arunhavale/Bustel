package Bustle.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import Bustle.pages.ForgotPassword;


public class ForgotPasswordPageTest extends ForgotPassword{
	
	@Test
	public void validMailId()
	{
		
		clickonForgotPassword();
		enterDataIntoForgotPasswordPage("arun.havale@softsuave.com");
		verifyMsg();
	}

	@Test
	public void emptyMailId()
	{
		clickonForgotPassword();
		enterDataIntoForgotPasswordPage(" ");
		errorMsgforNoOrInmailEntered();
	}
	
	@Test
	public void invalidMailId()
	{
		clickonForgotPassword();
		enterDataIntoForgotPasswordPage("Arjds@gmail.com");
		verifyMsg();
	}
	
	@Test
	public void returnToLoginPage()
	{
		clickonForgotPassword();
		clickOnLoginLink();
	}
	
	@Test 
	public void verifyForgotPasswordPage()
	{
		clickonForgotPassword();
		Assert.assertEquals(driver.getCurrentUrl(),"http://bustle-spot.com/forgot-password");
	}
}
