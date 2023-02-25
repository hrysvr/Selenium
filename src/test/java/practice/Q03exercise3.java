package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q03exercise3 {

    /*     ...Exercise3...
           go to url : https://www.techlistic.com/p/selenium-practice-form.html
           fill the firstname
           fill the lastname
           check the gender
           check the experience
           fill the date
           choose your profession -> Automation Tester
           choose your tool -> Selenium Webdriver
           choose your continent -> Antartica
           choose your command  -> Browser Commands
           click submit button
    */

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");

        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("username" + Keys.ENTER);
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("password" + Keys.ENTER);

        WebElement cinsiyetKontrol = driver.findElement(By.id("sex-1"));
        cinsiyetKontrol.click();
        String cinsiyetSecim = "Female";
        if (cinsiyetKontrol.equals(cinsiyetSecim)){
            System.out.println("SECIM PASSED");
        }else {
            System.out.println("SECIM FAILED");
        }

        WebElement experienceKontrol = driver.findElement(By.id("exp-1"));
        experienceKontrol.click();
        String experience = "2";
        if (experienceKontrol.equals(experience)){
            System.out.println("EXPERIENCE PASSED");
        }else {
            System.out.println("EXPERIENCE FAILED");
        }

        driver.findElement(By.id("datepicker")).sendKeys("11-02-2018");

        driver.findElement(By.id("profession-1")).click();

        driver.findElement(By.id("tool-2")).click();

        driver.findElement(By.id("continents")).sendKeys("Antartika");

        driver.findElement(By.xpath("//option[text()='Browser Commands']")).click();

        driver.findElement(By.id("submit")).click();

        driver.quit();



    }

}
