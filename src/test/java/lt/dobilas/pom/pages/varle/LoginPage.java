package lt.dobilas.pom.pages.varle;

import lt.dobilas.pom.pages.Common;
import lt.dobilas.pom.pages.Locator;

public class LoginPage {
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

    public static void inputLoginEmail(String email) {
        Common.addText(Locator.Varle.Login.inputLoginEmail, email);
    }

    public static void inputLoginPassword(String password) {
        Common.addText(Locator.Varle.Login.inputLoginPassword, password);
    }

    public static void clickOnButtonPrisijungti() {
        Common.clickOnElement(Locator.Varle.Login.buttonPrisijungti);
    }

    public static String readName() {
        return Common.getText(Locator.Varle.Login.readText);
    }

    public static String readError() {
        return Common.getText(Locator.Varle.Login.readError);
    }
}
