package CoreElements;

import org.openqa.selenium.By;

public class CheckBox extends Element{
    public CheckBox(By checkBox){
        this.setLocator(checkBox);
    }
    //Actions
    public void click(){
        webDriver.findElement(locator).click();
    }
}
