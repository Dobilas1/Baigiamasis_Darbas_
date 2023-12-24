package lt.dobilas.pom.tests.varle;

import lt.dobilas.pom.pages.varle.LoginPage;
import lt.dobilas.pom.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    @BeforeMethod
    @Override
    public void setUp() {
        LoginPage.openUrl("https://www.varle.lt/");
    }

    @Test
    public void testLoginPositive() {
        String email = "praktika141@gmail.com";
        String password = "naujimetai2024";
        String expectedResult = "Sveiki,";
        String actualResult;

        LoginPage.clickOnButtonAcceptCookies();
        LoginPage.clickOnButtonPrisijungimas();
        LoginPage.inputLoginEmail(email);
        LoginPage.inputLoginPassword(password);
        LoginPage.clickOnButtonPrisijungti();

        actualResult = LoginPage.readName();

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testLoginNegative() {
        String email = "praktika141@gmail.com";
        String password = "naujimetai2023";
        String expectedResult = "Pateiktas el. pašto adresas ir/arba slaptažodis yra neteisingi.";
        String actualResult;

        LoginPage.clickOnButtonAcceptCookies();
        LoginPage.clickOnButtonPrisijungimas();
        LoginPage.inputLoginEmail(email);
        LoginPage.inputLoginPassword(password);
        LoginPage.clickOnButtonPrisijungti();

        actualResult = LoginPage.readError();

        Assert.assertEquals(actualResult, expectedResult);
    }
}
