package test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import pages.GoogleSearchPage;
import utilities.Useful;

public class ExtentReportsBasicDemoWithTestNG {
	
	WebDriver driver = null;
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent2;
	
	@BeforeSuite
	public void setUp() {		
		htmlReporter = new ExtentHtmlReporter("extent2.html");
		// initialize ExtentReports and attach the HtmlReporter
		extent2 = new ExtentReports();
		// attach only HtmlReporter
		extent2.attachReporter(htmlReporter);
	}
	
	@BeforeTest
	public void setUpTest() {		
		driver = new ChromeDriver();		
	}
	
	@Test
	public void test2() throws Exception {		
		ExtentTest test = extent2.createTest("MyFirstTest");
		
		test.log(Status.INFO, "Starting Test");
		driver.get("https://google.com");
		test.pass("Navigated to google.com");
		
		GoogleSearchPage.textBoxSearch(driver).sendKeys("abc");
		test.pass("Entered text into search box");
		
		GoogleSearchPage.textBoxSearch(driver).sendKeys(Keys.ENTER);
		test.pass("Click enter");
	
		Useful.waitASec(3);
		test.pass("Results appeared and we wait 3 sec now");		
	}
	
	@AfterTest
	public void tearDownTest() {		
		//close driver
		driver.close();
		driver.quit();
		//System.out.println("Test completed succesfuly");		
	}

	@AfterSuite
	public void tearDown() {
		// calling flush writes everything to the log file
        extent2.flush();				
	}
}
