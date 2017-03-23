package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Example {
	
	public static WebDriver driver;
	
	@Test(dataProvider="facebookdata")
	public void Login_Validation(String username, String password) throws Exception{
		
		System.setProperty("webdriver.chrome.driver", "C://Users/kumar/workspace/selenium packg zar/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		
		Thread.sleep(5000);
		
		Assert.assertTrue(driver.getTitle().equalsIgnoreCase("Facebook"),"User is unable to login - Incorrect credentials");
		System.out.println("Page title verified");
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	@DataProvider(name="facebookdata")
	public Object[][] test_Data(){
		
		Object[][] data = new Object[3][2];
		
		data[0][0] = "abhilash@gmail.com";
		data[0][1] = "password1";
		data[1][0] = "abhilash2@gmail.com";
		data[1][1] = "password2";
		data[2][0] = "kumarabhilash460@yahoo.com";
		data[2][1] = "Aakaash460";
		
		return data;
	}
}
