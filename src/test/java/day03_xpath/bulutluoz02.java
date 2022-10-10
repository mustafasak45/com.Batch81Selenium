package day03_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class bulutluoz02 {
    public static void main(String[] args) {

        /*
        amazon'a git
        arama kutusunun tagName'inin input oldugunu test edin
        arama kutusunun name attribute'nun degerlerinin fiekd-keywords oldugunu test edin
         */

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//amazon'a git
        driver.get("https://amazon.com");

// arama kutusunun tagName'inin input oldugunu test edin
        WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));
        String expectedTagname ="input";
        String actualTagName=aramaKutusu.getTagName();

//arama kutusunun name attribute'nun degerlerinin fiekd-keywords oldugunu test edin
        if (actualTagName.equals(expectedTagname)){
            System.out.println("Tag Name input : PASSED");
        }else System.out.println("Tag Name input : FAILED");

        System.out.println(aramaKutusu.getLocation());
        System.out.println(aramaKutusu.isDisplayed());
        System.out.println(aramaKutusu.isEnabled());

    }
}
