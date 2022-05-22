package pageActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import pageLocators.HeaderlinkLocator;
import pageLocators.homepagelocator;
import utility.testbase;

public class HeaderlinkAction extends testbase{
	HeaderlinkLocator Product= new HeaderlinkLocator();


public void headerlink() throws Exception{
	Product.Headerlink.click();
	Thread.sleep(3000);

}
public void verifyhomepage() {                             // #2
	boolean result=Product.verifyhomepage.isDisplayed();
	Assert.assertTrue(result);
}
public void contectlink() {
	Product.contect.click();
}
public void verifycontectlink() {
	WebElement l= driver.findElement(By.id("exampleModalLabel"));
	System.out.println("getText()method:"+l.getText());
}
public void aboutus() {             //#3
	Product.aboutus.click();
}	
	public void verifyaboutus() {      //code for verify text
		WebElement result= driver.findElement(By.id("videoModalLabel"));
		System.out.println("getText()method:"+result.getText());
	}
	public void cartverify() {           //#4
		boolean result=Product.verifyCart.isDisplayed();
		Assert.assertTrue(result);
	}
	public void login() {              //#5
		Product.login2.click();
	}
	public void veryfilogin() {
		WebElement result= driver.findElement(By.id("logInModalLabel"));
		System.out.println("getText()method:"+result.getText());
	}
}
	
	
	

