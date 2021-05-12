package Algorithms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class BasePage {
    public WebDriver driver;
    public  WebDriverWait wait;




    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver,20);

    }
    //wait wrapper method
    public void  waitVisibility(By elementBy){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));

    }

    //click method
    public void click (By elementBy){
        waitVisibility(elementBy);
        driver.findElement(elementBy).click();
    }
    //is element displayed
    public  void isElementDisplayed (By elementBy){
        waitVisibility(elementBy);
        assertTrue(driver.findElement(elementBy).isDisplayed());
    }
    // Clear method
     public  void clear (By elementBy){
        waitVisibility(elementBy);
        driver.findElement(elementBy).clear();

     }
    // mouseHoverEffect

    public void hover(By elementBy) {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(elementBy)).build().perform();

    }
    //scroll
    public  void scroll (){

         JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,3000)");


    }



}
