package driver;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    // Enum to define supported browsers
    public enum BrowserType {
        FIREFOX,
        CHROME
        // Add more browsers if needed
    }

    // Get the WebDriver instance based on the browser type
    public static WebDriver getDriver() {
        if (driver.get() == null) {
            BrowserType browserType = BrowserType.FIREFOX; // You can modify this to get the desired browser type

            switch (browserType) {
                case FIREFOX:
                    WebDriverManager.firefoxdriver().setup();
                    driver.set(new FirefoxDriver());
                    break;
                case CHROME:
                    WebDriverManager.chromedriver().setup();
                    driver.set(new ChromeDriver());
                    break;
                // Add more cases for other browsers if needed
                default:
                    throw new IllegalStateException("Unexpected value: " + browserType);
            }

            // Optional: Maximize the browser window upon initialization
            driver.get().manage().window().maximize();
        }
        return driver.get();
    }

    // Quit the WebDriver and close the browser
    public static void quitDriver() {
        if (driver.get() != null) {
            driver.get().quit();
            driver.remove();
        }
    }
}