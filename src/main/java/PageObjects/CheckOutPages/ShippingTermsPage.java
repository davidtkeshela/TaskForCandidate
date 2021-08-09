package PageObjects.CheckOutPages;

import Common.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ShippingTermsPage {
    WebDriver driver;

    public ShippingTermsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getProccedToChekoutButton() {
        return Helper.waitForElementPresence(driver, By.xpath("//button[@type=\"submit\"]/span[contains(text(), \"Proceed to checkout\")]"));
    }

    public WebElement getDialogBox() {
        return Helper.waitForElementPresence(driver, By.xpath("//p[contains(text(), \"You must agree to the terms of service before continuing.\")]"));
    }

    public WebElement getDialogBoxClose() {
        return Helper.waitForElementPresence(driver, By.xpath("//a[@class=\"fancybox-item fancybox-close\"]"));
    }

    public WebElement getAcceptTermsCheck(){
        return Helper.waitForElementPresence(driver, By.id("cgv"));
    }
}
