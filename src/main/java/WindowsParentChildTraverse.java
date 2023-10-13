import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Iterator;
import java.util.Set;

public class WindowsParentChildTraverse {

    public static void main(String args[]){
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");


     WebElement click =    driver.findElement(By.xpath("//*[contains(@class,'blinkingText')]"));
      //  driver.findElement(By.xpath("//*[contains(@class,'blinkingText')]"));

        Actions actions = new Actions(driver);
        actions.keyDown(Keys.CONTROL).click(click).keyUp(Keys.CONTROL).perform(); // Use Keys.COMMAND on macOS
        // we can use the Iterator to iterate over the string store the index of it

        // First define a Set
        Set<String> s = driver.getWindowHandles();


        Iterator<String> elements = s.iterator();


        String Parent = elements .next();
        String child = elements.next();


driver.switchTo().window(child);

String title = driver.getTitle();

System.out.println(title);

    }

}