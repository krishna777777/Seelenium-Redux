import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v113.input.Input;

public class DropdownPractice {

    public static void main(String args[]){
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/angularpractice/");

        driver.findElement(By.xpath("//*[contains(text(),'Name')]/parent::div//input")).sendKeys("Krishna");


    }
}
