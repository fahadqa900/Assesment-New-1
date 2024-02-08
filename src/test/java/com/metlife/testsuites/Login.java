package com.metlife.testsuites;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.time.Duration;

public class Login
{
    @Test
    public void test()
    {
        ChromeOptions option=new ChromeOptions();
        option.addArguments("--start-maximized");
        WebDriver driver=new ChromeDriver(option);
        driver.get("https://www.royalcaribbean.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.linkText("FIND A CRUISE")).click();
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500)");
        //driver.findElement(By.xpath("(//div[contains(@id,'card-title')])[1]")).click();
        driver.findElement(By.xpath("//button[text()='View 1 date']")).click();
       //driver.findElement(By.xpath("//span[text()='Select date']")).click();
        //js.executeScript("window.scrollBy(0,800)");
        //driver.findElement(By.xpath("//button[text()='Continue']")).click();
    }
}
