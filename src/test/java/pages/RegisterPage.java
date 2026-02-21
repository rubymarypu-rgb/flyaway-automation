package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class RegisterPage {

    WebDriver driver;
    WebDriverWait wait;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void registerUser(String firstName, String lastName,
                             String email, String password, String phone) {

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstname")))
                .sendKeys(firstName);

        driver.findElement(By.name("lastname")).sendKeys(lastName);
        driver.findElement(By.name("emailaddress")).sendKeys(email);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.name("phone")).sendKeys(phone);

        driver.findElement(By.xpath("//button[contains(text(),'Register')]")).click();
    }
}