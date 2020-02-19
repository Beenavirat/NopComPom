package WebTest1;

import org.openqa.selenium.By;

public class Homepage extends Utils {


    private By _registerLink = By.xpath("//a[contains(.,Register)]");

// clk on register
    public void clickOnRegisterButton(){
        clickOnElement(_registerLink);
    }
}
