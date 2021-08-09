package PageObjects;

import Common.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductsPage {

    WebDriver driver;

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getFirstItem() {
        return Helper.waitForElementPresence(driver, By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img"));
    }

    public WebElement getFirstItemQuickViewButton(){
        return Helper.waitForElementPresence(driver, By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[2]/span"));
    }

    public WebElement getAddToCartButton() {
        return Helper.waitForElementPresence(driver, By.xpath("//*[@id=\"center_column\"]/ul/li//span[contains(text(), \"Add to cart\")]"));
    }

    public WebElement getContinueShoppingButton() {
        return Helper.waitToBeClickable(driver, By.xpath("//span[@title=\"Continue shopping\"]"));
    }


//    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img")
//    WebElement firstItem;
//
//    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[2]/span")
//    WebElement firstItemQuickView;
//
//    @FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div[2]/ul/li/div/div[2]/div[2]/a[1]/span")
//    WebElement addToCartButton;
//
//    public WebElement getFirstItem() {
//        return firstItem;
//    }
//
//    public void clickFirstItemQuickView(){
//        firstItemQuickView.click();
//    }
//
//    public void clickAddToCartButton(){
//        addToCartButton.click();
//    }
}
