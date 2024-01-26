
import com.shaft.driver.DriverFactory;
import com.shaft.enums.internal.ElementAction;
import com.shaft.gui.browser.BrowserActions;
import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Test1 {
    @Test
    public void testFirst() {
        // setUp the web driver by default chromedriver
        WebDriver driver= DriverFactory.getDriver();
        BrowserActions.navigateToURL(driver,"https://www.phptravels.net/");
        new ElementActions().click(By.id("ACCOUNT"));
        ElementActions.click(driver,By.linkText("Custom er Signup"));
        ElementActions.type(driver,By.name("first_name"),"Abdulrahman");
        ElementActions.type(driver,By.name("last_name"),"Emad");
        ElementActions.type(driver,By.name("phone"),"01007943090");
        ElementActions.type(driver,By.name("email"),"test@gmail.com");
        ElementActions.type(driver,By.name("password"),"123456");

        ElementActions.click(driver,By.id("button"));



    }
}
