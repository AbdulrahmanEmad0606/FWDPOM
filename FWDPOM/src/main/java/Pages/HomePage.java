package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }
     public LoginAndRegisterPage clickLoginButton() {
        clickOnButton("Signup / Login");
        return new LoginAndRegisterPage(driver);
    }
    private void clickOnButton(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }
}
