package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SignUpPage {
    private WebDriver driver;

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
    }
    public void getAndSelectGender(){
        driver.findElement(By.id("id_gender2")).click();
    }
    private WebElement getPasswordFiled(){
        return driver.findElement(By.id("password"));
    }
    public void setPassword(String password){
        getPasswordFiled().sendKeys(password);
    }
    private WebElement getDaysDropDown() {
        return driver.findElement(By.id("days"));
    }
    private WebElement getMonthsDropDown() {
        return driver.findElement(By.id("months"));
    }
    private WebElement getYearsDropDown() {
        return driver.findElement(By.id("years"));
    }
    public void selectDay(String day){
        Select Days=new Select(getDaysDropDown());
        Days.selectByVisibleText(day);
    }
    public void selectMonth(String month){
        Select months=new Select(getMonthsDropDown());
        months.selectByVisibleText(month);
    }
    public void selectYear(String year){
        Select years=new Select(getYearsDropDown());
        years.selectByVisibleText(year);
    }
    private WebElement getAddressFirstName(){
        return driver.findElement(By.id("first_name"));
    }
    public void setAddressFirstName(String fName){
        getAddressFirstName().sendKeys(fName);
    }
    private WebElement getAddressLastName(){
       return driver.findElement(By.id("last_name"));
    }
    public void setAddressLastName(String lName){
        getAddressLastName().sendKeys(lName);
    }
    private WebElement getAddress(){
        return driver.findElement(By.id("address1"));
    }
    public void setAddress(String address1){
      getAddress().sendKeys(address1);
    }
    private WebElement getAddress2(){
        return driver.findElement(By.id("address2"));
    }
    public void setAddress2(String address2){
        getAddress2().sendKeys(address2);
    }
    private WebElement getCompanyName(){
        return driver.findElement(By.id("company"));
    }
    public void setCompanyName(String company){
        getCompanyName().sendKeys(company);
    }
    private WebElement getCountriesDropDown() {
        return driver.findElement(By.id("country"));
    }
    public void selectCountry(String country){
        Select Countries=new Select(getCountriesDropDown());
        Countries.selectByVisibleText(country);
    }

    private WebElement getStat(){
        return driver.findElement(By.id("state"));
    }
    public void setState(String state){
        getStat().sendKeys(state);
    }
    private WebElement getCity(){
        return driver.findElement(By.id("city"));
    }
    public void setCity(String city){
        getCity().sendKeys(city);
    }
    private WebElement getZipcode(){
        return driver.findElement(By.id("zipcode"));
    }
    public void setZipCode(String zipcode){
        getZipcode().sendKeys(zipcode);
    }

    private WebElement getMobileNumber(){
        return driver.findElement(By.id("mobile_number"));
    }
    public void setMobileNumber(String mobile_number){
        getMobileNumber().sendKeys(mobile_number);
    }
    public AccountCreatedPage clickCreateAccountBtn(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", driver.findElement(By.cssSelector("button[type='submit']")));
        return new AccountCreatedPage(driver);
    }
}
