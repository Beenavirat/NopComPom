package WebTest1;

import org.openqa.selenium.By;





    public class ShippingAddress extends Utils {
        private By _continue = By.xpath("//input[@onclick='ShippingMethod.save()']");


        //user confirm shipping address and method
        public void userShippingAddress()
        {
            clickOnElement(_continue);
        }

    }


