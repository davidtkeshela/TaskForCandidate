package PageObjects.CheckOutPages;

import Common.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {

    WebDriver driver;

    public SignInPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getCreateAccountButton(){
//        return Helper.waitToBeClickable(driver, By.xpath("//*[@id=\"center_column\"]/p/span[contains(text(), \"Create an account\")]"));
        return Helper.waitToBeClickable(driver, By.id("SubmitCreate"));

    }

    public WebElement getEmailInputField(){
        return Helper.waitForElementPresence(driver, By.id("email_create"));
    }

    public WebElement getMr() {
        return Helper.waitToBeClickable(driver, By.id("uniform-id_gender1"));
    }

    public WebElement getFirstNameField() {
        return Helper.waitForElementPresence(driver, By.id("customer_firstname"));
    }

    public WebElement getLastNameField() {
        return Helper.waitForElementPresence(driver, By.id("customer_lastname"));
    }

    public WebElement getPasswordField() {
        return Helper.waitForElementPresence(driver, By.id("passwd"));
    }

    public WebElement getDateOfBirthDaySelector() {
        return Helper.waitForElementPresence(driver, By.id("days"));
    }
    
    public WebElement getDateOfBirthMonthSelector() {
        return Helper.waitForElementPresence(driver, By.id("months"));
//        return new Select(monthOfBirth);
    }

    public WebElement getDateOfBirthYearSelector() {
        return Helper.waitForElementPresence(driver, By.id("years"));
    }

    public WebElement getAddressFirstNameField() {
        return Helper.waitForElementPresence(driver, By.id("firstname"));
    }

    public WebElement getAddressLastNameField() {
        return Helper.waitForElementPresence(driver, By.id("lastname"));
    }

    public WebElement getCompanyField() {
        return Helper.waitForElementPresence(driver, By.id("company"));
    }

    public WebElement getAddressField() {
        return Helper.waitForElementPresence(driver, By.id("address1"));
    }

    public WebElement getAddressField2() {
        return Helper.waitForElementPresence(driver, By.name("address2"));
    }

    public WebElement getCityField() {
        return Helper.waitForElementPresence(driver, By.id("city"));
    }

    public WebElement getStateSelector() {
        return Helper.waitForElementPresence(driver, By.id("id_state"));
    }

    public WebElement getZipCodeField() {
        return Helper.waitForElementPresence(driver, By.id("postcode"));
    }

    public WebElement getCountrySelector() {
        return Helper.waitForElementPresence(driver, By.id("id_country"));
    }

    public WebElement getAdditionalInfoField() {
        return Helper.waitForElementPresence(driver, By.id("other"));
    }

    public WebElement getHomePhoneField() {
        return Helper.waitForElementPresence(driver, By.id("phone"));
    }

    public WebElement getMobilePhoneField() {
        return Helper.waitForElementPresence(driver, By.id("phone_mobile"));
    }

    public WebElement getAdditionalAddressField() {
        return Helper.waitForElementPresence(driver, By.id("alias"));
    }

    public WebElement getRegisterBtn() {
        return Helper.waitToBeClickable(driver, By.id("submitAccount"));
    }

}
