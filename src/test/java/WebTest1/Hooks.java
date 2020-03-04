package WebTest1;


import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

//porttic com.sun.tools.doclint.Entity.copy;
import static org.apache.commons.io.FileUtils.copyFile;
import static org.openqa.selenium.io.FileHandler.copy;

public class Hooks extends Utils {
  private  String timestamp =new SimpleDateFormat("yyyyddHHmmss").format(new Date());


    BrowserSelector browserSelector =new BrowserSelector();


    @Before
    public void openBrowser(){
        browserSelector.setUpBrowser();
    }
    @After
    public void closeBrowser(Scenario scenario) throws IOException{

        if (scenario.isFailed()){
            String screenshotName =scenario.getName().replaceAll("[.,:;?!]","")+timestamp + ".png";
            try{
                File sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                File destinationPath=new File(System.getProperty("user.dir") +"/target/Destination/Screenshots/"+screenshotName);
                copyFile(sourcePath,destinationPath);
                scenario.write("!!!!!!!!!!!!...Scenario failed.Please see attached screenshot for the error");
                scenario.embed(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES),"image/png");
            }catch(IOException e){

            }



            driver.quit();
        }


    }


    }





