package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConfirmBookingPage {

    WebDriver driver;

    public ConfirmBookingPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickConfirmBooking() {
        driver.findElement(By.cssSelector("input[value='Confirm Booking']"))
              .click();
    }
}