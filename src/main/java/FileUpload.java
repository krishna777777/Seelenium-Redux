import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class FileUpload {

    public static void main(String args[]) throws InterruptedException, IOException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ilovepdf.com/word_to_pdf");
        driver.findElement(By.xpath("//a[@id='pickfiles']")).click();
        Thread.sleep(5000);

        // java method to get the exe file location
        Runtime.getRuntime().exec("C:\\sample_folder\\fileuploader.exe");

        // locate the convert now test using the selenium locatoer
        // Now we need to download the file

        // Use proper wait mechanism for the element to appear

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='processTask']"))).click();
        //driver.findElement(By.xpath("//button[@id='processTask']")).click();

        // after the downloading has finished you need to Verify that
        //there is a class in java you need to pass the path

        File f = new File("C:\\Users\\krish\\Downloads");
        // see if the file is exists or not
        if(f.exists()){
            System.out.println("file is present ");
        }

    }
}
