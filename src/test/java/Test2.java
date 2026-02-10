import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Test2{


    @Test
    public void test2() {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.navigate().to("https://www.selenium.dev/selenium/web/dynamic.html");


        By WebElement = new By.ByXPath("//*[@id=\"adder\"]");
        WebElement element = driver.findElement(WebElement);
        element.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        By WebElement1 = new By.ByXPath("//*[@id=\"box0\"]");
        WebElement element1 = driver.findElement(WebElement1);
        Assert.assertTrue(element1.isDisplayed());
    }

    @Test
    public void test3() {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.navigate().to("https://www.selenium.dev/selenium/web/dynamic.html");


        By WebElement = new By.ByXPath("//*[@id=\"reveal\"]");
        WebElement element = driver.findElement(WebElement);
        element.click();

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement element1 =wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("revealed")));
        Assert.assertTrue(element1.isDisplayed());
    }


}




