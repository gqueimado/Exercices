import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Exercise9 extends BasePage {
    @Test
    public void main() throws InterruptedException {

        String Url = "http://toolsqa.wpengine.com/automation-practice-form/";
        driver.get(Url);
        Select oSelect = new Select(driver.findElement(By.name("selenium_commands")));
        oSelect.selectByIndex(0);
        Thread.sleep(4000);
        oSelect.deselectByIndex(0);
        oSelect.selectByVisibleText("Navigation Commands");
        Thread.sleep(4000);
        oSelect.deselectByVisibleText("Navigation Commands");
        List<WebElement> elementCount = oSelect.getOptions();
        int iSize = elementCount.size();
        for(int i =0; i<iSize ; i++){
            oSelect.selectByIndex(i);
            String sValue = elementCount.get(i).getText();
            System.out.println(sValue);
        }
        Thread.sleep(4000);
        oSelect.deselectAll();

    }
}
