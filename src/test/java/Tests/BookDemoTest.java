package Tests;

import Buttons.BookDemoButton;
import Pages.*;
import SharedData.SharedData;
import org.testng.annotations.Test;

public class BookDemoTest extends SharedData {
    
    @Test
    
    public void testMethod(){

        HomePage homePageMenu = new HomePage(getDriver());
        homePageMenu.clickBookDemo();

        String fullNameValue = "Alexandru Palsoi";
        String businessEmailValue = "blabla@business.com";
        String companyNameValue = "Company";
        String countryValue = "Algeria";
        String phoneNumberValue = "0722123123";

        BookDemoButton bookDemoButton = new BookDemoButton(getDriver());
        bookDemoButton.fillForm(fullNameValue, businessEmailValue, companyNameValue, countryValue, phoneNumberValue);

    }

}
