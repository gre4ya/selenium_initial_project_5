import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Driver;
import utils.Waiter;

public class TestCase5 {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();
        driver.get("https://automationexercise.com/");
        Waiter.pause(2);

        driver.findElement(By.xpath("(//ul/li)[5]/a")).click();
        Waiter.pause(2);

        Alert alert = driver.switchTo().alert();
        alert.dismiss();




        System.out.println(driver.getCurrentUrl().equals("https://automationexercise.com/test_cases") ?
                "Validation of navigation PASSED" : "Validation of navigation FAILED");


       // Driver.quitDriver();
    }
}
