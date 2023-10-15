import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class DynamicDropdowns {
    public static void main (String args[]){


        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        WebElement origin = driver.findElement(By.xpath("//*[contains(@id ,'ctl00_mainContent_ddl_originStation1_CTXTaction')]"));
        origin.click();

        driver.findElement(By.xpath("//a[contains(text(),'Chennai (MAA)')]")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5000));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[contains(text(),'Bengaluru')])[2]"))).click();
        //driver.findElement(By.xpath("(//a[contains(text(),'Bengaluru')])[2]")).click();


        // Typing the Values
        driver.findElement(By.xpath("//*[contains(@placeholder,'Type to Select')]")).sendKeys("ind");


        //WebElement child = driver.findElement(By.xpath("//ul[@id='ui-id-1']/li/a"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@class='ui-menu-item']//a[@class='ui-corner-all']")));

       List<WebElement> childs = driver.findElements(By.xpath("//li[@class='ui-menu-item']//a[@class='ui-corner-all']"));

       for (WebElement element : childs) {


           String countryname = element.getText();

           if (countryname.equalsIgnoreCase("India")) {
               element.click();
               break;
           }
       }







    }
}
