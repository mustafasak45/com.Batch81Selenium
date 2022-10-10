package day02_SayfaBoyutlari_Konumlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_wait {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));//sayfa açılıncaya kadar max sn süresini test eder
        driver.get("https://techproeducation.com");
         /*
        ileride wait daha geniş olarak ele alacağız.
        1 sayfa acılırken ilk basta sayfanin icerisinde bulunan elementlere göre 1 yukleme süres,ne ihtiyac vardir.
        veya 1 web elementin kullanılabilmesi icin zamana ihtiyac olabilir.
        implicitywait bize sayfanin yüklenmesi ve sayfadaki elementlere ulasim icin beklenecek maximum süreyi belirleme
        olanagi tanir
         */

        driver.close();

    }
}
