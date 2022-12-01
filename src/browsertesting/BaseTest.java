package browsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {
    public static WebDriver driver;

    public void  openBrowser(String baseUrl){

        System.setProperty(" webdriver.chrome.driver", "drivers/chromedriver.exe");
         driver = new ChromeDriver();
        //launch the URL
        driver.get(baseUrl);
        //maximise screen(window)
        driver.manage().window().maximize();
        //we give imlpicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //get the title of the page

    }
    public void closeBrowser(){
        driver.quit();
    }
}
