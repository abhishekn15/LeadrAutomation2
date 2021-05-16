package LeadrPomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LeadrAdminPage {
	
public static WebDriver driver;
	
	
	public LeadrAdminPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

}
