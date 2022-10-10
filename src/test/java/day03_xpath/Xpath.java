package day03_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Xpath {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        /*
    https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
    2- Add Element butonuna basin
    Delete butonu’nun gorunur oldugunu test edin
    Delete tusuna basin
    “Add/Remove Elements” yazisinin gorunur oldugunu test edin
     */

        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        driver.findElement(By.xpath("//*[@onclick='addElement()']")).click();


  /*      Thread.sleep(1000);

 //       driver.findElement(By.xpath("//*[text()='Add Element']")).click();  //text ten xpath kod hali
        driver.findElement(By.xpath("//*[@onclick='addElement()']")).click();
//        Thread.sleep(1000);

        System.out.println("DELETE BUTONU ENABLE = "+driver.findElement(By.xpath("//*[@class='added-manually']")).isDisplayed());
//
        driver.findElement(By.xpath("//*[text()='Delete']")).click();

        driver.findElement(By.xpath("//*[@src='/img/forkme_right_green_007200.png']")).click();
//
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//*[text()='Elemental Selenium']")).click();

*/

    }
}
