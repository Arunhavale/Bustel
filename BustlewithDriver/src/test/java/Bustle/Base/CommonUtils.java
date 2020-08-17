package Bustle.Base;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

public class CommonUtils extends BaseClass{

	 By activityicon = By.xpath("//span[.='Activity']");
	 By projectsicon = By.xpath("//span[.='Projects']");
	 By tasksicon    = By.xpath("//span[.='Tasks']"); 
	 By membersicon =  By.xpath("//span[.='Members']");
	 
	 By downLoadTrackerIcon = By.xpath("//div[@title='Download Tracker']");
	 By signoutIcon = By.xpath("//div[@class='account-sec'][2]");
	 By signouttext = By.xpath("//div[.='Signout']");
	 By profiletext = By.xpath("//div[.='Profile']");
	 
	 By organisationIcon = By.xpath("//button[@class='MuiButtonBase-root MuiIconButton-root jss35']");
	 By manageOrgText = By.xpath("//span[.='Manage Organisation']");
	 
	 
	 By save = By.xpath("//button[.='Save']");
	 By cancel = By.xpath("//button[.='Cancel']");
	 
	
	 
	 public void viewOrganisations()
	 {
		WebElement organisationElement = driver.findElement(organisationIcon);
		organisationElement.click();
	 }
	 
	 public void manageOrganisations()
	 {
		 viewOrganisations();
		 WebElement manageOrgElement = driver.findElement(manageOrgText);
		 manageOrgElement.click();
	 }
	 public void signOutOfTheApplication()
	 {
		 WebElement signoutElement = driver.findElement(signoutIcon);
		 signoutElement.click();
		 waitForElement(signouttext);
		 WebElement signoutButton = driver.findElement(signouttext);
		 signoutButton.click();
	 }
	 
	 public void viewProfile()
	 {
		 WebElement signoutElement = driver.findElement(signoutIcon);
		 signoutElement.click();
		 waitForElement(profiletext);
		 WebElement profileElement = driver.findElement(profiletext);
		 profileElement.click();
		 
	 }
	 public void clickOnActivityIcon()
	 {
		WebElement activityElement = driver.findElement(activityicon);
		activityElement.click();
	 }
	 
	 public void clickOnProjectsIcon()
	 {
		 WebElement projectsElement = driver.findElement(projectsicon);
		 projectsElement.click();
	 }
	 
	 public void clickOnTasksIcon()
	 {

		WebElement tasksElement = driver.findElement(tasksicon);
		tasksElement.click();
	 }
 
	 public void clickOnMembersIcon()
	 {
		WebElement membersElement  = driver.findElement(membersicon);
		membersElement.click();
	 }
	 
	 public void clickOnDownLoadTrackerButton()
	 {
		WebElement downLoadTrackerElement = driver.findElement(downLoadTrackerIcon);
		downLoadTrackerElement.click();
	 }
	 
	 public void clickOnSignoutIcon()
	 {
		 WebElement signoutElement = driver.findElement(signoutIcon);
		 signoutElement.click();
	 }
	 
	 public void clickOnSaveButton()
	 {
		 WebElement saveElement = driver.findElement(save);
		 saveElement.click();
	 }
	 
	 public void clickOnCancelButton()
	 {
		 WebElement cancelelement = driver.findElement(cancel);
		 cancelelement.click();
	 }
}
