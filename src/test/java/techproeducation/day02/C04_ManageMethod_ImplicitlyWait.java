package techproeducation.day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_ManageMethod_ImplicitlyWait {
    public static void main(String[] args) {
         /*
         // ImplicitlyWait ise Seleniumdan gelir ve cok faydalidir ,
         web Elementlerin  bizim belirtecegimiz surede 20 saniye bekler max surede bekler  ,yosa Failed alabiliriz

          */

        System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        /*
        Eger web elementler 2 saniyede olusur ise 2 saniye bekler ve alt satira gecer fakat belirttigimiz max sure boyunca
        internetten yada sayfadan kaynakli olarak web Elementler olusmazsa testimiz failed verir.
        Thread.sleap() , Java kodlarini bizim belirttigimiz sure kadar bekler , 30 saniyebeklemesini belirtirsek 30 saniye
        bekler ve alt satira gecer
         */
        // techproed sayfasina gielim
        String techproUrl = "https://techproeducation.com";  // Boylede yapabiliriz
        driver.get(techproUrl);
        String amazonUrl = "https://amazon.com";

        // amazona gidelim
        driver.get(amazonUrl);


        //techpro sayfasina geri donelim
        driver.navigate().back();


        //sayfa basliginin techpo icerdigini test edelim
        String actualTitle = driver.getTitle();
        String arananKelime = "Techpro";

        if (actualTitle.contains(arananKelime)){
            System.out.println("Test Passed");
        }else System.out.println("Test Failled --> "+ actualTitle);  // Failled oldugunda problemin ne oldugunu gorebiliyoruz


        // tekrar amazon sayfasina gidelim
        driver.navigate().forward();

        //sayfa basliginin amazon icerdigini test edelim
        if (driver.getTitle().contains("Amazon")){
            System.out.println("Test Passed");
        }else System.out.println("Test Failled --> "+ driver.getTitle());  // Eger failled olsaydi buraya boyle yazabiliriz sebebini ogrenmek icin

        // Sayfayi kapatiniz
        driver.close();

        // ************ HOMEWORK **********

        /*
        Yeni bir class olusturalim (Homework)
ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) “facebook”
oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i
yazdirin.
https://www.walmart.com/ sayfasina gidin.
Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
Tekrar “facebook” sayfasina donun
Sayfayi yenileyin
Sayfayi tam sayfa (maximize) yapin  9.Browser’i kapatin

    HOMEWORK 2 :

    Instructor Erol Evren
  8:44 PM
1.Yeni bir Class olusturalim.C06_ManageWindow
2.Amazon soyfasina gidelim. https://www.amazon.com/
3.Sayfanin konumunu ve boyutlarini yazdirin
4.Sayfayi simge durumuna getirin
5.simge durumunda 3 saniye bekleyip sayfayi maximize yapin
6.Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
7.Sayfayi fullscreen yapin
8.Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
9.Sayfayi kapatin

         */


    }
}

