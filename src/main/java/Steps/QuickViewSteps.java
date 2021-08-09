package Steps;

import PageObjects.QuickViewPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class QuickViewSteps {

    public String baseUrl;
    public WebDriver driver;

    public QuickViewSteps(String baseUrl, WebDriver driver) {
        this.driver = driver;
        this.baseUrl = baseUrl;
    }

    public void hoverOverEachSmallPic() {
        QuickViewPage quickViewPage = new QuickViewPage(driver);
        Actions builder = new Actions(driver);
        WebElement quickView = driver.switchTo().activeElement();
        WebElement smallPicsDiv = quickView.findElement(By.id("thumbs_list"));
//        WebElement smallPicsDiv = quickViewPage.getSmallPicsList();
        List<WebElement> smallPicsList = smallPicsDiv.findElements(By.xpath("//*[contains(@id, thumbnail)]"));
//        List<WebElement> smallPicsList = quickViewPage.getSmallPicsList();
        int i = 0;
        for (WebElement smallPic:smallPicsList) {
//            smallPic.getAttribute("")
            i++;
        }
    }
}
