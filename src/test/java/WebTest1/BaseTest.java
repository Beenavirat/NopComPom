package WebTest1;

import org.junit.After;
import org.junit.Before;

public class BaseTest {

    BrowserSelector browserSelector =new BrowserSelector();


    @Before
    public void openBrowser(){
        browserSelector.setUpBrowser();
    }
    @After
    public void closeBrowser(){
       // browserSelector.closeBrowser();
    }




}
