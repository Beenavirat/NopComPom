package WebTest1;

import org.openqa.selenium.By;

public class ChangeCurrency extends Utils {
    // locator for changecurrency
    private By _changeCurrency = By.xpath("//select[@id=\"customerCurrency\"]");


    // Select and change curency from us Dollar To Euro





    public void selectCurrencyUsDollarToEuro() {
        selectFromDropDownByVisibleText(_changeCurrency, "Euro");
    }





    // select and change currency from Euro to US Dollar
    public void selectCurrencyEuroToUsDollar() {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        selectFromDropDownByVisibleText(_changeCurrency, "Dollar");
    }
}


