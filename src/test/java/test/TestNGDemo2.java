package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDemo2 {
	
	WebDriver driver = null;
	
	@BeforeTest
	public void setUpTest() {
		
		driver = new ChromeDriver();		
	}
	
	@Test
	public void googleSearch2() {
		
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
		
	}

}
