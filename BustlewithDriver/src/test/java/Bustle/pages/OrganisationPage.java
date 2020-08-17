package Bustle.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Bustle.Base.BaseClass;

public class OrganisationPage extends BaseClass{
	
	
	By addorg = By.xpath("//button[.='Add Organisation']");
	By enterOrgName = By.xpath("//input[@name='organisation-name']");
	By orgDesc = By.xpath("//textarea[@name='organisation-description']");
	By uploadlogo = By.xpath("//div[@id='custom-upload']");
	By submit = By.xpath("//button[.='Submit']");
	By usericon = By.xpath("//div[@class='MuiAvatar-root MuiAvatar-circle acc-pro-pic MuiAvatar-colorDefault']");
	By previousButton = By.xpath("//button[@class='prev-btn act-prev-btn']");
	By errorMsg = By.xpath("//label[.='already_exist']");
	
	
	public void clickonAddOrganisation()
	{
		waitForElement(addorg);
	    WebElement addOrganisation = driver.findElement(addorg);
	    addOrganisation.click();
	}
	
	public void enterOrganisationName(String OrganisationName)
	{
		waitForElement(enterOrgName);
		WebElement orgName = driver.findElement(enterOrgName);
		orgName.sendKeys(OrganisationName);
	}
    
	public void enterorgDesc(String organisationDescription)
	{
		WebElement orgDescription = driver.findElement(orgDesc);
		orgDescription.sendKeys(organisationDescription);
	}
	
//	public void uploadLogo()
//	{
//		WebElement uploadLogo= driver.findElement(uploadlogo);
//	}
	
	public void errorAddOrganisation()
	{
		driver.findElement(errorMsg).getText();
		
	}
	public void clickOnSubmitButton()
	{
		WebElement Submit = driver.findElement(submit);
		Submit.click();
	}
	
	public void addOrganisation(String OrganisationName)
	{
		clickonAddOrganisation();
		enterOrganisationName(OrganisationName);
		clickOnSubmitButton();
	}
}
