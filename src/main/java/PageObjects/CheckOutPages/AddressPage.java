package PageObjects.CheckOutPages;

import Common.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class AddressPage {
    WebDriver driver;

    public AddressPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getProccedToChekoutButton() {
        return Helper.waitToBeClickable(driver, By.xpath("//button[@type=\"submit\"]/span[contains(text(), \"Proceed to checkout\")]"));
    }
}
