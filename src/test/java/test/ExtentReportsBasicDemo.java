package test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import pages.GoogleSearchPage;
import utilities.Useful;

public class ExtentReportsBasicDemo {

	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		// initialize the HtmlReporter
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");
		
		// initialize ExtentReports and attach the HtmlReporter
		ExtentReports extent = new ExtentReports();

		// attach only HtmlReporter
		extent.attachReporter(htmlReporter);
		
		// creating tests
		ExtentTest test1 = extent.createTest("Google Search Test One");
		
		driver = new ChromeDriver();
		
		test1.log(Status.INFO, "Starting Test");
		driver.get("https://google.com");
		test1.pass("Navigated to google.com");
		
		GoogleSearchPage.textBoxSearch(driver).sendKeys("abc");
		test1.pass("Entered text into search box");
		
		GoogleSearchPage.textBoxSearch(driver).sendKeys(Keys.ENTER);
		test1.pass("Click enter");
	
		Useful.waitASec(3);
		test1.pass("Results appeared and we wait 3 sec now");
		
		//close driver
		driver.close();
		driver.quit();
		test1.pass("Closed the browser");
		
		test1.info("Test Completed");
		
		//calling flush writes everything to the log file
		extent.flush();

	}

}
