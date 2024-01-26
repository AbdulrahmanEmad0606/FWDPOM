package LoginTest;

import CoreElements.Driver;
import Pages.HomePage;
import Pages.LoginPage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginTests {
    Driver driver=new Driver();
    HomePage homePage=new HomePage(driver);
    SoftAssert softAssert = new SoftAssert();
//    @BeforeTest
//    public void setUp() {
//        homePage.openSite();
//    }

    @Test(priority = 1)
    public void tesLoginWithInvalidData() {
        LoginPage loginPage = homePage.clickLoginButton();
        loginPage.setMailFiled("test@ddd.com");
        loginPage.setPasswordField("wrong pass");
        loginPage.getLoginBtn();
        softAssert.assertTrue(loginPage.getErrorMessage().getText().contains("Login was unsuccessful."),"In valid error message");
        softAssert.assertEquals(loginPage.getErrorMessageColor(),"#e4434b");
        softAssert.assertAll();
    }
    @Test(priority = 2)
    public void testSuccessfulLogin() {
        LoginPage loginPage = homePage.clickLoginButton();
        loginPage.setMailFiled("test5@gmail.com");
        loginPage.setPasswordField("123456");
        loginPage.getLoginBtn();
        softAssert.assertTrue(homePage.getMyAccountTab().equalsIgnoreCase("My account"),"Login Failed");
        softAssert.assertAll();
    }
}