package com.webdriver.manyi;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.*;
import org.testng.annotations.*;
import org.testng.Assert;


public class TestZhiChuBao {

	private static WebDriver driver;
    @Test
    public void helloWorld() throws Exception {        
        //System.setProperty("webdriver.firefox.bin", "D:/Program Files/Mozilla firefox/firefox.exe"); 
    	System.setProperty("webdriver.chrome.driver", "E:\\work\\chromedriver.exe");
    	driver = new ChromeDriver();
        driver.get("http://testbuyer.zhichubao.com/");
        
        driver.manage().window().maximize();
        
        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("1239263709@qq.com");
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("manyi123");
        
        WebElement btn = driver.findElement(By.id("loginBtn"));
        btn.click();
        String name = "//*[@id=\"navbar-demo-mobile\"]/div/ul/li[5]/a/span/font/font";
        String qiyeshezhi = "//*[@id=\"navbar-demo-mobile\"]/div/ul/li[5]/ul/li[1]/a";
        driver.findElement(By.xpath(name)).click();
        driver.findElement(By.xpath(qiyeshezhi)).click();
        
//        String expectedTitle = "支出宝";
//        String actualTitle = driver.getTitle();
//        
//        Assert.assertEquals(actualTitle,expectedTitle);            
    }
    
    @AfterTest
    public void tearDown(){
//        driver.quit();
    }

}