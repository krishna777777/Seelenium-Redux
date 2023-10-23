import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class cartItemsaddingmultipleDatasets {
    public static void main(String args[]) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

        String[] names = {"Brocolli","Cauliflower"};
        List<WebElement> elements = driver.findElements(By.xpath("//h4[@class='product-name']"));

        int size = driver.findElements(By.xpath("//h4[@class='product-name']")).size();

        for (String str : names) {
            for (int i = 0; i < size; i++) {

                String text = elements.get(i).getText();
                if (text.contains(str)) {
                    driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();

                    // using the break because we dont want to keep on clicking

                    // what will you do if you want to select multiple products store those in a array and iterate it

                    break;

                }
            }
        }
    }
}
