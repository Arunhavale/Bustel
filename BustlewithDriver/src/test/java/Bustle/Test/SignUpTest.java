package Bustle.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import Bustle.pages.SignUppage;

public class SignUpTest extends SignUppage{
	
	@Test
    public void verifySignUpPage()
    {
   	 gotoSignUpPage();
   	 Assert.assertEquals(driver.getCurrentUrl(),"http://bustle-spot.com/sign-up");
    }
	
	
	@Test
	public void duplicateSignUp()
	{
		gotoSignUpPage();
		Signupapplication("Arun.havale@softsuave.com","Arun Havale","arun1234","arun1234");
		verifyErrorMsg();
	}
	
	@Test
	public void invalidSignUp1()
	{
		gotoSignUpPage();
		Signupapplication("","","","");
		errorMsgUnderTextBox();
		
	}
	
	@Test
	public void invalidSignUp2()
	{
		gotoSignUpPage();
		Signupapplication("","dada","","");
		errorMsgUnderTextBox();
	}
	
	@Test
	public void invalidSignUp3()
	{
		gotoSignUpPage();
		Signupapplication("Arun.havale@softsuave.com","arun havale","","");
		errorMsgUnderTextBox();
	}
     
     
}
