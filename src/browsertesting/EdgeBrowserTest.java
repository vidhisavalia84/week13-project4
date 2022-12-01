package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeBrowserTest {
    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/";
        System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get(baseUrl);
        //maximize the screen
        driver.manage().window().maximize();
        //time out
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //get the title
        System.out.println(driver.getTitle());
        //get the source
        System.out.println(driver.getPageSource());
        //get the current url
        System.out.println(driver.getCurrentUrl());
        //click on login field
        WebElement loginField = driver.findElement(By.linkText("Log in"));
        loginField.click();
        //get the email id
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("xyz@gmail.com");
        //get the password field
        WebElement passwordField = driver.findElement(By.id("Password"));
        passwordField.sendKeys("Welcome123");
        driver.quit();
    }
}
