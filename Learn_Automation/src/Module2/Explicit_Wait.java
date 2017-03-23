package Module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C://Users/kumar/workspace/selenium packg zar/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-use-explicit-wait-in-selenium.html");
		
		driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));
		
		//WebElement element = driver.findElement(By.xpath("//p[text()='WebDriver']"));
		boolean visible = element.isDisplayed();
		if(visible){
			System.out.println("Element is visible");
			System.out.println(element.getText());
		}
		else{
			System.out.println("Element is not visible");
		}
	}
}
