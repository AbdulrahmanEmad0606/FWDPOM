package RegisterTest;

import Base.BaseTest;
import Pages.AccountCreatedPage;
import Pages.LoginAndRegisterPage;
import Pages.SignUpPage;
import org.bouncycastle.util.test.FixedSecureRandom;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.sql.Time;
import java.util.Date;

public class RegisterTest extends BaseTest {

    SoftAssert softAssert=new SoftAssert();
    @DataProvider(name = "data-provider")
    public Object[][] dataProviderMethod() {
        Date date = new Date();
        // 3 values for every column of the 4 unique columns
        Object [] [] data = new Object [3] [4];
        data [0] [0] = "SignUpForFrjhhee@InvaliddEmfffllail.com"+ date.getTime();    data [0] [1] = "Abdulrxxahman"; data[0][2]="01022942679"; data[0][3]="123456";
        data [1] [0] = "Rex.Jonles@Test4Success.org"+ date.getTime();      data [1] [1] = "Mahmoud"; data[1][2]="01022942690"; data[1][3]="89989";
        data [2] [0] = "InvaloidLogIn@Test.com"+ date.getTime();      data [2] [1] = "Mohammed"; data[2][2]="01022942100"; data[2][3]="78910";
        return data;
    }
    @Test(dataProvider = "data-provider")
    public void testSuccessRegisterFirstPage(String mail,String name,String phoneNumber,String zipCode) {

        LoginAndRegisterPage loginAndRegisterPage= homePage.clickLoginButton();
        loginAndRegisterPage.setNameFiled(name);
        loginAndRegisterPage.setMailFieldForRegistration(mail);
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
        signUpPage.setZipCode(zipCode);
        signUpPage.setMobileNumber(phoneNumber);
        AccountCreatedPage accountCreatedPage=signUpPage.clickCreateAccountBtn();
        softAssert.assertTrue(accountCreatedPage.getSuccessMessage().contains("ACCOUNT CREATED!"),"Account Not Created");
        softAssert.assertEquals(accountCreatedPage.getSuccessMessageColor(),"#008000");
        softAssert.assertAll();
    }
    @AfterMethod
    public void logOut()  {
        homePage.getLogoutButtonAndClickOn().click();
    }
}
