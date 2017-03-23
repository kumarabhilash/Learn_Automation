package Module3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

import Library.Listener_Event_Activity;

public class Event_Listener {
	
	public static WebDriver driver;
	@Test
	public void Event_Method() throws Exception{
		
			System.setProperty("webdriver.chrome.driver", "C://Users/kumar/workspace/selenium packg zar/chromedriver.exe");
			driver = new ChromeDriver();
			
			EventFiringWebDriver event = new EventFiringWebDriver(driver);
			Listener_Event_Activity handle = new Listener_Event_Activity();
			event.register(handle);
			
			event.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			event.get("https://facebook.com");
			event.findElement(By.xpath(".//*[@id='email']")).sendKeys("kumarabhilash460@yahoo.com");
			Thread.sleep(2000);
			event.close();
	}
}
