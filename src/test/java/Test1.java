import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Test1 {

    @Test
    public void Text_input() {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.navigate().to("https://www.selenium.dev/selenium/web/web-form.html");


        By WebElement = new By.ByXPath("//*[@id=\"my-text-id\"]");

        WebElement element = driver.findElement(WebElement);
        //element.click();
        element.sendKeys("Body");
    }


    @Test
    public void Password() {

        WebDriver driver;
        driver = new ChromeDriver();
        driver.navigate().to("https://www.selenium.dev/selenium/web/web-form.html");

//        By WebElement = new By.ByXPath("/html/body/main/div/form/div/div[1]/label[2]/input");
//        WebElement password = driver.findElement(WebElement);

        WebElement passwordInput =
                driver.findElement(By.name("my-password"));

        passwordInput.sendKeys("Body$123");
        //driver.quit();

    }


    @Test
    public void Textarea() {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");

        WebElement TextArea = driver.findElement(By.name("my-textarea"));
        TextArea.sendKeys("My Name's Abdelrahman");
    }


    @Test
    public void dropdown() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");

        WebElement selectElement = driver.findElement(By.name("my-select"));
        Select select = new Select(selectElement);

        select.selectByVisibleText("One");
        Assert.assertEquals(select.getFirstSelectedOption().getText(), "One");

        select.selectByVisibleText("Two");
        Assert.assertEquals(select.getFirstSelectedOption().getText(), "Two");

        select.selectByVisibleText("Three");
        Assert.assertEquals(select.getFirstSelectedOption().getText(), "Three");


    }
}


