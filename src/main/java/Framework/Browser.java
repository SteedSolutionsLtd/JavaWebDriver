package Framework;

import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;

public class Browser {
    private static String baseUrl = "https://www.google.co.uk";
    private static String BrowserName = "chrome";
    private static WebDriver webDriver;

    public static void Initialize()
    {
        webDriver = BrowserSetup.getInstance(BrowserName);
        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        goTo(baseUrl);
    }

    public static String getTitle()
    {
        return webDriver.getTitle();
    }

    public static WebDriver Driver()
    {
        return webDriver;
    }

    public static void goTo(String url)
    {
        webDriver.get(url);
    }

    public static void close()
    {
        webDriver.close();
    }
}
