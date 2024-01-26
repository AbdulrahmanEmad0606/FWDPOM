package Pages;

import CoreElements.*;
import org.openqa.selenium.By;

public class RegisterPage extends BasePage {

    public RegisterPage(Driver webDriver) {
        super(webDriver);
    }

    /** RegisterPage locators **/
    DropDown dropDown=new DropDown(webDriver.getWebDriver());
    RadioButton gender=new RadioButton(By.id("gender-male"));
    TextBox firstName=new TextBox(By.id("FirstName"));
    TextBox lastName=new TextBox(By.id("LastName"));
    TextBox filledEmail=new TextBox(By.id("Email"));
    TextBox filledCompany=new TextBox(By.id("Company"));
    CheckBox checkedNewsLetter=new CheckBox(By.id("Newsletter"));
    TextBox filledPassword=new TextBox(By.id("Password"));
    TextBox filledConfirmPassword=new TextBox(By.id("ConfirmPassword"));
    Button registerBtn=new Button(By.id("register-button"));



    public AccountCreatedPage setData
            (String fName,String lName,String day,String month,String year,String email,String company,String password,String confirmPassword){
        gender.radioBtnClick();
        firstName.typeText(fName);
        lastName.typeText(lName);
        dropDown.selectDay("1");
        dropDown.selectMonth("June");
        dropDown.selectYear("1998");
        filledEmail.typeText(email);
        filledCompany.typeText(company);
        checkedNewsLetter.click();
        filledPassword.typeText(password);
        filledConfirmPassword.typeText(confirmPassword);
        registerBtn.click();
        return new AccountCreatedPage(webDriver.getWebDriver());
    }

    /*
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
*/
}
