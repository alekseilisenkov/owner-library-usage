package com.alexlis.config;

import org.aeonbits.owner.Config;

/**
 * var ${name} used by TestBase in ability to switch properties files
 */
@MainConfig.Sources({
        "classpath:config/${name}.properties"
})
public interface MainConfig extends Config {

    @Key("name.browser")
    String getBrowser();

    @Key("browser.size")
    String getSize();

    @Key("browser.version")
    String getVersion();

    @Key("config.remote")
    boolean isRemote();

    @Key("remote.url")
    String getRemoteUrl();

    @Key("selenide.login")
    String selenideLogin();

    @Key("selenide.password")
    String selenidePassword();
}
