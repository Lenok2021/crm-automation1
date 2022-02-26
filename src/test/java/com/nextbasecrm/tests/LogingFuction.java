package com.nextbasecrm.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;

import java.util.concurrent.TimeUnit;

public class LogingFuction {

    //  in real wok envirement we create our steps
    // for each AC  we create at least one step!!!!!
    // 1TC for login
    /*
     * 1-go to login page
     * 2-write User name
     * 3-write User password
     * 4- click on login button
     */
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // go to login page
        driver.get(ConfigurationReader.getProperty("env"));

    }


    @Test
    public void login_with_valid_credentials_with_login_btn() {
        //username
        WebElement username = driver.findElement(By.xpath("(//input[@class = 'login-inp'])[1]"));
        username.sendKeys(ConfigurationReader.getProperty("username"));
        // write password
        WebElement password = driver.findElement(By.xpath("(//input[@class = 'login-inp'])[2]"));
        password.sendKeys(ConfigurationReader.getProperty("password"));
        // click login button
        WebElement loginButton = driver.findElement(By.xpath("//input[@type = 'submit']"));
        BrowserUtils.sleepMethod(3);
        loginButton.click();
        //loginButton+ Keys.ENTER;




    }
}
