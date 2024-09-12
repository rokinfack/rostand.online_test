package com.rostand.store.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import com.rostand.store.pages.LoginPage;
import com.rostand.store.utils.BaseClass;

public class LoginTest extends BaseClass {

    private WebDriver driver;
    private LoginPage loginPage;

    // Utilisation d'un constructeur ou d'une méthode @BeforeEach pour l'initialisation
    @BeforeEach
    public void setupTest() {
        // Utilise le WebDriver hérité de BaseClass
        driver = BaseClass.getWebDriver();;
        loginPage = new LoginPage(driver);
    }

    @Test
    public void login() {
        // Utilisation des guillemets doubles pour les chaînes de caractères
        loginPage.enterEmail("rostandkana2@gmail.com");
        loginPage.enterPassword("rostand");
        loginPage.clickLoginBtnElement();

        Assertions.assertTrue(loginPage.accountElementIsDisplay());
    }
}
