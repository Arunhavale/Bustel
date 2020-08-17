package Bustle.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import Bustle.pages.LoginPage;
import Bustle.pages.MembersPage;

public class MembersPageTest extends MembersPage{

	@Test 
	public void verifyMembersPage()
	{
		 LoginPage l = new LoginPage();
			l.loginToApplication();
			clickonMembersIcon();
		Assert.assertEquals(driver.getCurrentUrl(),"http://bustle-spot.com/member#");
	}
	
	@Test
	public void AddMembers()
	{
		LoginPage l = new LoginPage();
		l.loginToApplication();
		addMember("Bustleuser@gmail.com");
		
	}
	
	@Test
	public void assignProject()
	{
		LoginPage l = new LoginPage();
		l.loginToApplication();
		assignProject("DataBase Testing","User");
	}
	
	@Test
	public void selectMember()
	{
		LoginPage l = new LoginPage();
		l.loginToApplication();
		clickonMembersIcon();
		clickonMember("ArunH");
		clickOnAssignProject();
	}
	
	
}
