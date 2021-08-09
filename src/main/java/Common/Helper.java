package Common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Helper {

    public static WebElement waitToBeClickable(WebDriver driver, By selector) {
        return (new WebDriverWait(driver, 15)).until(ExpectedConditions.elementToBeClickable(selector));
    }

    public static WebElement waitForElementPresence(WebDriver driver, By selector) {
        return (new WebDriverWait(driver, 15)).until(ExpectedConditions.presenceOfElementLocated(selector));
    }

}
