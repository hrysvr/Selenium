package practice;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q05exercise5 {

    // .......Exercise5........
    /*
    Navigate to website https://testpages.herokuapp.com/styled/index.html
    Under the ORIGINAL CONTENTS
    click on Alerts
    print the URL
    navigate back
    print the URL
    Click on Basic Ajax
    print the URL
    enter value 20 and ENTER
    and then verify Submitted Values is displayed open page
    close driver
     */

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://testpages.herokuapp.com/styled/index.html");

        driver.findElement(By.id("alerts")).click();

        String expectedUrl = driver.getCurrentUrl();
        System.out.println(expectedUrl);

        driver.navigate().back();

        String expectedUrl2 = driver.getCurrentUrl();
        System.out.println(expectedUrl2);

        driver.findElement(By.id("basicajax")).click();
        String basicUrl = driver.getCurrentUrl();
        System.out.println(basicUrl);

        WebElement girilenDeger = driver.findElement(By.id("lteq30"));
        girilenDeger.sendKeys("20");
        Assert.assertTrue(girilenDeger.isDisplayed());

        driver.quit();




    }
}
