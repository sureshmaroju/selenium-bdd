package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Suresh
 * 
 */
public class MyAccountPage {


	@FindBy(tagName = "h1")
	public WebElement pageHeading;
	
	@FindBy(xpath = "//span[text()='My personal information']")
    public WebElement myPersonalInformationCTA;
  
}
