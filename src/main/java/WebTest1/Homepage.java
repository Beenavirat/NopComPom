package WebTest1;

import org.openqa.selenium.By;

public class Homepage extends Utils {

    private By _books = By.linkText("Books");
    private By _registerLink = By.xpath("//a[contains(.,Register)]");
    //private By  _computers  = By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/a");
    private By _computers = By.linkText("Computers");
    private By _jewelryLink = By.xpath("//ul[contains(@class,'notmobile')]//li//a[contains(text(),'Jewelry')]");
    private By _details = By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[5]/div[2]/div[2]/div[3]/a");
    private By _viewNewsArchive = By.xpath("//a[contains(text(),'Archive')]");

    // clk on register
    public void clickOnRegisterButton() {
        clickOnElement(_registerLink);
    }

    public void clickOnComputer() {
        clickOnElement(_computers);
    }

    public void clickOnBooks() {
        clickOnElement(_books);
    }

    public void scrolldownbandclickonnopcomdetails() {
        scrollAndClick(_details);

    }

    public void verifyUserIsOnHomepage() {
        assertURL("demo.nopcommerce");
    }

    //verify that user click on jewellery category
    public void clickOnJewellery() {
        clickOnElement(_jewelryLink);
    }


    //verify that user click on News Archive
    public void clickOnViewNewsArchive()
    {
        clickOnElement(_viewNewsArchive);
    }




}