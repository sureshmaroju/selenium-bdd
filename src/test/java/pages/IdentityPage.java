package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Suresh
 * 
 */
public class IdentityPage {


	@FindBy(tagName = "h1")
	public WebElement pageHeading;
	
	@FindBy(id = "firstname")
	public WebElement firstName;
	
	@FindBy(id = "old_passwd")
	public WebElement oldPasswd;
	
	@FindBy(name = "submitIdentity")
	public WebElement saveCTA;
  
	@FindBy(xpath ="//*[contains(@class,'alert-success')]")
	public WebElement alertSuccessBanner;
	
}
