package com.alexlis.tests;

import com.alexlis.config.WebDriverConfig;
import com.alexlis.config.WebDriverProvider;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WebDriverTest {

    //    private final SimpleWebDriverConfig config =
//            ConfigFactory.create(SimpleWebDriverConfig.class, System.getProperties());
    private final WebDriverConfig config = new WebDriverConfig();
    private final WebDriverProvider provider = new WebDriverProvider(config);


    @Test
    public void testTitle() {
        WebDriver driver = provider.get();
        driver.get(config.getBaseUrl());
        assertEquals(
                "GitHub: Where the world builds software · GitHub",
                driver.getTitle()
        );
        driver.quit();
    }

}
