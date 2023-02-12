package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementsPage extends BasePage{
    public ElementsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[text()=\"Text Box\"]")
    public WebElement textBoxLink;

    public void goToTextBoxPage(){
        textBoxLink.click();
    }
}
