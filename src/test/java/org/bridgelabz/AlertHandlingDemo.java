package org.bridgelabz;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.testng.annotations.Test;

public class AlertHandlingDemo  extends Base{
    @Test
    public static void alerthandling() throws NoAlertPresentException,InterruptedException {
        driver.get("https://www.browserstack.com/users/sign_up");
        driver.findElement(By.id("user_full_name")).sendKeys("aayusharyan1");
        driver.findElement(By.id("input-lg text user_email_ajax")).sendKeys("aayusharyan1.xyz.net");
        driver.findElement(By.id("user_password")).sendKeys("abc@123");
        driver.findElement(By.id("user_submit")).click();
        Thread.sleep(5000);
        Alert alert = driver.switchTo().alert(); // switch to alert
        String alertMessage= driver.switchTo().alert().getText(); // capture alert message
        System.out.println(alertMessage); // Print Alert Message
        Thread.sleep(5000);
        alert.accept();
    }
}
