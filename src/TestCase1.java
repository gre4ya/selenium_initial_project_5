import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Driver;

public class TestCase1 {
    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();
        driver.get("https://automationexercise.com/");
        System.out.println(driver.findElement(By.cssSelector(".logo img")).isDisplayed() ?
                "Logo Validation PASSED" : "Logo Validation FAILED");
        Driver.quitDriver();
    }
}
