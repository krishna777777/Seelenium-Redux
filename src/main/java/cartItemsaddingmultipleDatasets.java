import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class cartItemsaddingmultipleDatasets {
    public static void main(String args[]){

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        WebElement cucumberelement = driver.findElement(By.xpath("//*[contains(text(),'Cucumber')]/parent::div//*[contains(@type,'button')]"));
        cucumberelement.click();

        String pricetext = driver.findElement(By.xpath("//*[contains(text(),'Cucumber')]/parent::div//*[contains(@type,'button')]")).getText();

        //    ==    //td[text()='Price']/parent::tr//strong


        String priceintheValue = driver.findElement(By.xpath("//td[text()='Price']/parent::tr//strong")).getText();
        System.out.println(priceintheValue);

        Assert.assertEquals(pricetext,priceintheValue,"the price text is same" );

    }
}
