package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SolutionsButton extends HomePageMenu {

    public SolutionsButton(WebDriver driver) {
        super(driver);
    }

    public class SolutionsButtonElements {
        @FindBy(xpath = "//div[@class='secondary']//div[@class='sub-menu']/div[@class='secondary-menu']/ul/li")
        private List<WebElement> menuButtons;

        public List<WebElement> getMenuButtons() {
            return menuButtons;
        }
    }
}

//    public class solutionsButtonElements {
//        @FindBy (xpath = "//body/nav[@class='navbar navbar-expand-lg navbar-light fixed-top']" +
//                "/div[@class='container-fluid']/div[@id='navbarSupportedContent']/ul[@class='navbar-nav me-auto mb-2 mb-lg-0 web-menu']/" +
//                "li[@class='nav-item']/div[@class='secondary']/div[@class='col-md-12 col-lg-12']/div[@class='sub-menu']/div[@class='secondary-menu']/ul/li[1]")
//        private List<WebElement> peopleManagementButton;
//
//        @FindBy (xpath = "//body/nav[@class='navbar navbar-expand-lg navbar-light fixed-top']/div[@class='container-fluid']/div[@id='navbarSupportedContent']/" +
//                "ul[@class='navbar-nav me-auto mb-2 mb-lg-0 web-menu']/li[@class='nav-item']/div[@class='secondary']/div[@class='col-md-12 col-lg-12']" +
//                "/div[@class='sub-menu']/div[@class='secondary-menu']/ul/li[2]")
//        private List<WebElement> talentManagementButton;
//
//        @FindBy (xpath = "//div[@class='secondary']//li[3]")
//        private List<WebElement> compensationButton;
//
//        @FindBy (xpath = "//div[@class='secondary']//li[4]")
//        private List<WebElement> cultureButton;
//
//        @FindBy (xpath = "//div[@class='secondary']//li[5]")
//        private List<WebElement> valueAddedServicesButton;
//    }

