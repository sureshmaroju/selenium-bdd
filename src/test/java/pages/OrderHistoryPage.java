package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Suresh
 * 
 */
public class OrderHistoryPage {


	@FindBy(tagName = "h1")
	public WebElement pageHeading;
	
    
    @FindBy(xpath = "//table/tbody/tr[1]/td[1]")
    public WebElement orderReference;
}
