package com.example.demoqa;

import Config.Params;
import org.junit.jupiter.api.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import pageObject.BasePage;
import pageObject.elements.CheckBoxPage;
import pageObject.elements.ElementsPage;
import pageObject.elements.TextBoxPage;
import pageObject.elements.WebTablesPage;

import java.time.Duration;

public class BaseTest {
    protected WebDriver driver;
    protected Actions act;
    protected BasePage basePage;
    protected ElementsPage elementsPage;
    protected WebTablesPage webTablesPage;




    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Params.ImplicitWait));
        driver.get(Params.URL);
        act = new Actions(driver);
        basePage = new BasePage(driver);
        elementsPage = new ElementsPage(driver);



    }

    @AfterEach
    public void tearDown() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }




}
