import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Exercise13 extends BasePage {
    @Test

    public void main() {

        String URL = "http://www.alten.com/";
        driver.get(URL);
        int count = driver.findElements(By.tagName("a")).size();
        for(int i = 0;i<count ; i++)
        {
            String element = driver.findElements(By.tagName("a")).get(i).getText();
            System.out.println(element);
        }
    }
}
