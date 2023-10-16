import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DatePicker {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver,
                Duration.ofSeconds(5000));

        driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");

        driver.findElement(By.id("datepicker")).click();

        String desiredMonth = "July";
        String desiredYear = "2022";

        while (true) {
            String year1 = driver.findElement(By.className("ui-datepicker-year")).getText();
            String month1 = driver.findElement(By.className("ui-datepicker-month")).getText();

            if (year1.equals(desiredYear) && month1.equalsIgnoreCase(desiredMonth)) {
                System.out.println("Desired date reached: the year is " + year1 + " and the month is " + month1);
                break;
            } else if (year1.equals(desiredYear) && month1.compareTo(desiredMonth) < 0) {
                driver.findElement(By.className("ui-icon-circle-triangle-e")).click();
            } else if (year1.equals(desiredYear) && month1.compareTo(desiredMonth) > 0) {
                driver.findElement(By.className("ui-icon-circle-triangle-w")).click();
            } else {
                // If year1 is not equal to desiredYear, go forward
                driver.findElement(By.className("ui-icon-circle-triangle-e")).click();
            }

            // Wait for the changes to take effect
            wait.until(ExpectedConditions.presenceOfElementLocated(By.className("ui-datepicker-year")));
        }

        driver.quit();
    }
}