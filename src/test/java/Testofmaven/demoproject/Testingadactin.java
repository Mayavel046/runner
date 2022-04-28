package Testofmaven.demoproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Testingadactin {
	@Test(enabled = true)
	public void aa() {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Mayavel\\eclipse-workspace\\Selenium_9am\\Selenium\\drivernew\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://google.com");
		driver.manage().window().maximize();
		
		System.out.println("This is ok");

	}
	@Test
	@Ignore
	private void bb() {
	System.out.println("This is BB");

	}
	
@Test
@Ignore
	private void cc() {
	System.out.println("This is CC");

	}
}
