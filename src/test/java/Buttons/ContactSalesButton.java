package Buttons;

import Pages.MainPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class ContactSalesButton extends MainPage {

    public ContactSalesButton(WebDriver driver) {
        super(driver);
    }
    @FindBy (id = "Form_getForm_FullName")
    private WebElement fullName;

    @FindBy (id = "Form_getForm_Contact")
    private WebElement phoneNumber;

    @FindBy (id = "Form_getForm_Email")
    private  WebElement businessEmail;

    @FindBy (id = "Form_getForm_Country")
    private WebElement countryName;

    @FindBy (xpath = "//option[contains(text(),'Algeria')]")
    private WebElement selectCountry;

    @FindBy (id = "Form_getForm_NoOfEmployees")
    private WebElement selectNumberOfEmployees;

    @FindBy (id = "Form_getForm_JobTitle")
    private WebElement selectJobTitle;

    @FindBy (id = "Form_getForm_Comment")
    private WebElement writeYourMessage;

    @FindBy (id = "recaptcha-anchor")
    private WebElement captchaCheckBox;

    @FindBy (id = "Form_getForm_action_submitForm")
    private WebElement submitButton;

    public void fillForm(String fullName,  String phoneNumber, String businessEmail, String countryName, String selectNumberOfEmployees,
                         String selectJobTitle, String writeYourMessage){
        fillFullName(fullName);
        fillPhoneNumber(phoneNumber);
        fillBusinessEmail(businessEmail);
        fillCountryName(countryName);
        fillNumberOfEmployees(selectNumberOfEmployees);
        fillJobTitle(selectJobTitle);
        fillMessage(writeYourMessage);
    }

    public List<String> getCountriesList(){
        List<String> formValues = new ArrayList<>();
        formValues.add(countryName.getText());
        return formValues;
    }

    public List<String> getNumberOfEmployeesList(){
        List<String> formValues = new ArrayList<>();
        formValues.add(selectNumberOfEmployees.getText());
        return formValues;
    }

    public void fillFullName(String fullNameValue){
        elementMethods.fillElement(fullName, fullNameValue);
    }
    public void fillPhoneNumber(String phoneNumberValue){
        phoneNumber.sendKeys(phoneNumberValue);
    }
    public void fillBusinessEmail(String businessEmailValue){
        businessEmail.sendKeys(businessEmailValue);
    }

    public void fillCountryName(String countryValue){
//        elementMethods.scrollByPixels(0,450);
        elementMethods.clickElement(countryName);
        elementMethods.fillElement(selectCountry, countryValue, Keys.ENTER);
    }

    public void fillNumberOfEmployees(String numberOfEmployeesValue){
        elementMethods.clickElement(selectNumberOfEmployees);
        elementMethods.fillElement(selectNumberOfEmployees, numberOfEmployeesValue, Keys.ENTER);
    }

    public void fillJobTitle(String jobTitleValue){
        selectJobTitle.sendKeys(jobTitleValue);
    }

    public void fillMessage(String messageValue){
        writeYourMessage.sendKeys(messageValue);
    }
}
