package pageObject.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import pageObject.BasePage;


public class ButtonsPage extends BasePage {
    @FindBy(xpath = "//button[@id=\"doubleClickBtn\"]")
    private WebElement doubleClickButton;
    @FindBy(xpath = "//button[@id=\"rightClickBtn\"]")
    private WebElement rightClickButton;
    @FindBy(xpath = "//button[@id=\"tI8AI\"]")
    private WebElement clickButton;
    @FindBy(xpath = "//p[@id=\"doubleClickMessage\"]")
    private WebElement doubleClickMessage;
    @FindBy(xpath = "//p[@id=\"rightClickMessage\"]")
    private WebElement rightClickMessage;
    @FindBy(xpath = "//p[@id=\"dynamicClickMessage\"]")
    private WebElement dynamicClickMessage;

    public WebElement getDoubleClickButton(){
        return doubleClickButton;
    }

    public WebElement getRightClickButton(){
        return rightClickButton;
    }

    public ButtonsPage clickButton(){
        clickButton.click();
        return this;
    }



    public ButtonsPage(WebDriver driver) {
        super(driver);
    }
}
