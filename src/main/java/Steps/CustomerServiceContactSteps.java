package Steps;

import PageObjects.CheckOutPages.ShoppingCartSummaryPage;
import PageObjects.CheckOutPages.SignInPage;
import PageObjects.CustomerServiceContactPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class CustomerServiceContactSteps {
    public WebDriver driver;

    public CustomerServiceContactSteps(org.openqa.selenium.WebDriver driver) {
        this.driver = driver;
    }

    public void sendMessageToCustomerService() {
        CustomerServiceContactPage page = new CustomerServiceContactPage(driver);

        WebElement headingSelector = page.getHeadingSelector();
        new Select(headingSelector).selectByValue("1");

        WebElement orderReferenceSelector = page.getOrderReferenceSelector();
        new Select(orderReferenceSelector).selectByIndex(1);

        WebElement productSelector = page.getProductSelector();
        new Select(productSelector).selectByIndex(1);

        WebElement messageField = page.getMessageField();
        messageField.clear();
        messageField.sendKeys("test message");

        page.getSendButton().click();
    }
}
