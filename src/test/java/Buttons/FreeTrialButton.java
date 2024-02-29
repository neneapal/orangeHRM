package Buttons;

import Pages.MainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class FreeTrialButton extends MainPage {
    public FreeTrialButton(WebDriver driver) {
        super(driver);
    }
    @FindBy (xpath = "//h1[contains(text(),'Revolutionize Your Human Resource Management Exper')]")
    private WebElement firstHeader;

    @FindBy (xpath = "//h1[contains(text(),'Revolutionize Your Human Resource Management Exper')]")
    private WebElement secondHeader;

    @FindBy (xpath = "//h1[contains(text(),'Revolutionize Your Human Resource Management Exper')]")
    private WebElement firstParagraph;

    public void expectedText(){
        Assert.assertTrue(firstHeader.getText().contains("Revolutionize Your Human Resource Management Experience!"));
        Assert.assertTrue(secondHeader.getText().contains("Revolutionize Your Human Resource Management Experience!"));
        Assert.assertTrue(firstParagraph.getText().contains("Revolutionize Your Human Resource Management Experience!"));

    }

}
