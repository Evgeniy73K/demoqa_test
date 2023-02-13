package com.example.demoqa.elements;

import com.example.demoqa.BaseTest;
import dev.failsafe.internal.util.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class ElementsPageTest extends BaseTest {

    //test data
    private String name = "Name";
    private String email = "test@mail.ru";
    private String currentAddress = "test1";
    private  String permanentAddress = "test2";

    @Test
    public void validInputTextBoxTest() {
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
        basePage.goToElementsPage();
        elementsPage.goToCheckBoxPage();
        checkBoxPage.clickDropDown()
                .selectDesktop();
        Assert.isTrue(checkBoxPage.checkResult(), "Values is not equals");
    }
}