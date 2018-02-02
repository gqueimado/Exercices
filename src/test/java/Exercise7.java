import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Exercise7 extends BasePage {
    @Test
    public void main() {

        String Url = "http://toolsqa.wpengine.com/automation-practice-form/";
        driver.get(Url);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        List <WebElement> rdBtn_Sex = driver.findElements(By.name("sex"));
        // Create a boolean variable which will hold the value (True/False)
        boolean bValue = false;
        // This statement will return True, in case of first Radio button is selected
        bValue = rdBtn_Sex.get(1).isSelected();
        // This will check that if the bValue is True means if the second radio button is selected
        if(bValue == false){
            // This will select Second radio button, if the first radio button is selected by default
           rdBtn_Sex.get(1).click();
        }else {
            System.out.println("Is already checked");
        }
        WebElement YearsofExperience = driver.findElement(By.id("exp-2"));
        YearsofExperience.click();

        // Find the checkbox or radio button element by Name

        List <WebElement> Control = driver.findElements(By.name("profession"));

        // This will tell you the number of checkboxes are present

        int iSize = Control.size();
        System.out.print(iSize);

        // Start the loop from first checkbox to last checkbox

        for(int i=0; i < iSize ; i++ ){

            // Store the checkbox name to the string variable, using 'Value' attribute

            String sValue = Control.get(i).getAttribute("value");

            //Select the Check Box it the value of the Check Box is same what you are looking for

            if (sValue.equalsIgnoreCase("Automation Tester")){

                Control.get(i).click();

                // This will take the execution out of for loop

                break;
            }
        }

        WebElement oCheckBox = driver.findElement(By.cssSelector("input[value='Selenium IDE']"));
        oCheckBox.click();



    }
}
