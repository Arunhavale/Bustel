package Bustle.Test;

import org.testng.annotations.Test;

import Bustle.pages.LoginPage;
import Bustle.pages.TasksPage;

public class TaskPageTest extends TasksPage{
	

	@Test
	public void AddTask1()
	{
		LoginPage l = new LoginPage();
		l.loginToApplication();
		clickonTaskIcon();
		selectProject("Lets grow tress");
		clickonAddTask();
//		enterTaskName("watering");
//		clickonSaveButton();
	}
	
	@Test 
	public void AddTask2()
	{
		LoginPage l = new LoginPage();
		l.loginToApplication();		 
		addTask("Life", "water the trees");
	}

}
