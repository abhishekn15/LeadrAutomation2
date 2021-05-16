package LeadrSettingsTestClass;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.Test;


import LeadrPomPackage.LeadrHomePage;
import LeadrPomPackage.LeadrSettings;
import LeadrUtlites.BaseTest;

public class LeadrClickonEnableEmail  extends BaseTest{
	
	public static WebDriver driver;
	@Test
	public void check() {
	
	LeadrHomePage homePage=new LeadrHomePage(driver);
	LeadrSettings set=new LeadrSettings(driver);
	
	openBrowser();
	homePage.settingsTab();
	closeBrower();
}
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
}