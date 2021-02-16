package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Suresh
 * 
 */
public class AddressPage {


	@FindBy(tagName = "h1")
	public WebElement pageHeading;
	
	@FindBy(xpath = "//button[contains(@class,'button btn btn-default button-medium')]")
    public WebElement proceedToCheckoutBtn;
    
    
}
