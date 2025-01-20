import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FirstScript {

    public static void main(String[] args) {
        // Paso 1
        WebDriver driver = new ChromeDriver();
        // Paso 2
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        // Paso 3
        driver.getTitle();
        // Paso 4
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        // Paso 5
        WebElement textBox = driver.findElement(By.name("my-text"));
        WebElement submitButton = driver.findElement(By.cssSelector("button"));
        // Paso 6
        textBox.sendKeys("Selenium");
        submitButton.click();
        // Paso 7
        WebElement message = driver.findElement(By.id("message"));
        message.getText();
        // Paso 8
        //driver.quit();
    }

}
