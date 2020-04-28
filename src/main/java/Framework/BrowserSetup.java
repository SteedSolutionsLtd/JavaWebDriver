package Framework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserSetup {

    public static final String CHROME = "chrome";
    public static final String FIREFOX = "firefox";
    public static final String INTERNET_EXPLORER = "ie";

    private BrowserSetup () {}

    public static WebDriver getInstance(String browserName) {

        WebDriver webDriver = null;

        if (CHROME.equals(browserName)) {
            WebDriverManager.chromedriver().setup();
            webDriver = new ChromeDriver();
        }
        else if (FIREFOX.equals(browserName)) {
            //FirefoxDriverManager.getInstance().setup();
            //webDriver = new FirefoxDriver();

        }
        else if (INTERNET_EXPLORER.equals(browserName)) {
            //InternetExplorerDriverManager.getInstance().setup();
            //webDriver = new InternetExplorerDriver();
        }
        else {
            throw new IllegalArgumentException("Unsupported browser");
        }

        return webDriver;
    }
}
