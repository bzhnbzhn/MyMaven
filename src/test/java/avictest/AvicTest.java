package avictest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.openqa.selenium.By.id;
import static org.openqa.selenium.By.xpath;
import static org.testng.Assert.assertTrue;


public class AvicTest {

    private WebDriver driver;

    @BeforeTest
    public void profileSetUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
    }

    @BeforeMethod
    public  void testsSetUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://avic.ua/ua");
    }
    @Test
    public void  checkThatUrlContainsSearchWord(){
        driver.findElement(By.id("input_search")).sendKeys("iPhone");
        driver.findElement(xpath("//button[@class='button-reset search-btn']")).click();
        assertTrue(driver.getCurrentUrl().contains("query=iPhone"));
    }
    
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
