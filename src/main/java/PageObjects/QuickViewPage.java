package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class QuickViewPage {

    WebDriver driver;

    public QuickViewPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "bigpic")
    WebElement bigPic;

    @FindBy(id="thumbs_list")
    WebElement smallPicsList;

    public WebElement getBigPic() {
        return bigPic;
    }

//    public List<WebElement> getSmallPicsList() {
//        return smallPicsFrame.findElements(By.tagName("li"));
//    }

    public WebElement getSmallPicsList(){
        return smallPicsList;
    }
}