package pageLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utility.testbase;

public class HeaderlinkLocator extends testbase {

	public  HeaderlinkLocator () {         //  we creat a constractor pagefactory class given by selenium to suport pagemodel
		PageFactory.initElements(driver, this);//we initi all web elements with help of initElement method (perameterize)
	}
	@FindBy(how=How.XPATH, using="//li[@class=\"nav-item active\"]")// Maven Format Flow this  code
	public WebElement Headerlink;
	
	
	@FindBy(how=How.ID, using="cat")
	public WebElement verifyhomepage ;
	
	
	@FindBy(how=How.LINK_TEXT, using="Contact")    //#2
	public WebElement contect;
	
	@FindBy(how=How.ID, using="exampleModalLabel")
	public WebElement verifycontect ;
	
	
	@FindBy(how=How.LINK_TEXT, using="About us")    //#3
	public WebElement aboutus;
	
	@FindBy(how=How.ID, using="videoModalLabel")
	public WebElement verifyabout ;

	@FindBy(how=How.ID, using="nava")   //#4
	public WebElement verifyCart;
	
	@FindBy(how=How.ID, using="login2")   //#5
	public WebElement login2;

	@FindBy(how=How.ID, using="logInModalLabel")   
	public WebElement verifylogin;

	
}
	