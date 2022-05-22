package pageLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utility.testbase;

public class homepagelocator extends testbase { //extends with testbase class

	
	
	public homepagelocator () {// creating  an constructor
		
		PageFactory.initElements(driver, this); //init we elements by help of initElement method
	}
	@FindBy(how=How.ID, using="loginusername")// Maven Format Flow this  code
	public WebElement UserName;
	
	
	@FindBy(how=How.ID, using="loginpassword")
	public WebElement password ;
	
	
	@FindBy(how=How.XPATH, using="//button[text()='Log in']")
	public WebElement loginbutton ;
	
	@FindBy(how=How.ID, using="login2")
	public WebElement loginlink;
	
	@FindBy(how=How.XPATH, using="//a[text()='Nokia lumia 1520']")
	public WebElement Nokialumia1520;
	
	
	
	@FindBy(how=How.LINK_TEXT, using="Add to cart")
	public WebElement clickonaddtocartbutton;
	
	
	@FindBy(how=How.XPATH, using="//a[text()='Cart']")
	public WebElement clickoncart;
	
	
	@FindBy(how=How.ID, using="tbodyid")
	public WebElement productdisplayedoncartpage ;
	
	@FindBy(how=How.LINK_TEXT, using="Samsung galaxy s6")//test case 2
	public WebElement ClickonGalaxyS6;
	
	@FindBy(how=How.XPATH, using="//td[text()='Samsung galaxy s6']")//test case 2
	public WebElement productdisplayed;

	
	@FindBy(how=How.LINK_TEXT, using="Nexus 6")//test case 3
	public WebElement NeuxUS6;
	
	@FindBy(how=How.LINK_TEXT, using="Add to cart")
	public WebElement addtocart;
	
	
	@FindBy(how=How.LINK_TEXT, using="Cart")
	public WebElement clickoncartbutton;
	
	@FindBy(how=How.XPATH, using="//th[text()='Title']")
	public WebElement title;
	
	@FindBy(how=How.LINK_TEXT, using="Sony vaio i5")    //test 4
	public WebElement Sonyvaioi5;
	
	
	@FindBy(how=How.XPATH, using="//td[text()='790']")
	public WebElement pricedisplayedoncartpage;
	
	@FindBy(how=How.XPATH, using="//button[text()='Place Order']")  //#5
	public WebElement oorderbutton;
	
	
	@FindBy(how=How.XPATH, using="//a[text()='Sony xperia z5']")    //#6
	public WebElement sonyZ5;
	
	@FindBy(how=How.XPATH, using="//b[text()='Get in Touch']")  
	public WebElement getintouch;
	
}
