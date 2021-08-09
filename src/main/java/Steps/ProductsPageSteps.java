package Steps;

import PageObjects.ProductsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import static java.lang.Thread.sleep;

public class ProductsPageSteps {

    public String baseUrl;
    public WebDriver driver;

    public ProductsPageSteps(String baseUrl, WebDriver driver) {
        this.driver = driver;
        this.baseUrl = baseUrl;
    }

    public void openFirstItemQuickView() {
        ProductsPage productsPage = new ProductsPage(driver);
        Actions builder = new Actions(driver);
        builder.moveToElement(productsPage.getFirstItem()).perform();
        builder.click(productsPage.getFirstItemQuickViewButton()).build().perform();
    }

    public void addFirstItemToCart(){
        ProductsPage productsPage = new ProductsPage(driver);
        Actions builder = new Actions(driver);
        builder.moveToElement(productsPage.getFirstItem()).perform();
        builder.click(productsPage.getAddToCartButton()).build().perform();
    }

    public void continueShoppingAfterAdding(){
        ProductsPage productsPage = new ProductsPage(driver);
        Actions builder = new Actions(driver);
        builder.click(productsPage.getContinueShoppingButton()).build().perform();
    }

}
