package LeadrPomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LeadrTaskPage {
public static WebDriver driver;
	
	
	public LeadrTaskPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

}
