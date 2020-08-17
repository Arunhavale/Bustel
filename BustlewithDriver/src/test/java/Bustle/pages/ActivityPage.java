package Bustle.pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import Bustle.Base.BaseClass;


public class ActivityPage extends BaseClass{
		
		By calendarIcon = By.xpath("//img[@alt='date-selector']");
		By monthDropDown = By.xpath("//span[@class='rdrMonthPicker']/select");
		By yearDropDown = By.xpath("//span[@class='rdrYearPicker']/select");
		String dayInCalendar = "//span[@class='rdrDayNumber']/span[text()='Replace']";
		String todayInCalendar = "//span[@class='rdrDayNumber']/span[.='Replace']";
				
		By totalhours = By.xpath("//*[@id=\"root\"]/div[2]/div[3]/div[2]/div[3]/div/div[1]/p[2]");
		By billablehours = By.xpath("//div[@class='content-body']/div[2]/div[3]/div/div[2]/p[2]");
		By totalactivity = By.xpath("//div[@class='content-body']/div[2]/div[3]/div/div[3]/p[2]");
		By totalnoofusers = By.xpath("//div[@class='content-body']/div[2]/div[3]/div/div[4]/p[2]");
		
		By viewDetailsButton = By.xpath("//button[.='View Details']");
		By viewScreenshotLink = By.xpath("//a[.='View Screenshot']");
		By appsButton = By.xpath("//span[.='Apps']");
		
		
		By orgicon = By.xpath("//button[@class='MuiButtonBase-root MuiIconButton-root jss35']");
		By manageorg = By.xpath("//span[.='Manage Organisation']");
		
		By nextButton = By.xpath("//button[@class='next-btn']");
		By previousButton = By.xpath("//button[@class='prev-btn']");
		
		
	
		public void selectDateFromCalendar(String fromday,String today, String month, String year) {

			WebElement calendarElement = driver.findElement(calendarIcon);
			calendarElement.click();
			
			WebElement monthDropDownElement = driver.findElement(monthDropDown);
			Select monthdd = new Select(monthDropDownElement);
			monthdd.selectByVisibleText(month);
				
			WebElement yearDropDownElement = driver.findElement(yearDropDown);
			Select yeardd = new Select(yearDropDownElement);
			yeardd.selectByVisibleText(year);
			
			dayInCalendar = dayInCalendar.replace("Replace", fromday);
			WebElement dayElement = driver.findElement(By.xpath(dayInCalendar));
			dayElement.click();
			
			
			todayInCalendar = todayInCalendar.replace("Replace", today);
			WebElement uptoday1 = driver.findElement(By.xpath(todayInCalendar));
			uptoday1.click();
			
			
//			Actions act = new Actions(driver);
//			act.sendKeys(Keys.ESCAPE);
			
		}
		
		
		public void selectProject(String projectName){
			By projectDropDown = By.xpath("//label[text()='Select Project']//parent::div/div/div/div/div[.='Select...']");
			waitForElement(projectDropDown);
			WebElement projectElement = driver.findElement(projectDropDown);
			projectElement.click();
			
			String xpath = "//*[text()='Replace']";
			xpath = xpath.replace("Replace", projectName);
			
			WebElement projectOption = driver.findElement(By.xpath(xpath));
			projectOption.click();
		}
		
		public void selectName(String person){
			By namesDropDown = By.xpath("//label[text()='Select Name']//parent::div/div/div/div/div[.='Select...']");
			waitForElement(namesDropDown);
			WebElement namesElement = driver.findElement(namesDropDown);
			namesElement.click();
			
			String xpath = "//*[text()='Replace']";
			xpath = xpath.replace("Replace", person);
			
			WebElement namesOption = driver.findElement(By.xpath(xpath));
			namesOption.click();
		}
		
		
		public void viewDetails() 
		{
			waitForElement(viewDetailsButton);
			WebElement ViewDetails = driver.findElement(viewDetailsButton);
			ViewDetails.click();			
		}
		
		
		public void ViewScreeshot()
		{
			WebElement viewScreenshot = driver.findElement(viewScreenshotLink);
			viewScreenshot.click();
		}
		
		public void AppsButton()
		{
			WebElement Apps = driver.findElement(appsButton);
			Apps.click();
		}
		
		public String getTotalHoursofWorkDone() 
		{
			WebElement TotalHours =driver.findElement(totalhours);
			System.out.println("Total hours of workdone:"+TotalHours.getText());	
			return TotalHours.getText();
		}
		
		public void verifyTotalHoursWorkDone(String expectedHoursWorkDone)
		{
			String actualHoursWorkDone = getTotalHoursofWorkDone();
			Assert.assertEquals(actualHoursWorkDone, expectedHoursWorkDone);
			
		}
		
		public String getTotalBillableHours()
		{
			WebElement TotalBillableHours = driver.findElement(billablehours);
			System.out.println("Total Billable Hours :"+ TotalBillableHours.getText());
			return TotalBillableHours.getText();
		}
		
		public void verifyTotalBillableHours(String expectedTotalBillableHours)
		{
			String actualTotalBillableHours =getTotalBillableHours();
			Assert.assertEquals(actualTotalBillableHours, expectedTotalBillableHours);
			
		}
		
		public String getTotalActivity()
		{
			WebElement TotalActivity = driver.findElement(totalactivity);
			System.out.println("Total Activity Percentage :"+TotalActivity.getText());
			return TotalActivity.getText();
		}
		
		public void verifyTotalActivity(String expectedTotalActivity)
		{
		      String actualTotalActivity = getTotalActivity();
		      Assert.assertEquals(actualTotalActivity, expectedTotalActivity);	
		}
		
		
		public String getTotalNoOfUsers()
		{
			WebElement TotalNoOfUsers =driver.findElement(totalnoofusers);
			System.out.println("Total Number of users in the project :"+TotalNoOfUsers.getText());
			return TotalNoOfUsers.getText();
		}
		
		public void verifyTotalNoOfUsers(String expectedTotalNoOfUsers)
		{
			String actualTotalNoOfUsers = getTotalNoOfUsers();
			Assert.assertEquals(actualTotalNoOfUsers, expectedTotalNoOfUsers);
		}


		
		public void clickonOrganisationIcon()
		{
			waitForElement(orgicon);
			WebElement organisationIcon = driver.findElement(orgicon);
			organisationIcon.click();
		}
		
		public void clickonManageOrganisation()
		{
			waitForElement(manageorg);
			WebElement manageOrganisation = driver.findElement(manageorg);
			manageOrganisation.click();
		}
		
		public void clickOnNextButton()
		{
			driver.findElement(nextButton).click();
		}
		
		public void previousButton()
		{
			driver.findElement(previousButton).click();
		}
		
		
}
