package utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class irineutility extends testbase {   //extends testbase class with irineutility
	
	public static long implicitly_Wait=20; //adding some veriable 
	public static long pageLoad_Timeout=20;
	
	
	
	public static void fbScreenshots(WebDriver driver, String screenShot) {//  set up for screenshot 
		File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String currentDir =System.getProperty("user.dir");
		try {
			FileUtils.copyFile(srcFile, new File(currentDir + "/Screenshots/" +screenShot+".png"));//make sure screenshots same name as folder
		} catch (IOException e) {
			
			e.printStackTrace();
	
	
	
		}
	
	
	}
}
