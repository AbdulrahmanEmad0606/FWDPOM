package BaseTest;

import CoreElements.Driver;
import Pages.BasePage;
import Pages.HomePage;
import org.junit.AfterClass;
import org.junit.BeforeClass;

public class BaseTest {
    public Driver driver=new Driver();
   // BasePage basePage=new BasePage(driver);
    protected HomePage homePage;


    @BeforeClass
    public void setUp() {
        homePage.openSite();
        homePage=new HomePage(driver);
    }
    @AfterClass
    public void closeSite(){
        driver.tearDown();
    }
}
