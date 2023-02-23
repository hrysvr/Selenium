package day01_seleniumGiris;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_driverNavigateMethodlari {

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // amazon ana sayfaya gidin
        driver.get("https://www.amazon.com");

        // wisequarter ana sayfaya gidin
        driver.get("https://www.wisequarter.com");

        // yeniden amazon ana sayfaya gidin
        driver.navigate().back();

        // wisequarter ana sayfaya donun
        driver.navigate().forward();

        // navigate().to() driver.get() ile ayni islemi yapar
        driver.navigate().to("https://www.youtube.com");

        // driver.navigate() sayfayi yeniler
        driver.navigate().refresh();

        driver.quit();
    }
}
