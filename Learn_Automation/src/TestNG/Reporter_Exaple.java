package TestNG;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Reporter_Exaple {
	
	public static WebDriver driver;
	
	@Test
	public void verifyPageTitle(){
		
		System.setProperty("webdriver.chrome.driver", "C://Users/kumar/workspace/selenium packg zar/chromedriver.exe");
		driver = new ChromeDriver();
		Reporter.log("Driver instantiated");
		
		driver.manage().window().maximize();
		Reporter.log("Window maximiized");
		//driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get("https://google.com");
		Reporter.log("opened google");
		
		driver.quit();
	}	
}
