package Bustle.pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import Bustle.Base.BaseClass;

public class MembersPage extends BaseClass{
	
	By membersicon = By.xpath("//span[.='Members']");
	By addmembers = By.xpath("//button[.='Add Members']");
	By usermail = By.xpath("//*[@id=\"root\"]/div[2]/div[3]/div[2]/div[3]/div/form/div[2]/div/input");     //("//label[.='User Email']/../div[2]");
	By save = By.xpath("//button[.='Save']");
	By membersbutton = By.xpath("(//span[.='Members'])[2]");
    By assignproject = By.xpath("//button[.='Assign Project']");
    By savebutton = By.xpath("//button[.='Save']");
    By membername = By.xpath("(//span[.='Members'])[2]/../../../ul[2]/li/a");
    By actions = By.xpath("//span[.='Lifejourney']/../../div[4]");
   
    By roles = By.xpath("//div[@class=' css-11unzgr']/div[1]");
    By searchMembersTB = By.xpath("//input[@placeholder='Search Members']");
    
	public void clickonMembersIcon()
	{
		WebElement MembersIcon = driver.findElement(membersicon);
		MembersIcon.click();
	}
	
	public void clickonAddMembers()
	{
		WebElement AddMembers = driver.findElement(addmembers);
		AddMembers.click();
	}

	public void enterUserMail(String mail)
	{
		waitForElement(usermail);
		WebElement UserMail = driver.findElement(usermail);
		UserMail.sendKeys(mail);
	}
	
	public void clickonSaveButton()
	 {
		 WebElement Save = driver.findElement(save);
		 Save.click();
	 }
	
	public void clickonMembersButton()
	{
		WebElement Members = driver.findElement(membersbutton);
		Members.click();
	}
	
	 public void addMember(String mail)
	 {
		 clickonMembersIcon();
		 clickonAddMembers();
		 enterUserMail(mail);
		 clickonSaveButton();
	 }
	 
	 public void clickOnAssignProject()
	 {
	WebElement assignProjectButton = driver.findElement(assignproject);
		 assignProjectButton.click();
	 }
	 
	 public void selectProject(String project)
	 {
		 By projectlist = By.xpath("//div[@class=' css-11unzgr']/div");
		 waitForElement(projectlist);
		  WebElement Projectddl = driver.findElement(projectlist);
		  Projectddl.click();
		 			
			String xpath = "//*[text()='Replace']";
			xpath = xpath.replace("Replace",project);
			
			WebElement projectsoption = driver.findElement(By.xpath(xpath));
			projectsoption.click();
	 }
	 
	 
	
	 public void clickonMember(String MemberName)
	 {
		
		 waitForElement(membername);
		List<WebElement> Membername = driver.findElements(membername);
		for (WebElement member : Membername) {
			if(member.getText().equals(MemberName))
			{
				member.click();
			}
		}
	 }
	 
	 
	 public void selectRole(String roleName)
	 {
		 By rolelist =By.xpath("//label[.='Roles']/../div");
		 waitForElement(rolelist);
		 WebElement roleList = driver.findElement(rolelist);
		 roleList.click();
		 
		 String xpath = "//*[text()='Replace']";
		 xpath = xpath.replace("Replace",roleName);
		 
		 WebElement Role = driver.findElement(By.xpath(xpath));
		 Role.click();
	 }
	 
	 public void clickOnSaveButton()
	 {
		 WebElement Save = driver.findElement(savebutton);
		 Save.click();
	 }
	 	 
	 	 
	 public void assignProject(String project,String roleName)
	 {
		 clickonMembersIcon();
		 clickOnAssignProject();
	     selectProject(project);
	     selectRole(roleName);
	     clickonSaveButton();   
	 }
	 
	 public void clickOnSearchmembersTextBox()
	 {
		 driver.findElement(searchMembersTB).click();
	 }
	 
	 
	 public void clickonActionsButton()
	 {
		 
	 }
}
