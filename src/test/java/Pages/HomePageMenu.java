package Pages;

import HelperMethods.ElementMethods;
import SharedData.SharedData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePageMenu extends MainPage {

    public HomePageMenu(WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath = "img[src='/_resources/themes/orangehrm/dist/images/OrangeHRM_Logo.svg']")
    private WebElement logoButton;

    @FindBy (xpath = "//a[normalize-space()='EN']")
    private WebElement languageEnglishButton;

    @FindBy (xpath = "//a[normalize-space()='ES']")
    private WebElement languageSpanishButton;

    @FindBy (xpath = "//a[@class='nav-link-hed'][normalize-space()='Solutions']")
    WebElement solutionsButton;

    @FindBy (xpath = "//a[@class='nav-link-hed'][normalize-space()='Why OrangeHRM']")
    private WebElement whyButton;

    @FindBy (xpath = "//a[@class='nav-link-hed'][normalize-space()='Resources']")
    private WebElement resourcesButton;

    @FindBy (xpath = "//a[@class='nav-link-hed'][normalize-space()='Company']")
    private WebElement companyButton;

    @FindBy (xpath = "//div[@class='d-flex web-menu-btn']//li[1]//a[1]")
    private WebElement bookDemoButton;

    @FindBy (xpath = "//div[@class='d-flex web-menu-btn']//li[1]//a[1]")
    private WebElement contactSalesButton;

    @FindBy (xpath = "//input[@id='Form_submitForm_EmailHomePage']")
    private WebElement emailInput;

    @FindBy (xpath = "//input[@id='Form_submitForm_action_request']")
    private WebElement freeTrialButton;

    public void clickLogo(){
        logoButton.click();
    }

    public void hoverLanguageButton(){
        actions.moveToElement(languageEnglishButton).build().perform();
    }

    public void setLanguageEnglishButton(){
        languageEnglishButton.click();
    }

    public void setLanguageSpanishButton(){
        languageSpanishButton.click();
    }












}
