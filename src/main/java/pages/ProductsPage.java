package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends ParentPage {
    public ProductsPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath = ".//div[@id='product-list']//div[@class='col-md-4 col-sm-6 col-xs-12 '][1]//button")
    private WebElement buyButtonForFirstItem;

    @FindBy(xpath = ".//a[@class='btn btn-checkout']")
    private WebElement checkoutBuuton;

    @FindBy(xpath = ".//a[@class='cart-item-remove']")
    private WebElement deleteButton;

    @FindBy(xpath = ".//button[@id='cart-modal-button']/span[@class='badge']")
    private WebElement trashCounter;

    @Step
    public void clickBuyButtonForFirstItem(){
        actionsWithOurElements.clickOnElement(buyButtonForFirstItem);
    }

    @Step
    public void clickDeleteButtonInTrashPopup(){
        actionsWithOurElements.clickOnElement(deleteButton);
    }

    @Step
    public void ischeckoutButtonPresent(){
        actionsWithOurElements.isElementPresent(checkoutBuuton);
    }

    @Step
    public boolean isTrashIsEmpty() {
        return actionsWithOurElements.getElementText(trashCounter).equals("0");
    }

    @Step
    public void confirmDeleteItemfromTrash(){
        webDriver.switchTo().alert().accept();
    }

    @Step
    public void addItemInTrash(){
        HomePage homePage = new HomePage(webDriver);
        CatalogPage catalogPage = new CatalogPage(webDriver);

        homePage.clickFirstItemInHeaderNav();
        catalogPage.clickBySubmenuElement();
        clickBuyButtonForFirstItem();
    }

}
