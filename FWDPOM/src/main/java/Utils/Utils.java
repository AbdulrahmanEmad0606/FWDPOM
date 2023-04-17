package Utils;

import org.bouncycastle.util.Arrays;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

public class Utils  {
    // wait till item appears
private WebDriver driver;
    public void waitTillVisibility(By el) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(el));
    }
    public void selectOptions(WebElement el,String txt) {
        Select option = new Select(el);
        option.selectByVisibleText(txt);
    }
    public void clickOnButton(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }
    
}
