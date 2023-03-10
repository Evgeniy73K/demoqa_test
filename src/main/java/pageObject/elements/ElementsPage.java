package pageObject.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageObject.BasePage;

public class ElementsPage extends BasePage {
    public ElementsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[text()=\"Text Box\"]")
    private WebElement textBoxLink;
    @FindBy(xpath = "//span[text()=\"Check Box\"]")
    private WebElement checkBoxLink;
    @FindBy(xpath = "//span[text()=\"Radio Button\"]")
    private WebElement radioButtonLink;
    @FindBy(xpath = "//span[text()=\"Web Tables\"]")
    private WebElement webTablesLink;
    @FindBy(xpath = "//span[text()=\"Buttons\"]")
    private WebElement buttonsPageLink;



    public void goToTextBoxPage(){
        textBoxLink.click();
    }

    public void goToRadioButtonPage(){
        radioButtonLink.click();
    }

    public void goToCheckBoxPage(){
        checkBoxLink.click();
    }
    public void goToWebTablePage(){
        webTablesLink.click();
    }

    public void goToButtonPage(){
        buttonsPageLink.click();
    }
}
