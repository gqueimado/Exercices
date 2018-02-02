import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Exercise5 extends BasePage {
    @Test
     public void main() throws InterruptedException {

         String Url = "http://toolsqa.wpengine.com/automation-practice-switch-windows/";
         driver.get(Url);
         driver.findElement(By.id("alert")).click();
         Thread.sleep(5000);
         Alert myAlert = driver.switchTo().alert();
         myAlert.accept();
         Thread.sleep(3000);


     }
}
