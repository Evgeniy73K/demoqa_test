package pageObject.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageObject.BasePage;

import java.util.List;

public class WebTablesPage extends BasePage {
    @FindBy(xpath = "//button[@id=\"addNewRecordButton\"]")
    private WebElement addButton;
    @FindBy(xpath = "//input[@id=\"firstName\"]")
    private WebElement firstNameField;
    @FindBy(xpath = "//input[@id=\"lastName\"]")
    private WebElement lastNameField;
    @FindBy(xpath = "//input[@id=\"userEmail\"]")
    private WebElement userEmailField;
    @FindBy(xpath = "//input[@id=\"age\"]")
    private WebElement ageField;
    @FindBy(xpath = "//input[@id=\"department\"]")
    private WebElement departmentField;
    @FindBy(xpath = "//button[@id=\"submit\"]")
    private WebElement submitButton;
    @FindBy(xpath = "//input[@id=\"salary\"]")
    private WebElement salaryField;
    @FindBy(xpath = "//div[@class=\"rt-td\"]")
    private List<WebElement> valuesOfTable;

    public WebTablesPage(WebDriver driver) {
        super(driver);
    }

    public WebTablesPage typeRegistrationForm(String name, String lastName, String email, String age,String salary, String department){
        addButton.click();
        firstNameField.sendKeys(name);
        lastNameField.sendKeys(lastName);
        userEmailField.sendKeys(email);
        ageField.sendKeys(age);
        salaryField.sendKeys(salary);
        departmentField.sendKeys(department);
        submitButton.click();
        return this;
    }

    public boolean test(String name, String lastName, String email, String age,String salary, String department) {
        for (WebElement element : valuesOfTable) {
            if (element.getText().equals(name) ||
                    element.getText().equals(lastName) ||
                    element.getText().equals(email) ||
                    element.getText().equals(age) ||
                    element.getText().equals(salary) ||
                    element.getText().equals(department)
            ) {
                return true;
            }
        }
        return false;


    }
}
