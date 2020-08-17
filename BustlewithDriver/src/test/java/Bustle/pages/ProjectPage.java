package Bustle.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Bustle.Base.BaseClass;

public class ProjectPage extends BaseClass {
	  
	
	    By projectsicon = By.xpath("//span[.='Projects']");
	    By addprojects = By.xpath("//button[.='Add Projects']");
	    By projectname =By.name("project-name");
	    By selectpmanager = By.xpath("//*[@id=\"root\"]/div[2]/div[3]/div[2]/div[4]/div/form/div[5]/div/div/div[1]");
	    By save = By.xpath("//button[.='Save']");
	    
	    By projects = By.xpath("//div[@class='project-list']/ul/li/a");
	    By addmember = By.xpath("//button[.='Add Members']||//button[.='Add Member']");
	    By membersddl = By.xpath("//label[.='Members']/../div");
	    By roleddl = By.xpath("//label[.='Roles']/../div");
	    
	    
	    public void clickonProjectsIcon()
	    {
	    	WebElement ProjectsIcon = driver.findElement(projectsicon);
	    	ProjectsIcon.click();
	    	Assert.assertEquals(driver.getCurrentUrl(), "http://bustle-spot.com/project#");
	    }
	    
	        
	    public void clickOnAddMember()
	    {
	     waitForElement(addmember);
	     WebElement addMember = driver.findElement(addmember);
	     addMember.click();
	    }
	    
	    public void clickonAddProjects()
	    {
	    	WebElement AddProjects = driver.findElement(addprojects);
	    	AddProjects.click();
	    }
	    
	    	    
	    public void enterProjectName(String project)
	    {
	    	WebElement ProjectName = driver.findElement(projectname);
	    	ProjectName.sendKeys(project);
	    }
	    
	    
	    public void SelectProjectManager(String Person) throws InterruptedException
	    {
	    	waitForElement(selectpmanager);
	    	WebElement ProjectManager = driver.findElement(selectpmanager);
	    	ProjectManager.click();
	    	
	    	String xpath = "//*[text()='Replace']";
	    	xpath = xpath.replace("Replace",Person);
	    			  	
	    	WebElement managerOptions = driver.findElement(By.xpath(xpath));
	    	managerOptions.click();
	    }
	    
	    public void clickonSaveButton()
	    {
	    	WebElement Save = driver.findElement(save);
	    	Save.click();
	    }
	    
	    public void selectProject(String Project)
	    {
	    	List<WebElement> projectlist = driver.findElements(projects);
	    	for (WebElement project : projectlist) {
				if(project.getText().equals(Project))
				{
					project.click();
				}
			}
	    }
	    
	    public void selectMember(String member)
	    {
	     waitForElement(membersddl);
	     WebElement membersDdl = driver.findElement(membersddl);
	     membersDdl.click();
	     
	     String xpath = "//*[text()='replace']";
	     xpath = xpath.replace("replace",member);
	     
	     WebElement memberOption = driver.findElement(By.xpath(xpath));
	     memberOption.click();
	     
	    }
	    
	    public void selectRole(String role)
	    {
	    	WebElement roleelemenet = driver.findElement(roleddl);
	    	roleelemenet.click();
	    	
	    	String xpath ="//*[text()='replace']";
	    	xpath = xpath.replace("replace", role);
	    	
	    	WebElement roleelement = driver.findElement(By.xpath(xpath));
	    	roleelement.click();
	    }
	    public void addMemberToTheProject(String Project,String member, String role)
	    {
	    	clickonProjectsIcon();
	    	selectProject(Project);
	    	clickOnAddMember();
	    	selectMember(member);
	    	selectRole(role);
	    	clickonSaveButton();
	    	   	
	    }

	    
	    public void addProject(String projectName,String projectManagerName) throws InterruptedException
	    {
	    	clickonProjectsIcon();
	    	clickonAddProjects();
	    	enterProjectName(projectName);
	    	SelectProjectManager(projectManagerName);
	    	clickonSaveButton();
	    }
	    
//	    public void SelectProjectManager(String Person)
//	    {
//	    	waitForElement(selectpmanager);
//	    	WebElement ProjectManager = driver.findElement(selectpmanager);
//	    	ProjectManager.click();;
//	    	WebElement Pm = driver.findElement(By.xpath("//div[.='ArunH']"));
//	    	Pm.click();
//	    	
//	    }
}
