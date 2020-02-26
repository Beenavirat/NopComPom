package WebTest1;

import org.openqa.selenium.By;

public class AboutnopComAddComment extends Utils {

   LoadProp loadProp = new LoadProp();

   //
    private By _detailsButtonAboutNop =By.xpath("//div[3]/div[3]/a[@class=\"read-more\"]");
    private By _title= By.xpath("//*[@id=\"comments\"]/form/div[1]/div[1]/label");
    private By _enterTitle =By.xpath("//input[@class=\"enter-comment-title\"]");
    private By _enterComments = By.xpath("//textarea[@class=\"enter-comment-text\"]");
    private By _submitNewComments =By.xpath("//input[@class=\"button-1 news-item-add-comment-button\"]");
    private String title =loadProp.getProperty("Title");
    private String comments = loadProp.getProperty("Comments");


    public  void addComments(){

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

        enterText(_enterComments,comments);
      clickOnElement(_submitNewComments);

    }

   public void clickonElement(By submitNewComments) {
    }


}
