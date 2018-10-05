package mindfire.serenity.serenity_pages;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.stream.Collectors;

import com.ibm.icu.impl.Assert;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.BlurScreenshots;
import net.thucydides.core.screenshots.BlurLevel;

public class LoginPage extends PageObject {

	@FindBy(name = "txtName")
	WebElementFacade username;

	@FindBy(name = "txtPassword")
	WebElementFacade password;

	@FindBy(name = "btnLogin")
	WebElementFacade login;
	@FindBy(id="lblValidation")
	WebElementFacade message;

	public void setUsername(String userN) {

		username.type(userN);
	}

	public void setPassword(String pass) {
		password.type(pass);

	}

	public void PressLogin() {
		login.click();
	}

	public void invalidCredentialMessageShouldCome() {
		message.shouldBeVisible();
	
	}

	

}
