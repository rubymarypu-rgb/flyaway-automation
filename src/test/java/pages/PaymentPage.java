package pages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PaymentPage {

    WebDriver driver;
    WebDriverWait wait;

    public PaymentPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public void makePayment(String cardName, String cardNumber) {

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("cardname")))
                .sendKeys(cardName);

        driver.findElement(By.name("cardno")).sendKeys(cardNumber);

        wait.until(ExpectedConditions.elementToBeClickable(By.id("paybtn")))
                .click();

        wait.until(ExpectedConditions.urlContains("confirmbooking"));
    }

    public boolean isPaymentSuccessful() {
        return driver.getCurrentUrl().contains("confirmbooking");
    }
}