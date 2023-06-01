package techproeducation.day05_XpathCssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class C03_relativelocators {

    public static void main(String[] args) {
        /*
        Benzer ozelliklere sahip webelementler icin "Relative Locators" kullanabiliriz

        SYNTAX :

        driver.findElement(with(By.tagname).below().above().to-left-of().to_right_of().near())

        gibi methodlar le benzer ozelliklere sahip webElementlerin locate ini almadan o webelement e ulasabiliriz.
         */

        System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

         // Amazona gidelim
        driver.get("https://amazon.com");

        //city bike aratalim
        WebElement aramaKutusu = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        aramaKutusu.sendKeys("city bike", Keys.ENTER);


        //relative kullanarak hybrid bike altindaki elemente tiklayalim
        WebElement hybridBike = driver.findElement(By.xpath("//*[text()='Hybrid Bikes']"));
        WebElement electricBike = driver.findElement(with(By.tagName("a")).below(hybridBike));
        WebElement completeBike = driver.findElement(with(By.tagName("a")).below(electricBike));
        completeBike.click();

       driver.close();

    }
}
