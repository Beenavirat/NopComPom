package WebTest1;

import org.junit.Test;

public class Testsuite extends BaseTest {


    Homepage homePage = new Homepage();
    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationResultPage registrationResultPage =new RegistrationResultPage();

    @Test
    public  void userShouldAbleToRegisterSuccessfully(){

        // click on Register button
        homePage.clickOnRegisterButton();

        //fill up registration button
        registrationPage.verifyUserIsOnRegisterPage();
        registrationPage.userEntersRegistrationDetails();

       // verify registration success message
       registrationResultPage.verifyUserSeeRegistrationSuccessMessage();
    }
}
