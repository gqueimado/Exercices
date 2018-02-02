import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Exercise10 extends BasePage {
    @Test
    public void main() {

        String Url = "http://toolsqa.wpengine.com/automation-practice-table/";
        driver.get(Url);
        String Dubai = driver.findElement(By.xpath("//*[@id=\"content\"]/table/tbody/tr[1]/td[2]")).getText();
        System.out.println(Dubai);
        WebElement Details = driver.findElement(By.xpath("//*[@id=\"content\"]/table/tbody/tr[1]/td[6]/a"));
        System.out.println(Details);
        Details.click();

    }
}
