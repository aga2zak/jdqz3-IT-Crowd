package pl.infoshare.tests;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pl.infoshare.categories.*;
import pl.infoshare.dataModels.Address;
import pl.infoshare.dataModels.Bag;
import pl.infoshare.dataModels.RegisteredUser;
import pl.infoshare.pages.*;

import static org.assertj.core.api.Assertions.assertThat;


public class FooterTest {

    private WebDriver driver;
    private BasePage basePage;
    private Address address;
    private RegisteredUser user;
    private Bag randomBag;
    private Bag randomBagNext;
    private Bag randomLaptopBag;

    @Before
    public void startBrowser() {
        driver = new ChromeDriver();
        this.basePage = new BasePage(driver);
        this.user = new RegisteredUser(true);
    }

    @After
    public void closeBrowser() {
        basePage.close();
    }


    @Category(HandbagsOnFooter.class)
    @Test
    public void handbagsOnFooter() {
        FooterPage footerPage = new FooterPage(driver);
        footerPage.clickHandbagsButtonOnFooter();

        HandbagCataloguePage handbagText = new HandbagCataloguePage(driver);
        assertThat(handbagText.handbagText()).isEqualTo("Handbags");
    }

    @Category(SignInOnFooter.class)
    @Test
    public void signInOnFooter() {
        FooterPage footerPage = new FooterPage(driver);
        footerPage.clickSignIn();
        CustomLogonPage customLogonPage = new CustomLogonPage(driver);
        assertThat(customLogonPage.isRegisteredCustomerSection()).isEqualTo("Registered customer");
        assertThat(customLogonPage.isNewCustomerSection()).isEqualTo("New customer");
    }

    @Category(BeachBagsOnFooter.class)
    @Test
    public void beachBagsOnFooter() {
        FooterPage footerPage = new FooterPage(driver);
        footerPage.clickBeachBags();

        BeachBagsCataloguePage beachBagsCataloguePage = new BeachBagsCataloguePage(driver);
        assertThat(beachBagsCataloguePage.getTitlePage()).isEqualTo("Beach bags");
    }

    @Category(HomeOnFooter.class)
    @Test
    public void homeFooter() {
        FooterPage footerPage = new FooterPage(driver);
        footerPage.clickHomeButtonOnFooter();

        MainPage mainPage = new MainPage(driver);
        assertThat(mainPage.featuredItemsText()).isEqualTo("Featured items");

    }

    @Category(LaptopBagsOnFooter.class)
    @Test
    public void LaptopBagsOnFooter() {
        FooterPage footerPage = new FooterPage(driver);
        footerPage.clickLaptopBagsButtonOnFooter();

        LaptopBagsCataloguePage laptopBagsCataloguePage = new LaptopBagsCataloguePage(driver);
        assertThat(laptopBagsCataloguePage.laptopBagText()).isEqualTo("Laptop bags");
    }

    @Category(ContactUsOnFooter.class)
    @Test
    public void contactUsFooter() {
        FooterPage footerPage = new FooterPage(driver);
        footerPage.clickContactUsButtonOnFooter();

        ContactUsPage contactUsPage = new ContactUsPage(driver);
        assertThat(contactUsPage.verifyContactUsText()).isEqualTo("Contact us");
    }
}