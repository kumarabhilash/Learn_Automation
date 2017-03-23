package Module3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import Library.utility;

public class Failed_Test_Capture_Screenshot {

	public static WebDriver driver;
	@Test
	public void CaptureScrreenshot(){

		System.setProperty("webdriver.chrome.driver", "C://Users/kumar/workspace/selenium packg zar/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Open webpage
		driver.get("https://facebook.com");
		//utility.Capture_screenshots(driver, "site opened");
		
		driver.findElement(By.xpath(".//*[@id='email123']")).sendKeys("kumarabhilash460@yahoo.com");
		//utility.Capture_screenshots(driver, "Username_entered");
	}
	
	@AfterMethod
	public void tearDown(ITestResult result){
		
		if(ITestResult.FAILURE == result.getStatus()){
			utility.Capture_screenshots(driver, result.getName());
		}
	}
}
