package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

public class BookFlightPage {

    WebDriver driver;

    public BookFlightPage(WebDriver driver) {
        this.driver = driver;
    }

    public void searchFlights(String from, String to, String date, String no) {

        Select source = new Select(driver.findElement(By.id("Source")));
        source.selectByValue(from);

        Select destination = new Select(driver.findElement(By.id("Dest")));
        destination.selectByValue(to);

        WebElement dateField = driver.findElement(By.id("travel_date"));
        dateField.clear();
        dateField.sendKeys(date);

        driver.findElement(By.id("passengers_no")).sendKeys(no);

        driver.findElement(By.xpath("//button[contains(text(),'Search Flights')]")).click();
    }
}