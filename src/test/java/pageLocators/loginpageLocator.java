package pageLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utility.testbase;

public class loginpageLocator extends testbase {

	public  loginpageLocator () {         //  we creat a constractor pagefactory class given by selenium to suport pagemodel
		PageFactory.initElements(driver, this);//we initi all web elements with help of initElement method (perameterize)
}
	
	@FindBy(how=How.ID, using="login2")// Maven Format Flow this  code
	public WebElement loginLink;
	
	@FindBy(how=How.ID, using="loginusername")
	public WebElement username;
	
	@FindBy(how=How.ID, using="loginpassword")
	public WebElement password;
	
	@FindBy(how=How.XPATH, using="//button[text()='Log in']")
	public WebElement loginbutton;
	
	@FindBy(how=How.ID, using="cat")
	public WebElement verifypage;
}