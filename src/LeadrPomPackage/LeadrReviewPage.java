package LeadrPomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LeadrReviewPage {
	
public static WebDriver driver;
	
	
	public LeadrReviewPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

}
