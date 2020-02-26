package WebTest1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
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
    public static void assertTextMessage(String message, String expected, By by) {
        String actual = getTextfromElement(by);
        Assert.assertEquals(message, expected, actual);
    }

    //to scroll and click
    public static void scrollAndClick(By by) {
        WebElement element = driver.findElement(by);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        element.click();

    }

    public static void timeDelay(int time) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //  creating method for    selectFromDropDownByVisible Text
    public static void selectFromDropDownByVisibleText(By by, String text) {


        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);

    }
  //  method for enter text
    public static void enterText(By by, String text) {

        driver.findElement(by).sendKeys(text);
    }
}



