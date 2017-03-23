package Module3;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Library.Retry;


public class Rerun_Failed_Tests {
	
	public static WebDriver driver;
	
	@Test(retryAnalyzer=Retry.class)
	public void sample_Test(){
		
	System.setProperty("webdriver.chrome.driver", "C://Users/kumar/workspace/selenium packg zar/chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.get("https://facebook.com");
	
	Assert.assertTrue(driver.getTitle().contains("QTP"));
	
	}
}
