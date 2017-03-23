package Module2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestRightClick {
	@Test
	public void TestClick() throws Exception{
		
		System.setProperty("webdriver.chrome.driver", "C://Users/kumar/workspace/selenium packg zar/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		
		Actions act=new Actions(driver);
		act.contextClick(driver.findElement(By.xpath(".//*[@id='lga']/div"))).perform();

		}
}