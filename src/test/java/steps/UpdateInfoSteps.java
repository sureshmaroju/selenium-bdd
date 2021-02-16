package steps;

import static org.testng.Assert.assertEquals;

import java.util.Random;

import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.GherkinKeyword;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.IdentityPage;
import pages.LoginPage;
import pages.MyAccountPage;
import utils.Base;

/**
 * @author Suresh
 * 
 */
public class UpdateInfoSteps extends Base {

    private  Base base;
    public HomePage homePage;
	public LoginPage loginPage;
    public MyAccountPage myAccountPage;
    public IdentityPage identityPage;



    public UpdateInfoSteps(Base base) {
        this.base = base;
        homePage = PageFactory.initElements(Driver, HomePage.class);
        loginPage = PageFactory.initElements(Driver, LoginPage.class);
        myAccountPage = PageFactory.initElements(Driver, MyAccountPage.class);
        identityPage = PageFactory.initElements(Driver, IdentityPage.class);

    }

    @Given("I login to AutomationPracticeShopping website")
    public void i_login_to_AutomationPracticeShopping_website() throws Throwable {
    	scenarioDef.createNode(new GherkinKeyword("Given"), "I login to AutomationPracticeShopping website");
        base.openBaseURL();
        homePage.signInCTA.click();
        loginPage.Login(configManager.getProperty("userName"), configManager.getProperty("password"));
    }
    

    @When("I click on {string} CTA")
    public void i_click_on_CTA(String cta) throws Throwable {
    	scenarioDef.createNode(new GherkinKeyword("When"), "I click on "+cta+" CTA");
    	if(cta.equals("View My Customer Account")) {
            homePage.viewMyCustomerAccountCTA.click();
    	} else if(cta.equals("MY PERSONAL INFORMATTION")) {
            myAccountPage.myPersonalInformationCTA.click();
    	}
    }

    @When("I rename first name")
    public void i_rename_first_name() throws Throwable {
    	scenarioDef.createNode(new GherkinKeyword("When"), "I rename first name");
    	Random rnd = new Random();
    	char c = (char) ('a' + rnd.nextInt(26));
    	//String firstName = identityPage.firstName.getText();
    	identityPage.firstName.clear();
    	identityPage.firstName.sendKeys("Automation"+c);
    }

    @When("I enter password")
    public void i_enter_password() throws Throwable {
    	scenarioDef.createNode(new GherkinKeyword("When"), "I enter password");
    	identityPage.oldPasswd.sendKeys(configManager.getProperty("password"));        
    }


    @Then("I should see success message as {string}")
    public void i_should_see_success_message_as(String message) throws Throwable {
    	scenarioDef.createNode(new GherkinKeyword("Then"), "I should see success message as "+message);
        waitForElement(identityPage.alertSuccessBanner, 15);
        System.out.println(identityPage.alertSuccessBanner.getText() +"======"+message);
        assertEquals(identityPage.alertSuccessBanner.getText(), message);
    }
}
