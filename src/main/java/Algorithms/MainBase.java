package Algorithms;

import Algorithms.Insructor.CoursesSectionBaseInstructor;
import Algorithms.Insructor.LoginBaseInstructor;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class MainBase {
    WebDriver driver;

    public LoginBaseInstructor loginBaseInstructor;
    public CoursesSectionBaseInstructor coursesSectionBaseInstructor;
    @BeforeEach
    public  void start(){

        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        loginBaseInstructor = PageFactory.initElements(driver,LoginBaseInstructor.class);
        coursesSectionBaseInstructor = PageFactory.initElements(driver,CoursesSectionBaseInstructor.class);

    }


    @AfterEach
    public  void finish (){
        driver.quit();
    }


}
