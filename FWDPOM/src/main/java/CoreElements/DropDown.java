package CoreElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown extends Element {
    public DropDown(WebDriver webDriver) {
        super();
    }

    public void selectDay(String day) {
        Select Days = new Select(webDriver.findElement(By.name("DateOfBirthDay")));
        Days.selectByVisibleText(day);
    }

    public void selectMonth(String month) {
        Select months = new Select(webDriver.findElement(By.name("DateOfBirthMonth")));
        months.selectByVisibleText(month);
    }

    public void selectYear(String year) {
        Select years = new Select(webDriver.findElement(By.name("DateOfBirthYear")));
        years.selectByVisibleText(year);
    }
    public void selectRam(String ram){
        Select years = new Select(webDriver.findElement(By.id("product_attribute_2")));
        years.selectByVisibleText(ram);
    }
    public void selectCountry(String country){
        Select years = new Select(webDriver.findElement(By.id("BillingNewAddress_CountryId")));
        years.selectByVisibleText(country);

    }
}
