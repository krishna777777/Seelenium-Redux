import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class windowAuth {
    public static void main (String args[]){
        WebDriver driver = new ChromeDriver();


        driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");


       String successText =  driver.findElement(By.xpath("//*[contains(text(),'Congratulations')]")).getText();

               String text = "Congratulations";


        Assert.assertTrue(successText.contains(text),"the character is present");



    }
}
