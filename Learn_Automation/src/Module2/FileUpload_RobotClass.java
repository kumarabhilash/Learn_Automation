package Module2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUpload_RobotClass {

	@Test
	public void FileUpload() throws InterruptedException, AWTException{

		System.setProperty("webdriver.chrome.driver", "C://Users/kumar/workspace/selenium packg zar/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// Specify the file location with extension
		StringSelection sel = new StringSelection("C:\\Users\\kumar\\Desktop\\Kumar Abhilash_Resume.DOCX");
		
		//Copy To Clip board
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel, null);
		System.out.println("Selection : " +sel);
		
		driver.get("http://my.monsterindia.com/create_account.html");
		Thread.sleep(2000);
		
		// This will scroll down the page 
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("Scroll(0,350)");
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		Thread.sleep(5000);
		
		driver.findElement(By.id("wordresume")).click();
		System.out.println("Browse button clicked");
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		 
		  // Press CTRL+V
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		 
		// Release CTRL+V
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		Thread.sleep(1000);
		  
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
}
