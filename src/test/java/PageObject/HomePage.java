package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
//public WebDriver driver;

public class HomePage {
	 WebDriver driver;
	public HomePage( WebDriver driver) {
		this.driver = driver;
	 PageFactory.initElements(driver,this );
	
	
	}
}
