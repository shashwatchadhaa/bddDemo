package mindfire.serenity.serenity_stepdefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import mindfire.serenity.serenity_steps.GpsUser;
import net.thucydides.core.annotations.Steps;

public class LoginSteps {

	@Steps
	GpsUser user;

	@Given("^User is present on login page\\.$")
	public void user_is_present_on_login_page() {
		user.open_GPS_Login_Page();
	}

	@When("^User enters \"([^\"]*)\" as username\\.$")
	public void user_enters_as_username(String username) {
		user.enter_Username( username);
	}
	

	@When("^Press login button\\.$")
	public void press_login_button() {
		user.press_Login_button();
	}
	
	@When("^User enters \"([^\"]*)\" as password\\.$")
	public void user_enters_as_password(String password) {
		user.enter_Password(password);
	}

	

	@Then("^He should be successfully logged into GPS\\.$")
	public void he_should_be_successfully_logged_into_GPS() {
		user.successfully_login_to_application();
	}
	@Then("^Invalid credential message should come\\.$")
	public void invalid_credential_message_should_come() {
	    user.should_get_invalid_credentials_message();
	}

	@Then("^User should not be logged in\\.$")
	public void user_should_not_be_logged_in() {
	    user.should_be_on_login_page();
	}

}
