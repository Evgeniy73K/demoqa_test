package pageObject.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageObject.BasePage;

public class RadioButtonPage extends BasePage {

    @FindBy(xpath = "//input[@id=\"yesRadio\"]/following::label")
    private WebElement yesRadio;
    @FindBy(xpath = "//input[@id=\"impressiveRadio\"]/following::label")
    private WebElement impressiveRadio;
    @FindBy(xpath = "//span[@class=\"text-success\"]")
    private WebElement result;

    public RadioButtonPage selectRadio(String value){
        switch (value){
            case "Yes":
                yesRadio.click();
                break;
            case "Impressive":
                impressiveRadio.click();
                break;
        }
        return this;
    }

    public boolean checkResult(String value){
        return result.getText().equals(value);
    }

    public RadioButtonPage(WebDriver driver) {
        super(driver);
    }
}
