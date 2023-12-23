package lt.dobilas.pom.tests.varle;

import lt.dobilas.pom.pages.varle.AddToCartPage;
import lt.dobilas.pom.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddToCartTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        AddToCartPage.openUrl("https://www.varle.lt/");
    }

    @Test
    public void test() {
        String expectedResult = "Krepšelis";
        String actualResult;


        AddToCartPage.clickOnAcceptCookies();
        AddToCartPage.clickOnSportasLaisvalaikis();
        AddToCartPage.clickOnZiemosSportas();
        AddToCartPage.clickOnSlides();
        AddToCartPage.clickOnExactProduct();
        AddToCartPage.addToCart();
        try {
            // Labai atsiprasau uz sita, kitaip nepavyko.
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        AddToCartPage.clickOnPirkti();


        actualResult = AddToCartPage.readText();

        Assert.assertEquals(actualResult, expectedResult);
    }
}
