import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestClassConfig {

    public String baseUrl = "http://automationpractice.com/index.php";
    public static WebDriver driver;

    @BeforeClass
    public static void setUp(){
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
    }

    @AfterClass
    public static void tearDown(){
        driver.quit();
    }
}
