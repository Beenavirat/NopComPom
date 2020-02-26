package WebTest1;

import org.openqa.selenium.By;

public class ComputerPage extends Utils {

   // private By _desktops = By.xpath("//img[@alt='Picture for category Desktops']");
   // private By _desktops = By.linkText("desktops");
   private By _desktops = By.xpath("/html/body/div[6]/div[3]/div[2]/div[1]/div[1]/div[2]/ul/li[1]/ul/li[1]/a");
  //  private By _addToCartButton= By.xpath("//*[@id=\"bar-notification\"]/div/p/a");
   public  void verifyUserIsOnComputerPage(){assertURL("computers");}
// clk on  Desktops
   public void clickOnDesktops(){ clickOnElement(_desktops);}

 //  public void clickOnShoppingCart(){
 //      clickOnElement(_addToCartButton);
 //  }

}
