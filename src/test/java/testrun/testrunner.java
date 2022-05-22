package testrun;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import utility.testbase;
;

@CucumberOptions(features = {"src//test//resources//Feature"} ,//path of Feature folder
// take the Location of Feature Folder
plugin = {"json:target/cucumber.json"},
glue = "stepdef",tags= "@login")
public class testrunner extends AbstractTestNGCucumberTests {  //to work with Cucumber and TestNg we need this class given by cucumber

	
	
	
	@BeforeTest
	   public void setup() {
		   testbase test = new testbase(); // This object will open the browser
		     test.initi();  
	//every test case runing indivusili
	
	
}
	@AfterTest
    public void close() {
   	 testbase test = new testbase();// This object will closed the Application
   	 test.driver.quit();
	
}	
	
	
}