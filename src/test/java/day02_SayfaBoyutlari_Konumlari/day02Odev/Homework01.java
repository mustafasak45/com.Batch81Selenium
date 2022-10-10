package day02_SayfaBoyutlari_Konumlari.day02Odev;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework01 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        /*
    Yeni bir class olusturalim (Homework)

    1-ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) “facebook”
    oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.

    2-Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i
    yazdirin.

    3-https://www.walmart.com/ sayfasina gidin.

    4-Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
    5-Tekrar “facebook” sayfasina donun
    6-Sayfayi yenileyin
    7-Sayfayi tam sayfa (maximize) yapin
    8.Browser’i kapatin*/

        driver.get("https://facebook.com");
//1
        if (driver.getTitle().contains("facebook")) {
            System.out.println("Title test PASSED");
        }else System.out.println("driver.getTitle() = " + driver.getTitle());

//2
        if (driver.getCurrentUrl().contains("facebook")) {
            System.out.println("URL Test PASSED");
        }else System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

//3
        driver.navigate().to("https://www.walmart.com/");

//4
        if (driver.getTitle().contains("Walmart.com")){
            System.out.println("Walmart.com Title PASSED");
        }else System.out.println("Walmart.com Tİtle FAILED");
//5
        driver.navigate().back();

//6
        driver.navigate().refresh();
//7
        driver.manage().window().maximize();

//8
        driver.close();

    }
}
