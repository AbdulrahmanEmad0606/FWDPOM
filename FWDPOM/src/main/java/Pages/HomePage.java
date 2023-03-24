package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class HomePage {
    public WebDriver driver;

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
    public WebElement getLogoutButtonAndClickOn(){
        driver.get("https://automationexercise.com/");
        List<WebElement> lists = driver.findElements(By.cssSelector("ul li"));
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Logout")));

        System.out.println(lists.get(3).getText());
        return lists.get(3);
    }
}
