package test.id.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AdvisoryBoard extends Page {

   @FindBy(how = How.CLASS_NAME, using = "sqs-gallery-container")
   public WebElement carousel;



    public AdvisoryBoard(WebDriver driver) {
        super(driver);
    }
}
