package Hover;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
public class HoverTests extends BaseTest {
    @Test
    public void testMainCategories() {
        int max = 2;int min = 0;int max2 = 5;int min2 = 3;int max3 = 8;int min3 = 6;
        int randomMain = (int) (Math.random() * (max - min + 1) + min);
        int randomSub1 = (int) (Math.random() * (max - min + 1) + min);
        int randomSub2 = (int) (Math.random() * (max2 - min2 + 1) + min2);
        int randomSub3 = (int) (Math.random() * (max3 - min3 + 1) + min3);
        WebElement mainCat = homePage.getMainCategories().get(randomMain);
        System.out.println(mainCat.getText());
        if (randomMain == 0) {
            getRandomElement(mainCat, randomSub1);
        } else if (randomMain == 1) {
            getRandomElement(mainCat, randomSub2);
        } else if (randomMain == 2) {
            getRandomElement(mainCat, randomSub3);
        }
    }

    public void getRandomElement(WebElement el, int random) {
        Actions actions = new Actions(homePage.driver);
        actions.moveToElement(el).perform();
        WebElement subCat = homePage.getSupCategories().get(random);
        System.out.println(subCat.getText());
        subCat.click();
    }
}
