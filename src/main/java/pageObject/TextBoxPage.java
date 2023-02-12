package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TextBoxPage extends BasePage{

    @FindBy(id = "userName")
    public WebElement fullNameField;
    @FindBy(id = "userEmail")
    public WebElement emailField;
    @FindBy(id = "currentAddress")
    public WebElement currentAddressField;
    @FindBy(id = "permanentAddress")
    public WebElement permanentAddressField;
    @FindBy(xpath = "//p[@id=\"name\"]")
    public WebElement nameResult;
    @FindBy(id = "email")
    public WebElement emailResult;
    @FindBy(xpath = "//p[@id=\"currentAddress\"]")
    public WebElement currentAddressResult;
    @FindBy(xpath = "//p[@id=\"permanentAddress\"]")
    public WebElement permanentAddressResult;
    @FindBy(id = "submit")
    public WebElement submitButton;

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
