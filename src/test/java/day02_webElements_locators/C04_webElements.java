package day02_webElements_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_webElements {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // amazon sayfasina gidin
        driver.get("https://www.amazon.com");

        // arama kutusunu locate edip, bir webelement olarak kaydedin
        // id'si twotabsearchtextbox olan webelement seklinde locate ederiz



        /*
           driver'a webelement'i tarif etme islemine Locate,
           bu tarifi yapabilmek icin kullanabilecegim degiskenlere de LOCATOR denir

           8 tane Locator vardir:
           Locator'larin 6 tanesi webelement'in ozelliklerine baglidir
                 1- id
                 2- classname
                 3- name
                 4- tagname
                 5- linkText
                 6- partialLinkText
           Geriye kalan 2 locator ise her turlu webelementi locate etmek icin kullanilabilir
                 7- xpath
                 8- cssSelector

         */


        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));


        // arama kutusuna "Nutella" yazip aratin

        aramaKutusu.sendKeys("Nutella");
        aramaKutusu.submit();
        Thread.sleep(3000);

        driver.close();


    }
}
