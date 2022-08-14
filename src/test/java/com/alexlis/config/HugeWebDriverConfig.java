package com.alexlis.config;


import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class HugeWebDriverConfig {

    public URL getRemoteUrl() {
        //зачитываем
        String remoteUrl = System.getProperty("remoteUrl");
        //конвертируем
        try {
            return new URL(remoteUrl);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public int getPort() {
        //зачитываем
        String port = System.getProperty("port");
        //конвертируем
        return Integer.parseInt(port);
    }

    public Browser getBrowser() {
        //зачитываем
        String browserName = System.getProperty("browser");
        //конвертируем
        return Browser.valueOf(browserName);
    }

    public String getBaseUrl() {
        //зачитываем
        //конвертируем
        return  System.getProperty("baseUrl");
    }

}
