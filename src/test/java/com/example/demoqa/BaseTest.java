package com.example.demoqa;

import Config.Params;
import org.junit.jupiter.api.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObject.BasePage;
import pageObject.elements.CheckBoxPage;
import pageObject.elements.ElementsPage;
import pageObject.elements.TextBoxPage;

import java.time.Duration;

public class BaseTest {
    protected WebDriver driver;
    protected BasePage basePage;




    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Params.ImplicitWait));
        driver.get(Params.URL);
        basePage = new BasePage(driver);



    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }




}
