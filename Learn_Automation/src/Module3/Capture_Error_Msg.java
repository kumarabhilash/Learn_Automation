package Module3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

//import junit.framework.Assert;
//org.junit.Assert;

public class Capture_Error_Msg {

	//@Test
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C://Users/kumar/workspace/selenium packg zar/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Open webpage
		driver.get("https://gmail.com");
		
		driver.findElement(By.xpath(".//*[@id='next']")).click();
		Thread.sleep(2000);
		
		String actual = driver.findElement(By.xpath(".//*[@id='errormsg_0_Email']")).getText();
		String expected = "Please enter your email.";
		
		//Type 1
		Assert.assertEquals(actual, expected);
		//Type2
		Assert.assertTrue(actual.contains("Please enter your email"));
		
		System.out.println("test passed");
		}
}
