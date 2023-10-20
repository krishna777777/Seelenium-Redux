import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;

public class FileUpload {

    public static void main(String args[]) throws InterruptedException, IOException {
        // setting to the current project directory

        String downloadPath = System.getProperty("user.dir");
        ChromeOptions chrome = new ChromeOptions();
        // CALLING THis method to set the preferences to store the downloaded file inside the webbrowser
        // google has given has a Predefined set of code thAT WE CAN USE TO set the download property in the project
        HashMap<String,Object> chromeprefs = new HashMap<String, Object>();
        chromeprefs.put("profile.default_content_settings.popups",0);
        chromeprefs.put("download.default_directory",downloadPath);
        chrome.setExperimentalOption("prefs",chromeprefs);
        // passing the options
        WebDriver driver = new ChromeDriver(chrome);
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


        // using the Thread.sleep beacuse we cannot use the explicit waits and also that the windows don't use that

        Thread.sleep(7000);
        //driver.findElement(By.xpath("//button[@id='processTask']")).click();

        // after the downloading has finished you need to Verify that
        //there is a class in java you need to pass the path


        // now going to that property and storing it in /converted.zip
        File fe = new File(downloadPath+"/converted.zip");
        //File f = new File("C:\\Users\\ksriram\\Downloads");
        // see if the file is exists or not
        if(fe.exists()){
            System.out.println("file is present ");
            // to delete something
            //fe.delete();
        }




    }
}
