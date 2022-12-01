package browsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class CromeOptionsExamples {

    public static void main(String[] args) {
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--disable-notifications");//Disable browser notifications
        options.addArguments("--incognito");//opeb browser in private window
        options.addArguments("--headless");//open headless browser(this runs in backend)
        String baseUrl = "https://courses.letskodeit.com/practice";

        System.setProperty(" webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(options);
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        System.out.println("Page Title = "+driver.getTitle());



    }
}
