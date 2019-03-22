package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

public class LoginPage extends ParentPage {
    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath = ".//input[@id='loginform-username']")
    private WebElement inputLogin;

    @FindBy(xpath = ".//input[@id='loginform-password']")
    private WebElement inputPassword;

    @FindBy(xpath = ".//button[@name='signup-button']")
    private WebElement buttonSubmit;


    public void enterTextInToInputLogin(String login) {
        actionsWithOurElements.enterTextInToElement(inputLogin, login);
    }

    public void enterTextInToInputPassword(String pswd) {
        actionsWithOurElements.enterTextInToElement(inputPassword, pswd);
    }

    public void clickSubmitButton() {
        actionsWithOurElements.clickOnElement(buttonSubmit);
    }

    public void login(String login, String pswd) {
        HomePage homePage = new HomePage(webDriver);
        homePage.openPage();
        homePage.clickVhodButton();
        enterTextInToInputLogin(login);
        enterTextInToInputPassword(pswd);
        clickSubmitButton();
    }
}
