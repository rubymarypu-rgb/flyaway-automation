package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    By email = By.name("email");
    By password = By.name("password");
    By loginBtn = By.xpath("//button[contains(text(),'Login')]");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String mail, String pwd) {
        driver.findElement(email).sendKeys(mail);
        driver.findElement(password).sendKeys(pwd);
        driver.findElement(loginBtn).click();
    }
}