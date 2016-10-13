package test.id.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Sample page
 */
public class HomePage extends Page {

  @FindBy(how = How.ID, using = "banner")
  public WebElement bannerImage;

  @FindBy(how = How.ID, using = "main-navigation")
  public WebElement navigationPanel;

  @FindBy(how = How.XPATH, using = ".//*[@id=\"main-navigation\"]/ul/li[1]/a")
  public WebElement aboutLink;

  @FindBy(how = How.LINK_TEXT, using = "Management Team")
  public WebElement managementLink;

  @FindBy(how = How.CSS, using = ".folder-collection.folder li:nth-child(2) a")
  public WebElement advisoryBoard;

  @FindBy(how = How.LINK_TEXT, using = "Careers")
  public WebElement careersLink;

  @FindBy(how = How.LINK_TEXT, using = "Primary Care Council")
  public WebElement primaryCareCouncilLink;

  @FindBy(how = How.LINK_TEXT, using = "Be An Insider")
  public WebElement beAnInsiderLink;

  @FindBy(how = How.XPATH, using = "//*[@id=\"main-navigation\"]/ul/li[5]/a")
  public WebElement contactLink;

  @FindBy(how = How.ID, using = "page-thumb")
  public WebElement pageThumb;



    public void clickManagementTeamLink(){
        Actions action = new Actions(driver);
        action.moveToElement(aboutLink).build().perform();
        managementLink.click();
    }

    public void clickAdvisoryBoardLink(){
        Actions action = new Actions(driver);
        action.moveToElement(aboutLink).build().perform();
        advisoryBoard.click();
    }



  public HomePage(WebDriver webDriver) {
    super(webDriver);
  }
}
