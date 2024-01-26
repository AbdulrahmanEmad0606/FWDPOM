package CoreElements;

import org.openqa.selenium.By;

public class Label extends Element{
    //constructor
    public Label(By label){
        this.setLocator(label);
    }

}
