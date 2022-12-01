package browsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowserTest {

    static String browser = "edge";
    static String baseUrl = "https://demo.nopcommerce.com/";
    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            driver = new ChromeDriver();
        }else if (browser.equalsIgnoreCase("firefox")){

            driver = new FirefoxDriver();
        }else if (browser.equalsIgnoreCase("edge")){

            driver = new EdgeDriver();
        }else {
            System.out.println("Wrong Browser Name");
        }
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }


}
