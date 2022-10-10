package day02_SayfaBoyutlari_Konumlari.day02Odev;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Homework03 {
    public static void main(String[] args) throws InterruptedException {
   /*
        ClasslassWork : L oginoginTest
        1. Bir class oluşturun: LoginTest
        2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
        a. http://a.testaddressbook.com adresine gidiniz.
        b. Sign in butonuna basin
        c. email textbox,password textbox, and signin button elementlerini locate
        d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        i. Username :
        testtechproed@gmail.com
        ii. Password : Test1234!
        e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
        f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
        3. Sayfada kac tane link oldugunu bulun.
         */


        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.manage().window().maximize();

        // Main method oluşturun ve aşağıdaki görevi tamamlayın.

        // http://a.testaddressbook.com adresine gidiniz.
        driver.get("http://a.testaddressbook.com");
//Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Sign in butonuna basin
        driver.findElement(By.id("sign-in")).click();

//Thread.sleep(1000);

        // email textbox,password textbox, and signin button elementlerini locate ediniz..
        WebElement emailTextBox=driver.findElement(By.name("session[email]"));
        WebElement passwordTextBox=driver.findElement(By.name("session[password]"));

        // Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        // Username : testtechproed@gmail.com
        String userName="testtechproed@gmail.com";
        emailTextBox.sendKeys(userName);

//Thread.sleep(1000);
        // Password : Test1234!
        String password="Test1234!";
        passwordTextBox.sendKeys(password+Keys.ENTER);

//Thread.sleep(1000);

// Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
        String correctMessage="testtechproed@gmail.com";
        if (driver.getPageSource().contains(correctMessage)){
            System.out.println("Login in Succesfull, TEST PASSED");
        }else System.out.println("Login in Bad, TEST FAILED");

        //2. çözümü
        WebElement expectedUser = driver.findElement(By.className("navbar-text"));
        if (expectedUser.isDisplayed()){
            System.out.println("ExpectedUser Testi PASSED "+expectedUser.getText());
        }else System.out.println("ExpectedUser Testi FAILED");

        //3. çözümü
        String expectrdUserYazisi = "testtechproed@gmail.com";
        String actualUserYazisi=expectedUser.getText();
        if (actualUserYazisi.equals(expectrdUserYazisi)){
            System.out.println("test PASSED");
        }else System.out.println("test FAILED");

        //  xpath ile çözümü:

//        WebElement Addresses = driver.findElement(By.xpath("//a[@class='nav-item nav-link']"));
//        System.out.println("Addresses : " + Addresses.isDisplayed());
//
//        WebElement SignOut = driver.findElement(By.xpath("//a[@class='nav-item nav-link']"));
//        System.out.println("SignOut : " + SignOut.isDisplayed());


//“Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
        if (driver.getPageSource().contains("Addresses") && driver.getPageSource().contains("Sign Out")){
            System.out.println("Addresses ve Sign Out PASSED");
        }else System.out.println("Addresses ve Sign Out FAILED");

        //xpath ile çözümü:

//        WebElement Addresses = driver.findElement(By.xpath("//a[@class='nav-item nav-link']"));
//        System.out.println("Addresses : " + Addresses.isDisplayed());
//
//        WebElement SignOut = driver.findElement(By.xpath("//a[@class='nav-item nav-link']"));
//        System.out.println("SignOut : " + SignOut.isDisplayed());

//Sayfada kac tane link oldugunu bulun.
        List<WebElement> tag = driver.findElements(By.tagName("a"));
        System.out.println("Sayfada olan link sayisi : "+tag.size());

        for (WebElement a:tag) {
            System.out.println(a.getText());
        }

        //lambda ile yazdiralim
        tag.forEach(t-> System.out.println(t.getText()));

       driver.close();


    }
}
