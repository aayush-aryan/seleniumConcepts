package org.bridgelabz;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDrop extends Base {
    @Test
    public static void dragAndDrop() throws InterruptedException {
 driver.get("https://jqueryui.com/droppable/");
        driver.switchTo().frame(0);
    Actions actions = new Actions(driver);
        Thread.sleep(3000);
        actions.clickAndHold(driver.findElement(By.xpath("//*[@id=\"draggable\"]")))
                .moveToElement(driver.findElement(By.xpath("//*[@id=\"droppable\"]")))
                .release()
                .build()
                .perform();
        Thread.sleep(3000);
}

}
