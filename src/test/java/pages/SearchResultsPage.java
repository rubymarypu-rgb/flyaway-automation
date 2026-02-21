package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchResultsPage {

    WebDriver driver;

    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickBookTickets() {
        driver.findElement(By.cssSelector("input[value='Book Tickets']")).click();
    }
    
    public void clickBookNow() {
        driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
    }
}