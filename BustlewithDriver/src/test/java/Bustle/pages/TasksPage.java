package Bustle.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Bustle.Base.BaseClass;

public class TasksPage extends BaseClass{
	
	By tasksicon = By.xpath("//span[.='Tasks']");
	By addtask = By.xpath("//button[.='Add Task']||//button[.='Add Tasks']");
	By taskname = By.name("taskName");
	By save = By.xpath("//button[.='Save']");
	By projectlist = By.xpath("//div[@class='project-list']/ul/li/a");
	By searchProjects = By.xpath("//input[@placeholder = 'Search Projects']");
	
	
	public void clickonTaskIcon()
	 {
		System.out.println("clickontaskicon");
		WebElement TasksIcon = driver.findElement(tasksicon); 
	    TasksIcon.click();
	 }
	 
	 public void clickonAddTask()
	 {
		 System.out.println("clickonAddTask");
		 waitForElement(addtask);
		 WebElement AddTasks =  driver.findElement(addtask);
		 AddTasks.click();
	 }
      
	 public void enterTaskName(String task)
	 {
		 WebElement TaskName = driver.findElement(taskname);
		 TaskName.sendKeys(task);
	 }
	 
	 public void clickonSaveButton()
	 {
		 WebElement Save = driver.findElement(save);
		 Save.click();
	 }
	 
	 public void selectProject(String project)
	 {
		 waitForElement(projectlist);
		List<WebElement> Projects = driver.findElements(projectlist);
		for (WebElement p : Projects) {
			if(p.getText().equals(project))
			{
				p.click();
			}	
		}
	 }
	 
	 public void clickonSearchProjects()
	 {
		WebElement searchprojects = driver.findElement(searchProjects);
		searchprojects.click();
	 }
	 
	 
	 public void addTask(String project,String taskname)
	 {
		 clickonTaskIcon();
		 selectProject(project);
		 clickonAddTask();
		 enterTaskName(taskname);
		 clickonSaveButton();
		 
	 }
}
