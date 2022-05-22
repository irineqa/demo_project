package stepdef;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageActions.homepageAction;
import utility.testbase;

public class Homepagestepdefinition extends testbase {     //extends with testbase class

	
	homepageAction Action = new homepageAction();//creat an object to acces the Action class
	
	@Given("Launch {string}")
	public void launch(String URL) throws Exception {// created as perameter
		openURL(URL); //calling by openurl  method 
		
	
	}
	
	
	@When("Click log in")
	public void click_log_in() {
		Action.Clicklogin();
	}

	@When("Enter username and password and click log in") //test case #1
	public void enter_username_and_password_and_click_log_in() throws Exception {
		Action.userCredantial(prop.getProperty("UserName"),prop.getProperty("password"));//we abstract the username and pass
	}


@When("Click on  Nokia lumia {int}")
public void click_on_nokia_lumia(Integer int1) throws Exception {
		Action.ClickonNokialumia1520();
	}

@When("Click on add to cart button")
public void click_on_add_to_cart_button() throws Exception {   
	Action.clickonaddtocartbutton();
		
	}

	@When("Click on cart button")
	public void click_on_cart_button() throws Exception {
		Action.clickoncart(); 
	}

	@Then("Product displayed on cart page")
	public void product_displayed_on_cart_page() {
		Action.Productdisplayedoncartpage();
	}

	@When("Click on Galaxy S6")        //test case  2
	public void click_on_galaxy_s6() {
		Action.ClickonGalaxyS6();
		
	}
	    
	
	@Then("Verify Product displayed on cart page")
	public void verify_product_displayed_on_cart_page() {
		Action.productdisplayed();
	    
	}
	@When("Click on NexUS S6")            //test case #3 
	public void click_on_nex_us_s6() {
	   Action.NexUSS6();
	}
	@When("Click add to cart button")
	public void addtocart() throws Exception {
		Action.clickoncartbutton();
	
                  
	
	}

	

	@Then("Verify product title is displayed")
	public void verify_product_title_is_displayed() {
		Action.title();
	
 
	}
	@When("Click on Sony vaio i5")    // test # 4
	public void click_on_sony_vaio_i5() throws Exception {
		Action.Sonyvaioi5();
	   
	}

	@Then("Verify product  price is displayed")
	public void verify_product_price_is_displayed() {
		Action.Productdisplayedoncartpage();
	    
	}

@Then("Verify order button displayed on cart page")         //#5
public void verify_order_button_displayed_on_cart_page() {
Action.oorderbutton();


	}


}