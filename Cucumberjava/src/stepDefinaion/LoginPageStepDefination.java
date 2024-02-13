package stepDefinaion;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageClass.LoginPage;

public class LoginPageStepDefination{


	

	LoginPage lp =  new LoginPage();
	
	@Given("^I am the user of an application$")
	public void i_am_the_user_of_an_application() throws Throwable {
	   lp.openUrl();
	}

	@When("^User enter valid username$")
	public void user_enter_valid_username() throws Throwable {
	  lp.enterUsername();
	}

	@When("^User enter valid password$")
	public void user_enter_valid_password() throws Throwable {
	   lp.enterPassword();
	}

	@When("^User click on login button$")
	public void user_click_on_login_button() throws Throwable {
	  lp.clickLoginButton();
	}

	@Then("^User should be able to login successfully$")
	public void user_should_be_able_to_login_successfully() throws Throwable {
	    lp.validLoginCreditionals();
	}
//
//	@When("^User enter invalid username$")
//	public void user_enter_invalid_username() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@When("^User enter invalid password$")
//	public void user_enter_invalid_password() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//	
//	@Then("^User should not be able to login successfully$")
//	public void user_should_not_be_able_to_lodgin_successfully() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	    }
}
