package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Suresh
 * 
 */
public class PaymentPage {


	@FindBy(tagName = "h1")
	public WebElement pageHeading;

	@FindBy(className = "bankwire")
	public WebElement payByBankWireCTA;
	
	@FindBy(className = "cheque")
	public WebElement payBychequeCTA;
    
}
