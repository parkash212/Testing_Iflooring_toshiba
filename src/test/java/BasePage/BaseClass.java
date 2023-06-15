package BasePage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseClass  {
	//package BasePackage;
	public static  WebDriver driver; // we make it static 
	//JavascriptExecutor js = ((JavascriptExecutor)driver);


	@BeforeClass
	public void setup() {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://iflooring.customerdevsites.com/");
	JavascriptExecutor js = ((JavascriptExecutor)driver);
	}
	@AfterClass
	public void teardown()  {
	//driver.quit();
	}
	public String captureScreen(String tname) throws IOException {
		// how to generate timestamp , in java we have predefined class = SimpleDateFormat
	// these are the 3 statement to generate timestamp

	// SimpledateFormat df = new SimpleDateFormat(yyyyMMddhhmmss);
	//Date dt = new Date();

	//String timestamp=  df.format(dt)
	// here we combined 3 statements into one below 
	String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		
		
			TakesScreenshot takesScreenshot =  (TakesScreenshot) driver;
	        File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
			String destination = System.getProperty("user.dir") + "\\Screenshots\\" + tname + "_" + timeStamp + ".png";
				try {
					FileUtils.copyFile(source, new File(destination));
				} catch(Exception e) {
					e.getMessage();
				}
					return destination;
				
	}
}



