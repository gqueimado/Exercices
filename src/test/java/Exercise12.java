import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Exercise12 extends BasePage {
    @Test
        public void main() throws InterruptedException {

            String URL = "http://www.dhtmlx.com/docs/products/dhtmlxTree/index.shtml";
            driver.get(URL);
            driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
            WebElement From = driver.findElement(By.xpath("//*[@id='treebox1']/div/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[4]/span"));
            WebElement To = driver.findElement(By.xpath("//*[@id='treebox2']/div/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[4]/span"));
            Actions action = new Actions(driver);
            Action dragDrop = action.dragAndDrop(From, To).build();
            Thread.sleep(3000);
            dragDrop.perform();

     }
    }
