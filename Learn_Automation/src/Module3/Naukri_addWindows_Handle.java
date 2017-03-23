package Module3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Naukri_addWindows_Handle {
	
	public static String search_text = "QA Testing";

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "C://Users/kumar/workspace/selenium packg zar/chromedriver.exe");

		// Create object of HashMap Class
		Map<String, Object> prefs = new HashMap<String, Object>();
        // Set the notification setting it will override the default setting
		prefs.put("profile.default_content_setting_values.notifications", 2);
        // Create object of ChromeOption class
		ChromeOptions options = new ChromeOptions();
        // Set the experimental option
		options.setExperimentalOption("prefs", prefs);
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.naukri.com/");
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		System.out.println(driver.getTitle());
		
		Set<String> handles = driver.getWindowHandles();
		for(String handle : handles){
			System.out.println(handle);
			if(handle.equalsIgnoreCase(parent)){
				System.out.println("yes");
				driver.switchTo().window(handle);
				System.out.println(driver.getTitle());
			}
			else{
				driver.switchTo().window(handle);
				driver.close();
			}
		}
		driver.switchTo().window(parent);
		driver.findElement(By.xpath(".//*[@id='qsbClick']/span[1]")).click();
		driver.findElement(By.xpath(".//*[@id='skill']/div[1]/div[2]/input")).sendKeys("test");
	/*	
		List<WebElement> lists = driver.findElements(By.xpath(".//*[@id='sugDrp_skill']/ul/li"));
		for(WebElement list : lists){
			if(list.getText().equalsIgnoreCase(search_text)){
				list.click();
				//break;
			}
			//driver.findElement(By.xpath("//li[text()=Bi Testing]")).click();
		}
		driver.findElement(By.xpath(".//*[@id='location']/div[1]/div[2]/input")).sendKeys("Bangalore");
		driver.findElement(By.xpath(".//*[@id='qsbFormBtn']")).submit();
	*/
	}

}
