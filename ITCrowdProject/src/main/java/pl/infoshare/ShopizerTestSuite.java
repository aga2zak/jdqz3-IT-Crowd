package pl.infoshare;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import pl.infoshare.categories.*;
import pl.infoshare.tests.*;

@RunWith(Categories.class)
@Categories.IncludeCategory({PurchaseTests.class, AddToCartTest.class, AddToCartRandomBagTest.class,
        AddToCartNextRandomBagTest.class, PurchaseLaptopBagTest.class, HandbagsOnFooter.class, LaptopBagsOnFooter.class,
        SignInOnFooter.class, BeachBagsOnFooter.class, ValidateNameIsRequired.class, ValidateLastnameIsRequired.class,
        ValidateStreetAddressIsRequired.class})
@Suite.SuiteClasses({PurchaseTest.class, FooterTest.class, LoginTest.class, QuantityTest.class,
        BillingInformationValidationTest.class})
public class ShopizerTestSuite {
}
