package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickBookFlight() {
        driver.findElement(By.linkText("BOOK FLIGHT")).click();
        // OR if using button text:
        // driver.findElement(By.xpath("//a[contains(text(),'CLICK TO BOOK FLIGHT')]")).click();
    }
}