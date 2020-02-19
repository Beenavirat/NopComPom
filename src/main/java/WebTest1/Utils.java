package WebTest1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils extends BasePage {

    // creating parameterized method for clicking an element
    public void clickOnElement(By by) {
        driver.findElement(by).click();
    }


    // create method for sendtext
    public static void sendText(By by, String text) {

        driver.findElement(by).sendKeys(text);
    }

    //  method for timestamp

    public static String createTimeStamp() {
        return new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
    }

    // create method for gettext
    public static String getTextfromElement(By by) {
        return driver.findElement(by).getText();
    }

// asserturl
    public static void assertURL(String text) {
        Assert.assertTrue(driver.getCurrentUrl().contains(text));

    }
    //asserttextmessage
    public static void assertTextMessage(String message,String expected, By by) {
        String actual= getTextfromElement(by);
        Assert.assertEquals(message,expected,actual);
    }


}




