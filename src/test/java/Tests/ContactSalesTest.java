package Tests;

import Buttons.ContactSalesButton;
import Pages.HomePage;
import SharedData.SharedData;
import org.testng.annotations.Test;

public class ContactSalesTest extends SharedData {

    @Test

            public void testMethod(){

        HomePage homePage = new HomePage(getDriver());
        homePage.clickContactSales();

        String fullNameValue = "Alexandru Palsoi";
        String phoneNumberValue = "0722123123";
        String businessEmailValue = "blabla@business.com";
        String countryValue = "Algeria";
        String numberOfEmployeesValue = "21 - 25";
        String jobTitleValue = "Manager";
        String messageValue = "This is a random message written";

        ContactSalesButton contactSalesButton = new ContactSalesButton(getDriver());
        contactSalesButton.fillForm(fullNameValue,phoneNumberValue,businessEmailValue,countryValue, numberOfEmployeesValue, jobTitleValue, messageValue);

    }




}
