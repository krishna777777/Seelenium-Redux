import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Checkbox {

    public static void main(String args[]){
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        // selecting the senior citizen dropdown

        driver.findElement(By.xpath("//*[contains(text(),'Senior Citizen')]/parent::div/child::input")).click();
        // make sure that the checbox is sekected or not

        // Using assertion to see if the value is true or not
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Senior Citizen')]/parent::div/child::input")).isSelected());



        System.out.println(driver.findElement(By.xpath("//*[contains(text(),'Senior Citizen')]/parent::div/child::input")).isSelected());

        // Method to select all the checkboxes in the screen


        int size =driver.findElements(By.xpath("//input[@type='checkbox']")).size();

        System.out.println(size);

    }
}
