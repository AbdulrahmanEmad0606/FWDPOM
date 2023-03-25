package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {
    private WebDriver driver;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    public void getAndSelectGender() {
        driver.findElement(By.id("gender-male")).click();
    }

    private WebElement getFirstName() {
        return driver.findElement(By.id("FirstName"));
    }

    public void setFirstName(String fName) {
        getFirstName().sendKeys(fName);
    }

    private WebElement getLastName() {
        return driver.findElement(By.id("LastName"));
    }

    public void setLastName(String lName) {
        getLastName().sendKeys(lName);
    }

    private WebElement getDaysDropDown() {
        return driver.findElement(By.name("DateOfBirthDay"));
    }

    private WebElement getMonthsDropDown() {
        return driver.findElement(By.name("DateOfBirthMonth"));
    }

    private WebElement getYearsDropDown() {
        return driver.findElement(By.name("DateOfBirthYear"));
    }

    public void selectDay(String day) {
        Select Days = new Select(getDaysDropDown());
        Days.selectByVisibleText(day);
    }

    public void selectMonth(String month) {
        Select months = new Select(getMonthsDropDown());
        months.selectByVisibleText(month);
    }

    public void selectYear(String year) {
        Select years = new Select(getYearsDropDown());
        years.selectByVisibleText(year);
    }

    private WebElement getEmail() {
        return driver.findElement(By.id("Email"));
    }

    public void setEmail(String email) {
        getEmail().sendKeys(email);
    }

    private WebElement getCompany() {
        return driver.findElement(By.id("Company"));
    }

    public void setCompany(String address1) {
        getCompany().sendKeys(address1);
    }

    private WebElement getPasswordFiled() {
        return driver.findElement(By.id("Password"));
    }

    public void setPassword(String password) {
        getPasswordFiled().sendKeys(password);
    }

    private WebElement getConfirmPasswordFiled() {
        return driver.findElement(By.id("ConfirmPassword"));
    }

    public void setConfirmPassword(String confirmPassword) {
        getConfirmPasswordFiled().sendKeys(confirmPassword);
    }

    public AccountCreatedPage clickCreateAccountBtn() {
        driver.findElement(By.id("register-button")).click();
        return new AccountCreatedPage(driver);
    }
}
