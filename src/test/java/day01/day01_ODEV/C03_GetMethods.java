package day01.day01_ODEV;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_GetMethods {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

//        Yeni bir package olusturalim : day01
//        Yeni bir class olusturalim : C03_GetMethods

//        Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com/");

//        Sayfa basligini(title) yazdirin
        System.out.println("Sayfanin Basligi: " + driver.getTitle());

//        Sayfa basliginin “Amazon” icerdigini test edin
        if (driver.getTitle().contains("Amazon")){
            System.out.println("Title Amazon Testi : PASSED");
        }else System.out.println("Title Amazon Testi : FAILED");

//        Sayfa adresini(url) yazdirin
        System.out.println("Sayfa URL'si: " + driver.getCurrentUrl());

//        Sayfa url’inin “amazon” icerdigini test edin.
        if (driver.getCurrentUrl().contains("amazon")){
            System.out.println("Sayfa URL amazon Testi : PASSED");
        }else System.out.println("Sayfa URL amazon Testi : FAILED");

//        Sayfa handle degerini yazdirin
        System.out.println("Sayfanın handle degeri : " + driver.getWindowHandle());

//        Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
        if (driver.getPageSource().contains("Gateway")){
            System.out.println("Gateway test : PASSED");
        }else System.out.println("Gateway test : FAILED");

//        Sayfayi kapatin.
        driver.close();
    }
}
