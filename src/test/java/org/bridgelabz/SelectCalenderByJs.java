package org.bridgelabz;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SelectCalenderByJs extends  Base{
    @Test
    public void selectDate() throws InterruptedException {
        driver.get("https://www.spicejet.com/");
        WebElement date = driver.findElement(By.id("view_fulldate_id_1"));
        Thread.sleep(2000);
        String dateValue = "29-02-2021";
        Thread.sleep(2000);
        selectDate_ByJs(date,dateValue);
    }
    public static void selectDate_ByJs(WebElement element, String dateValue){
        JavascriptExecutor javascriptexecutor   = (JavascriptExecutor) Base.driver;
        javascriptexecutor.executeScript("arguments[0].setAttribute('value','"+dateValue+"');",element);
    }

}
