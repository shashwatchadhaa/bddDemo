package mindfire.serenity.serenity_pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class GpsHomePage extends PageObject{

	
	
	
	@FindBy(xpath="//img[@alt='mindfire logo']")
	WebElementFacade mindFireLogo;
	
	public void verifyLogin() {
		
		mindFireLogo.shouldBePresent();
	}

	public void shouldNotLoad() {
		mindFireLogo.shouldNotBePresent();
		
	}

}
