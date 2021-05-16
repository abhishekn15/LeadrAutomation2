package LeadrPomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LeadrPeoplePage {
public static WebDriver driver;
	
	
	public LeadrPeoplePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

}
