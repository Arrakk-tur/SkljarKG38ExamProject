package pages;

import io.qameta.allure.Step;
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


    @Step
    public void enterTextInToInputLogin(String login) {
        actionsWithOurElements.enterTextInToElement(inputLogin, login);
    }

    @Step
    public void enterTextInToInputPassword(String pswd) {
        actionsWithOurElements.enterTextInToElement(inputPassword, pswd);
    }

    @Step
    public void clickSubmitButton() {
        actionsWithOurElements.clickOnElement(buttonSubmit);
    }

    @Step
    public void login(String login, String pswd) {
        HomePage homePage = new HomePage(webDriver);
        homePage.openPage();
        homePage.clickVhodButton();
        enterTextInToInputLogin(login);
        enterTextInToInputPassword(pswd);
        clickSubmitButton();
    }
}
