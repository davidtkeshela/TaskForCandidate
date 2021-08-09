package Steps;

import PageObjects.MainPage;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import static java.lang.Thread.sleep;

public class MainPageSteps{

    public String baseUrl;
    public WebDriver driver;

    public MainPageSteps(String baseUrl, WebDriver driver) {
        this.driver = driver;
        this.baseUrl = baseUrl;
    }

    public void openTShirtsPage() {
        driver.get(baseUrl);
        MainPage mainPage = new MainPage(driver);
        Actions builder = new Actions(driver);
        builder.moveToElement(mainPage.getWomensCategory()).perform();
        builder.click(mainPage.getWomensTshirtsButton()).build().perform();
    }

    public void openCasualDressesPage() {
        driver.get(baseUrl);
        MainPage mainPage = new MainPage(driver);
        Actions builder = new Actions(driver);
        builder.moveToElement(mainPage.getDressesCategory()).perform();
        builder.click(mainPage.getCasualDressesButton()).build().perform();
    }

    public void moveToCarTAndCheckout() {
        MainPage mainPage = new MainPage(driver);
        Actions builder = new Actions(driver);
        builder.moveToElement(mainPage.getShoppingCartMenu()).perform();
        builder.click(mainPage.getCheckOutButtomFrmCartMenu()).build().perform();
    }
}
