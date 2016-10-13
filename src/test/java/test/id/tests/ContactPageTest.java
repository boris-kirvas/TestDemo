package test.id.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.id.TestNgTestBase;
import test.id.pages.AdvisoryBoard;
import test.id.pages.Contact;
import test.id.pages.HomePage;


public class ContactPageTest extends TestNgTestBase {
    private HomePage homePage;
    private Contact contactPage;

    @BeforeMethod
    public void initPageObjects() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        contactPage = PageFactory.initElements(driver, Contact.class);
    }


    @Test
    public void submitMessage(){
        driver.get(baseUrl);

        homePage.contactLink.click();
        contactPage.setFirstName("Myfirstname");
        contactPage.setLastName("MyLastName");
        contactPage.setEmail("my$email.com");
        contactPage.setMessageText("Tis is just a test");

        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
