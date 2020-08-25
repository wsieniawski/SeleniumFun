package listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.Test;

//if more then ({ example1.class, example2.class, etc. })
//@Listeners(listeners.TestNGListeners.class)
public class TestNGListnerDemo {

	@Test
	public void test1() {
		System.out.println("I am inside test1");
	}

	@Test
	public void test2() {
		System.out.println("I am inside test2");

		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path is: " + projectPath);

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("abc");
		driver.findElement(By.xpath("//input[@name='abcd']")).sendKeys("abc");
		driver.close();
	}

	@Test
	public void test3() {
		System.out.println("I am inside test3");
		throw new SkipException("This test is skipped");
	}
}
