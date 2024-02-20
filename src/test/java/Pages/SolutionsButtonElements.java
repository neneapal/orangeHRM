//package Pages;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//
//public class SolutionsButtonElements extends MainPage{
//
//    public SolutionsButtonElements(WebDriver driver) {
//        super(driver);
//    }
//    @FindBy(xpath = "/html/body/nav/div/div[2]/ul/li[1]/div/div/div/div/ul/li[1]\n")
//    public WebElement peopleManagementButton;
//
//    @FindBy(xpath = "//body/nav[@class='navbar navbar-expand-lg navbar-light fixed-top']/div[@class='container-fluid']/div[@id='navbarSupportedContent']/" +
//            "ul[@class='navbar-nav me-auto mb-2 mb-lg-0 web-menu']/li[@class='nav-item']/div[@class='secondary']/div[@class='col-md-12 col-lg-12']" +
//            "/div[@class='sub-menu']/div[@class='secondary-menu']/ul/li[2]")
//    public WebElement talentManagementButton;
//
//    @FindBy(xpath = "//div[@class='secondary']//li[3]")
//    public WebElement compensationButton;
//
//    @FindBy(xpath = "//div[@class='secondary']//li[4]")
//    public WebElement cultureButton;
//
//    @FindBy(xpath = "//div[@class='secondary']//li[5]")
//    public WebElement valueAddedServicesButton;
//
//    public void clickPeopleManagement(){
//        peopleManagementButton.click();
//    }
//
//    public void clickTalentManagement(){
//        talentManagementButton.click();
//    }
//
//    public void clickCompensation(){
//        compensationButton.click();
//    }
//
//    public void clickCulture(){
//        cultureButton.click();
//    }
//
//    public void clickValueAddedServices(){
//        valueAddedServicesButton.click();
//    }
//}
