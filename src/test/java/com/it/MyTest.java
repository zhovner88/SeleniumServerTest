package com.it;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class MyTest {
    @Test
    public void testDoesNothing() {
        System.setProperty("webdriver.chrome.driver",
                "/home/denys/Documents/repositories/globalTraning/drivers/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://mvnrepository.com/");
        String url = driver.getCurrentUrl();
        Assert.assertEquals("https://mvnrepository.com/", url);
        driver.quit();
    }
}