package steps;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.GherkinKeyword;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AddressPage;
import pages.HomePage;
import pages.IdentityPage;
import pages.LoginPage;
import pages.OrderConfirmationPage;
import pages.OrderHistoryPage;
import pages.OrderPage;
import pages.OrderSummaryPage;
import pages.PaymentPage;
import pages.ShippingPage;
import pages.TShirtsPage;
import utils.Base;

/**
 * @author Suresh
 * 
 */
public class ShoppingSteps extends Base {

    private  Base base;
    public HomePage homePage;
    public TShirtsPage tShirtsPage;
    public OrderPage orderPage;
    public LoginPage loginPage;
    public AddressPage addressPage;
    public ShippingPage shippingPage;
    public PaymentPage paymentPage;
    public OrderSummaryPage orderSummaryPage;
    public OrderConfirmationPage orderConfirmationPage;
    public OrderHistoryPage orderHistoryPage;
    public IdentityPage identityPage;
	private String referenceNo;


    public ShoppingSteps(Base base) {
        this.base = base;
        homePage = PageFactory.initElements(Driver, HomePage.class);
        tShirtsPage  = PageFactory.initElements(Driver, TShirtsPage.class);
        orderPage = PageFactory.initElements(Driver, OrderPage.class);
        loginPage = PageFactory.initElements(Driver, LoginPage.class);
        addressPage = PageFactory.initElements(Driver, AddressPage.class);
        shippingPage = PageFactory.initElements(Driver, ShippingPage.class);
        paymentPage = PageFactory.initElements(Driver, PaymentPage.class);
        orderSummaryPage = PageFactory.initElements(Driver, OrderSummaryPage.class);
        orderConfirmationPage = PageFactory.initElements(Driver, OrderConfirmationPage.class);
        orderHistoryPage = PageFactory.initElements(Driver, OrderHistoryPage.class);
        identityPage = PageFactory.initElements(Driver, IdentityPage.class);

    }
    
    @Given("I navigate to AutomationPracticeShopping website") 
    public void i_navigate_to_AutomationPracticeShopping_website() throws Throwable {
    	Base.scenarioDef.createNode(new GherkinKeyword("Given"), "I navigate to AutomationPracticeShopping website");
        base.openBaseURL();
    }

    @When("I click on T-SHIRTS category")
    public void i_click_on_T_SHIRTS_category() throws Throwable {
    	scenarioDef.createNode(new GherkinKeyword("When"), "I click on T-SHIRTS category");
    	homePage.tshirtsCategoryCTA.click();
        
    }

    @Then("I should navigate to {string} page")
    public void i_should_navigate_to_page(String page) throws Throwable {
    	scenarioDef.createNode(new GherkinKeyword("Then"), "I should navigate to "+page+" page");
    	switch (page) {
		case "T-SHIRTS":
			assertEquals(Driver.getTitle(), "T-shirts - My Shop");
			break;
		case "SHOPPING-CART SUMMARY":
			assertEquals(Driver.getTitle(), "Order - My Store");
			break;
		case "AUTHENTICATION":
			assertEquals(Driver.getTitle(), "Login - My Store");
			break;
		case "ADDRESSES":
			assertEquals(addressPage.pageHeading.getText(), "ADDRESSES");
			break;
		case "SHIPPING":
			assertTrue(shippingPage.pageHeading.getText().contains("SHIPPING"));
			break;
		case "PAYMENT":
			assertEquals(paymentPage.pageHeading.getText(), "PLEASE CHOOSE YOUR PAYMENT METHOD");
			break;
		case "ORDER SUMMARY":
			assertTrue(orderSummaryPage.pageHeading.getText().contains("ORDER SUMMARY"));
			break;
		case "ORDER CONFIRMATION":
			assertTrue(orderConfirmationPage.pageHeading.getText().contains("ORDER CONFIRMATION"));
			break;
		case "ORDER HISTORY":
			assertTrue(orderHistoryPage.pageHeading.getText().contains("ORDER HISTORY"));
			break;
		case "My ACCOUNT":
			assertEquals(Driver.getTitle(), "My account - My Store");
			break;
		case "IDENTITY":
			assertEquals(Driver.getTitle(), "Identity - My Store");
			break;
		default:
			break;
		} 
    	
    }

