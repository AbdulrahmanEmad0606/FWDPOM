package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchPage {
    private WebDriver driver;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    // get search input
    private WebElement getSearchInput() {
        return driver.findElement(By.id("small-searchterms"));
    }

    public void setSearchInput(String searchVal) {
        getSearchInput().sendKeys(searchVal);
    }

    // get search button
    public WebElement getSearchButton() {
        return driver.findElement(By.className("search-box-button"));
    }

    //get search result
    private List<WebElement> getSearchResult() {
        return driver.findElements(By.cssSelector(".product-title a"));
    }

    // get search result Size
    public void getSearchResultSize() {
        System.out.println("Size of Search Result :" + getSearchResult().size());
    }

    // validate search result
    public boolean ValidateSearchResult(String searchText) {
        List<WebElement> results = getSearchResult();
        boolean x = true;
        for (int i = 0; i < results.size(); i++) {
            System.out.println(results.get(i).getText());
            if (results.get(i).getText().toLowerCase().contains(searchText)) {
                x = true;
            } else {
                x = false;
                break;
            }
            System.out.println(x);
        }
        return x;
        // return false;
    }
}

