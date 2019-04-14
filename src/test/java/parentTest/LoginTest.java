package parentTest;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.Test;

@Story("Authorization")
public class LoginTest extends ParentTest {

    String email = "testering@i.ua";
    String pswd = "1qaz2wsx";
    String name = "QA";


    @Test
    @Feature("Authorization with correct credentials")
    public void validLogin(){

        homePage.openPage();
        homePage.clickVhodButton();
        loginPage.enterTextInToInputLogin(email);
        loginPage.enterTextInToInputPassword(pswd);
        loginPage.clickSubmitButton();

        checkExpectedResult("Name isn't displayed",
                homePage.getUserName().contains(name));

    }

    @Test
    @Feature("Logging out")
    public void logout(){

        loginPage.login(email, pswd);
        homePage.clickLogoutButton();

        checkExpectedResult("Registration button isn't present",
                homePage.isRegistrationButtonPresent());
    }
}
