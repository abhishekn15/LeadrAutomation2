package LeadrPomPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;

import LeadrUtlites.BaseTest;

public class LeadrSettings extends BaseTest {
	
	By profilebtn=By.xpath("//span[text()='Profile']");
	
    By settingsProfile=By.xpath("//body/div[@id='root']/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/span[1]");
	By emailNotification=By.cssSelector(".jss4.MuiSwitch-input");
	public LeadrSettings(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	
     public void clickonProfileBttn() {
    	 waitforElementToVisible(profilebtn);
     }
     
     public void clickOnSettings() {
    	 waitforElementToVisible(settingsProfile);
    	 waitForElementToClickable(settingsProfile);
    	 clickOn(settingsProfile);
     }
     
     public void clickOnEmailNotifcation() {
    	 Boolean flag=true;
    	 waitforElementToVisible(emailNotification);
    	 waitForElementToClickable(emailNotification);
    	 clickOn(emailNotification);
    	 
    	 
     }


	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
}
