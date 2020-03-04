package WebTest1;

import org.openqa.selenium.By;

public class AboutnopComAddComment extends Utils {

   LoadProp loadProp = new LoadProp();


    private By _detailsButtonAboutNop =By.xpath("//div[3]/div[3]/a[@class=\"read-more\"]");

    private By _enterTitle =By.xpath("//input[@class=\"enter-comment-title\"]");
    private By _enterComments = By.xpath("//textarea[@class=\"enter-comment-text\"]");
    private By _submitNewComments =By.xpath("//input[@class=\"button-1 news-item-add-comment-button\"]");
    private By _successmessage =By.xpath("//div[contains(text(),'successfully ')]");

    private String title =loadProp.getProperty("Title");
    private String comment = loadProp.getProperty("Comment");

    public static void addComments() {
    }


    public   void userClickOnDetails(){

        clickOnElement(_detailsButtonAboutNop);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        enterText(_enterTitle,title);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        enterText(_enterComments,comment);
      clickOnElement(_submitNewComments);

    }

   public void verifysuccessmessageofcomment(){
        String expected  ="new comment is successfully added";
        assertTextMessage("News comment is successfully added",expected,_successmessage);
    }


}
