package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Validation {
	
	@Test
	public void Test1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String actualTitle = driver.getTitle();
		
		Assert.assertEquals(actualTitle, "OrangeHRM", "Invalid Title");
		driver.quit();

	}
	
}
