package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Suresh
 * 
 */
public class ShippingPage {


	@FindBy(tagName = "h1")
	public WebElement pageHeading;
	
	@FindBy(xpath = "//button[contains(@class,'standard-checkout')]")
    public WebElement proceedToCheckoutBtn;
    
	@FindBy(name = "cgv")
	public WebElement termsCheckbox;
    
}
