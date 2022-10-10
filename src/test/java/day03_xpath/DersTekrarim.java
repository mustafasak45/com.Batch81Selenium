package day03_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class DersTekrarim {
    public static void main(String[] args) throws InterruptedException {
  /*
       1. Bir class oluşturun : AmazonSearchTest
       2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
       a. web sayfasına gidin. https://www. amazon.com/
       b. Search(ara) “city bike”
       c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
       e. Sonra karşınıza çıkan ilk sonucun resmine tıklayın
     */

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //a. web sayfasına gidin. https://www. amazon.com/
        driver.get("https://www.amazon.com/");

        //b. Search(ara) “city bike”
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("city bike"+Keys.ENTER);

        //c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        List<WebElement> liste=driver.findElements(By.className("sg-col-inner"));
        System.out.println(liste.size()+" adet element var");

        //d. Sadece sonuç sayısını yazdırınız
        String[] aramaSonucu=driver.findElements(By.className("sg-col-inner")).get(0).getText().split(" ");
          //amazonda arama yaptıktan sonra sol üst tarafta"1-16 of 109 results for "city bike"" diye yazan String'i split ile
          // arraye ekledik ve onun istedigimiz elementini yazdirdik
        System.out.println("Arama sonucu : "+aramaSonucu[0]); //Arama sonucu : 1-16
        System.out.println("Arama sonucu : "+aramaSonucu[1]); //Arama sonucu : of
        System.out.println("Arama sonucu : "+aramaSonucu[2]); //Arama sonucu : 109

        System.out.println(driver.findElement(By.className("sg-col-inner")));

        //e. Sonra karşınıza çıkan ilk sonucun resmine tıklayın
        List<WebElement> bike = driver.findElements(By.className("s-image"));// class adi "s-image" olan bütün elementleri bike listine ekledik.
        System.out.println(bike.size()); //kaç tane bike listinin elementi var onu yazdırdık.
        bike.get(0).click();// bike listine attgimiz butun elemlerin ilkine tıklatıyoruz.


        //Sayfayı kapatınız
        driver.close();

    }
}
