package PriceTest;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PricesTests extends BaseTest {
    @Test
    public void testPrices(){
        homePage.SelectEuro();
        Assert.assertTrue(homePage.checkEuro(),"the price in dollar");
    }
}
