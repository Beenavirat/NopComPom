import WebTest1.Homepage;
import WebTest1.RegistrationPage;
import WebTest1.RegistrationResultPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class MyStepdefs {
    Homepage homePage = new Homepage();
    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationResultPage registrationResultPage = new RegistrationResultPage();

    @Given("User is on register page")
    public void userIsOnRegisterPage() {
        homePage.clickOnRegisterButton();

    }

    @When("User enters all registration details")
    public void userEntersAllRegistrationDetails() {
        registrationPage.verifyUserIsOnRegisterPage();
        registrationPage.userEntersRegistrationDetails();

    }

    @And("User clicks on register button")
    public void userClicksOnRegisterButton() {
registrationPage.clickonRegisterButton();
}

    @Then("User should be able to register successfully")
    public void userShouldBeAbleToRegisterSuccessfully() {
        registrationResultPage.verifyUserSeeRegistrationSuccessMessage();
    }

 //   --------------------------------------------------------

  /*  @Given("^User is on register page$")
    public void user_is_on_register_page() {
        homePage.clickOnRegisterButton();
        registrationPage.verifyUserIsOnRegisterPage();
    }

    @When("^User enters all registration details$")
    public void user_enters_all_registration_details()  {
        registrationPage.userEntersRegistrationDetails();
    }

    @When("^User clicks on register button$")
    public void user_clicks_on_register_button() {
        registrationPage.clickonRegisterButton();
    }

    @Then("^User should be able to register successfully$")
    public void user_should_be_able_to_register_successfully() {
        registrationResultPage.verifyUserSeeRegistrationSuccessMessage();
    }
*/



  //  @And("User clicks on register button")
   // public void userClicksOnRegisterButton() {
  //      registrationPage.clickonRegisterButton();
 //   }













}
