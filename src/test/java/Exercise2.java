import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Exercise2 extends BasePage {
    @Test
    public void main() {

        driver.get("http://demoqa.com/frames-and-windows/");
        driver.findElement(By.xpath("//*[@id='tabs-1']/div/p/a")).click();

    }
}
