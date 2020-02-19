package WebTest1;

import org.openqa.selenium.By;

public class RegistrationPage extends Utils {


    private By _firstName = By.name("FirstName");
    private By _lastName = By.xpath("//*[@id=\"LastName\"]");
    private By _email = By.xpath("//*[@id=\"Email\"]");
    private By _password = By.xpath("//input[@id=\"Password\"]");
    private By _confirmPassword = By.xpath("//*[@id=\"ConfirmPassword\"]");
    private By _registerButton = By.xpath("//input[@id=\"register-button\"]");
    private String firstName = "Rajesh";
    private String lastName = "Khanna";

    private static String timestamp = createTimeStamp();

//verify user is on register page

    public void verifyUserIsOnRegisterPage() {
        assertURL("register");
    }

// enter registration details
    public void userEntersRegistrationDetails() {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        {
            sendText(_firstName, firstName);
            sendText(_lastName, lastName);
            sendText(_email, "testtest" + timestamp + "@test.com");
            sendText(_password, "testtest");
            sendText(_confirmPassword, "testtest");
            clickOnElement(_registerButton);
        }
    }

}

