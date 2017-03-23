package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Library.ExcelData_Config;

public class DataProvider_ExcelFile {
	
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
	public Object[][] test_Data() throws Exception{
		
		ExcelData_Config config = new ExcelData_Config("C:\\Users\\kumar\\workspace\\Learn_Automation\\Test_Data\\input_data.xlsx");
		
		int rows = config.getRowCount(0);
		
		Object[][] data = new Object[rows][2];
		
		for(int i=0; i<rows; i++){
			
			data[i][0] = config.getData(0, i, 0);
			data[i][1] = config.getData(0, i, 1);
		}
		
		return data;
	}
}
