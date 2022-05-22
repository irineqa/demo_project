package stepdef;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pageActions.loginpageAction;
import utility.testbase;

public class loginpageStepdeff extends testbase{
	
	loginpageAction Action= new loginpageAction();
	
	@When("Click on login opption")
	public void click_on_login_opption() {
	Action.Clickloginlink();
	    
	}

	@When("Enter username and password")
	public void enter_username_and_password() throws Exception {
	   Action.userCredantial (prop.getProperty("UserName"), prop.getProperty("password"));
	}

	@When("click on login button")
	public void click_on_login_button() throws Exception {
	    Action.loginbutton();
	}

	@Then("verify home page displayed successfuley")
	public void verify_home_page_displayed_successfuley() {
	    Action.verifyhome();
	}

}
