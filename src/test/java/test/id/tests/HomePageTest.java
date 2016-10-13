package test.id.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import org.testng.asserts.SoftAssert;
import test.id.TestNgTestBase;
import test.id.pages.AdvisoryBoard;
import test.id.pages.HomePage;

public class HomePageTest extends TestNgTestBase {

  private HomePage homepage;
  private AdvisoryBoard advisoryBoard;

  @BeforeMethod
  public void initPageObjects() {
    homepage = PageFactory.initElements(driver, HomePage.class);
    advisoryBoard = PageFactory.initElements(driver, AdvisoryBoard.class);
  }

  @Test(priority = 0)
  public void homePageElementsValidation() {
    driver.get(baseUrl);

    SoftAssert softAssert = new SoftAssert();
    softAssert.assertTrue(homepage.bannerImage.isDisplayed(), "Banner image is displayed on the home page");
    softAssert.assertTrue(homepage.pageThumb.isDisplayed(), "Page thumb is displayed");
    softAssert.assertTrue(homepage.navigationPanel.isDisplayed(), "Navigation panel is displayed");

    softAssert.assertAll();
  }

  @Test(priority = 1)
    public void checkNavigationTool(){
      driver.get(baseUrl);

      homepage.clickAdvisoryBoardLink();
      try {
          Thread.sleep(3000);
      } catch (InterruptedException e) {
          e.printStackTrace();
      }
      System.out.println(advisoryBoard.getTitle());
      Assert.assertTrue(advisoryBoard.getTitle().contains("Medical Advisory Board"), "Medical Advisory Board has corresponding title");
      Assert.assertTrue(advisoryBoard.carousel.isDisplayed(), "Advisory board carousel is displayed");
  }
}
