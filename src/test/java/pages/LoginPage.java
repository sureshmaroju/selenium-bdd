package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Suresh
 * 
 */
public class LoginPage {


    @FindBy(id = "email")
    public WebElement emailAddressTextField;
    
    @FindBy(id = "passwd")
    public WebElement passwordTextField;
    
    @FindBy(id = "SubmitLogin")
    public WebElement signInBtn;

    public LoginPage(WebDriver driver) {
    }

    public void Login(String userName, String password)
    {
    	emailAddressTextField.sendKeys(userName);
    	passwordTextField.sendKeys(password);
    	signInBtn.click();
    }


    public void ClickLogin() {
        //This will be implemented later
    }
}
