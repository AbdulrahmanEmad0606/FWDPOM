package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getEmailFiled() {
        return driver.findElement(By.id("Email"));
    }

    public void setMailFiled(String email) {
        getEmailFiled().sendKeys(email);
    }

    public WebElement getPasswordField() {
        return driver.findElement(By.id("Password"));
    }

    public void setPasswordField(String mail) {
        getPasswordField().sendKeys(mail);
    }

    public void getLoginBtn() {
        driver.findElement(By.className("login-button")).click();
    }
    public WebElement getErrorMessage(){
        return driver.findElement(By.className("message-error"));
    }
    public String getErrorMessageColor(){
        String color1= driver.findElement(By.className("message-error")).getCssValue("color");
        return Color.fromString(color1).asHex();
    }
}

