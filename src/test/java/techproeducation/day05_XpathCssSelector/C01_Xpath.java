package techproeducation.day05_XpathCssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Xpath {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // Ex :
        // https://www.amazon.com sayfasına gidiniz
        driver.get("https://amazon.com");

// arama kutusuna "city bike"  yazıp aratın
        /*
        ARAMA KUTUSUNUN HTML CODELARI
        <input type="text" id="twotabsearchtextbox"
        value="" name="field-keywords" autocomplete="off" placeholder="Search Amazon"
        class="nav-input nav-progressive-attribute" dir="auto" tabindex="0" aria-label="Search Amazon"
         spellcheck="false">
         */

      //  driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
        WebElement findBox = driver.findElement(By.xpath("//*[@type='text']"));
        findBox.sendKeys("city bike", Keys.ENTER);


     // Hybrid Bikes bölümüne tıklayın
        driver.findElement(By.xpath("//*[text()='Hybrid Bikes']")).click();

     // sonuc sayısını yazdırın
        WebElement writeOfResult = driver.findElement(By.xpath("(//*[@class='sg-col-inner'])[1]")); // 14 results for "city bike", locate ini aldik
        String [] numberOfResult = writeOfResult.getText().split(" ");
        System.out.println("numberOfResult = " + numberOfResult[0] );

     // ilk ürününe tıklayın
        driver.findElement(By.xpath("(//h2)[1]")).click();
       // driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-fixed-height'])[1]")).click();
    // Yada bu yontemle de yapabiliriz

     // Sayfayı kapatınız

        Thread.sleep(3000);
        driver.close();
        // Css ile index ve text alamiyoruz fakat hizli calisir
    }
}
