package com.nextbasecrm.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
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
        driver.get(ConfigurationReader.getProperty("env"));

    }
    



}
