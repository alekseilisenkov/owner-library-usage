package com.alexlis.config;


public class WebDriverConfig {

    public Browser getBrowser() {
        String browserName = System.getProperty("browser");
        return Browser.valueOf(browserName);
    }

    public String getBaseUrl() {
        return  System.getProperty("baseUrl");
    }

}
