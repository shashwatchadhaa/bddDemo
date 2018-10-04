package mindfire.serenity.serenity_steps;

import static org.junit.Assert.assertThat;

import mindfire.serenity.serenity_pages.GpsHomePage;
import mindfire.serenity.serenity_pages.LoginPage;
import net.thucydides.core.annotations.Step;

public class GpsUser {
	
	
	
	LoginPage loginPage;
	GpsHomePage homePage;

	@Step
	public void open_GPS_Login_Page() {
		loginPage.openUrl("http://ourgoalplan.com/Login.aspx");
		
	}
	@Step
	public void enter_Username(String username) {
		
		loginPage.setUsername(username);
	}
	@Step
	public void enter_Password(String password) {
	
		loginPage.setPassword(password);
	}
	@Step
	public void successfully_login_to_application() {
		homePage.verifyLogin();
		
	}
	@Step
	public void press_Login_button() {
	
		loginPage.PressLogin();
	}
	@Step
	public void should_get_invalid_credentials_message() {
		loginPage.invalidCredentialMessageShouldCome();
		
	}
	public void should_be_on_login_page() {
		
		homePage.shouldNotLoad();
	}

	

}
