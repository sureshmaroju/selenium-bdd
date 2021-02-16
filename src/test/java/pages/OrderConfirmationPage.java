package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Suresh
 * 
 */
public class OrderConfirmationPage {

	@FindBy(tagName = "h1")
	public WebElement pageHeading;
	
	@FindBy(xpath = "//a[contains(@class,'button-exclusive btn')]")
    public WebElement backToOrdersCTA;
    
	@FindBy(xpath = "//*[@class='box']")
	public WebElement orderReference;
  
    
    
}
