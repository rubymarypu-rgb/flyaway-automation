package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TicketPage {

    WebDriver driver;

    By printTicketBtn = By.xpath("//button[contains(text(),'Print Ticket')]");

    public TicketPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isTicketDisplayed() {
        return driver.findElement(printTicketBtn).isDisplayed();
    }
}