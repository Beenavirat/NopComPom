package WebTest1;

import org.openqa.selenium.By;

public  class RegistrationResultPage extends Utils {

    private By _registerSuccessMessage = By.cssSelector("div.result");
    String expected ="your registration completed";
// method for verifyregistrationsuccess message
    public void verifyUserSeeRegistrationSuccessMessage(){
        assertURL("registerresult");
  assertTextMessage("Registration not completed","your registration completed",By.cssSelector("div.result"));
    }

}
