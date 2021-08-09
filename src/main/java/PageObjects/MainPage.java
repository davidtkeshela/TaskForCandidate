package PageObjects;

import Common.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getWomensCategory() {
        return Helper.waitForElementPresence(driver, By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a"));
    }

    public WebElement getWomensTshirtsButton(){
        return Helper.waitToBeClickable(driver, By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]//a[contains(text(), \"T-shirts\")]"));
    }

    public WebElement getDressesCategory() {
        return Helper.waitForElementPresence(driver, By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a"));

    }

    public WebElement getCasualDressesButton(){
        return Helper.waitToBeClickable(driver, By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]//a[contains(text(), \"Casual Dresses\")]"));
    }

    public WebElement getShoppingCartMenu() {
        return Helper.waitForElementPresence(driver, By.xpath("//b[contains(text(), \"Cart\")]/.."));
    }

    public WebElement getCheckOutButtomFrmCartMenu() {
        return Helper.waitToBeClickable(driver, By.xpath("//a[@id=\"button_order_cart\"]/span[contains(text(), \"Check out\")]"));
    }
}
