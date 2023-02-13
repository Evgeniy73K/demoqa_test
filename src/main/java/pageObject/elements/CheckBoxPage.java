package pageObject.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageObject.BasePage;


public class CheckBoxPage extends BasePage {
    //elements
    @FindBy(xpath = "//button[@title=\"Toggle\"]")
    private WebElement dropDownButton;
    @FindBy(xpath = "//input[@id=\"tree-node-desktop\"]/following::span")
    private WebElement desktopCheckBox;
    @FindBy(xpath = "//div[@id=\"result\"]")
    private WebElement result;

    public CheckBoxPage clickDropDown(){
        dropDownButton.click();
        return this;
    }

    public CheckBoxPage selectDesktop(){
        desktopCheckBox.click();
        return this;
    }

    public boolean checkResult(){
        return result.getText().equals("You have selected :\n" +
                "desktop\n" +
                "notes\n" +
                "commands");
    }



    public CheckBoxPage(WebDriver driver) {
        super(driver);
    }
}
