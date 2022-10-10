package day02_SayfaBoyutlari_Konumlari;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_Locators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://amazon.com");


        //Amazonda nutella aratınız

//ID İLE ARAMA:

       // driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Nutella"+ Keys.ENTER); 24-25 satırın aynısı

        //WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox")); //"twotabsearchtextbox" amazonun arama textbox'ından
        //aramaKutusu.sendKeys("Nutella"+ Keys.ENTER); //                               sağtık->incele dedik id'yi aldık.Sitede bu id'nin tek olduguna
                                                        //                              bakmak için kaynak kodda CTRL+F yazdık tek olduguna baktık
//NAME İLE ARAMA:

        //WebElement aramaKutusu = driver.findElement(By.name("field-keywords"));
        //aramaKutusu.sendKeys("Nutella"+ Keys.ENTER); // uniqe olduğu için sorunsuz çalışır

//CLASS NAME İLE ARAMA:

        //WebElement aramaKutusu = driver.findElement(By.className("nav-search-field "));
        /*
        Bu locatar çalismadı
        Locatar alırken gözümüzden kaçan detaylar olabilir
        aldığımız bir locatar çalışmazsa alternatif locatorlar denemeliyiz
         */
        driver.findElement(By.partialLinkText("oducts on Amazon")).click(); // a tag'ındaki link isminden istediğimiz bir parçayla locate edebiliriz
        driver.findElement(By.linkText("Sell products on Amazon")).click();//sitedeki tag: <a href="https://go.thehub-amazon.com/amazon-hub-locker" class="nav_a">Host an Amazon Hub</a>
    }

}
