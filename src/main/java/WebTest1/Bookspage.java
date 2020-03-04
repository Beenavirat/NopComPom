package WebTest1;

import org.openqa.selenium.By;

public class Bookspage  extends Utils {
    private By _Books =By.xpath("/html/body/div[6]/div[3]/div[2]/div[2]/div/div[1]/h1");
private By _filterbyprice= By.xpath("/html/body/div[6]/div[3]/div[2]/div[2]/div/div[2]/div[2]/div/div[1]");
//private By _clickOnaddtocartbookFirstPrizePies = By.xpath("//div[@class='product-grid']/div/div[2]/div/div[2]/div[3]/div][2]/input[2]");
private By _clickOnShoppingCart =By.linkText("shopping cart");
private By _addtocart =By.xpath("/html/body/div[6]/div[3]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div[2]/div[3]/div[2]/input[1]");




    // Clk on Add to cart
  /*  public void clickOnaddtocart() {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        scrollAndClick(_clickOnaddtocartbookFirstPrizePies);
    }

       public void clickOnShoppingCart(){
       timeDelay(1);
       scrollAndClick(_clickOnShoppingCart);
 }

*/


    public void scrolldownbandclickonaddtocart() {
       scrollAndClick(_addtocart);
    }
}