package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTest {
    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/";
        // System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        System.setProperty(" webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //launch the URL
        driver.get(baseUrl);
        //maximise screen(window)
        driver.manage().window().maximize();
        //we give imlpicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //get the title of the page
        String title = driver.getTitle();
        System.out.println("Page title is : "+title);
        //get current url
       // String title1 = driver.getCurrentUrl();
        System.out.println("Current url is : "+driver.getCurrentUrl());
        //get page source

        System.out.println("Page source  is : "+driver.getPageSource());
     /*  String loginurl="https://demo.nopcommerce.com/login?returnUrl=%2F";
        driver.navigate().to(loginurl);*/

        //navigate to login page by clicking on login link
        WebElement loginLink=driver.findElement(By.linkText("Log in"));
        loginLink.click();




       // driver.findElement(By.id("Email"));
        //find the email field
       WebElement emailField= driver.findElement(By.id("Email"));
       //type the email add for email feild
       emailField.sendKeys("test123@gmail.com");

       //find the password field element
        WebElement passwordField=driver.findElement(By.name("Password"));
       passwordField.sendKeys("test123");

      //close the browser
        driver.quit();

    }

}
