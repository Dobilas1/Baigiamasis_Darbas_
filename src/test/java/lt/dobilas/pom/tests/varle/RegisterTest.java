package lt.dobilas.pom.tests.varle;

import lt.dobilas.pom.pages.varle.RegisterPage;
import lt.dobilas.pom.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegisterTest extends TestBase {

    @BeforeMethod
    @Override
    public void setUp() {
        RegisterPage.openUrl("https://www.varle.lt/");
    }

    @Test
    public void testRegisterPositive() {
        String email = "karvyte474@gmail.com";
        String password = "asd181";
        String expectedResult = "Sveiki,";
        String actualResult;

        RegisterPage.clickOnButtonAcceptCookies();
        RegisterPage.clickOnButtonPrisijungimas();
        RegisterPage.clickOnButtonRegistruotis();
        RegisterPage.writeEmail(email);
        RegisterPage.writePassword(password);
        RegisterPage.writeIncorrectPassword(password);
        RegisterPage.acceptTos();
        RegisterPage.clickOnButtonSubmit();

        actualResult = RegisterPage.readLoginName();

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testRegisterNegative() {
        String email = "karvyte1919@gmail.com";
        String password = "asd181";
        String wrongPassword = "qwe789";
        String expectedResult = "Įvesti slaptažodžiai nesutampa";
        String actualResult;

        RegisterPage.clickOnButtonAcceptCookies();
        RegisterPage.clickOnButtonPrisijungimas();
        RegisterPage.clickOnButtonRegistruotis();
        RegisterPage.writeEmail(email);
        RegisterPage.writePassword(password);
        RegisterPage.writeIncorrectPassword(wrongPassword);
        RegisterPage.acceptTos();
        RegisterPage.clickOnButtonSubmit();

        actualResult = RegisterPage.readErrorMessage();

        Assert.assertEquals(actualResult, expectedResult);
    }
}
