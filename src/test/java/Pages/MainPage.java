package Pages;

import HelperMethods.ElementMethods;
import HelperMethods.WindowMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    public WebDriver driver;
    public ElementMethods elementMethods;
    public WindowMethods windowMethods;

    public MainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        elementMethods = new ElementMethods(driver);
        windowMethods = new WindowMethods(driver);
    }
}
