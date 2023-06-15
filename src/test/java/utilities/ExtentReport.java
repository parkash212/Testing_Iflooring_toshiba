
package utilities;

import java.io.IOException;
//import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import BasePage.BaseClass;

//import testBase.BaseClass;
public class ExtentReport implements ITestListener {
	// these are 3 classes
public ExtentSparkReporter sparkReporter; // for ui of report 
public ExtentReports extent; // for populate some common information 
public ExtentTest test; // to create test case entries

String repName;
public void onStart(ITestContext testContext) {
	String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date()); // time stamp
repName = "Test-Report-" + timeStamp + ".html";
	
  sparkReporter = new ExtentSparkReporter(".\\Reports\\" + repName); // specify location of report
  
  sparkReporter.config().setDocumentTitle("opencart Autoamtion Report"); // title of report
  sparkReporter.config().setReportName("opencart Functional testing"); // name of the report
  sparkReporter.config().setTheme(Theme.DARK);
  
  extent = new ExtentReports();
  extent.attachReporter(sparkReporter);
  extent.setSystemInfo("Application","opencart");
  extent.setSystemInfo("Module","Admin");
  extent.setSystemInfo("Sub Module","Customers");
  extent.setSystemInfo("Operating System", System.getProperty("os.name"));
  extent.setSystemInfo("User Name", System.getProperty("user.name"));
  extent.setSystemInfo("Environment", "QA");	
}
public void onTestSuccess(ITestResult result) {
	test = extent.createTest(result.getName());
	test.log(Status.PASS, "Test passed");
}
public void onTestFailure(ITestResult result) {
	test = extent.createTest(result.getName());
	test.log(Status.FAIL, "Test failed");
	test.log(Status.FAIL, result.getThrowable().getMessage());	
	try {
	String imgPath = new BaseClass().captureScreen(result.getName());
	// here new baseclass will create object of base-class
	test.addScreenCaptureFromPath(imgPath);
	} catch(IOException e1) {
		e1.printStackTrace();
	}
}
public void onTestSkipped(ITestResult result) {
	test = extent.createTest(result.getName());
	//test.createNode(result.getName());
	//test.assignCategory(result.getMethod().getGroups());
	test.log(Status.SKIP, "Test Skipped");
		test.log(Status.SKIP, result.getThrowable().getMessage());
	}
	public void onFinish(ITestContext testContext) {
		extent.flush();
	}	
}	
// 57:00 to send the report through email


