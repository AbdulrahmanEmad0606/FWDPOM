package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginAndRegisterPage {
    private WebDriver driver;

    public LoginAndRegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getNameFiled() {
        return driver.findElement(By.name("name"));
    }

    public void setNameFiled(String name) {
        getNameFiled().sendKeys(name);
    }

    public WebElement getMailFieldForRegistration() {
        return driver.findElement(By.cssSelector("input[data-qa='signup-email']"));
    }

    public void setMailFieldForRegistration(String mail) {
        getMailFieldForRegistration().sendKeys(mail);
    }

    public SignUpPage clickSignupBtn() {
        driver.findElement(By.cssSelector("button[data-qa='signup-button']")).click();
        return new SignUpPage(driver);
    }

}
