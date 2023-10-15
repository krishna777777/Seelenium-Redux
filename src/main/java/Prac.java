import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Iterator;
import java.util.Set;

public class Prac {

    public static void main (String args[]){
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        String title1 =driver.getTitle();
        System.out.println(title1);

        String parent = driver.getWindowHandle();

        WebElement link = driver.findElement(By.xpath("//*[contains(@class,'blinkingText')]"));
        Actions abc = new Actions(driver);

        abc.keyDown(Keys.CONTROL).click(link).keyUp(Keys.CONTROL).perform();

        Set<String> sam = driver.getWindowHandles();

        for (String windowHandle : sam){
            driver.switchTo().window(windowHandle);
        }

        String amchild = driver.getTitle();


        System.out.println(amchild);


// this code will switch to each window and gets the title .

        // switch back to the parent window handle

        driver.switchTo().window(parent);

        System.out.println("the switched back title is "+driver.getTitle());



    }
}
