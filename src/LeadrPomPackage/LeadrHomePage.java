package LeadrPomPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;

import LeadrUtlites.BaseTest;

public class LeadrHomePage extends BaseTest {

 By Meetings=By.xpath("//div[contains(text(),'Meetings')]");
 By Goals=By.xpath("//div[contains(text(),'Goals')]");
 By Feedback=By.xpath("//div[contains(text(),'Feedback')]");
 By Learnings=By.xpath("//div[contains(text(),'Feedback')]");
 By Task=By.xpath("//div[contains(text(),'Tasks')]");
 By People=By.xpath("//div[contains(text(),'People')]");
 By Reviews=By.xpath("//div[contains(text(),'Reviews')]");
 By HrModule=By.xpath("//div[contains(text(),'HR Module')]");
 By Tools=By.xpath("//div[contains(text(),'Tools')]");
 By Admin=By.xpath("//div[contains(text(),'Admin')]");
 By Settings=By.xpath("//div[contains(text(),'Settings')]");
 By Logout=By.xpath("//div[contains(text(),'Logout')]");
	
	
	public LeadrHomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void meetingsTab() {
		waitforElementToVisible(Meetings);
		
	}
	
	public void settingsTab() {
		waitforElementToVisible(Settings);
		waitForElementToClickable(Settings);
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
