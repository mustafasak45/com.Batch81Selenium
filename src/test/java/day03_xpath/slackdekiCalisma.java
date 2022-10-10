package day03_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class slackdekiCalisma {
    public static void main(String[] args) {
        /*
2 https://www.amazon.com/ adresine gidin
3 Browseri tam sayfa yapin
4 Sayfayi "refresh" yapin
5 Sayfa basliginin "Spend less" ifadesi icerdigini test edin
6 Gift Cards sekmesine basin
7 Birthday butonuna basin
8 Best Seller bolumunden ilk urunu tiklayin
9 Gift card details'den 25 $'i secin
10 Urun ucretinin 25$ oldugunu test edin
11 Sayfayi kapatin
 */

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //2
        driver.get("https://www.amazon.com/");
        //3
        driver.manage().window().maximize();
        //4
        driver.navigate().refresh();
        //5
        if (driver.getTitle().contains("Spend less")) {
            System.out.println("Title PASSED");
        }else System.out.println("Title FAILED");
        //6
        driver.findElement(By.linkText("Gift Cards")).click();
        //7
        driver.findElement(By.xpath("//*[@alt='Birthday gift cards']")).click();
        //8
        List<WebElement> listem=driver.findElements(By.xpath("//*[@class='a-carousel'][1]"));
        listem.get(0).click();





//        List<WebElement> resimListesi=driver.findElements(By.xpath("//img[@alt='Amazon.com eGift Card']"));
//        resimListesi.get(0).click();
//
//        WebElement fiyat= driver.findElement(By.xpath("//button[@value='25']"));
//        fiyat.click();




    }
}
