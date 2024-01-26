package RegisterTest;

import CoreElements.Driver;
import Pages.AccountCreatedPage;
import Pages.HomePage;
import Pages.RegisterPage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.Date;

public class RegisterTest{
    Driver driver=new Driver();

    HomePage homePage=new HomePage(driver);
    RegisterPage registerPage=new RegisterPage(driver);
    AccountCreatedPage accountCreatedPage=new AccountCreatedPage(driver.getWebDriver());
    SoftAssert softAssert = new SoftAssert();


    @BeforeTest
    public void setUp() {
        homePage.openSite();
    }

    @DataProvider(name = "data-provider")
    public Object[][] dataProviderMethod() {
        Date date = new Date();
        // 3 values for every column of the 4 unique columns
        Object[][] data = new Object[3][3];
        data[0][0] = "test7@gmail.com";data[0][1] = "Abdulrahman";data[0][2] = "Emad";
        data[1][0] = "test8@gmail.com";data[1][1] = "Mahmoud";data[1][2] = "Emad";
        data[2][0] = "test9@gmail.com";data[2][1] = "Maraim";data[2][2] = "Emad";
        return data;
    }

    @Test(dataProvider = "data-provider")
    public void testSuccessRegisterFirstPage(String mail, String firstName, String lastName) {
        homePage.clickRegisterButton();
        registerPage.setData(firstName,lastName,"01","February","1998",mail,"name","123456","123456");
        softAssert.assertTrue(accountCreatedPage.getSuccessMessage().contains("Your registration completed"), "Account Not Created");
        softAssert.assertEquals(accountCreatedPage.getSuccessMessageColor(), "#4cb17c");
        softAssert.assertAll();
    }

}
