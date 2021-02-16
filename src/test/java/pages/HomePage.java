package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Suresh
 * 
 */
public class HomePage {


    @FindBy(xpath = "//*[@id='block_top_menu']/ul/li[3]/a[text()='T-shirts']")
    public WebElement tshirtsCategoryCTA;
    
    @FindBy(className = "login")
    public WebElement signInCTA;
    
    @FindBy(className = "account")
    public WebElement viewMyCustomerAccountCTA;

}
