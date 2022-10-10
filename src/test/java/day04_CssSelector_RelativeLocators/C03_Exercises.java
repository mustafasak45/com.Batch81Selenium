package day04_CssSelector_RelativeLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C03_Exercises {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

//       1- https://www.amazon.com/ sayfasina gidelim
        driver.get("https://www.amazon.com/");
//       2- arama kutusunu locate edelim
        WebElement aramaKutusu = driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
//       3- “Samsung headphones” ile arama yapalim
        aramaKutusu.sendKeys("Samsung headphones"+ Keys.ENTER);
//       4- Bulunan sonuc sayisini yazdiralim
        String aramaElementSayisi=driver.findElement(By.xpath("(//*[@class='sg-col-inner'])[1]")).getText();
        String [] array=aramaElementSayisi.split(" ");
        System.out.println(array[2]+" adet ürün var.");
//       5- Ilk urunu tiklayalim
        driver.findElement(By.xpath("(//*[@class='s-image'])[1]")).click();
//       6- Sayfadaki tum basliklari yazdiralim
        for (int i = 1; i <=6 ; i++) {
            List<WebElement> basliklar=driver.findElements(By.tagName("h"+i));
            basliklar.stream().forEach(t-> System.out.println(t.getText()));
        }

    }
}
