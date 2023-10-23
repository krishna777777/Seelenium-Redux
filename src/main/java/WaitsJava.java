import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class WaitsJava {

    WebDriver driver  = new ChromeDriver();

    public void Items(){

        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        List<WebElement> names = driver.findElements(By.xpath("//*[contains(@class,'product-name')]"));

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));

        List<String> newname =  new ArrayList<>();

        newname.add("Cucumber");

        newname.add("Beetroot");

        String fruitname="";

        for ( String s : newname){

            System.out.println(s);

            for ( int i =0 ;i<names.size();i++){


                fruitname = names.get(i).getText();

                if(fruitname.contains(s)){


                    driver.findElements(By.xpath("//*[contains(@class,'product-action')]/child::button")).get(i).click();
                }

            }

        }

        driver.findElement(By.xpath("//*[contains(@class,'cart-icon')]")).click();

        driver.findElement(By.xpath("//*[contains(text(),'PROCEED TO CHECKOUT')]")).click();


      List<WebElement> pname=   driver.findElements(By.xpath("//p[@class='product-name']"));

        String ProductNames= "";


        for(int j =0 ;j< newname.size();j++){

            String s = newname.get(j);



            for (int i = 0; i < pname.size(); i++) {
                ProductNames = pname.get(i).getText();
                ProductNames= ProductNames.split("-")[0].trim();
                System.out.println(ProductNames+"hiiii");
                System.out.println(s+"hiiiiii");



            }

            Assert.assertTrue(s.contains(ProductNames), "the fruitname and product name are same ");

        }

        driver.findElement(By.xpath("//*[contains(@class,'promoCode')]")).sendKeys("rahulshettyacademy");


        // //*[contains(text(),'Apply')]

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Apply')]"))).click();

        String Text = driver.findElement(By.xpath("//*[contains(text(),'Code applied')]")).getText();

        Assert.assertNotNull(Text,"The value is Present and the code is applied");

        driver.findElement(By.xpath("//*[contains(text(),'Place Order')]")).click();

      WebElement element = driver.findElement(By.xpath("//select"));

      Select options = new Select(element);

      options.selectByValue("India");

      driver.findElement(By.xpath("//input[@type='checkbox']")).click();

      driver.findElement(By.xpath("//*[contains(text(),'Proceed')]")).click();
    }

    public static void main(String args[]){

        WaitsJava obj = new WaitsJava();
        obj.Items();





    }
}
