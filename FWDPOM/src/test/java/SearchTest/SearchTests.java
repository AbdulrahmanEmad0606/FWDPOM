//package SearchTest;
//
//import Base.BaseTest;
//import Pages.SearchPage;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.interactions.Actions;
//import org.testng.Assert;
//import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;
//
//public class SearchTests extends BaseTest {
//    @DataProvider(name = "data-provider")
//    public Object[][] dataProviderMethod() {
//        Object[][] data = new Object[3][1];
//        data[0][0] = "book";
//        data[1][0] = "laptop";
//        data[2][0] = "nike";
//        return data;
//    }
//
//    @Test(dataProvider = "data-provider")
//    public void testSearchByProductName(String searchItem) {
//        SearchPage searchPage = new SearchPage(homePage.driver);
//        searchPage.setSearchInput(searchItem);
//        new Actions(homePage.driver).sendKeys(Keys.ENTER).perform();
//        searchPage.getSearchResultSize();
//        Assert.assertTrue(homePage.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/search?q="));
//        Assert.assertTrue(searchPage.ValidateSearchResult(searchItem));
//    }
//    @DataProvider(name = "data-provider2")
//    public Object[][] dataProviderMethodBySKU() {
//        Object[][] data = new Object[3][1];
//        data[0][0] = "SCI_FAITH";
//        data[1][0] = "APPLE_CAM";
//        data[2][0] = "SF_PRO_11";
//        return data;
//    }
//    @Test (dataProvider = "data-provider2")
//    public void testSearchBySKU(String searchItem) {
//        SearchPage searchPage = new SearchPage(homePage.driver);
//        searchPage.setSearchInput(searchItem);
//        new Actions(homePage.driver).sendKeys(Keys.ENTER).perform();
//        searchPage.getSearchResultSize();
//        Assert.assertTrue(homePage.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/search?q="));
//        Assert.assertTrue(searchPage.ValidateSearchResult(searchItem));
//
//    }
//}
