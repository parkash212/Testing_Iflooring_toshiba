	package Test_Cases;
	
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import BasePage.BaseClass;
import PageObject.Customer_dashboard;

//import PageObject.Customer_dashboard;
		public class Test_Case001 extends BaseClass{
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		@Test
		public void test_account() {
    
	Customer_dashboard cd = new Customer_dashboard(driver);
	cd.setusername("naveen@gmail.com");
	cd.setpassword("111111");
	cd.clickprimarybutton();
	cd.clickbookings();
	cd.setapplicant("kaja65");
	cd.setapp("kaja65");
	cd.setaddress("10");
	cd.setcontactperson("kaja65");
	cd.setemail("j@mailinator.com");
	cd.setfactory("water bottles");
	cd.setproduct("water bottles");
	cd.settest(null);
	cd.setclient("kaja65");
	cd.setclientapplication("14042023");
	cd.setcreate();
		 
	}
	}
	
	
