package RegisterTest;

import Base.BaseTest;
import Pages.AccountCreatedPage;
import Pages.LoginAndRegisterPage;
import Pages.SignUpPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTest extends BaseTest {
    @Test(priority = 1)
    public void testSuccessRegisterFirstPage() {
        LoginAndRegisterPage loginAndRegisterPage= homePage.clickLoginButton();
        loginAndRegisterPage.setNameFiled("Abdo2");
        loginAndRegisterPage.setMailFieldForRegistration("test2rr@gg.com");
        SignUpPage signUpPage=loginAndRegisterPage.clickSignupBtn();
        signUpPage.getAndSelectGender();
        signUpPage.setPassword("Test2");
        signUpPage.selectDay("6");
        signUpPage.selectMonth("June");
        signUpPage.selectYear("1998");
        signUpPage.setAddressFirstName("Test fName");
        signUpPage.setAddressLastName("Test lName");
        signUpPage.setCompanyName("Test Company");
        signUpPage.setAddress("Address");
        signUpPage.setAddress2("Address2");
        signUpPage.selectCountry("Canada");
        signUpPage.setState("State1");
        signUpPage.setCity("City1");
        signUpPage.setZipCode("123456789");
        signUpPage.setMobileNumber("01022942679");
        AccountCreatedPage accountCreatedPage=signUpPage.clickCreateAccountBtn();
        Assert.assertTrue(accountCreatedPage.getSuccessMessage().contains("ACCOUNT CREATED!"),"Account Not Created");
        Assert.assertEquals(accountCreatedPage.getSuccessMessageColor(),"#008000");
    }
}
