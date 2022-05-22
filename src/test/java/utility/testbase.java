package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testbase {
	
	
	public static WebDriver driver;
	public static Properties prop;
	public testbase () {   //making the constractor same Class name 	
		prop =new Properties();
		try {
		
			FileInputStream File1 =new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\config\\cofig1.properties");
			 prop.load(File1);
			     //get the .propartey path
				//FileInpute is an Class to  responsibal to read and write the config.proparty File
				//Properties prop = new Properties(); //we make it as Golobal so we can use the prop object it is Reuseable
		} catch (FileNotFoundException e) {
			System.out.println("please check the constroctor");
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	
	}

	public void initi() {   //  we creat 2 method 1 method for Browser set up 2 for URL open
	String browser = prop.getProperty("Browser1");
	if(browser.equals("Chrome")) {
		 System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Driver1\\chromedriver.exe");//driver path 
		 driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(irineutility.implicitly_Wait,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(irineutility.pageLoad_Timeout, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
	}
	else if (browser.equals("IE"));// done our browser set up and change the path of driver

}
public static void openURL(String URL) throws Exception {   // method for URL open
	driver.get(prop.getProperty("URL"));
	Thread.sleep(10000);
	irineutility.fbScreenshots(driver, "home page");//code for screenshot call by irineutility class name
	
       
}
}



