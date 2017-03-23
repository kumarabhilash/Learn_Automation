package Library;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class utility {
	
	public static void Capture_screenshots(WebDriver driver, String FileName) {
		
		try {
			TakesScreenshot tsc = (TakesScreenshot)driver;
			File file = tsc.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(file, new File("./screenshots/"+FileName+".png"));
			System.out.println("Screenshot taken successfully");
		} catch (Exception e) {
			System.out.println("Failed to take print out : " +e.getMessage());
		} 
		
	}
}
