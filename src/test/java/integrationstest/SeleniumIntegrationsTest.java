/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integrationstest;

import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
//import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;

/**
 *
 * @author Laura Lüthi
 */
public class SeleniumIntegrationsTest {

    private WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        System.setProperty("webdriver.chrome.driver", "src\\test\\java\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
//        


//        System.setProperty("webdriver.gecko.driver", "src\\test\\java\\resources\\geckodriver.exe");
//        driver = new FirefoxDriver();
//        driver.manage().window().maximize();
    }

    @Test
    public void testBerechne() throws Exception {
        driver.get("http://localhost:8080/calcwebapp/berechnungsformular.xhtml");
        Thread.sleep(5000);
        List<WebElement> elements = driver.findElements(By.tagName("input"));
        for(WebElement element:elements){
            if(element.getAttribute("id").endsWith("value1")){
                element.sendKeys("2.3");
            }
            if(element.getAttribute("id").endsWith("value1")){
                 element.sendKeys("3.2");
            }
        }
        driver.findElement(By.className("button")).click();
        Thread.sleep(5000);
        Assert.assertEquals(driver.findElement(By.id("result")).getText(), "Resultat=5.5");
    }

    @AfterMethod
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }

}
