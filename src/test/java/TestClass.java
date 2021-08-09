import Steps.*;
import org.junit.Test;
import org.testng.Assert;

public class TestClass extends TestClassConfig{

    public MainPageSteps mainPageSteps;
    public ProductsPageSteps productsPageSteps;
    public QuickViewSteps quickViewSteps;
    public CheckOutSteps checkOutSteps;
    public CustomerServiceContactSteps customerServiceContactSteps;

    public TestClass() {
        this.mainPageSteps = new MainPageSteps(baseUrl, driver);
        this.productsPageSteps = new ProductsPageSteps(baseUrl, driver);
        this.quickViewSteps = new QuickViewSteps(baseUrl, driver);
        this.checkOutSteps = new CheckOutSteps(driver);
        this.customerServiceContactSteps = new CustomerServiceContactSteps(driver);
    }

    @Test
    public void orderAndCheckoutFlow(){
        addWomensTshirtToCart();
        addCasualDressToCart();
        moveToCartAndCheck();
        checkOutFlow();
    }

    public void addWomensTshirtToCart() {
        mainPageSteps.openTShirtsPage();
        productsPageSteps.openFirstItemQuickView();
//        quickViewSteps.hoverOverEachSmallPic(); TODO
    }

    public void addCasualDressToCart() {
        mainPageSteps.openCasualDressesPage();
        productsPageSteps.addFirstItemToCart();
        productsPageSteps.continueShoppingAfterAdding();
    }

    public void moveToCartAndCheck() {
        mainPageSteps.moveToCarTAndCheckout();
        Assert.assertEquals(checkOutSteps.getProductsFromCheckOutDT().size(), 1);
//        Assert.assertEquals(checkOutSteps.getProductDesctription(1, "shirt"), true);
        Assert.assertEquals(checkOutSteps.getProductDesctription(1, "Dress"), true);
    }

    public void checkOutFlow(){
        checkOutSteps.proceedToCheckout();
        checkOutSteps.proccedToCreateAccount("email!!!12221@gmail.com");
        checkOutSteps.createAnAccount();
        checkOutSteps.proceedToShippingFromAddress();
        checkOutSteps.proceedToPaymenFromShippin();
        if (checkOutSteps.agreeOnTermsDialogIsDisplayed()){
            checkOutSteps.closeAgreeOnTermsDialogBox();
            checkOutSteps.agreeOnShippingTermsAndProccedToPayment();
            checkOutSteps.proceedToPaymenFromShippin();
        }

        checkOutSteps.payByCheck();
        checkOutSteps.confirmOrder();
        checkOutSteps.proceedToCustomerService();

        customerServiceContactSteps.sendMessageToCustomerService();
    }

}
