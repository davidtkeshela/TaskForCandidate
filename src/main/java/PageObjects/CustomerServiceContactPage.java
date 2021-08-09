package PageObjects;

import Common.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class CustomerServiceContactPage {
    WebDriver driver;

    public CustomerServiceContactPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getHeadingSelector() {
        return Helper.waitForElementPresence(driver, By.id("id_contact"));
    }

    public WebElement getOrderReferenceSelector() {
        return Helper.waitForElementPresence(driver, By.name("id_order"));
    }

    public WebElement getProductSelector() {
        return Helper.waitForElementPresence(driver, By.name("id_product"));
    }

    public WebElement getMessageField() {
        return Helper.waitForElementPresence(driver, By.id("message"));
    }

    public WebElement getSendButton() {
        return Helper.waitToBeClickable(driver, By.xpath("//button[@type=\"submit\"]/span[contains(text(), \"Send\")]"));
    }

}
