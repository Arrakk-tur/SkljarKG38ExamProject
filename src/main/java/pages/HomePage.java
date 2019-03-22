package pages;

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

    public void openPage() {
        try {
            webDriver.get("https://www.sam-dom.com.ua");
            logger.info("Login page was opened");
        }catch (Exception e){
            logger.error("Can not open Login Page " + e);
            Assert.fail("Can not open Login Page " + e);
        }
    }

    public void clickRegistrationButton() {
        actionsWithOurElements.clickOnElement(registrationButton);
    }

    public void clickVhodButton() {
        actionsWithOurElements.clickOnElement(vhodButton);
    }

    public void clickLogoutButton() {
        actionsWithOurElements.clickOnElement(buttonLogout);
    }

}
