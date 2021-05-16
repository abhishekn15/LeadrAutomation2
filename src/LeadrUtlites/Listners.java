package LeadrUtlites;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.google.common.io.Files;

public abstract class Listners implements ITestListener {
public static WebDriver driver;
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("The browser has started"+result);
		
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Date d=new Date();
		int min=d.getMinutes();
		int sec=d.getSeconds();
		int date=d.getDate();
		TakesScreenshot scrShot =(TakesScreenshot)driver;
		File source = scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile=new File("./Photo/date+min+sec.jpeg");
		 try {
			Files.copy(source, DestFile);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		
	}

	

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
		
	}
	
	

}
