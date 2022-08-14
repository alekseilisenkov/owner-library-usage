package com.alexlis.tests;

import com.alexlis.config.MainConfig;
import com.codeborne.selenide.Configuration;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * boolean remoteStart is trigger of remote start configuration
 */
public class TestBase {

    @BeforeAll
    static void setupBeforeAll() {

        boolean remoteStart = true;

        if (remoteStart) {
            System.setProperty("name", "remoteChrome");
            MainConfig config = ConfigFactory.create(MainConfig.class, System.getProperties());

            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("enableVNC", true);
            capabilities.setCapability("enableVideo", true);

            String login = config.selenideLogin();
            String password = config.selenidePassword();
            String url = config.getRemoteUrl();
            Configuration.remote = String.format("https://%s:%s@%s", login, password, url);
            Configuration.browserVersion = config.getVersion();
            Configuration.browser = config.getBrowser();
            Configuration.browserSize = config.getSize();
            Configuration.browserCapabilities = capabilities;
        } else {
            System.setProperty("name", "localChrome");
            MainConfig config = ConfigFactory.create(MainConfig.class, System.getProperties());
            Configuration.browserSize = config.getSize();
            Configuration.browser = config.getBrowser();
            Configuration.browserVersion = config.getVersion();
        }
    }
}
