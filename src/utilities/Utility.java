package utilities;

import browsertesting.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Utility extends BaseTest {
    /*This method will click on element
     */
    public void clickOnElement(By by)
    {
        WebElement loginLink = driver.findElement(by);
        loginLink.click();


    }
    public void sendTextToElement(By by,String text){
        WebElement emailField= driver.findElement(by);
        //type the email add for email feild
        emailField.sendKeys(text);
    }
    public String getTextFromElement(By by){
        WebElement actualTextMessageElement=driver.findElement(by);
        return actualTextMessageElement.getText();
    }
    //***************   Alert methods *******
    /**
     * This method will switch to alert
     */

    public void switchToAlert() {
        driver.switchTo().alert();

    }
    //Homework 4 methods acceptAlert,dismissAlert,  String getTextFromAlert, sendTextToAlert(String text)
//**************  select class Meethod

    /**
     * This method will select option by visible text
     *
     */
    public void selectByVisibleTextFromDropDown(By by,String text)
    {
        WebElement dropDown=driver.findElement(by);
        Select select=new Select(dropDown);
        select.selectByValue(text);//select by value
    }
/**
 * This method will select the option by value
 */
public void selectOptionsByValue(By by,String value){
    WebElement option=driver.findElement(by);
    Select select=new Select(option);
    select.selectByValue(value);

}
    /**
     * This method will select the option by index
     */
    public void selectOptionByIndex(By by,int index){
        WebElement option=driver.findElement(by);
        Select select=new Select(option);
        select.selectByIndex(index);
            }

    /**
     * This method will select the option by contains text
     */

public void selectOptionsByContainText(By by,String text){
   // WebElement option=driver.findElement(by);
    List<WebElement> allOption=driver.findElements(by);
    for(WebElement option:allOption){
        System.out.println(option.getText());
        if(option.getText().equals(text)){
            option.click();
            break;

        }
    }

}
    public void verifyMessage(String expectedMessage,String actualMessage) {
        Assert.assertEquals(expectedMessage, actualMessage);

    }
}
