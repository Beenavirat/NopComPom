package WebTest1;

import org.openqa.selenium.By;

import static WebTest1.Utils.assertTextMessage;
import static WebTest1.Utils.assertURL;

public class AboutnopComAddCommentsResults extends Utils {

    private By _assert1CommentsSuccessMessage =By.linkText("News comment is successfully added");
    private By _assert2userCanSeeComments  =By.linkText("1/24/2020 1:20 PM");
   String  expected = " News comment is successfully added";

    public void verifyGuestUserSeeCommentsSuccessfulMessage(){
     assertURL("about-nopcomm");
assertTextMessage("you should be registered customer to refer to a friend",expected,By.linkText("News comment is successfully added"));

 }

}
