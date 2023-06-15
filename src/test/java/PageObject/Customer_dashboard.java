package PageObject;
//public class Customer_dashboard {

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	
import org.openqa.selenium.support.ui.Select;

	public class Customer_dashboard extends HomePage{
		JavascriptExecutor js = ((JavascriptExecutor)driver);

		public Customer_dashboard( WebDriver driver) {
		super(driver);
		
		//JavascriptExecutor js = ((JavascriptExecutor)driver);
		}	
	@FindBy(name="email")
	WebElement txt_username ;
	
	@FindBy(name="password")
	WebElement txt_Password;
			
	@FindBy(xpath="//button[@class='btn btn-primary']")
	WebElement txt_primarybutton;
									
	@FindBy(xpath="//a[normalize-space()='Bookings']")
	WebElement txt_bookings;
					
	@FindBy(name="applicant")
	WebElement txt_applicant;
	
	@FindBy(name=("app_no"))
	WebElement txt_app;
	
	@FindBy(name=("applicant_address"))
	WebElement txt_address;
	
	@FindBy(name=("applicant_contact_person"))
	WebElement txt_contactperson;
					
	@FindBy(name=("applicant_contact_person_email"))
	WebElement txt_email;
	
	@FindBy(name=("factory"))
	WebElement txt_factory;
	
	@FindBy(name=("product_name"))
	WebElement txt_product;
	
	@FindBy(name = "test[]")
	WebElement txt_test;
					
	//Select test = new Select(txt_test);

	@FindBy(name = "client_name")
	WebElement txt_client_name;
	
	@FindBy(name = "client_application_date")
	WebElement txt_client_application;
		
	@FindBy(xpath = "//input[@value='Create']") 
	WebElement txt_create;
	//JavascriptExecutor js = ((JavascriptExecutor)driver);
						 
	//WebElement button = driver.findElement(By.xpath("//input[@value='Create']"));
	//js.executeScript("arguments[0].click();",button);
	//js.executeScript("arguments[0].click();",txt_create);
	public void setusername(String username)	{
		txt_username.sendKeys(username);
	}
	public void setpassword(String password)	{
		txt_Password.sendKeys(password);
	}
	public void clickprimarybutton()	{
		txt_primarybutton.click();
	}
	public void clickbookings()	{
		txt_bookings.click();
	}
	public void setapplicant(String applicant)	{
		txt_applicant.sendKeys(applicant);
	}
	public void setapp(String app)	{
		txt_app.sendKeys(app);
	}	
	public void setaddress(String address)	{
		txt_address.sendKeys(address);
	}	
	public void setcontactperson(String contactperson)	{
		txt_contactperson.sendKeys(contactperson);
	}
	public void setemail(String email)	{
		txt_email.sendKeys(email);
	}	
	public void setfactory(String factory)	{
		txt_factory.sendKeys(factory);
	}
	public void setproduct(String product)	{
		txt_product.sendKeys(product);
	}
	public void settest(String test1)	{
		Select test = new Select(txt_test);
		test.selectByVisibleText("DELAMINATION I(Y-SYS-065C)");
	}
	public void setclient(String client)	{
		txt_client_name.sendKeys(client);
	}
	public void setclientapplication(String clientapplication)	{
		txt_client_application.sendKeys(clientapplication);
	}
	public void setcreate()	{
		
		//js.executeScript("arguments[0].scrollIntoView(true);",txt_create);
		js.executeScript("arguments[0].click();",txt_create);

		//txt_create.click();
	}	
	}


	


