package day04_CssSelector_RelativeLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Homework02AmazonBirthday {
    public static void main(String[] args) {
//        1-C01_TekrarTesti isimli bir class olusturun
//        2- https://www.amazon.com/ adresine gidin
//        3- Browseri tam sayfa yapin
//        4- Sayfayi “refresh” yapin
//        5- Sayfa basliginin “Spend less” ifadesi icerdigini test edin
//        6- Gift Cards sekmesine basin
//        7- Birthday butonuna basin
//        8- Best Seller bolumunden ilk urunu tiklayin
//        9- Gift card details’den 25 $’i secin
//        10- Urun ucretinin 25$ oldugunu test edin
//        11-Sayfayi kapatin

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

//        2- https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com/");


//        3- Browseri tam sayfa yapin
        driver.manage().window().maximize();

//        4- Sayfayi “refresh” yapin
        driver.navigate().refresh();

//        5- Sayfa basliginin “Spend less” ifadesi icerdigini test edin
        if (driver.getTitle().contains("Spend less")) {
            System.out.println("Title PASSED");
        }else System.out.println("Title FAILED");

//        6- Gift Cards sekmesine basin
        driver.findElement(By.linkText("Gift Cards")).click();

//        7- Birthday butonuna basin
        driver.findElement(By.xpath("//*[@alt='Birthday gift cards']")).click();

//        8- Best Seller bolumunden ilk urunu tiklayin
     //   driver.findElement(By.xpath("(//*[@alt='Amazon.com eGift Card'])[1]")).click();

        List<WebElement> grifCartList = driver.findElements(By.className("a-carousel"));
        grifCartList.get(0).click();

//        9- Gift card details’den 25 $’i secin
       driver.findElement(By.xpath("(//*[@id='gc-mini-picker-amount-1'])[1]")).click();

//        10- Urun ucretinin 25$ oldugunu test edin
        if (driver.findElement(By.xpath("//*[@id='gc-live-preview-amount']")).getText().equals("$25.00")) {
            System.out.println("Urun ucreti 25$ PASSED");
        }else System.out.println("Urun ucreti 25$ FAILED");

//        11-Sayfayi kapatin
             driver.close();

    }
}
