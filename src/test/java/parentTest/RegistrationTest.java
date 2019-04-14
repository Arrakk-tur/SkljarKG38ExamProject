package parentTest;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.Test;

@Story("Registration")
public class RegistrationTest extends ParentTest {

    String email = "testering@i.ua";
    String pswd = "1qaz2wsx";
    String name = "QA";
    String phone = "12345678";


    @Test
    @Feature("Registration new user")
    public void registrationNewUser(){
        homePage.openPage();
        homePage.clickRegistrationButton();
        registrationPage.enterTextInToInputEmail(email);
        registrationPage.enterTextInToInputPassword(pswd);
        registrationPage.enterTextInToInputName(name);
        registrationPage.enterTextInToInputPhone(phone);
        registrationPage.clickSubmitButton();

        checkExpectedResult("Name isn't displayed",
                homePage.getUserName().contains(name));
    }
}
