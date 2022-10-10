package day04_CssSelector_RelativeLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_CssSelector {
    public static void main(String[] args) throws InterruptedException {
/*
        1 ) Bir class oluşturun : Locators_css
        2 ) Main method oluşturun ve aşağıdaki görevi tamamlayın.
          a. Verilen web sayfasına gidin. http://a.testaddressbook.com/sign_in
          b. Locate email textbox
          c. Locate password textbox ve
          d. Locate signin button
          e. Asagidaki kullanıcı adını ve şifreyi girin ve sign in düğmesini tıklayın
             i. Username : testtechproed@gmail.com
             ii. Password : Test1234!
     */

         /* *********************************************************************************
        cssSelectorde sadece id atribute'u için # işareti kullanılır(b ve c şıkkında kullandık)
        cssSelectorde sadece class atribute'u için . işareti kullanılır
        **************************************************************************************
         */

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //  a. Verilen web sayfasına gidin. http://a.testaddressbook.com/sign_in
        driver.get("http://a.testaddressbook.com/sign_in");

        //  b. Locate email textbox
       WebElement emailTextBox= driver.findElement(By.cssSelector("#session_email"));

        //  c. Locate password textbox ve
        WebElement passwordTextBox= driver.findElement(By.cssSelector("#session_password"));

        // d. Locate signin button
        WebElement sign=driver.findElement(By.cssSelector("input[type='submit']"));

//        e. Asagidaki kullanıcı adını ve şifreyi girin ve sign in düğmesini tıklayın
//        i. Username : testtechproed@gmail.com
//        ii. Password : Test1234!

        emailTextBox.sendKeys("testtechproed@gmail.com");
        passwordTextBox.sendKeys("Test1234!");
        sign.click();

        Thread.sleep(1000);
        driver.close();

    }
}
