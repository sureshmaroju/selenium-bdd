package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Suresh
 * 
 */
public class TShirtsPage {


    @FindBy(xpath = "//*[@id='center_column']/ul/li/div")
    public WebElement productContainer;
    
    @FindBy(className = "quick-view")
    public WebElement quickViewCTA;
    
    @FindBy(xpath = "//a[contains(@class,'add_to_cart_button')]")
    public WebElement addToCartCTA;
    
    @FindBy(xpath = "//a[contains(@class,'lnk_view btn')]")
    public WebElement moreCTA;
    
    @FindBy(xpath = "//*[@id='color_2']")
    public WebElement color2CTA;
   
    @FindBy(className = "clearfix")
    public WebElement productCartLayer;
    
    @FindBy(className = "fancybox-iframe")
    public WebElement productIFrame;
    
    @FindBy(className = "fancybox-item fancybox-close")
    public WebElement iframeLayerClose;
    
    @FindBy(xpath = "//a[@title='Proceed to checkout']")
    public WebElement proceedToCheckoutCTAOnLayer;
  
    
    @FindBy(name = "group_1")
    public WebElement sizeDropDown;
  
    
    
}
