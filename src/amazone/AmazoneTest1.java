package amazone;
/*Create a New Java Project with the Name 'amazontest' create BaseTest and TestSuite
and add all jars.
Automate the Following Test.
1. Open the URL https://www.amazon.co.uk/
2. Type "Dell Laptop" in the search box and press enter or click on search
   Button.
3. Click on the checkbox brand dell on the left side.
4. Verify that the  30(May be different) products are displayed on the page.
5. Print all product names in the console.
5. Close the Browser.

This is a real test one of our previous batch students got this test.
*/

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

import java.util.List;

public class AmazoneTest1 extends Utility {

    String baseUrl = "https://www.amazon.co.uk/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void verifyUserCanCheckHowmanyProductsAreDisplayedOnThePage() throws InterruptedException {
        //Type "Dell Laptop" in the search box and press enter or click on search
        //   Button.
        sendTextToElement(By.xpath("//input[@id='twotabsearchtextbox']"), "Dell Laptop");
        //click on search buton
        clickOnElement(By.xpath("//input[@id='nav-search-submit-button']"));
        //click on allow coockies button
        Thread.sleep(5000);
        clickOnElement(By.id("sp-cc-accept"));

        //Click on the checkbox brand dell on the left side.
        clickOnElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/span[1]/div[1]/div[1]/div[1]/div[5]/ul[1]/li[1]/span[1]/a[1]/div[1]/label[1]/i[1]"));
        // Verify that the  30(May be different) products are displayed on the page.
        List<WebElement> allLatop = driver.findElements(By.xpath("//div[@class='a-section aok-relative s-image-fixed-height']"));
        //List<WebElement> allLatop=driver.findElements(By.xpath("//div[@data-component-type='s-search-result']"));//both statement working

        int num = allLatop.size();
        System.out.println(num + " products are displayed on the page");
        //find name of the 24 elements
        List<WebElement> title = driver.findElements(By.xpath("//div[@class='a-section a-spacing-none puis-padding-right-small s-title-instructions-style']"));
        //  Print all product names in the console.
        for (WebElement listOfTitle : title) {
            System.out.println(listOfTitle.getText());
        }
    }

    @After
    public void tearDown() {
        // closeBrowser();
    }


}
