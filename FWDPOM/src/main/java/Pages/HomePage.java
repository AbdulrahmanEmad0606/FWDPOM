package Pages;

import Utils.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends Utils {
    public WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }
     public RegisterPage clickRegisterButton() {
        clickOnButton("Register");
        return new RegisterPage(driver);
    }
    public LoginPage clickLoginButton(){
        clickOnButton("Log in");
        return new LoginPage(driver);
    }
    public String getMyAccountTab(){
        return driver.findElement(By.linkText("My account")).getText();
    }
    private WebElement getEuroOption(){
        return driver.findElement(By.id("customerCurrency"));
    }
    public void SelectEuro(){
        selectOptions(getEuroOption(),"Euro");
    }
    private List<WebElement> getProducts(){
         return driver.findElements(By.className("prices"));
    }
    public boolean checkEuro(){
        for (int i=0;i<getProducts().size();i++)
            return getProducts().get(i).getText().contains("€");
        return false;
        }
}
