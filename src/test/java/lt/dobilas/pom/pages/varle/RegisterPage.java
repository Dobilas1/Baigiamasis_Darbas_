package lt.dobilas.pom.pages.varle;

import lt.dobilas.pom.pages.Common;
import lt.dobilas.pom.pages.Locator;

public class RegisterPage {
    public static void openUrl(String url) {
        Common.setUpChrome(8);
        Common.openUrl(url);
    }


    public static void clickOnButtonAcceptCookies() {
        Common.clickOnElement(Locator.Varle.Register.buttonLeistiVisusSlapukus);
    }

    public static void clickOnButtonPrisijungimas() {
        Common.clickOnElement(Locator.Varle.Register.buttonPrisijungimas);
    }

    public static void clickOnButtonRegistruotis() {
        Common.clickOnElement(Locator.Varle.Register.buttonRegistruotis);
    }

    public static void writeEmail(String email) {
        Common.addText(Locator.Varle.Register.inputEmail, email);
    }

    public static void writePassword(String password) {
        Common.addText(Locator.Varle.Register.inputPassword, password);
    }

    public static void writeIncorrectPassword(String password) {
        Common.addText(Locator.Varle.Register.repeatPassword, password);
    }

    public static void clickOnButtonSubmit() {
        Common.clickOnElement(Locator.Varle.Register.buttonSubmit);
    }

    public static void acceptTos() {
        Common.clickOnElement(Locator.Varle.Register.buttonTos);
    }

    public static String readLoginName() {
        return Common.getText(Locator.Varle.Register.readLoginText);
    }

    public static String readErrorMessage() {
        return Common.getText(Locator.Varle.Register.readErrorText);
    }
}
