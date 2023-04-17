package SliderTest;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SliderTests extends BaseTest {
    @Test
    public void testNokiaSlider() {
        String nokiaUrl="https://demo.nopcommerce.com/nokia-lumia-1020";
        homePage.getNokiaSlider().click();
        Assert.assertTrue(homePage.validatePageUrl(nokiaUrl),"Invalid URL");
    }

    @Test
    public void testIphoneSlider() {
        String iphoneUrl="https://demo.nopcommerce.com/iphone-6";
        homePage.getIphoneSlider().click();
        Assert.assertTrue( homePage.validatePageUrl(iphoneUrl),"Invalid URL");
    }
}
