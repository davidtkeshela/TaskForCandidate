package Steps;

import PageObjects.CheckOutPages.*;
import PageObjects.MainPage;
import PageObjects.ProductsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class CheckOutSteps {

    public WebDriver driver;

    public CheckOutSteps(WebDriver driver) {
        this.driver = driver;
    }

    public List<WebElement> getProductsFromCheckOutDT() {
        ShoppingCartSummaryPage summaryPage = new ShoppingCartSummaryPage(driver);
        return summaryPage.getCartProductsFromDT();
    }

    public boolean getProductDesctription(int productPosition, String productDescription){
        ShoppingCartSummaryPage summaryPage = new ShoppingCartSummaryPage(driver);
        return summaryPage.getProductDescriptionFromDT(productPosition).getAttribute("innerText").contains(productDescription);
    }

    public void proceedToCheckout(){
        ShoppingCartSummaryPage summaryPage = new ShoppingCartSummaryPage(driver);
        Actions builder = new Actions(driver);
        builder.click(summaryPage.getProccedToChekoutButton()).build().perform();
    }

    public void proccedToCreateAccount(String email){
        SignInPage signInPage = new SignInPage(driver);
        WebElement emailField = signInPage.getEmailInputField();
        emailField.sendKeys(email);
        Actions builder = new Actions(driver);
        builder.click(signInPage.getCreateAccountButton()).build().perform();
    }

    public void createAnAccount(){
        SignInPage signInPage = new SignInPage(driver);

        WebElement mr = signInPage.getMr();
        mr.click();

        WebElement firstNameField = signInPage.getFirstNameField();
        firstNameField.sendKeys("firstName");

        WebElement lastNameField = signInPage.getLastNameField();
        lastNameField.sendKeys("lastName");

        WebElement passwordField = signInPage.getPasswordField();
        passwordField.sendKeys("password");

        WebElement dateOfBirthDaySelector = signInPage.getDateOfBirthDaySelector();
        new Select(dateOfBirthDaySelector).selectByValue("1");

        WebElement dateOfBirthMonthSelector = signInPage.getDateOfBirthMonthSelector();
        new Select(dateOfBirthMonthSelector).selectByValue("2");

        WebElement dateOfBirthYearSelector = signInPage.getDateOfBirthYearSelector();
        new Select(dateOfBirthYearSelector).selectByValue("2000");

        WebElement addressFirstNameField = signInPage.getAddressFirstNameField();
        addressFirstNameField.sendKeys("firstName");

        WebElement addressLastNameField = signInPage.getAddressLastNameField();
        addressLastNameField.sendKeys("lastName");

        WebElement companyField = signInPage.getCompanyField();
        companyField.sendKeys("company");

        WebElement addressField = signInPage.getAddressField();
        addressField.sendKeys("addressfield");

        WebElement addressField2 = signInPage.getAddressField2();
        addressField2.sendKeys("addressField2");

        WebElement cityField = signInPage.getCityField();
        cityField.sendKeys("cityField");

        WebElement stateSelector = signInPage.getStateSelector();
        new Select(stateSelector).selectByVisibleText("Alabama");

        WebElement zipCodeField = signInPage.getZipCodeField();
        zipCodeField.sendKeys("12345");

        WebElement countrySelector = signInPage.getCountrySelector();
        new Select(countrySelector).selectByVisibleText("United States");

        WebElement additionalInfoField = signInPage.getAdditionalInfoField();
        additionalInfoField.sendKeys("additionalInfoField");

        WebElement homePhoneField = signInPage.getHomePhoneField();
        homePhoneField.sendKeys("123454321");

        WebElement mobilePhoneField = signInPage.getMobilePhoneField();
        mobilePhoneField.sendKeys("123454321");

        WebElement additionalAddressField = signInPage.getAdditionalAddressField();
        additionalAddressField.sendKeys("additionalAddressField");

        Actions builder = new Actions(driver);
        builder.click(signInPage.getRegisterBtn()).build().perform();
    }

    public void proceedToShippingFromAddress(){
        AddressPage addressPage = new AddressPage(driver);
        addressPage.getProccedToChekoutButton().click();
//        Actions builder = new Actions(driver);
//        builder.click(addressPage.getProccedToChekoutButton()).build().perform();
    }

    public void proceedToPaymenFromShippin(){
        ShippingTermsPage shippingTermsPage = new ShippingTermsPage(driver);
        shippingTermsPage.getProccedToChekoutButton().click();
    }

    public void closeAgreeOnTermsDialogBox(){
        ShippingTermsPage shippingTermsPage = new ShippingTermsPage(driver);
        Actions builder = new Actions(driver);
        builder.moveToElement(shippingTermsPage.getDialogBoxClose()).perform();
        builder.click(shippingTermsPage.getDialogBoxClose()).build().perform();
    }

    public void agreeOnShippingTermsAndProccedToPayment(){
        ShippingTermsPage shippingTermsPage = new ShippingTermsPage(driver);
        shippingTermsPage.getAcceptTermsCheck().click();
    }

    public boolean agreeOnTermsDialogIsDisplayed(){
        ShippingTermsPage shippingTermsPage = new ShippingTermsPage(driver);
        return shippingTermsPage.getDialogBoxClose().isDisplayed();
    }

    public void payByCheck(){
        PaymentPage paymentPage = new PaymentPage(driver);
        paymentPage.getPayByCheckButton().click();
    }

    public void confirmOrder(){
        PaymentPage paymentPage = new PaymentPage(driver);
        paymentPage.getConfirmOrderButton().click();
    }

    public void proceedToCustomerService(){
        PaymentPage paymentPage = new PaymentPage(driver);
        paymentPage.getCustomerServiseRef().click();
    }
}
