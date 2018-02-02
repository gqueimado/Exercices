import org.junit.Test;
import org.openqa.selenium.By;

public class Exercise11 extends BasePage {
    @Test
    public void main() {
        String Url = "http://toolsqa.wpengine.com/automation-practice-table/";
        driver.get(Url);
        String sRow = "1";
        String sCol = "2";
        String Dubai = driver.findElement(By.xpath("//*[@id=\"content\"]/table/tbody/tr[" + sRow + "]/td[" + sCol + "]")).getText();
        System.out.println(Dubai);

        //Print all the column values of row ‘Clock Tower Hotel’

        String sColValue = "Clock Tower Hotel";

        for (int i = 1; i <= 5; i++) {

            String Values = null;
            Values = driver.findElement(By.xpath("//*[@id=\"content\"]/table/tbody/tr[" + i + "]/th")).getText();
            if (Values.equalsIgnoreCase(sColValue)) {
                // If the sValue match with the description, it will initiate one more inner loop for all the columns of 'i' row
                for (int j = 1; j <= 5; j++) {
                    String sRowValue = driver.findElement(By.xpath("//*[@id=\"content\"]/table/tbody/tr[" + i + "]/td[" + j + "]")).getText();
                    System.out.println(sRowValue);
                }
                break;
            }
        }

    }
}

