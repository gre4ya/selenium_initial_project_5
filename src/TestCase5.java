import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Driver;
import utils.Waiter;

import java.util.concurrent.TimeUnit;

public class TestCase5 {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();
       // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://automationexercise.com/");

        driver.findElement(By.xpath("(//ul/li)[5]/a")).click();
        Waiter.pause(3);

       // driver.findElement(By.xpath("(//ul/li)[5]/a")).click();



        System.out.println(driver.getCurrentUrl().equals("https://automationexercise.com/test_cases") ?
                "Validation of navigation PASSED" : "Validation of navigation FAILED");


        Driver.quitDriver();
    }
}
