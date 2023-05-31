package techproeducation.day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C03_findelements {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // Amazon sayfasina gidelim
        driver.get("https://amazon.com");


        // Sayfadaki linklerin sayisini ve linkleri yazdiralim
        /*
         findElement ile bir webelement'e ulasabilirken , birden fazla webelement icin findElements() methodunu kullaniriz.
         Dolayisiyla bu webelementlerin sayisina ulasmak icin yada bu webElementlerin yazisini konsola yazdirabilmek icin
         list<WebElement> inklerListesi = driver.findElement(By.locator("locator degeri")) olarak kullaniriz.
         Olusturmus oldugumuz listi loop ile consol'a yazdirabiliriz
         */

        List<WebElement> linklerListesi = driver.findElements(By.tagName("a"));
        System.out.println("Linklerin sayisi = " + linklerListesi.size());
/*
        for (WebElement w : linklerListesi) {

            if (!w.getText().isEmpty()){

                System.out.println(w.getText());   // Bos olmayanlari yazdir dedik yani bosluklari kaldirdi yani yazisi olmayan linkleri getirmedi

            }



        }

 */

        // Lambda ile yazdiralim
        linklerListesi.forEach(link -> {if (!link.getText().isEmpty())
        {System.out.println(link.getText());}});   // Fake sayfaya gitti ve 31 tane buldu
        // Shop deals in Electronics webelementinin yazisini yazdiralim
        System.out.println("**********************************");
        System.out.println();
        driver.close();

         // *********    HOMEWORK    **********

        //Amazon sayfasına gidiniz
//iphone aratınız
//çıkan sonuç yazısını konsola yazdırınız
//çıkan ürünlerden ilk 5 tanesine tıklayıp sayfa başlıklarını yazdırınız

    }
}
