package Testofmaven.demoproject;

import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class demo {
	


@Test
public static void main(String[] args) {
	

		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Mayavel\\eclipse-workspace\\Selenium_9am\\Selenium\\drivernew\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://google.com");
		driver.manage().window().maximize();
		
		System.out.println("This is ok");
}}
