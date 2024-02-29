package Buttons;

import Pages.MainPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class BookDemoButton extends MainPage {
    public BookDemoButton(WebDriver driver){
        super(driver);
    }

    @FindBy (id = "Form_getForm_FullName")
    private WebElement fullName;

    @FindBy (id = "Form_getForm_Email")
    private  WebElement businessEmail;

    @FindBy (id = "Form_getForm_CompanyName")
    private WebElement companyName;

    @FindBy (id = "Form_getForm_Country")
    private WebElement countryName;

    @FindBy (xpath = "//option[contains(text(),'Algeria')]")
    private WebElement selectCountry;

    @FindBy (id = "Form_getForm_Contact")
    private WebElement phoneNumber;

    @FindBy (id = "recaptcha-anchor")
    private WebElement captchaCheckBox;

    @FindBy (id = "Form_getForm_action_submitForm")
    private WebElement submitButton;

//    @FindBy (id = "//body/div[3]/div[1]/div[1]/section[1]/div[2]/div[1]/div[2]/div[1]")
//    private List<WebElement> validationTable;

    @FindBy (xpath = "/html/body/div[3]/div/div/section/div[1]/div/div/div/div[2]/h1\n")
    private WebElement thanksMessage;


    public void fillForm(String fullName, String businessEmail, String companyName, String countryName, String phoneNumber){
        fillFullName(fullName);
        fillBusinessEmail(businessEmail);
        fillCompanyName(companyName);
        fillCountryName(countryName);
        fillPhoneNumber(phoneNumber);
    }


    public void fillFullName(String fullNameValue){
        elementMethods.fillElement(fullName, fullNameValue);
    }
    public void fillBusinessEmail(String businessEmailValue){
        elementMethods.fillElement(businessEmail, businessEmailValue);
    }

    public void fillCompanyName(String companyNameValue){
        elementMethods.fillElement(companyName, companyNameValue);
    }

    public void fillCountryName(String countryValue){
//        elementMethods.scrollByPixels(0,450);
        Select countrySelect = new Select(countryName);
        countrySelect.selectByVisibleText(countryValue);
    }


    public void fillPhoneNumber(String phoneNumberValue){
        elementMethods.fillElement(phoneNumber, phoneNumberValue);
    }

    public void validateForm( String fullNameValue, String businessEmailValue,
                             String companyNameValue, String countryValue, String phoneNumberValue){


        Assert.assertTrue(fullName.getText().contains("Full Name"));
        Assert.assertTrue(fullName.getText().contains(fullNameValue));

        Assert.assertTrue(businessEmail.getText().contains("Business Email"));
        Assert.assertTrue(businessEmail.getText().contains(businessEmailValue));

        Assert.assertTrue(companyName.getText().contains("Company Name"));
        Assert.assertTrue(companyName.getText().contains(companyNameValue));

        Assert.assertTrue(countryName.getText().contains("Country Name"));
        Assert.assertTrue(countryName.getText().contains(countryValue));

        Assert.assertTrue(phoneNumber.getText().contains("Phone Number"));
        Assert.assertTrue(phoneNumber.getText().contains(phoneNumberValue));

    }

}
