package com.example.demoqa.elements;

import com.example.demoqa.BaseTest;
import dev.failsafe.internal.util.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pageObject.elements.CheckBoxPage;
import pageObject.elements.ElementsPage;
import pageObject.elements.TextBoxPage;


public class ElementsPageTest extends BaseTest {
    private ElementsPage elementsPage;
    private TextBoxPage textBoxPage;
    private CheckBoxPage checkBoxPage;



    //test data
    private String name = "Name";
    private String email = "test@mail.ru";
    private String currentAddress = "test1";
    private  String permanentAddress = "test2";

    @Test
    public void validInputTextBoxTest() {
        elementsPage = new ElementsPage(driver);
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
        checkBoxPage = new CheckBoxPage(driver)
        basePage.goToElementsPage();
        elementsPage.goToCheckBoxPage();
        checkBoxPage.clickDropDown()
                .selectDesktop();
        Assert.isTrue(checkBoxPage.checkResult(), "Values is not equals");
    }
}