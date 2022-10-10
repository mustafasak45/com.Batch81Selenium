package day03_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class bulutluoz {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();

        driver.get("https://amazon.com/");

        //sayfadaki a taginin link sayısını verir
        List<WebElement> linkler= driver.findElements(By.tagName("a"));
        System.out.println("Sayfadaki link sayisi : "+linkler.size());

        //web elementin içerigini Turkey yazisina esit mi onu verir
        if (driver.findElement(By.id("glow-ingress-line2")).getText().equals("Turkey")){
            System.out.println("Passed");
        }else System.out.println("Failed");

        //uzun olan LinkTextlerin bir kısmını alıp element olarak kullanmayı saglar
        driver.findElement(By.partialLinkText("Click here to go to amazon.com.")).click();


       // driver.findElement(By.id("twotabsearchtextbox")).sendKeys("araba"+ Keys.ENTER);
    }
}
