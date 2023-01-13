import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

public class TestCase4 {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();
        driver.get("https://automationexercise.com/");

        WebElement copyrightFooter = driver.findElement(By.cssSelector(".footer-bottom p"));
        System.out.println(copyrightFooter.isDisplayed() ?
                "Copyright footer IS Displayed" : "Copyright footer IS NOT Displayed");

        System.out.println("Copyright footer text is - \"" + copyrightFooter.getText() + "\"");

        System.out.println(copyrightFooter.getText().equals("Copyright © 2021 All rights reserved") ?
                "Copyright footer Verification PASSED" : "Copyright footer Verification FAILED");

        Driver.quitDriver();
    }
}
