package day02_SayfaBoyutlari_Konumlari;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

//        Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com");

//        Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("Sayfanin Konumu :"+driver.manage().window().getPosition());
        System.out.println("Sayfanin boyutu :"+driver.manage().window().getSize());

//        Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
        driver.manage().window().setPosition(new Point(20,20));
        driver.manage().window().setSize(new Dimension(600,300));

//        Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
        System.out.println("Sayfanin Yeni Konumu :"+driver.manage().window().getPosition());
        System.out.println("Sayfanin Yeni boyutu :"+driver.manage().window().getSize());

//        8. Sayfayi kapatin
        Thread.sleep(2000);
        driver.close();
    }
}
