package day07_actionsClass_fileTestleri;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C02KeyboardActions extends TestBase {

    @Test
    public void test01(){

        // 2- https://www.amazon.com sayfasina gidelim
        driver.get("https://www.amazon.com/");

        // 3- Arama kutusuna actions method’larine kullanarak
        // Samsung A71 yazdirin ve Enter’a basarak arama yaptirin

        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));

        Actions actions = new Actions(driver);

        actions.click(aramaKutusu)
                .keyDown(Keys.SHIFT)
                .sendKeys("s")
                .keyUp(Keys.SHIFT)
                .sendKeys("amsung ")
                .keyDown(Keys.SHIFT)
                .sendKeys("a")
                .keyUp(Keys.SHIFT)
                .sendKeys("71")
                .sendKeys(Keys.ENTER);


        // 4- aramanin gerceklestigini test edin
        String actualsonucYazisi = driver
                .findElement(By.xpath("//h1[@class='a-size-base s-desktop-toolbar a-text-normal']"))
                .getText();
        String expectedIcerik="Samsung A71";

        Assert.assertTrue(actualsonucYazisi.contains(expectedIcerik));


        bekle(4);
    }
}
