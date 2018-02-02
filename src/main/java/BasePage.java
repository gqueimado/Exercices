import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasePage {
    public static WebDriver driver;

    @BeforeClass
    public static void before() {

        System.setProperty("webdriver.gecko.driver","C:\\Users\\Goncalo\\Desktop\\drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }

    @AfterClass
    public static void after() { driver.close(); }

}
