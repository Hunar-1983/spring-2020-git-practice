package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class GoggleTest {
WebDriver driver;

@BeforeMethod
    public void setup(){
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.get("https://www.google.com");
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.MICROSECONDS);
}
@Test
    public void test1(){
    Assert.assertEquals(driver.getTitle(), "Google");
}

@AfterMethod
    public void tearDown(){
    driver.quit();
}
}
