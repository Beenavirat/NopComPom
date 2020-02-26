package WebTest1;

//import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import java.sql.SQLOutput;
import java.util.List;

public class ChangeCurrencyResultPage extends Utils {

  // Method for verify currency DOllar to Euro
    public void verifycurrencychangeUsDollarToEuro() {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        SoftAssert softassert = new SoftAssert();
        List<WebElement> productPrice = driver.findElements(By.xpath("//span[@class=\"price actual-price\"]"));
        for (WebElement we : productPrice) {
            softassert.assertTrue(we.getText().contains("Ђ"), "Ђ is not found in " + we.getText());
        }
        softassert.assertAll();
        System.out.println("check your currency");

    }
    // method for verify currency euro to dollar
    public void verifycurrencyChangeEuroToDollar(){

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        SoftAssert softassert = new SoftAssert();
        List<WebElement> productPrice = driver.findElements(By.xpath("//span[@class=\"price actual-price\"]"));
        for (WebElement we : productPrice) {
            softassert.assertTrue(we.getText().contains("$"), "$ is not found in " + we.getText());
        }
        softassert.assertAll();
        System.out.println("check your currency");
    }
}
