package lt.dobilas.pom.pages.varle;

import lt.dobilas.pom.pages.Common;
import lt.dobilas.pom.pages.Locator;

public class AddToCartPage {
    public static void openUrl(String url) {
        Common.setUpChrome(8);
        Common.openUrl(url);
    }

    public static void clickOnAcceptCookies() {
        Common.clickOnElement(Locator.Varle.AddToCard.buttonLeistiSlapukus);
    }

    public static void clickOnSportasLaisvalaikis() {
        Common.clickOnElement(Locator.Varle.AddToCard.buttonSportasLaisvalaikis);
    }

    public static void clickOnZiemosSportas() {
        Common.clickOnElement(Locator.Varle.AddToCard.buttonZiemosSportas);
    }

    public static void clickOnSlides() {
        Common.clickOnElement(Locator.Varle.AddToCard.buttonSlides);
    }

    public static void clickOnExactProduct() {
        Common.clickOnElement(Locator.Varle.AddToCard.exactProduct);
    }

    public static void addToCart() {
        Common.clickOnElement(Locator.Varle.AddToCard.toCart);
    }

    public static String readText() {
        return Common.getText(Locator.Varle.AddToCard.readText);
    }

    public static void clickOnPirkti() {
        Common.clickOnElement(Locator.Varle.AddToCard.pirkti);
    }
}

