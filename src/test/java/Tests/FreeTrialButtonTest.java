package Tests;

import Pages.HomePage;
import SharedData.SharedData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FreeTrialButtonTest extends SharedData{

    @Test

    public void testMethod(){

        HomePage homePage = new HomePage(getDriver());
        homePage.enterEmail();
        homePage.clickFreeTrialButton();

        String firstHeaderValue = "Revolutionize Your Human Resource Management Experience!";
        String secondHeaderValue = "Experience the cutting-edge features and seamless functionality" +
                " of OrangeHRM with our exclusive Free Trial.";
        String firstParagraphValue = "Evaluate OrangeHRM without any financial commitment." +
                " It provides a risk-free opportunity to assess if the platform meets your expectations.";

        System.out.println(firstHeaderValue);
        System.out.println(secondHeaderValue);
        System.out.println(firstParagraphValue);
    }

}
