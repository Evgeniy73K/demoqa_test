package com.example.demoqa.elements;

import com.example.demoqa.BaseTest;
import dev.failsafe.internal.util.Assert;
import org.junit.jupiter.api.Test;
import pageObject.elements.*;


public class ElementsPageTest extends BaseTest {
    private TextBoxPage textBoxPage;
    private CheckBoxPage checkBoxPage;
    private RadioButtonPage radioButtonPage;
    private ButtonsPage buttonsPage;



    //test data
    private String name = "Name";
    private String email = "test@mail.ru";
    private String currentAddress = "test1";
    private  String permanentAddress = "test2";

    @Test
    public void validInputTextBoxTest() {
        textBoxPage = new TextBoxPage(driver);
        basePage.goToElementsPage();
        elementsPage.goToTextBoxPage();
        textBoxPage.typeValues(name,
                        email,
                        currentAddress,
                        permanentAddress)
                .clickSubmitButton();
        Assert.isTrue(textBoxPage.checkValues(name,
                email,
                currentAddress,
                permanentAddress),"Values is not equals");
    }

    @Test
    public void validInputCheckBoxTest() {
        checkBoxPage = new CheckBoxPage(driver);
        basePage.goToElementsPage();
        elementsPage.goToCheckBoxPage();
        checkBoxPage.clickDropDown()
                .selectDesktop();
        Assert.isTrue(checkBoxPage.checkResult(), "Values is not equals");
    }

    @Test
    public void RadioButtonTest() {
        radioButtonPage = new RadioButtonPage(driver);
        basePage.goToElementsPage();
        elementsPage.goToRadioButtonPage();
        radioButtonPage.selectRadio("Yes");
        Assert.isTrue(radioButtonPage.checkResult("Yes"), "Values is not equals");
    }

    @Test
    public void registrationFormTest(){
        webTablesPage = new WebTablesPage(driver);
        basePage.goToElementsPage();
        elementsPage.goToWebTablePage();
        webTablesPage.typeRegistrationForm("Evgeniy",
                "Karabaev",
                "evg@test.ru",
                "29",
                "100",
                "QA");
        Assert.isTrue(webTablesPage.test("Evgeniy",
                "Karabaev",
                "evg@test.ru",
                "29",
                "100",
                "QA"), "Some elements is not equals");
    }

    @Test
    public void buttonsTest() throws InterruptedException {
        buttonsPage = new ButtonsPage(driver);
        basePage.goToElementsPage();
        elementsPage.goToButtonPage();
        act.doubleClick(buttonsPage.getDoubleClickButton()).perform();
        act.contextClick(buttonsPage.getRightClickButton()).perform();
        buttonsPage.clickButton();


    }


}