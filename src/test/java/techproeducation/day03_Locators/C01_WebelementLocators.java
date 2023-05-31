package techproeducation.day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_WebelementLocators {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // Amazon sayfasina gidelim
        driver.get("https://www.amazon.com");

        //Arama kutusunu locate edelim

        //Arama kutusuna iphone yazdiralim
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone", Keys.ENTER);

        /*

Bir webelementin locate'ini birden fazla kullanacaksanız bir Webelement'e değişken olarak atayabilirsiniz.
Webelement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));
1-Locate işlemi bittikten sonra webelemente bir metin göndereceksek sendKeys() methodu kullanırız.
2-Webelement'e tıklayacaksak click() methodu kullanırız
3-Webelement'in üzerindeki yazıyı almak istiyorsak getText()methodunu kullanırız.
4-Webelement de sendKeys() methodundan sonra yani Webelement'e metin gonderdikten sonra
Keys.ENTER ile yada submit() methodu ile enter yaptigimiz gibi o
otomosyonda'da yapabiliriz.
        */


        // Sayfayi kapatalim

        driver.close();
    }
}
