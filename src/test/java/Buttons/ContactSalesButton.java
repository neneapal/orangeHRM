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

//    @FindBy (id = "//body/div[3]/div[1]/div[1]/section[1]/div[2]/div[1]/div[2]/div[1]")
//    private List<WebElement> validationTable;

//    @FindBy (css = "body.ThankYouPage:nth-child(2) div.main:nth-child(7) div.inner.typography.line" +
//            " div.thank-you-page-main section.page-body div.container div.row div.col-md-12 div.thank-page-menu div.thank-page-info > p:nth-child(2)")
//    private WebElement thanksMessage;

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
        Select countrySelect = new Select(countryName);
        countrySelect.selectByVisibleText(countryValue);
    }

    public void fillNumberOfEmployees(String numberOfEmployeesValue){
        Select employeeSelect = new Select(selectNumberOfEmployees);
        employeeSelect.selectByVisibleText(numberOfEmployeesValue);
    }

    public void fillJobTitle(String jobTitleValue){
        selectJobTitle.sendKeys(jobTitleValue);
    }

    public void fillMessage(String messageValue){
        writeYourMessage.sendKeys(messageValue);
    }

    public void validateForm(String fullNameValue, String phoneNumberValue, String businessEmailValue,
                             String countryValue, String numberOfEmployeesValue, String jobTitleValue, String messageValue){


        Assert.assertTrue(fullName.getText().contains("Full Name"));
        Assert.assertTrue(fullName.getText().contains(fullNameValue));

        Assert.assertTrue(phoneNumber.getText().contains("Phone Number"));
        Assert.assertTrue(phoneNumber.getText().contains(phoneNumberValue));

        Assert.assertTrue(businessEmail.getText().contains("Business Email"));
        Assert.assertTrue(businessEmail.getText().contains(businessEmailValue));

        Assert.assertTrue(countryName.getText().contains("Country Name"));
        Assert.assertTrue(countryName.getText().contains(countryValue));

        Assert.assertTrue(selectNumberOfEmployees.getText().contains(" Number of Employees"));
        Assert.assertTrue(selectNumberOfEmployees.getText().contains(numberOfEmployeesValue));

        Assert.assertTrue(selectJobTitle.getText().contains("Job Title"));
        Assert.assertTrue(selectJobTitle.getText().contains(jobTitleValue));

        Assert.assertTrue(writeYourMessage.getText().contains("Your Message"));
        Assert.assertTrue(writeYourMessage.getText().contains(messageValue));



    }

}
