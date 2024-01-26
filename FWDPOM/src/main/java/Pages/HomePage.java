package Pages;
import CoreElements.*;
import org.openqa.selenium.By;

public class HomePage extends BasePage {

    public HomePage(Driver webDriver) {
        super(webDriver);
    }

    /**
     * HomePage locators
     **/
    Link signUpLink = new Link(By.cssSelector(".header-links ul li:nth-child(1)"));
    Link loginLink = new Link(By.cssSelector(".header-links ul li:nth-child(2)"));
    Link account = new Link(By.linkText("My account"));
    TextBox searchField = new TextBox(By.id("small-searchterms"));
    Button searchButton = new Button(By.className("search-box-button"));
    Link product = new Link(By.linkText("Build your own computer"));
    Link facebook = new Link(By.className("facebook"));
    Link twitter = new Link(By.className("twitter"));
    Link youtube = new Link(By.className("youtube"));


    /******************************************************************************************************/

    /** Homepage Actions **/

    /**
     * Navigate to SignUp Page
     **/
    public RegisterPage clickRegisterButton() {
       // signUpLink.waitExplicitly((By.cssSelector(".header-links ul li:nth-child(1)")));
        signUpLink.click();
        return new RegisterPage(webDriver);
    }

    /**
     * Navigate to Login Page
     **/
    public LoginPage clickLoginButton() {
        loginLink.click();
        return new LoginPage(webDriver.getWebDriver());
    }

    /**
     * get linkText
     **/
    public String getMyAccountTab() {
        return account.getText();
    }
}

//
//    /*************** Currencies Feature *******************/
//    private WebElement getEuroOption() {
//        return webDriver.getWebDriver().findElement(By.id("customerCurrency"));
//    }
//
//    public void SelectEuro() {
//        //selectOptions(getEuroOption(), "Euro");
//    }
//
//    private List<WebElement> getProducts() {
//        return driver.findElements(By.className("prices"));
//    }
//
//    public boolean checkEuro() {
//        for (int i = 0; i < getProducts().size(); i++)
//            return getProducts().get(i).getText().contains("€");
//        return false;
//    }
//
//    /*************** Hover Categories Feature *******************/
//    // get the three main categories
//    public List<WebElement> getMainCategories() {
//        List<WebElement> mainCategories = driver.findElements(By.xpath("//ul[contains(@class,'notmobile')]/li/a"));
//        return mainCategories;
//    }
//
//    public List<WebElement> getSupCategories() {
//        List<WebElement> subCategories = driver.findElements(By.xpath("//ul[contains(@class, 'sublist')]/li/a"));
//        return subCategories;
//    }
//
//    /**************** Home Slider Feature *******************/
//    public WebElement getNokiaSlider() {
//        return driver.findElement(By.xpath("//div[@id='nivo-slider']/a[1]"));
//    }
//
//    public boolean validatePageUrl(String url) {
//        String currentUrl = driver.getCurrentUrl().toLowerCase();
//        String validUrl = url.toLowerCase();
//        boolean Sverify = false;
//        if (currentUrl.equals(validUrl)) {
//            Sverify = true;
//        }
//        return Sverify;
//    }
//
//    public WebElement getIphoneSlider() {
//        WebElement iphoneSlider = driver.findElement(By.xpath("//*[@id='nivo-slider']/a[1]"));
//        return iphoneSlider;
//    }
//
//    /*************** Follow Us Feature ****************/
//    public WebElement getFacebookIcon() {
//        return driver.findElement(By.className("facebook"));
//    }
//
//    public boolean switchToNewTabForFacebook() {
//        switchToNewTab();
//        boolean Sverify = false;
//        System.out.println(driver.getCurrentUrl());
//        if (driver.getCurrentUrl().equals("https://www.facebook.com/nopCommerce")) {
//            Sverify = true;
//        }
//        switchToFirstTab();
//        return Sverify;
//    }
//
//    public WebElement getTwitterIcon() {
//        return driver.findElement(By.className("twitter"));
//    }
//
//    public boolean switchToNewTabForTwitter() {
//        switchToNewTab();
//        boolean Sverify = false;
//        System.out.println(driver.getCurrentUrl());
//        if (driver.getCurrentUrl().equals("https://twitter.com/nopCommerce")) {
//            Sverify = true;
//        }
//        switchToFirstTab();
//        return Sverify;
//    }
//
//    public WebElement getRssIcon() {
//        return driver.findElement(By.className("rss"));
//    }
//
//    public boolean switchToNewTabForRss() {
//        switchToNewTab();
//        boolean Sverify = false;
//        System.out.println(driver.getCurrentUrl());
//        if (driver.getCurrentUrl().equals("https://www.rss.com/nopCommerce")) {
//            Sverify = true;
//        }
//        switchToFirstTab();
//        return Sverify;
//    }
//
//    public WebElement getYoutubeIcon() {
//        return driver.findElement(By.className("youtube"));
//    }
//
//    public boolean switchToNewTabForYoutube() {
//        switchToNewTab();
//        boolean Sverify = false;
//        System.out.println(driver.getCurrentUrl());
//        if (driver.getCurrentUrl().equals("https://www.youtube.com/user/nopCommerce")) {
//            Sverify = true;
//        }
//        switchToFirstTab();
//        return Sverify;
//    }
//
//    public void switchToNewTab() {
//        String mainWindowHandle = driver.getWindowHandle();
//        Set<String> allWindowHandles = driver.getWindowHandles();
//        Iterator<String> iterator = allWindowHandles.iterator();
//        while (iterator.hasNext()) {
//            String ChildWindow = iterator.next();
//            if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
//                driver.switchTo().window(ChildWindow);
//            }
//        }
//    }
//
//    public void switchToFirstTab() {
//        String currentWindowHandle = driver.getWindowHandle();
//        Set<String> windowHandles = driver.getWindowHandles();
//        for (String windowHandle : windowHandles) {
//            if (windowHandle.equals(currentWindowHandle)) {
//                continue; // Skip the current window
//            }
//            driver.switchTo().window(windowHandle);
//            break;
//        }
//
//    }
//    /**************** Wishlist Feature *******************/
//    // get favIcon
//    public WebElement getFavIcon(){
//        return driver.findElement(By.xpath("//div[contains(@class,'buttons')]/button[3]"));
//    }
//    public boolean checkUrlForWishList(){
//        String currentUrl= driver.getCurrentUrl();
//        boolean validation = false;
//        if(currentUrl.equals("https://demo.nopcommerce.com/build-your-own-computer")){
//            validation=true;
//        }
//        return validation;
//    }
//}
