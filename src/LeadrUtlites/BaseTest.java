package LeadrUtlites;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public abstract class BaseTest extends Listners {
	public static WebDriver driver;
	public static Properties p;
	
	String username1="updoer1tech@yopmail.com";
	String password="Updoer.17";

	
	@BeforeClass
	
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			
		driver.get("https://beta.leadr.dev");
		
	}
	
	@BeforeMethod
	
	public void waitForElementToClickable(By loc) {
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(loc));
		
	}
	@BeforeMethod
	public void  waitforElementToSelected(By loc) {
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeSelected(loc));
	}
	
	@BeforeMethod
	public void  waitforElementToVisible(By loc) {
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(loc));
	}
	
	@BeforeMethod
	public void clickOn(By settingsProfile) {
		try {
			Thread.sleep(1500);
			((WebElement) settingsProfile).click();
		} catch (InterruptedException e) {
			
			System.out.print("The element is not clicakbale"+e);
		}
		
	}
	
	
	
	@AfterClass
	public void closeBrower() {
		driver.quit();
		
	}
	

}
