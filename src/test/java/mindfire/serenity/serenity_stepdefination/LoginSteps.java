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

	@When("^He enters \"([^\"]*)\"\\.$")
	public void he_enters(String username) {

		user.enter_Username(username);
	}

	@When("^enters \"([^\"]*)\" \\.$")
	public void enters(String password) {
		user.enter_Password(password);
	}

	@When("^Press login \\.$")
	public void press_login() {
		user.press_Login_button();
	}

	@Then("^He should be successfully logged in\\.$")
	public void he_should_be_successfully_logged_in() {
		user.successfully_login_to_application();
	}

	@Then("^He should not be logged in\\.$")
	public void he_should_not_be_logged_in() {

		user.should_be_on_login_page();
	}

	@Then("^Invalid credential message should come\\.$")
	public void invalid_credential_message_should_come() {
		user.should_get_invalid_credentials_message();
	}

}
