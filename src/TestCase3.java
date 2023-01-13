import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

public class TestCase3 {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();
        driver.get("https://automationexercise.com/");

        System.out.println(driver.findElement(By.cssSelector(".col-sm-offset-1 h2")).isDisplayed() ?
                driver.findElement(By.cssSelector(".col-sm-offset-1 h2")).getText() + " IS Displayed\n" :
                driver.findElement(By.cssSelector(".col-sm-offset-1 h2")).getText() + " IS NOT Displayed\n");

        System.out.println(driver.findElement(By.id("susbscribe_email")).isDisplayed() ?
                "Email input box IS Displayed" : "Email input box IS NOT Displayed");
        System.out.println(driver.findElement(
                By.id("susbscribe_email")).getAttribute("placeholder").equals("Your email address") ?
                "Text Validation in placeholder PASSED\n" : "Text Validation in placeholder FAILED\n");

        System.out.println(driver.findElement(By.id("subscribe")).isDisplayed() ?
                "Submit button IS Displayed\n" : "Submit button IS NOT Displayed\n");

        WebElement footerElement = driver.findElement(By.cssSelector(".searchform p"));
        System.out.println(footerElement.isDisplayed() ?
                "Text \"" + footerElement.getText() + "\" IS Displayed" :
                "Text \"" + footerElement.getText() + "\" IS NOT Displayed");

//        System.out.println(footerElement.getText().contains("Get the most recent updates from our site and be updated your self...") ?
//                "Text Validation PASSED" : "Text Validation FAILED");

        Driver.quitDriver();
    }
}
