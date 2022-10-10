package day04_CssSelector_RelativeLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Homework10xDeleteButonu {
    public static void main(String[] args) throws InterruptedException {
         /*
    1-https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
    2- Add Element butonuna 10 kez basinız
    3- 10 kez Add element butonuna basıldığını test ediniz
    4 - Delete butonuna görünmeyene kadar basınız
    5- Delete butonunun görünmediğini test ediniz
    6- Sayfayı kapatınız
     */

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

//    1-https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

//    2- Add Element butonuna 10 kez basinız
         WebElement addElementButonu = driver.findElement(By.xpath("//*[@onclick='addElement()']"));
         for (int i=1;i<=10;i++){
             Thread.sleep(100);
             addElementButonu.click();
         }
//    3- 10 kez Add element butonuna basıldığını test ediniz
        List<WebElement> deleteButonListi=driver.findElements(By.className("added-manually"));//butonlarin oldugu classname'yi liste atadik
        WebElement deleteButonu=driver.findElement(By.xpath("(//*[@class=\"added-manually\"])[1]"));//ilk delete butununu atadik
        for (int i = 1; i <=10 ; i++) {
            //1. butondan başlayip 10. butona kadar deleteButonu'na elementi atadik
            deleteButonu=driver.findElement(By.xpath("(//*[@class=\"added-manually\"])[" + i + "]"));
            //Butonlari ayni loop icinde isDisplayed() methodu ile olup olmadigini kontrol ettirdik
            System.out.println(i+". DELETE Butonu = "+deleteButonu.isDisplayed());
        }
        //liste atadigim butonlarin kaç adet oldugunu size() ile yazdirdik
        System.out.println(deleteButonListi.size()+" Tane DELETE BUTONU VARDIR");

//    4 - Delete butonuna görünmeyene kadar basınız
        deleteButonListi.stream().forEach(t-> t.click());

                     /*
                     for (WebElement e:deleteButonListi) {
                          e.click();
                      }
                      */

//    5- Delete butonunun görünmediğini test ediniz
        try {
            deleteButonu.isDisplayed();
        } catch (Exception e) {
            System.out.println("Delete Butonu YOKTUR...");
        }

       /*
       WebElement anaSayfa = driver.findElement(By.className("no-js"));
        String butunSayfaTexti=anaSayfa.getText();
        if (butunSayfaTexti.contains("Delete")){
            System.out.println("Delete Butonu Yoktur.");
        }else System.out.println("Delete Butonu Vardir.");
        */

//    6- Sayfayı kapatınız
        driver.close();


    }
}
