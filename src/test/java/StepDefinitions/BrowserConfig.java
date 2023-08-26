package StepDefinitions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class BrowserConfig {
    private static final String WEBDRIVER_CHROME_DRIVER = "webdriver.chrome.driver";
    private static final String WEBDRIVER_RELATIVE_PATH = "\\src\\test\\resources\\drivers\\chromedriver.exe";
    public static final String BASE_URL = "https://www.ebay.com/";

    public static WebDriver getIEWebDriver() {
        String projectPath = System.getProperty("user.dir");
        System.setProperty(WEBDRIVER_CHROME_DRIVER, projectPath + WEBDRIVER_RELATIVE_PATH);
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().window().maximize();
        driver.navigate().to(BASE_URL);

        return driver;
    }

    public static void releaseResources(WebDriver driver) {
        if (null != driver) {
            driver.close();
            driver.quit();
        }
    }
}
