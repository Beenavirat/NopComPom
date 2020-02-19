package WebTest1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BrowserSelector extends Utils {

    public void setUpBrowser(){
        System.setProperty("webdriver.chrome.driver", "src/test/Resources/BrowserDriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver,30);

        driver.get("https://demo.nopcommerce.com/");


        try{
         Thread.sleep(2000);
        }catch (InterruptedException e){
           e.printStackTrace();
        }

    }
   public void closeBrowser(){


       driver.close();
    }

    }




