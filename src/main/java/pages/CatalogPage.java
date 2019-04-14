package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CatalogPage extends ParentPage {
    public CatalogPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath = ".//div[@class='row subcategory-row'][1]/div[@class='subcategory-item col-md-4 col-sm-6'][1]//ul[1]/li[2]")
    private WebElement submenuElement;

    @Step
    public void clickBySubmenuElement(){
        actionsWithOurElements.clickOnElement(submenuElement);
    }

}
