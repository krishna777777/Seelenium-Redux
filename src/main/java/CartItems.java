import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class CartItems {

    public static void main(String args[]) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        driver.manage().window().maximize();
        // To take the Multiple Inputs what we can do is this will not work so we can compare the array to arrayList
        String[] names = {"Carrot", "Beans","Cucumber"};
        List<WebElement> elements = driver.findElements(By.xpath("//*[contains(@class,'product-name')]"));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        List<String> list = Arrays.asList(names);
        //list.add("Cucumber");
        //list.add("Beetroot");

        for (String s : list) {

            System.out.println(s);


            for (int i = 0; i < elements.size(); i++) {
                String newname = elements.get(i).getText();
                String newnames = newname.split("-")[0];
                newname = newnames.trim();


                if (newname.contains(s)) {

                    //Thread.sleep(5000);
                    wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[contains(@class,'product-action')]/child::button")));

                    //driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
                    driver.findElements(By.xpath("//*[contains(@class,'product-action')]/child::button")).get(i).click();
                }
            }


        }
    }


}