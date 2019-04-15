package pages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

public class HomePage extends ParentPage {
    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath = ".//ul[@class='nav navbar-nav navbar-right']/li[1]/a")
    private WebElement registrationButton;

    @FindBy(xpath = ".//a[@data-toggle='modal']")
    private WebElement vhodButton;

    @FindBy(xpath = ".//a[@id='logout']")
    private WebElement buttonLogout;

    @FindBy(xpath = ".//ul[@id='navigation']/li[1]/a")
    private WebElement firstItemInHeaderNav;

    @FindBy(xpath = ".//li[@id='username']")
    private WebElement userName;

    public void openPage() {
        try {
            webDriver.get("https://www.sam-dom.com.ua");
            logger.info("Home page was opened");
        }catch (Exception e){
            logger.error("Can not open Home Page " + e);
            Assert.fail("Can not open Home Page " + e);
        }
    }

    public void clickRegistrationButton() {
        actionsWithOurElements.clickOnElement(registrationButton);
    }

    @Step
    public void clickVhodButton() {
        actionsWithOurElements.clickOnElement(vhodButton);
    }

    @Step
    public void clickLogoutButton() {
        actionsWithOurElements.clickOnElement(buttonLogout);
    }

    @Step
    public void clickFirstItemInHeaderNav(){
        actionsWithOurElements.clickOnElement(firstItemInHeaderNav);
    }

    @Step
    public String getUserName (){
        return actionsWithOurElements.getElementText(userName);
    }
    @Step
    public boolean isRegistrationButtonPresent() {
        return actionsWithOurElements.isElementPresent(registrationButton);
    }
}
