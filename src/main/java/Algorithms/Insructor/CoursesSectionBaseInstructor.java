package Algorithms.Insructor;

import Algorithms.BasePage;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.security.PublicKey;
import java.util.List;

public class CoursesSectionBaseInstructor extends BasePage {
    JavascriptExecutor jse = (JavascriptExecutor) driver;
    Actions actions = new Actions(driver);


    String SITE_URl = ("https://largeaccounttest.2leap.com/courses/");

    public CoursesSectionBaseInstructor(WebDriver driver) {
        super(driver);

    }

    public CoursesSectionBaseInstructor goToCourses() {
        driver.get(SITE_URl);
        return this;

    }


    public CoursesSectionBaseInstructor addNewCourse(String AutoCourse, String textBody, String emaill) throws InterruptedException {
        click(By.xpath("//a[@class='mb btn btn-primary']"));
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//h1[text()='Add Course']")));
        driver.findElement(By.xpath("//input[@name='name']")).sendKeys(AutoCourse);
        jse.executeScript("window.scrollBy(0,180)");
        Thread.sleep(3000);
        click(By.xpath("//*[@id=\"add-new-course-form\"]/div/div[1]/div/div[2]/span/span[1]/span/span[2]"));
        Thread.sleep(2000);
        click(By.xpath("//li[@class=\"select2-results__option select2-results__option--highlighted\"]"));
        Thread.sleep(2000);
        List<WebElement> Tusks = driver.findElements(By.xpath("//label[@class='toggle_checkbox']"));
        WebElement q;
        jse.executeScript("window.scrollBy(0,500)");
        for (int i = 1; i < 6; i++) {
            Thread.sleep(3000);

            try {


                q = Tusks.get(i);
                Thread.sleep(3000);
                q.click();
                if ( i == 6) {
                    continue;

                }
            } catch (Exception e) {

            }
        }
        Thread.sleep(3000);
        click(By.id("advanced-settings"));
        jse.executeScript("window.scrollBy(0,500)");
        for (int i = 7; i <= 10; i++) {
            Thread.sleep(1000);
            q = Tusks.get(i);
            Thread.sleep(1000);
            q.click();
            if (i == 9) {
                driver.findElement(By.xpath("//input[@class='select-form mt-2 w-100 float-right']")).sendKeys(emaill);

            }
        }
        Thread.sleep(3000);
        click(By.id("add-new-course-btn"));
        Thread.sleep(3000);
        click(By.xpath("//a[@title='Courses']"));
        isElementDisplayed(By.xpath("//a[@title='AutoCourse']"));

        return this;
    }

    public CoursesSectionBaseInstructor search_By_Course_Name(String text) {

        click(By.xpath("//a[@title='Courses']"));
        driver.findElement(By.xpath("//input[@class='form-control min-width-td-250']")).sendKeys(text);
        click(By.xpath("//button[@class='btn btn-default']"));
        isElementDisplayed(By.xpath("//a[@title='AutoCourse']"));

        return this;
    }
    public CoursesSectionBaseInstructor  search_By_Course_Category_And_Course_Type () throws InterruptedException {

        click(By.xpath("//a[@title='Courses']"));
        Thread.sleep(3000);
        click(By.xpath("//div[@class='form-group search-able-select selectDiv']"));
        click(By.xpath("//option[text()='Users']"));

        click(By.xpath("//div[@class='form-group selectDiv']"));
        click(By.xpath("//option[text()='Standard']"));
        click(By.xpath("//button[@class='btn btn-default']"));
        isElementDisplayed(By.xpath("//a[@title='AutoCourse']"));

        return this;
    }


           public CoursesSectionBaseInstructor click_The_Inactive_Active_Buttons () throws InterruptedException {
               click(By.xpath("//a[@title='Courses']"));
               driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
               Thread.sleep(2000);




               if (driver.findElement(By.xpath("//a[@href='https://largeaccounttest.2leap.com/courses/?active_setting=1']")).isDisplayed()) {


                     click(By.xpath("//a[@href='https://largeaccounttest.2leap.com/courses/?active_setting=1']"));
                     isElementDisplayed(By.xpath("//a[text()='Show Inactive']"));
               }



             else {


                    click(By.xpath("//a[@href='https://largeaccounttest.2leap.com/courses/?active_setting=0']"));

                    isElementDisplayed(By.xpath("//a[text()='Hide Inactive']"));

               }
               Thread.sleep(2000);

               return this;
           }



}
