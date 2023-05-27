package techproeducation.day02;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_ManageMethods {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        // Browser'in konumunu yazdiralim
        System.out.println("Sayfanin konumu : "+driver.manage().window().getPosition());

        // Browser'in boyutlarini yazdiralim
        System.out.println("Sayfanin Boyutlari : "+driver.manage().window().getSize());

        // Browser;i Maximize yapalim
        driver.manage().window().maximize();

        // TechProEducation sayfasina gidelim
        driver.get("https://techproeducation.com");

        //        Browser'in konumunu yazdiralim
        System.out.println("Sayfanin konumu : "+driver.manage().window().getPosition());

        //  Browser'in boyutlarini yazdiralim
        System.out.println("Sayfanin Boyutlari : "+driver.manage().window().getSize());
        Thread.sleep(3000);

        // Sayfayi Minimize yapalim
        driver.manage().window().minimize();
        Thread.sleep(3000);  // Code'lari bekletir ,Javadan gelir
        // ImplicitlyWait ise Seleniumdan gelur ve cok faydalidir ,web Elementlerin  bizim belirtecegimiz surede bekler max surede bekler  ,yosa Failed alabiliriz

        //Sayfayi FullScreen yapalim
        driver.manage().window().fullscreen();

        Thread.sleep(3000);
        driver.manage().window().setPosition(new Point(50,50));  //   istedigimiz konuma getirir

        driver.manage().window().setSize(new Dimension(600,600)); // stedigimiz size getirir

        // Sayfayi kapatiniz

        driver.close();

    }
}
