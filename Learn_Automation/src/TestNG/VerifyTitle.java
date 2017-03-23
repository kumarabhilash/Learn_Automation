package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class VerifyTitle {
	
	public static WebDriver driver;
	
	@Test
	@Parameters("Browser")
	public void verifyPageTitle(String browser_name){
		
		if(browser_name.equalsIgnoreCase("Chrome")){
			System.setProperty("webdriver.chrome.driver", "C://Users/kumar/workspace/selenium packg zar/chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browser_name.equalsIgnoreCase("Firefox")){
			System.setProperty("webdriver.gecko.driver", "C://Users/kumar/workspace/selenium packg zar/geckodriver.exe");
			driver = new FirefoxDriver();
		}else if(browser_name.equalsIgnoreCase("IE")){
			System.setProperty("webdriver.ie.driver", "C://Users/kumar/workspace/selenium packg zar/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get("https://google.com");
		driver.quit();
	}	
}
