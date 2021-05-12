package Algorithms.Insructor;

import Algorithms.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginBaseInstructor extends BasePage {
    String SITE_URL =("https://largeaccounttest.2leap.com/");


    public LoginBaseInstructor(WebDriver driver) {super(driver);}
    public  LoginBaseInstructor goTo() {
        driver.get(SITE_URL);

        return this;

    }

    public LoginBaseInstructor email (String email){
        driver.findElement(By.xpath("//input[@name='Email']")).sendKeys(email);
        return this;


    }
    public LoginBaseInstructor pass (String pass){
        driver.findElement(By.xpath("//input[@name='Pass']")).sendKeys(pass);
        return this;


    }
    public LoginBaseInstructor login () {
        click(By.xpath("//button[text()='Log in']"));
        return this;


    }
    public LoginBaseInstructor displayedText () {

        isElementDisplayed(By.xpath("//h5[text()='Training Path completion']"));
        return this;

    }
    public LoginBaseInstructor anErrorMessage () {

        isElementDisplayed(By.xpath("//div[text()='Login failed! Please try again.']"));
        return this;

    }




}
