package Test_Cases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import BasePage.BaseClass;
import PageObject.Staff_Dashboard;
public class Test_Cases002 extends BaseClass {
	JavascriptExecutor js = ((JavascriptExecutor)driver);

	@Test
	public void staff_account() {
	Staff_Dashboard sd = new Staff_Dashboard(driver);
	sd.sendname("admin@admin.com1");
	sd.sendpassword(("111111"));
	//sd.sendpassword("2222"); // jankar test ko fail karna ha 
	sd.sendbutton();
	sd.sendstatus();
	sd.sendtable();
	sd.setstaffvalue();
	sd.sendsave();
	sd.sendtester(null);
	sd.sendsubmission();
}
}

