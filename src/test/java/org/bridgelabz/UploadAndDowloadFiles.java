package org.bridgelabz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.IOException;

public class UploadAndDowloadFiles extends Base {

    @Test
    public static void uploadFiles() throws InterruptedException {
        driver.get("http://demo.guru99.com/test/upload/");
        WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));
        uploadElement.sendKeys("E:\\movie\\uploadAndDownloadFiles\\fileuploaddemo.txt");
        Thread.sleep(1000);
        driver.findElement(By.id("terms")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("send")).click();
    }

    @Test
    public static void downloadFiles() throws InterruptedException {

        driver.get("http://demo.guru99.com/test/yahoo.html");
        WebElement downloadButton = driver.findElement(By.id("messenger-download"));
        Thread.sleep(2000);
        String sourceLocation = downloadButton.getAttribute("href");
        Thread.sleep(2000);
        String wget_command = "cmd /c C:\\Wget\\wget.exe -P D: --no-check-certificate http://demo.guru99.com/selenium/msgr11us.exe";
        try {
            Process exec = Runtime.getRuntime().exec(wget_command);
            int exitVal = exec.waitFor();
            System.out.println("Exit value: " + exitVal);
        } catch (InterruptedException | IOException ex) {
            System.out.println(ex.toString());
        }
    }
}
