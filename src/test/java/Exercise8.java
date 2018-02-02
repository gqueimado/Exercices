import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Exercise8 extends BasePage {
   @Test
    public void main() throws InterruptedException {

        String Url = "http://toolsqa.wpengine.com/automation-practice-form";
        driver.get(Url);

       Select oSelect = new Select(driver.findElement(By.id("continents")));
       oSelect.selectByVisibleText("Africa");
       Thread.sleep(3000);
       oSelect.selectByIndex(1);

       List <WebElement> elementCount = oSelect.getOptions();
       int iSize = elementCount.size();

       for(int i =0; i<iSize ; i++){
           String sValue = elementCount.get(i).getText();
           System.out.println(sValue);
           if (sValue.equals("Africa")) {
               oSelect.selectByIndex(2);
           }
       }


    }
    }
