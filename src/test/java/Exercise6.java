import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Exercise6 extends BasePage{
    @Test

    public void main() {

        String Url = "http://toolsqa.wpengine.com/automation-practice-switch-windows/";
        driver.get(Url);
        driver.findElement(By.id("timingAlert")).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        Alert myAlert = wait.until(ExpectedConditions.alertIsPresent());
        myAlert.accept();

    }
}
