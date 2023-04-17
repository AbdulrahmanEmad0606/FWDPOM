package RegisterTest;

import Base.BaseTest;
import Pages.AccountCreatedPage;
import Pages.RegisterPage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.Date;

public class RegisterTest extends BaseTest {

    SoftAssert softAssert = new SoftAssert();

    @DataProvider(name = "data-provider")
    public Object[][] dataProviderMethod() {
        Date date = new Date();
        // 3 values for every column of the 4 unique columns
        Object[][] data = new Object[3][3];
        data[0][0] = "test4@gmail.com";data[0][1] = "Abdulrahman";data[0][2] = "Emad";
        data[1][0] = "test5@gmail.com";data[1][1] = "Mahmoud";data[1][2] = "Emad";
        data[2][0] = "test6@gmail.com";data[2][1] = "Maraim";data[2][2] = "Emad";
        return data;
    }
    @Test(dataProvider = "data-provider")
    public void testSuccessRegisterFirstPage(String mail, String firstName, String lastName) {

        RegisterPage registerPage = homePage.clickRegisterButton();
        registerPage.getAndSelectGender();
        registerPage.setFirstName(firstName);
        registerPage.setLastName(lastName);
        registerPage.selectDay("6");
        registerPage.selectMonth("June");
        registerPage.selectYear("1998");
        registerPage.setEmail(mail);
        registerPage.setCompany("Test Company");
        registerPage.setPassword("123456");
        registerPage.setConfirmPassword("123456");
        AccountCreatedPage accountCreatedPage = registerPage.clickCreateAccountBtn();
        softAssert.assertTrue(accountCreatedPage.getSuccessMessage().contains("Your registration completed"), "Account Not Created");
        softAssert.assertEquals(accountCreatedPage.getSuccessMessageColor(), "#4cb17c");
        softAssert.assertAll();
    }
}
