package Bustle.pages;

import org.openqa.selenium.By;

import Bustle.Base.BaseClass;

public class ResetPasswordPage extends BaseClass{

	By newPassword = By.xpath("//input[@name='password']");
	By confirmPassword = By.xpath("//input[@name='confirm-password']");
	By submitbutton = By.xpath("//button[.='Submit']");
	
	public void enterNewPassword(String newpassword)
	{
		driver.findElement(newPassword).sendKeys(newpassword);
	}
	
	public void enterConfirmPassword(String confirmpassword)
	{
		driver.findElement(confirmPassword).sendKeys(confirmpassword);
	}
	
	public void clickOnSubmitButton()
	{
		driver.findElement(submitbutton).click();
	}
	

}
