package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BookingDetailsPage {

    WebDriver driver;

    By confirmBookingBtn = By.xpath("//button[contains(text(),'Confirm Booking')]");

    public BookingDetailsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void confirmBooking() {
        driver.findElement(confirmBookingBtn).click();
    }
}