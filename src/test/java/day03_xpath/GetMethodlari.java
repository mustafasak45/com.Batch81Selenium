package day03_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class GetMethodlari {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//    -Amazon sayfasına gidiniz
//
//    -Arama kutusunu locate ediniz
//    -Arama kutusunun tagName'inin input olduğunu test ediniz
//    -Arama kutusunun name atributu'nun değerinin field-keywords olduğunu test ediniz
//    -Sayfayı kapatınız


        //    -Amazon sayfasına gidiniz
        driver.get("https://www.amazon.com/");
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));

        //    -Arama kutusunu locate ediniz
        String expectedtagName ="input";
        String actualTagName=aramaKutusu.getTagName();

        //    -Arama kutusunun tagName'inin input olduğunu test ediniz
        if (actualTagName.equals(expectedtagName)){
            System.out.println("TagName TESTI PASSED "+actualTagName);
        }else System.out.println("TagNamr TESTI FAILED");

//    -Arama kutusunun name atributu'nun değerinin field-keywords olduğunu test ediniz
        String expectedAtributuName = "field-keywords";
        String actualAtributuName = aramaKutusu.getAttribute("name");
        if (actualAtributuName.equals(expectedAtributuName)){
            System.out.println("Atribute TESTI PASSED");
        }else System.out.println("Atribute TESTI FAILED");

//     -Arama kutusunun konumunu yazdırın.

        System.out.println("driver.findElement().getLocation() = " + driver.findElement(By.id("twotabsearchtextbox")).getLocation());


        //    -Sayfayı kapatınız

        driver.close();

    }
}
