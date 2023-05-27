package techproeducation.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethods {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://amazon.com");  // Bu siteye gidiyoruz
        // get.title() sayfa basligini verir
        System.out.println("Amazon sayfa basligi : "+driver.getTitle());
        System.out.println("Amazon Actuel Url : "+driver.getCurrentUrl());

        String amazonWindowHandle = driver.getWindowHandle();  // Farkli pencereler arasinda kolay gecis icin,Amazondan,Selenium'a mesela
        // Yani tekrar ayni pencereye donerken bunu kullanicaz

        driver.get("https://techproeducation.com");
        System.out.println("TechPro Sayfasinin basligi :"+driver.getTitle());

        // Sayfanin basligi :Techpro Education | Online It Courses & Bootcamps
        // getCurrenntur()  Gidilen sayfanin Url sini verir

        System.out.println("Techproed Actuel Url : "+driver.getCurrentUrl());
        //  Techproed Actuel Url : https://techproeducation.com/

        //   System.out.println(driver.getPageSource());  Bilerek yoruma aldik ,her seferinde tum kaynaklari cagirmasin diye
        // Html code larini cikariyor ,cok gerekli degil bizim icin

        //getWindowHandle() ,Gidilen sayfanin handle degerini(hashCode) verir , u handle degeri ile yeni
        // sayfalar arasi gecis icin kullaniriz

        System.out.println("TechProed Window Handle Degeri : "+driver.getWindowHandle());

        // TechProed Window Handle Degeri : D2611D54DE036390F869444A72E62E66


    }
}

