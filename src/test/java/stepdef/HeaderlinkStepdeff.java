package stepdef;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageActions.HeaderlinkAction;
import pageLocators.HeaderlinkLocator;
import utility.testbase;

public class HeaderlinkStepdeff extends testbase{

	HeaderlinkAction Action= new HeaderlinkAction();
	
@When("Click on Home link")
public void click_on_home_link() throws Exception {
    Action.headerlink();
}

@Then("verify home link  is displayed")
public void verify_home_link_is_displayed() {
Action.verifyhomepage();

}

@When("Click on contect link")                         //#2
public void click_on_contect_link() {
    Action.contectlink();
}

@Then("verify contect link  is enabled")
public void verify_contect_link_is_enabled() {
   Action.verifycontectlink();
}
@When("Click on about us link")                    //#3
public void click_on_about_us_link() {
    Action.aboutus();
}

@Then("verify about us link  is displayed")
public void verify_about_us_link_is_displayed() {
	Action.verifyaboutus();
}
@Then("verify cart link  is displayed")                    //#4
public void verify_cart_link_is_displayed() {
	Action.cartverify();
}
@When("Click on Login link")                         //#5
public void click_on_login_link() {
    Action.login();
}

@Then("verify Login link  is displayed")
public void verify_login_link_is_displayed() {
    Action.veryfilogin();
}


}