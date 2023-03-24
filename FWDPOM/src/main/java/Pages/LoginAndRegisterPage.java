package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;

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
    public WebElement getMailFieldLogin(){
        return driver.findElement(By.cssSelector("input[data-qa='login-email']"));
    }
    public WebElement getPassword(){
        return driver.findElement(By.name("password"));
    }
    public WebElement getLoginButton(){
        return driver.findElement(By.cssSelector("button[data-qa='login-button']"));
    }
    public WebElement getErrorMessage(){
        return driver.findElement(By.cssSelector(".login-form p"));
    }
    public String getErrorMessageColor(){
        String color1= driver.findElement(By.cssSelector(".login-form p")).getCssValue("color");
        return color1;
    }
}

