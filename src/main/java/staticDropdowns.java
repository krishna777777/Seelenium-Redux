import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class staticDropdowns {

public static void main(String args[]){


     //select[contains(.,'Select')]

    WebDriver driver = new ChromeDriver();

    driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

    WebElement selector = driver.findElement(By.xpath("//select[contains(.,'Select')]"));

    Select dropdown = new Select(selector);

    String first = dropdown.getFirstSelectedOption().getText();

    System.out.println(first);

    dropdown.selectByIndex(3);
    System.out.println(dropdown.getFirstSelectedOption().getText());

    dropdown.selectByValue("INR");

    System.out.println(dropdown.getFirstSelectedOption().getText());
}
}
