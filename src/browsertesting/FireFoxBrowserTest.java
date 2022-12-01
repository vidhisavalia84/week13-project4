package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FireFoxBrowserTest {
    public static void main(String[] args) {
        String baseUrl ="https://demo.nopcommerce.com/login?returnUrl=%2F%22";
        System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get(baseUrl);
        //maximize the screen
        driver.manage().window().maximize();
        //time to load
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //get the current url
        System.out.println(driver.getCurrentUrl());
        //get the page title
        System.out.println(driver.getTitle());
        //get the source
        System.out.println(driver.getPageSource());
        //get the email id
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("Xyz@gmail.com");
        //get the password id
        WebElement passwordField = driver.findElement(By.id("Password"));
        passwordField.sendKeys("Hello01");
        //quit the driver
        driver.quit();
    }

}
