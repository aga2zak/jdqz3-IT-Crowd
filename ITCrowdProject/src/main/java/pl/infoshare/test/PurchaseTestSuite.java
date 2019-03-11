package pl.infoshare.test;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import pl.infoshare.catrgories.PurchaseTests;
import pl.infoshare.tests.PurchaseTest;

@RunWith(Categories.class)
@Categories.IncludeCategory({PurchaseTests.class})
@Suite.SuiteClasses(PurchaseTest.class)
public class PurchaseTestSuite {
}
