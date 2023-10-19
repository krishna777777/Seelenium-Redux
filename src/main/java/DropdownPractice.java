import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v113.input.Input;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class DropdownPractice {

    public static void main(String args[]){
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        //driver.findElement(By.xpath("//*[contains(@id,'autosuggest')]")).click();
        driver.findElement(By.xpath("//*[contains(@id,'autosuggest')]")).sendKeys("ind");

        // selecting the autosuggestive Dropdown .


       // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@class='ui-menu-item']//a[@class='ui-corner-all']")));

      int size =  driver.findElements(By.xpath("//li[@class='ui-menu-item']//a[@class='ui-corner-all']")).size();

      for (int i=0;i<size;i++){

          String city = driver.findElements(By.xpath("//ul[@id='ui-id-1']//li//a")).get(i).getText();
          if (city.equalsIgnoreCase("India")){

              driver.findElement(By.xpath("//ul[@id='ui-id-1']//li//a")).click();
              break;
          }
      }

      // Look at the opecity to see if the element is present for not .
        String opacity = driver.findElement(By.xpath("//div[@class='picker-second']")).getAttribute("style");

      System.out.println(opacity);
      String splitter = opacity.split("opacity :")[1];

      System.out.println(splitter);





    }
}
