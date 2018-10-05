package mindfire.serenity.serenity_steps;

import static org.junit.Assert.assertThat;

import mindfire.serenity.serenity_pages.GpsHomePage;
import mindfire.serenity.serenity_pages.LoginPage;
import net.thucydides.core.annotations.Step;

public class GpsUser {
	
	
	
	LoginPage loginPage;
	GpsHomePage homePage;

	@Step("Open our goal plan login page")
	public void open_GPS_Login_Page() {
		loginPage.openUrl("http://ourgoalplan.com/Login.aspx");
		
	}
	@Step("User enter username")
	public void enter_Username(String username) {
		
		loginPage.setUsername(username);
	}
	@Step("User enter password")
	public void enter_Password(String password) {
	
		loginPage.setPassword(password);
	}
	@Step("User is logged into the application.")
	public void successfully_login_to_application() {
		homePage.verifyLogin();
		
	}
	@Step("User press login button")
	public void press_Login_button() {
	
		loginPage.PressLogin();
	}
	@Step("User should see invalid credentials message")
	public void should_get_invalid_credentials_message() {
		loginPage.invalidCredentialMessageShouldCome();
		
	}
	@Step("User should be on Login page.")
	public void should_be_on_login_page() {
		
		homePage.shouldNotLoad();
	}

	

}
