import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsSelenium {

    public static void main (String args[]){

        String name = "krishna ";
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.id("name")).sendKeys(name);
        driver.findElement(By.id("alertbtn")).click();
        // switching to alert and getting the text showing in the alert
    System.out.println(driver.switchTo().alert().getText());


    // acception the alert
        driver.switchTo().alert().accept();

        // click on the confirm button

        driver.findElement(By.id("confirmbtn")).click();
        // we have 2 option sclick on alert or cancel .


        driver.switchTo().alert().dismiss();


    }
}
