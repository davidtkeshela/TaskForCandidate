package PageObjects.CheckOutPages;

import Common.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage {
    WebDriver driver;

    public PaymentPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getPayByCheckButton() {
        return Helper.waitToBeClickable(driver, By.xpath("//a[@title=\"Pay by check.\"]"));
    }

    public WebElement getConfirmOrderButton() {
        return Helper.waitToBeClickable(driver, By.xpath("//button[@type=\"submit\"]/span[contains(text(), \"confirm my order\")]"));
    }

    public WebElement getCustomerServiseRef() {
        return Helper.waitToBeClickable(driver, By.xpath("//*[@id=\"center_column\"]/div/a[contains(text(), \"customer service department.\")]"));
    }
}
