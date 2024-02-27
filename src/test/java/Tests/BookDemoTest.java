package Tests;

import Buttons.BookDemoButton;
import Pages.*;
import SharedData.SharedData;
import org.testng.annotations.Test;

import java.util.List;

public class BookDemoTest extends SharedData {
    
    @Test
    
    public void testMethod(){

        HomePageMenu homePageMenu = new HomePageMenu(getDriver());
        homePageMenu.clickBookDemo();

        String fullNameValue = "Alexandru Palsoi";
        String businessEmailValue = "blabla@business.com";
        String companyNameValue = "Company";
        String countryValue = "Algeria";
        String phoneNumberValue = "0722123123";
        String expectedMessage = "Thank You. We’ll be contacting you shortly!";

        BookDemoButton bookDemoButton = new BookDemoButton(getDriver());
        bookDemoButton.fillForm(fullNameValue, businessEmailValue, companyNameValue, countryValue, phoneNumberValue);
        bookDemoButton.fillSubmit();

        bookDemoButton.validateForm(expectedMessage, fullNameValue, businessEmailValue, companyNameValue, countryValue, phoneNumberValue);


    }

}
