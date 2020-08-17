package Bustle.Test;

import org.testng.annotations.Test;
import Bustle.pages.ActivityPage;
import Bustle.pages.LoginPage;

public class ActivityTest extends ActivityPage {
	


	@Test
	public void activitytest1(){
		LoginPage l = new LoginPage();
		l.loginToApplication();
		selectProject("AutomationTesting");
		selectName("ArunH");
		//selectDateFromCalendar("7","20","July","2019");	
		
	}
	
	@Test
	public void viewDetailsOfUser()
	{
		LoginPage l = new LoginPage();
		l.loginToApplication();
		viewDetails();
	}
	
	@Test
	public void viewScreenshotsOfUser()
	{
		LoginPage l = new LoginPage();
		l.loginToApplication();
		ViewScreeshot();
	}
    
	@Test
	public void verifyActivityPage()
	{
		     LoginPage l = new LoginPage();
			l.loginToApplication();
			String expectedUrl ="http://bustle-spot.com/activity";
     		  verifyPage(expectedUrl);
	}
	

	@Test
	public void TotalHours()   
	{
		LoginPage login = new LoginPage();
		login.loginToApplication();
		verifyTotalHoursWorkDone("00:00");
		verifyTotalBillableHours("00:00");
		verifyTotalActivity("0%");
		verifyTotalNoOfUsers("0");
		selectDateFromCalendar("10","20","March","2018");
	}
}
