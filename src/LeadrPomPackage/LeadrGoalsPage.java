package LeadrPomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LeadrGoalsPage {
	
public static WebDriver driver;
	
	
	public LeadrGoalsPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

}
