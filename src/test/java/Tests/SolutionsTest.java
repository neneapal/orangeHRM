package Tests;

import Pages.HomePage;
import Pages.HomePageMenu;
import Pages.MainPage;
import Pages.SolutionsButton;
import SharedData.SharedData;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static java.sql.DriverManager.getDriver;

public class SolutionsTest extends SharedData {
    
    @Test
    
    public void testMethod(){

        HomePageMenu homePageMenu = new HomePageMenu(getDriver());




    }



}
