package LeadrPomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LeadrNexusPage {
	
public static WebDriver driver;
	
	
	public LeadrNexusPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

}
