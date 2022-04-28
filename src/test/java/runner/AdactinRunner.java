package runner;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;

import org.apache.commons.collections4.FactoryUtils;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;

public class AdactinRunner extends AdactinPom {
	
	public static WebDriver driver;
	public static String ctype,url,url1,url2,url3,values,Address,Card_no,Expiry_month,Expiry_year,cvv1,card_type,user,pass;
	
	public static void getDriver() {
		System.setProperty("webdriver.chrome.driver", 
					"C:\\Users\\Mayavel\\eclipse-workspace\\est\\Driver1\\chromedriver.exe");
		
			
		driver = new ChromeDriver();
	}
		
	public static void getproperties() throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\Mayavel\\eclipse-workspace\\est\\tt.properties");
		Properties p = new Properties();
		p.load(fis);
		url=p.getProperty("url");
		Address= p.getProperty("Address");
		Card_no= p.getProperty("Card_no");
		Expiry_month = p.getProperty("Expiry_month");
		Expiry_year =p.getProperty("Expiry_year");
		card_type=p.getProperty("card_type");
		user= p.getProperty("user");
		pass= p.getProperty("pass");
		cvv1= p.getProperty("cvv");
		ctype=p.getProperty("card_type");
	}

	public static void getul(String s) {
		driver.get(s);
	}

	public static void maximize() {
		driver.manage().window().maximize();
	}
	
	public static void ts(int ab) throws InterruptedException {
		Thread.sleep(ab);
	}
	
	
	public static void senkeys(WebElement wb, String st) {
		
		wb.sendKeys(st);

	}
	public static void implicitwait(int i) {
	driver.manage().timeouts().implicitlyWait(i, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
				}
	public static String getdatatable(DataTable datatable, int index) throws InterruptedException{
		List<String> asList = datatable.asList(String.class);
		return values = asList.get(index);
		


	}
	
	public void pagefactory() {

		PageFactory.initElements(driver, AdactinPom.class);

	}
	
	public void dropdown(WebElement element, String value) {
		
		Select s = new Select(element);
		s.selectByValue(value);

	}
//	public void checkpage(String actual_url) {
//	expected_url = driver.getCurrentUrl();
//	Assert.assertEquals(actual_url, expected_url);
//	}
	
	
	public static void click(WebElement ct) {
		ct.click();
		
	}
	
	
	
	public static void jscript(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",element);
		
	}
	
		public void screenshot(String name) throws IOException {
			TakesScreenshot shot = (TakesScreenshot) driver;
			File source = shot.getScreenshotAs(OutputType.FILE);
			File destination = new File("C:\\Users\\Mayavel\\eclipse-workspace\\Selenium_9am\\Selenium\\driver\\screenshot\\Report.png");
			FileUtils.copyFile(source, destination);

	}
		
		public void close() {
			driver.close();

		}
		
		public void confirm_alert() {
		
			driver.switchTo().alert().accept();

		}

}
