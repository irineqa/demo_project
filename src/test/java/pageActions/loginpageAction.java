package pageActions;

import org.testng.Assert;

import pageLocators.HeaderlinkLocator;
import pageLocators.loginpageLocator;
import utility.testbase;

public class loginpageAction extends testbase{
	loginpageLocator Product= new loginpageLocator();
	
	public void userCredantial(String u,String p) throws Exception {
	Product.username.sendKeys(u);
	Product.password.sendKeys(p);
	Product.loginbutton.click();
	
	Thread.sleep(4000);


	


}

public void Clickloginlink() {
	Product.loginLink.click();
	
}

public void loginbutton() throws Exception {
	Product.loginbutton.clear();
	
	Thread.sleep(3000);
}
	

public void verifyhome() {
	boolean result = Product.verifypage.isDisplayed();
	Assert.assertTrue(result);
}
}


