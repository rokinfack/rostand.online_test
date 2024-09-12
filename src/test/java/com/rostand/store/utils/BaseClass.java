package com.rostand.store.utils;

import java.time.Duration;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
    private static WebDriver webDriver;

    @BeforeAll
    public static void setup() {
        // Initialisation du driver Chrome
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        
        // Gestion des temps d'attente implicites
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Accès à l'URL spécifiée
        webDriver.get("https://rostand.store/login");
    }
    // Getter pour WebDriver
    public static WebDriver getWebDriver() {
      return webDriver;
  }

    @AfterAll
    public static void tearDown() {
        // Fermeture du navigateur
        if (webDriver != null) {
            webDriver.quit();
        }
    }
}
