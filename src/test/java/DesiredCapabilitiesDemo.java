import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DesiredCapabilitiesDemo {


	public static void main(String[] args) {
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path is: " + projectPath);

		System.setProperty("webdriver.edge.driver", "C:\\webdrivers\\edge\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://google.com");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("abcd");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.ENTER);
		try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		driver.close();
	}
}
