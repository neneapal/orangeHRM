package Buttons;

import Pages.MainPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
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

    @FindBy (id = "/html/body/div[3]/div/div/section[1]/div[2]/div/div[2]/div\n")
    private List<WebElement> valitaionTable;

    @FindBy (xpath = "/html/body/div[3]/div/div/section/div[1]/div/div/div/div[2]/h1\n")
    private WebElement thanksMessage;


    public void fillForm(String fullName, String businessEmail, String companyName, String countryName, String phoneNumber){
        fillFullName(fullName);
        fillBusinessEmail(businessEmail);
        fillCompanyName(companyName);
        fillCountryName(countryName);
        fillPhoneNumber(phoneNumber);
    }

    public List<String>getFormValues(){
        List<String> formValues = new ArrayList<>();
        formValues.add(countryName.getText());
        return formValues;
    }

    public void fillFullName(String fullNameValue){
        elementMethods.fillElement(fullName, fullNameValue);
    }
    public void fillBusinessEmail(String businessEmailValue){
        businessEmail.sendKeys(businessEmailValue);
    }

    public void fillCompanyName(String companyNameValue){
        companyName.sendKeys(companyNameValue);
    }

    public void fillCountryName(String countryValue){
//        elementMethods.scrollByPixels(0,450);
        elementMethods.clickElement(countryName);
        elementMethods.fillElement(selectCountry, countryValue, Keys.ENTER);
    }

    public void fillSubmit(){
        elementMethods.clickJsElement(submitButton);
    }

    public void fillPhoneNumber(String phoneNumberValue){
        phoneNumber.sendKeys(phoneNumberValue);
    }

    public void validateForm(String expectedMessage, String fullNameValue, String businessEmailValue,
                             String companyNameValue, String countryValue, String phoneNumberValue){

        elementMethods.validateElementMessage(thanksMessage, expectedMessage);

        Assert.assertTrue(valitaionTable.get(0).getText().contains("Full Name"));
        Assert.assertTrue(valitaionTable.get(0).getText().contains(fullNameValue));

        Assert.assertTrue(valitaionTable.get(1).getText().contains("Business Email"));
        Assert.assertTrue(valitaionTable.get(1).getText().contains(businessEmailValue));

        Assert.assertTrue(valitaionTable.get(2).getText().contains("Company Name"));
        Assert.assertTrue(valitaionTable.get(2).getText().contains(companyNameValue));

        Assert.assertTrue(valitaionTable.get(3).getText().contains("Country Name"));
        Assert.assertTrue(valitaionTable.get(3).getText().contains(countryValue));

        Assert.assertTrue(valitaionTable.get(4).getText().contains("Phone Number"));
        Assert.assertTrue(valitaionTable.get(4).getText().contains(phoneNumberValue));

    }

}
