package pageObject.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageObject.BasePage;

public class TextBoxPage extends BasePage {

    @FindBy(id = "userName")
    private WebElement fullNameField;
    @FindBy(id = "userEmail")
    private WebElement emailField;
    @FindBy(id = "currentAddress")
    private WebElement currentAddressField;
    @FindBy(id = "permanentAddress")
    private WebElement permanentAddressField;
    @FindBy(xpath = "//p[@id=\"name\"]")
    private WebElement nameResult;
    @FindBy(id = "email")
    private WebElement emailResult;
    @FindBy(xpath = "//p[@id=\"currentAddress\"]")
    private WebElement currentAddressResult;
    @FindBy(xpath = "//p[@id=\"permanentAddress\"]")
    private WebElement permanentAddressResult;
    @FindBy(id = "submit")
    private WebElement submitButton;

    public TextBoxPage typeValues(String name, String email, String currentAddress, String permanentAddress){
        fullNameField.sendKeys(name);
        emailField.sendKeys(email);
        currentAddressField.sendKeys(currentAddress);
        permanentAddressField.sendKeys(permanentAddress);
        return this;
    }

    public TextBoxPage clickSubmitButton(){
        submitButton.click();
        return this;
    }


    public boolean checkValues(String name, String email, String currentAddress, String permanentAddress) {
        return nameResult.getText().equals("Name:" + name) &&
                emailResult.getText().equals("Email:" + email) &&
                currentAddressResult.getText().equals("Current Address :" + currentAddress) &&
                permanentAddressResult.getText().equals("Permananet Address :" + permanentAddress);
    }




    public TextBoxPage(WebDriver driver) {
        super(driver);
    }
}
