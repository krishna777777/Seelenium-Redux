import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Locators extends explicitwait{



    public static void main(String args[]) throws InterruptedException {



        //WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.manage().window().maximize();

        // implicit wait declartion :

       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        String username = "krishna";

        // sending the username
        // using the id selector
        driver.findElement(By.id("inputUsername")).sendKeys(username);
        //sending the password
        // using the name selector
        driver.findElement(By.name("inputPassword")).sendKeys("krishna");
        // using the class name selector
        //driver.findElement(By.className("signInBtn")).click();
        // using the css selector

        driver.findElement(By.cssSelector("button.signInBtn")).click();

        // capturing the error message using the css selector

WebElement forgotPw= wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("p[class='error']")));

        String errMsg =forgotPw.getText();

        System.out.println(errMsg);

        // capturing the i forgot the password credentials :

        driver.findElement(By.xpath("//*[contains(text(),'Forgot your ')]")).click();

        // after clicking on the xpath we can create a Login credentials where we can login successfully .


        // giving in the username

        driver.findElement(By.xpath("//*[contains(@placeholder,'Name')]")).sendKeys(username);

        // giving in the password

        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("krishna@gmail.com");

        // giving in the phone number

        driver.findElement(By.xpath("//*[contains(@placeholder,'Phone')]")).sendKeys("123");

        // clicking on the reset login button

       WebElement reset = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Reset Login']")));

        reset.click();

        // capturing the temporary password to login


      String password =   driver.findElement(By.cssSelector("p[class='infoMsg']")).getText();


      System.out.println(password);


      String split1 = password.split("password")[1];
      System.out.println(split1);
      String split2 = split1.split("to")[0];
      System.out.println(split2);
      String split3 = split2.replace("'"," ");
      split3 = split3.trim();

      System.out.println(split3);

      // passing the username
        // clicking on the back to login button
        driver.findElement(By.xpath("//button[text()='Go to Login']")).click();
// passing the username
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username);
        // sending the password
        System.out.println("the password is "+split3);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Password']"))).sendKeys(split3);
        //driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(split3);
        // clicking on the sign in button
     //   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
         Thread.sleep(5000);



         wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Sign In']"))).click();
//WebElement signin = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Sign In']")));

       //signin.click();

       WebElement welecome = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[.='Welcome to Rahul Shetty Academy']")));

       String msg = driver.findElement(By.xpath("//h2")).getText();
       String welcomemsg = welecome.getText();

       System.out.println(welcomemsg);

       Assert.assertEquals(msg.contains(username),true);
      /* if (welcomemsg.contains(username)){
           System.out.println("successfully logged in ");
       }
       else{
           System.out.println("Not successfully logged in");
       }*/


       driver.findElement(By.xpath("//button[text()='Log Out']")).click();
       driver.close();








    }


}
