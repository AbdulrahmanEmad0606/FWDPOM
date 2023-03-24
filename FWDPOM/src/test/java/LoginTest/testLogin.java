package LoginTest;

import Base.BaseTest;
import Pages.LoginAndRegisterPage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class testLogin extends BaseTest {

    SoftAssert softAssert=new SoftAssert();
    @Test(priority = 1)
    public void tesLoginWithInvalidData() {
        LoginAndRegisterPage loginAndRegisterPage = homePage.clickLoginButton();
        loginAndRegisterPage.getMailFieldLogin().sendKeys("SignUpForFrjhhee@InvaliddEmfffll55ail.com");
        loginAndRegisterPage.getPassword().sendKeys("wrong password");
        loginAndRegisterPage.getLoginButton().click();
        softAssert.assertTrue(loginAndRegisterPage.getErrorMessage().getText().equalsIgnoreCase("Your email or password is incorrect!"),"User Login Successfully");
        softAssert.assertEquals(loginAndRegisterPage.getErrorMessageColor(),"rgba(255, 0, 0, 1)");
        softAssert.assertAll();
    }
    @Test(priority = 2)
    public void testSuccessfulLogin() {
        LoginAndRegisterPage loginAndRegisterPage = homePage.clickLoginButton();
        loginAndRegisterPage.getMailFieldLogin().sendKeys("SignUpForFrjhhee@InvaliddEmfffllail.com");
        loginAndRegisterPage.getPassword().sendKeys("Test2");
        loginAndRegisterPage.getLoginButton().click();
        softAssert.assertTrue(homePage.driver.getTitle().equalsIgnoreCase("Automation Exercise"),"Login Failed");
        softAssert.assertAll();
    }
}