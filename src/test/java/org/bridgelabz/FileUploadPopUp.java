package org.bridgelabz;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FileUploadPopUp extends Base {
    @Test
    public static void fileUploadPopUp() throws InterruptedException {
        driver.get("https://testuserautomation.github.io/Alerts/");
        driver.findElement(By.xpath("//button[2]")).click();

        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
        Thread.sleep(2000);
        WebElement text = driver.findElement(By.xpath("//*[@id='demo']"));
        Thread.sleep(1000);
        System.out.println(text.getText());
    }
}
