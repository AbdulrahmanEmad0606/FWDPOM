package Pages;

import CoreElements.Driver;
import CoreElements.Element;

public class BasePage {
    protected Driver webDriver;
    public BasePage(Driver webDriver){
        this.webDriver=webDriver;
        Element.setWebDriver(webDriver.getWebDriver());
    }
    // open the user portal
    public void openSite(){
        webDriver.goTo("https://demo.nopcommerce.com/");
        webDriver.maximizeWindow();
    }
}
