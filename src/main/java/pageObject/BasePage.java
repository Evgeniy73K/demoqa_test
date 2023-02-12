package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// https://demoqa.com/
public class BasePage {
    @FindBy(xpath = "//h5[text()=\"Elements\"]")
    public WebElement elementsLink;

    public void goToElementsPage(){
        elementsLink.click();
    }



    public BasePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
