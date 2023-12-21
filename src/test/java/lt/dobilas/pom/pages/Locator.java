package lt.dobilas.pom.pages;

import org.openqa.selenium.By;

public class Locator {
    public static class Varle {
        public static class Register {
            public static By buttonLeistiVisusSlapukus = By.xpath("//button[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']");
            public static By buttonPrisijungimas = By.xpath("//span[@class='register']");
            public static By buttonRegistruotis = By.xpath("//a[contains(., 'Registruotis')]");
            public static By inputEmail = By.xpath("//input[@name='email']");
            public static By inputPassword = By.xpath("//input[@name='password1']");
            public static By repeatPassword = By.xpath("//input[@name='password2']");
            public static By buttonTos = By.xpath("//input[@name='agreement_check']");
            public static By buttonSubmit = By.xpath("//button[@class='primary-button full-width login-btn']");
            public static By readLoginText = By.xpath("(//span[contains(., 'Sveiki,')])[2]");
            public static By readErrorText = By.xpath("//ul[contains(., 'Įvesti slaptažodžiai nesutampa')]");
        }

        public static class Login {

            public static By inputLoginEmail = By.xpath("//input[@name='login']");
            public static By inputLoginPassword = By.xpath("//input[@name='password']");
            public static By buttonPrisijungti = By.xpath("//button[@class='primary-button full-width login-btn']");
            public static By readText = By.xpath("(//span[contains(., 'Sveiki,')])[2]");
            public static By readError = By.xpath("//div[@class= 'error-message-box']");
        }

        public static class AddToCard {
            public static By buttonLeistiSlapukus = By.xpath("//button[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']");
            public static By buttonSportasLaisvalaikis = By.xpath("//a[@title='Sportas, laisvalaikis, turizmas']");
            public static By buttonZiemosSportas = By.xpath("//li[@data-title='Žiemos sportas']");
            public static By buttonSlides = By.xpath("//li[@data-title='Slidės']");
            public static By exactProduct = By.xpath("//img[@alt='Rossignol Radical JR vaikiškow kalnų slidės 150']");
            public static By toCart = By.xpath("//a[@class='primary-button full-width add-to-cart in-stock'][1]");
            public static By pirkti = By.xpath("//button[@class='primary-button']");
            public static By readText = By.xpath("//strong[contains(., 'Krepšelis')]");
        }
    }
}
