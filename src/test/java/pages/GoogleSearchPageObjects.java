package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageObjects {
	
	WebDriver driver = null;
	
	By testBoxSearch = By.name("q");
	By buttonSearch = By.name("btnK");
	
	public GoogleSearchPageObjects(WebDriver driver) {
		this.driver = driver;
	}
	
	public void setTextInSearchBox(String text) {
		driver.findElement(testBoxSearch).sendKeys(text);
	}
	
	public void clickSearchButton() {
		driver.findElement(testBoxSearch).sendKeys(Keys.ENTER);
	}

}
