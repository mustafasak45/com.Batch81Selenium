package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FirstFirefoxTest {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver","src/resources/drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.amazon.com");
    //    driver.wait(1000);
        driver.get("https://facebook.com");
    }
}
