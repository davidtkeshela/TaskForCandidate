package PageObjects.CheckOutPages;

import Common.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ShoppingCartSummaryPage {

    WebDriver driver;

    public ShoppingCartSummaryPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public List<WebElement> getCartProductsFromDT() {
        return driver.findElements(By.xpath("//dt"));
//        return Helper.waitForElementPresence(driver, By.xpath("//dt"));
    }

    public WebElement getProductDescriptionFromDT(int productPosition) {
         return Helper.waitForElementPresence(driver, By.xpath("//dt[" + productPosition + "]//div[@class=\"product-name\"]"));
    }

    public WebElement getProccedToChekoutButton() {
        return Helper.waitForElementPresence(driver, By.xpath("//*[@id=\"center_column\"]/p//span[contains(text(), \"Proceed to checkout\")]"));
    }
}
