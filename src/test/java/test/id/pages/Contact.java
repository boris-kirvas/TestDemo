package test.id.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Contact extends Page {

    @FindBy(how = How.NAME, using = "fname")
    public WebElement firstName;

    @FindBy(how = How.NAME, using = "lname")
    public WebElement lastName;

    @FindBy(how = How.NAME, using = "email")
    public WebElement email;

    @FindBy(how = How.XPATH, using = "//textarea[contains(@class, 'field-element')]")
    public WebElement messageBox;

    @FindBy(how = How.XPATH, using = "//input")
    public WebElement submitButton;

    @FindBy(how = How.LINK_TEXT, using = "Thank you!")
    public WebElement successMsg;

    public void setFirstName(String firstName) {
        this.firstName.sendKeys(firstName);
    }

    public void setLastName(String lastName) {
        this.lastName.sendKeys(lastName);
    }

    public void setEmail(String email) {
        this.email.sendKeys(email);
    }

    public void setMessageText(String message) {
        this.messageBox.sendKeys(message);
    }

    public Contact(WebDriver driver) {
        super(driver);
    }
}
