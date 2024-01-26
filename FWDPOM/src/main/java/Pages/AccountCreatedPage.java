package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;

public class AccountCreatedPage {
    private WebDriver driver;

    public AccountCreatedPage(WebDriver driver) {
        this.driver = driver;
    }
    public String getSuccessMessage(){
        return driver.findElement(By.className("result")).getText();
    }
    public String getSuccessMessageColor(){
        String color1= driver.findElement(By.className("result")).getCssValue("color");
        return Color.fromString(color1).asHex();
    }


}