    @When("I mouse hover and click Add to cart button")
    public void i_mouse_hover_and_click_Add_to_cart_button() throws InterruptedException, Throwable {
    	scenarioDef.createNode(new GherkinKeyword("When"), "I mouse hover and click Add to cart button");
    	mouseHover(tShirtsPage.productContainer);
    	waitForElement(tShirtsPage.addToCartCTA, 10);
    	tShirtsPage.addToCartCTA.click();
        
    }

    @Then("Product cart layer should be displayed")
    public void product_cart_layer_should_be_displayed() throws Throwable {
    	scenarioDef.createNode(new GherkinKeyword("Then"), "Product cart layer should be displayed");
    	waitForElement(tShirtsPage.productCartLayer, 10);
    	assertTrue(tShirtsPage.productCartLayer.isDisplayed());
    }

    @When("I click on Procced to checkout button on Product cart layer")
    public void i_click_on_Procced_to_checkout_button_on_Product_cart_layer() throws Throwable {
    	scenarioDef.createNode(new GherkinKeyword("When"), "I click on Procced to checkout button on Product cart layer");
    	waitForElement(tShirtsPage.proceedToCheckoutCTAOnLayer, 10);
    	tShirtsPage.proceedToCheckoutCTAOnLayer.click();
    }


    @When("I click on {string} button on {string} page")
    public void i_click_on_button_on_page(String buttonName, String page) throws Throwable {
    	scenarioDef.createNode(new GherkinKeyword("Then"), "I click on "+buttonName+" button on "+page+" page");
    	switch (page) {
		case "SHOPPING-CART SUMMARY":
			orderPage.proceedToCheckoutBtn.click();
			break;
		case "ADDRESSES":
			addressPage.proceedToCheckoutBtn.click();
			break;
		case "SHIPPING":
			shippingPage.termsCheckbox.click();
			shippingPage.proceedToCheckoutBtn.click();
			break;
		case "PAYMENT":
			paymentPage.payByBankWireCTA.click();
			break;
		case "ORDER SUMMARY":
			orderSummaryPage.confirmMyOrderBtn.click();
			break;
		case "IDENTITY":
			identityPage.saveCTA.click();
			break;
		default:
			System.out.println("Invalid page");
			break;
		} 
    }

    @When("I login on AUTHENTICATION page")
    public void i_login_on_AUTHENTICATION_page() throws Throwable {
    	scenarioDef.createNode(new GherkinKeyword("When"), "I login on AUTHENTICATION page");
    	loginPage.Login(configManager.getProperty("userName"), configManager.getProperty("password"));
        
    }

    @And("I should get order reference")
    public void i_should_get_order_reference() throws Throwable {
    	scenarioDef.createNode(new GherkinKeyword("And"), "I should get order reference");
    	waitForElement(orderConfirmationPage.orderReference, 10);
    	System.out.println(orderConfirmationPage.orderReference.getText());
    	referenceNo = orderConfirmationPage.orderReference.getText();
    }

    @When("I click on Back to orders CTA")
    public void i_click_on_Back_to_orders_CTA() throws Throwable {
    	scenarioDef.createNode(new GherkinKeyword("When"), "I login on AUTHENTICATION page");
    	orderConfirmationPage.backToOrdersCTA.click();
    }

    @Then("I should see the latest order in the orders list")
    public void i_should_see_the_latest_order_in_the_orders_list() throws Throwable {
    	scenarioDef.createNode(new GherkinKeyword("Then"), "I should see the latest order in the orders list");
    	System.out.println("in order history: "+ orderHistoryPage.orderReference.getText());
    	assertTrue(referenceNo.contains(orderHistoryPage.orderReference.getText()));
        
    }
}
