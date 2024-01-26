package CoreElements;

import org.openqa.selenium.By;

public class TextBox extends Element{
    // constructor
    public TextBox(By typedElement) {
        this.setLocator(typedElement);
    }
    // Type method
    public void typeText(String txt){
        // wait
        webDriver.findElement(locator).sendKeys(txt);
    }
}
