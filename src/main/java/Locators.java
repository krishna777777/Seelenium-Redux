import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Locators {
    public static void main(String args[]){
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/locatorspractice/");

        // implicit wait declartion :

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));


        // sending the username
        // using the id selector
        driver.findElement(By.id("inputUsername")).sendKeys("krishna");
        //sending the password
        // using the name selector
        driver.findElement(By.name("inputPassword")).sendKeys("krishna");
        // using the class name selector
        //driver.findElement(By.className("signInBtn")).click();
        // using the css selector

        driver.findElement(By.cssSelector("button.signInBtn")).click();

        // capturing the error message using the css selector


        String errMsg =driver.findElement(By.cssSelector("p[class='error']")).getText();

        System.out.println(errMsg);

        // capturing the i forgot the password credentials :

        driver.findElement(By.xpath("//*[contains(text(),'Forgot your ')]")).click();

        // after clicking on the xpath we can create a Login credentials where we can login successfully .


        // giving in the username

        driver.findElement(By.xpath("//*[contains(@placeholder,'Name')]")).sendKeys("krishnasriram");

        // giving in the password

        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("krishna@gmail.com");

        // giving in the phone number

        driver.findElement(By.xpath("//*[contains(@placeholder,'Phone')]")).sendKeys("123");

        // clicking on the reset login button

        driver.findElement(By.xpath("//button[text()='Reset Login']")).click();

        // capturing the temporary password to login





    }


}
