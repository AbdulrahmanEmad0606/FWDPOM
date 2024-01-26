package CoreElements;

import org.openqa.selenium.By;

public class RadioButton extends Element{
    public RadioButton(By radioBtn){
        this.setLocator(radioBtn);
    }
    //Actions
    public void radioBtnClick(){
        webDriver.findElement(locator).click();
    }
}
