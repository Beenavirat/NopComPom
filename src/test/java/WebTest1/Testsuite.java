package WebTest1;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

import static WebTest1.AboutnopComAddComment.*;

public class Testsuite extends BaseTest {


    Homepage homePage = new Homepage();
    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationResultPage registrationResultPage = new RegistrationResultPage();
    ComputerPage  computerPage  = new ComputerPage();
    Bookspage bookspage = new Bookspage();
    JewelryPage jewelryPage = new JewelryPage();
    GuestCheckout guestCheckout = new GuestCheckout();
    ShippingAddress shippingAddress = new ShippingAddress();
    PaymentMethod paymentMethod = new PaymentMethod();
    CheckoutResult checkOutResult = new CheckoutResult();
    NewsAddPage newsAddPage = new NewsAddPage();


    // create changecurrency object
   ChangeCurrency changeCurrency =new ChangeCurrency();
   // create changecurrencyresultpage object
    ChangeCurrencyResultPage changeCurrencyResultPage =new ChangeCurrencyResultPage();
    //create object for addcomment
    AboutnopComAddComment aboutnopComAddComment = new AboutnopComAddComment();
  AboutnopComAddCommentsResults aboutnopComAddCommentsResults = new AboutnopComAddCommentsResults();

    @Test
    public void userShouldAbleToRegisterSuccessfully() {

        // click on Register button
        homePage.clickOnRegisterButton();

        //fill up registration button
        registrationPage.verifyUserIsOnRegisterPage();
        registrationPage.userEntersRegistrationDetails();
        registrationPage.clickonRegisterButton();

        // verify registration success message
        registrationResultPage.verifyUserSeeRegistrationSuccessMessage();
    }

    @Test
    public void printproductlist() {

        List<WebElement> productList = driver.findElements(By.xpath("//div[@class='product-grid home-page-product-grid']/div[2]/div/div/div[2]/div[3]/div/span"));
        System.out.println(productList.size());

        for (WebElement we : productList) {
            System.out.println(we.getText());

            Assert.assertTrue(we.getText().contains(("£")));

        }
    }

    @Test
  // User should able to checkout successfully
   public void userShouldBeAbleToCheckOutSuccessfully(){
// clk on books link

   homePage.clickOnBooks();
   // click on add to cart
  // bookspage.clickOnaddtocart();
   //click on shopping cart
   //  bookspage.clickOnShoppingCart();
   bookspage.scrolldownbandclickonaddtocart();

    }

@Test
    public void verifyGuestUserShouldBeAbleToCheckOutSuccessfully() {
        homePage.clickOnJewellery();
        jewelryPage.verifyUserIsOnJewelryPage();
        jewelryPage.addToCartProduct();
        guestCheckout.checkoutAsGuest();
    try {
        Thread.sleep(2000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }



        shippingAddress.userShippingAddress();
    try {
        Thread.sleep(2000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
        paymentMethod.userChoosePaymentMethod();
        checkOutResult.verifycheckoutsuccessmessage();

    }







    @Test
    // verify that user should change the currency
    public void userShouldBeAbleToChangeCurrency(){
        changeCurrency.selectCurrencyUsDollarToEuro();
        changeCurrencyResultPage.verifycurrencychangeUsDollarToEuro();


        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        changeCurrency.selectCurrencyEuroToUsDollar();
        changeCurrencyResultPage.verifycurrencyChangeEuroToDollar();
    }






  // verify guest user  should add comment


@Test
public void GuestUserShouldBeAbleToAddComments() {
    homePage.clickOnViewNewsArchive();
    newsAddPage.userClickOnDetails();
    newsAddPage.verifysuccessmessageofcomment();
}



}
