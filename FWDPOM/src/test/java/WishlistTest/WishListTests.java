//package WishlistTest;
//
//import Base.BaseTest;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//import java.time.Duration;
//
//public class WishListTests extends BaseTest {
//    @Test
//    public void testWishlist(){
//        homePage.getFavIcon().click();
//        WebDriverWait wait = new WebDriverWait(homePage.driver, Duration.ofSeconds(30));
//        wait.until(ExpectedConditions.urlToBe("https://demo.nopcommerce.com/build-your-own-computer"));
//        Assert.assertTrue(homePage.checkUrlForWishList(),"Invalid URL");
//    }
//}
