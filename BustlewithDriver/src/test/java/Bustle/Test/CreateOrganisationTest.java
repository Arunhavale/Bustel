package Bustle.Test;

import org.testng.annotations.Test;

import Bustle.pages.ActivityPage;
import Bustle.pages.LoginPage;
import Bustle.pages.OrganisationPage;

public class CreateOrganisationTest extends OrganisationPage{
	
	@Test
	public void CreateOrganisation()
	{
		LoginPage l = new LoginPage();
		l.loginToApplication();
		ActivityPage a = new ActivityPage();
		a.clickonOrganisationIcon();
		a.clickonManageOrganisation();
		addOrganisation("WhiteField");
		errorAddOrganisation();
		
	}
	

}
