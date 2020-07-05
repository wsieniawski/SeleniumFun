package test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPage;
import utilities.Useful;

public class GoogleSearch {
	
	public static void main(String[] args) {
		googleSearch();
		
	}
	
	public static void googleSearch() {
		
		WebDriver driver = new ChromeDriver();
		
		//go to google.com
		driver.get("https://google.com");
		
		//search for 'abc'
		GoogleSearchPage.textBoxSearch(driver).sendKeys("abc");
		
		//click enter to search for results		
		GoogleSearchPage.textBoxSearch(driver).sendKeys(Keys.ENTER);
		
		//wait 3sec on website
		Useful.waitASec(3);
		
		//close driver
		driver.close();
		
		System.out.println("Test completed succesfuly");
	}

}
