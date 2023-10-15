import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LocatorsSelectingPassengers {

    public static void main(String args[]){
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        WebElement Location = driver.findElement(By.xpath("//*[contains(@id,'divpaxinfo')]"));
        Location.click();
        //driver.findElement(By.xpath("//*[contains(@id,'hrefIncAdt')]"))

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5000));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Adult')]/parent::div//*[contains(@id,'hrefIncAdt')]")));
        for (int i =0 ;i<3;i++){
            driver.findElement(By.xpath("//*[contains(text(),'Adult')]/parent::div//*[contains(@id,'hrefIncAdt')]")).click();
        }

        Location.click();

        String TotalPeople = Location.getText();


        System.out.println(TotalPeople);

        driver.close();



    }
}
