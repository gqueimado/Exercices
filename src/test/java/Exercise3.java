import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Exercise3 extends BasePage{
    @Test
    public void main() {

        String Url = "http://www.DemoQA.com";
        driver.get(Url);
        driver.findElement(By.xpath("//*[@id='menu-item-374']/a")).click();
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().to(Url);
        driver.navigate().refresh();

    }
}
