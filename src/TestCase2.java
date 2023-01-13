import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

import java.util.List;

public class TestCase2 {
    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();
        driver.get("https://automationexercise.com/");

        String[] headersExpected = {"Home", "Products", "Cart", "Signup / Login", "Test Cases", "API Testing", "Video Tutorials", "Contact us"};
        List<WebElement> headersActual = driver.findElements(By.xpath("(//ul)[1]/li"));

        for (int i = 0; i < headersActual.size(); i++) {
            System.out.println("Expected element - \"" + headersExpected[i] + "\"");
            System.out.println("Actual element - \"" + headersActual.get(i).getText().trim() + "\"");
            System.out.println(headersActual.get(i).isDisplayed() ?
                    "Element IS Displayed" : "Element IS NOT Displayed");
            System.out.println(headersActual.get(i).isEnabled() ?
                        "Element IS Enabled" : "Element IS NOT Enabled");

            System.out.println(headersActual.get(i).getText().trim().equals(headersExpected[i]) ?
                    "Text Validation PASSED\n" : "Text Validation FAILED\n");
        }

        Driver.quitDriver();
    }
}
