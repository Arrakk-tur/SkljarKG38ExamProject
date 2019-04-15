package parentTest;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.Test;

@Story("Tests for Orders")
public class OrderTests extends ParentTest{

    @Test
    @Feature("Adding item to Order basket")
    public void addItemToBasket(){

        homePage.openPage();
        homePage.clickFirstItemInHeaderNav();
        catalogPage.clickBySubmenuElement();
        productsPage.clickBuyButtonForFirstItem();

        checkExpectedResult("Item isn't added to Order basket.",
                productsPage.isCheckoutButtonPresent());
    }

    @Test
    @Feature("Deleting item from Order basket")
    public void deleteItemFromBasket(){

        productsPage.addItemToBasket();
        productsPage.clickDeleteButtonInBasketPopup();
        productsPage.confirmDeleteItemFromBasket();

        checkExpectedResult("Basket isn't empty",
                productsPage.isBasketIsEmpty());
    }
}
