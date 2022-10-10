package day02_SayfaBoyutlari_Konumlari.day02Odev;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework02 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

         /*
         Yeni bir class olusturun (TekrarTesti)
    Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını doğrulayın  (verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
    Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa doğru  URL'yi yazdırın.
    Daha sonra Amazon sayfasina gidin https://www.amazon.com/
    Youtube sayfasina geri donun
    Sayfayi yenileyin
    Amazon sayfasina donun
    Sayfayi tamsayfa yapin
    Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın, Yoksa  doğru başlığı(Actual Title) yazdırın.
    Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru
    URL'yi yazdırın
    Sayfayi kapatin
    */

        driver.get("https://www.youtube.com");

        if (driver.getTitle().contains("youtube")){
            System.out.println("Title youtube PASSED");
        }else System.out.println("Title youtube FAILED");

        if (driver.getCurrentUrl().contains("youtube")) {
            System.out.println("URL youtube PASSED");
        }else {
            System.out.println("URL youtube FAILED");
            System.out.println("URL : " + driver.getCurrentUrl());
        }

        driver.navigate().to("https://www.amazon.com/");

        driver.navigate().back(); // Youtube sayfasina geri doner

        driver.navigate().refresh();

        driver.navigate().forward();//Amazon sayfasina doner
        driver.manage().window().maximize();

        if (driver.getTitle().contains("Amazon")) {
            System.out.println("Title Amazon PASSED");
        }else {
            System.out.println("Title Amazon FAILED");
            System.out.println("Title : " + driver.getTitle());
        }

        if (driver.getCurrentUrl().equals("https://www.amazon.com")){

        }else driver.get("https://www.amazon.com");

        driver.close();
    }
}
