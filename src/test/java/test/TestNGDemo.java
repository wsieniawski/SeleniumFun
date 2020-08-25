package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.PropertiesFile;

public class TestNGDemo {
	
	WebDriver driver = null;
	public static String browserName = null;
	
	@BeforeTest
	public void setUpTest() {
		PropertiesFile.getProperties(); 
		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();			
		} else if (browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
	}
	
	@Test
	public void googleSearch() {
		
		//go to google.com
		driver.get("https://google.com");
		
		//search for 'abc'
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("abc");
		
		//click enter to search for results
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.ENTER);
		
		//wait 3sec on website
		try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	}
	
	@AfterTest
	public void tearDownTest() {
		
		//close driver
		driver.close();
		driver.quit();
		System.out.println("Test completed succesfuly");
		PropertiesFile.setProperties();
	}

}
