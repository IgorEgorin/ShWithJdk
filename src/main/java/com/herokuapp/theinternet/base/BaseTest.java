package com.herokuapp.theinternet.base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest {

    protected WebDriver driver;
    protected Logger log;


    @Parameters({"browser"})
    @BeforeMethod()
    protected void setUp(String browser, ITestContext ctx) {

         switch (browser) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
                driver = new ChromeDriver();
                break;

        }
        driver.manage().window().maximize();
        driver.get("https://www.kia.ru/models/sorento_prime/desc/");
        String testName = ctx.getCurrentXmlTest().getName();
        log = LogManager.getLogger(testName);

    }

    @AfterMethod()
    protected void tearDown() {
        log.info("[Closing driver]");
        driver.quit();
    }

}
