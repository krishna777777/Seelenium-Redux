import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.ArrayList;
import java.util.List;

public class forEach {

    public static void main(String args[]) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise#/");

        List<WebElement> names = driver.findElements(By.xpath("//*[contains(@class,'product-name')]"));

        List<String> newname = new ArrayList<>();
        newname.add("Cucumber");
        newname.add("Beetroot");

        for (String s : newname) {
            System.out.println(s);
            for (WebElement nameElement : names) {
                String fruitname = nameElement.getText();
                if (fruitname.contains(s)) {
                    // Find the associated button for the current product element
                    WebElement addButton = nameElement.findElement(By.xpath("./following-sibling::div/button"));
                    addButton.click();
                }
            }
        }
    }
}
