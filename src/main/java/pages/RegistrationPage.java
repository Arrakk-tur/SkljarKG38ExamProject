package pages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class RegistrationPage extends ParentPage {
    public RegistrationPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath = ".//input[@id='signupform-email']")
    private WebElement inputEmail;

    @FindBy(xpath = ".//input[@id='signupform-password']")
    private WebElement inputPassword;

    @FindBy(xpath = ".//input[@id='signupform-name']")
    private WebElement inputName;

    @FindBy(xpath = ".//input[@id='signupform-phone']")
    private WebElement inputPhone;

    @FindBy(xpath = ".//button[@name='signup-button']")
    private WebElement buttonSubmit;


    @Step
    public void enterTextInToInputEmail(String email) {
        actionsWithOurElements.enterTextInToElement(inputEmail, email);
    }

    @Step
    public void enterTextInToInputPassword(String pswd) {
        actionsWithOurElements.enterTextInToElement(inputPassword, pswd);
    }

    @Step
    public void enterTextInToInputName(String name) {
        actionsWithOurElements.enterTextInToElement(inputName, name);
    }

    public void enterTextInToInputPhone(String phone) {
        actionsWithOurElements.enterTextInToElement(inputPhone, phone);
    }

    @Step
    public void clickSubmitButton() {
        actionsWithOurElements.clickOnElement(buttonSubmit);
    }
}
