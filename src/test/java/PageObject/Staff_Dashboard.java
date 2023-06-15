package PageObject;


import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
public class Staff_Dashboard extends HomePage{
	JavascriptExecutor js = ((JavascriptExecutor)driver);
	public Staff_Dashboard(WebDriver driver) {
		super(driver);
	}
	@FindBy(name="email")
	WebElement stf_email;
	
	@FindBy(name="password")
	WebElement stf_pswrd;
	
	@FindBy(xpath="//button[@class='btn btn-primary']")
	WebElement stf_btn;
	
	@FindBy(xpath="//a[normalize-space()='Test Status']")
	WebElement stf_status;
	
	@FindBy(xpath="//tbody/tr[1]/td[14]/a[1]")
	WebElement stf_table;
	
	//WebElement button = driver.findElement(By.xpath("//input[@value='Next']"));
	//js.executeScript("arguments[0].click();",button);
	@FindBy(xpath="//input[@value='Next']")
	WebElement stf_valve;
	
	@FindBy(xpath="//input[@value='Save']")
	WebElement stf_save;
	
	//Select testing = new Select(driver.findElement(By.name("tester[]")));
	//testing.selectByVisibleText("Graceold");
	@FindBy(name="tester[]")
	WebElement stf_tester;
	
	//WebElement button2 = driver.findElement(By.xpath("//input[@value='Submit']"));//.click();
	//js.executeScript("arguments[0].click();",button2);
	@FindBy(xpath ="//input[@value='Submit']")
	WebElement stf_submission;
	
	public void sendname(String name) {
		stf_email.sendKeys(name);
	}
	public void sendpassword(String pos) {
		stf_pswrd.sendKeys(pos);
	}
	public void sendbutton() {
		stf_btn.click();
	}
	public void sendstatus() {
		stf_status.click();
	}
	public void sendtable() {
		stf_table.click();
	}
	public void setstaffvalue() {
		//JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].click();",stf_valve);
	}
	public void sendsave() {
		stf_save.click();
	}
	public void sendtester(String testing) {
		Select element = new Select(stf_tester);
		element.selectByVisibleText("Graceold");
	}
	public void sendsubmission() {
		js.executeScript("arguments[0].click();",stf_submission);
	}
}

