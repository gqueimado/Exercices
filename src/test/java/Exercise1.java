import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Exercise1 extends BasePage {

    @Test
    public void main() {

        String url = "http://www.store.demoqa.com";
        driver.get(url);
        String Title = driver.getTitle();
        int TitleLenght = driver.getTitle().length();
        System.out.println(Title);
        System.out.println(TitleLenght);
        String Current = driver.getCurrentUrl();

        if (url == Current) {
            System.out.println("Verification Successful - The correct Url is opened.");
        } else {
            System.out.println("Verification Failed - An incorrect Url is opened.");
            //In case of Fail, you like to print the actual and expected URL for the record purpose
            System.out.println("Actual URL is : " + Current);
            System.out.println("Expected URL is : " + url);
        }

        String Page_Source = driver.getPageSource();
        int Page_Source_Lenght = driver.getPageSource().length();
        System.out.println(Page_Source);
        System.out.println("Total Lenght of Page source is " + Page_Source_Lenght);




    }
}
