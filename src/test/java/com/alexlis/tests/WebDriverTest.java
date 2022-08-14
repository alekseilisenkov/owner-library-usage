package com.alexlis.tests;

import com.alexlis.config.HugeWebDriverConfig;
import com.alexlis.config.WebDriverProvider;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WebDriverTest {

    private final HugeWebDriverConfig config = new HugeWebDriverConfig();
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
