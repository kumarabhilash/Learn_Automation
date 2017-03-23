package Module2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Google_search {

public static void main(String[] args) {


	System.setProperty("webdriver.chrome.driver", "C://Users/kumar/workspace/selenium packg zar/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://google.com");
	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	Actions act=new Actions(driver);
	
	WebElement ele = driver.findElement(By.xpath("//div[@id='_eEe']/a[2]"));
	act.contextClick(ele).build().perform();
	WebElement elementOpen = driver.findElement(By.linkText("Open")); /*This will select menu after right click */

	elementOpen.click();
	
	
	act.contextClick(driver.findElement(By.xpath("//div[@id='_eEe']/a[2]"))).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();

	//act.contextClick(driver.findElement(By.xpath("//div[@id='_eEe']/a[2]"))).perform();
	//act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();

	//act.contextClick(driver.findElement(By.xpath("//div[@id='_eEe']/a[2]"))).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();

}

}