package techproeducation.day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_DriverMethods_ClassWork {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        // Amazon sayfasina gidelim
        driver.get("https://amazon.com");

        // Sayfa basliginin Amazon icerdigini test edelim


        String actualTitle = driver.getTitle();
        String expectedTitle = "Amazon";
        if (actualTitle.contains(expectedTitle)){

            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED");   //  Test PASSED

        // Url'in http://www.amazon.com oldugunu test edelim

        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.amazon.com/";

        if (actualUrl.equals(expectedUrl)){
            System.out.println("Test PASSED");
        }else  System.out.println("Test FAILED"+ actualUrl);

        // Sayfayi kapatalim

        driver.close();  // Browser'i kapatir

        // driver.quit();   Birden fazla browser varsa hepsini kapatir

    }
}
