package Module3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bootstrap_Model_DialogBox {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "C://Users/kumar/workspace/selenium packg zar/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//a[text()='Signup']")).click();
		driver.findElement(By.xpath("html/body/div[3]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("9003097510");
		driver.findElement(By.xpath("html/body/div[3]/div/div/div/div/div[2]/div/form/div[2]/button")).click();
		Thread.sleep(4000);
		
		driver.navigate().to("https://www.goibibo.com/");
		driver.findElement(By.xpath("//a[text()='Sign up']")).click();
		driver.switchTo().frame("authiframe");
		driver.findElement(By.xpath(".//*[@id='id_mobile']")).sendKeys("pagla");
	}
}
