import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Set;

public class Exercise4 extends BasePage {
    @Test
    public void main() {

        String Url = "http://toolsqa.wpengine.com/automation-practice-switch-windows/";
        driver.get(Url);
        String handle = driver.getWindowHandle();
        System.out.println(handle);
        driver.findElement(By.xpath("//button[@onclick='newMsgWin()']")).click();
        Set Handles = driver.getWindowHandles();
        System.out.println(Handles);

        for ( String handle1 : driver.getWindowHandles()) {

            driver.switchTo().window(handle1);


        }
    }
}
