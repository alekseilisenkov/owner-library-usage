package com.alexlis.tests;

import com.alexlis.config.Browser;
import com.alexlis.config.TypesConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Typestest {

    private TypesConfig config;

    @Test
    public void testInteger() {
        System.setProperty("integer", "10");
        config = ConfigFactory
                .create(TypesConfig.class, System.getProperties());
        assertThat(config.getInteger()).isEqualTo(10);
    }

    @Test
    public void testBoolean() {
        System.setProperty("boolean", "false");
        config = ConfigFactory
                .create(TypesConfig.class, System.getProperties());
        assertThat(config.getBoolean()).isEqualTo(false);
    }

    @Test
    public void testDouble() {
        System.setProperty("double", "12.12");
        config = ConfigFactory
                .create(TypesConfig.class, System.getProperties());
        assertThat(config.getDouble()).isEqualTo(20.55);
    }

    @Test
    public void testEnum() {
        System.setProperty("enum", "FIREFOX");
        config = ConfigFactory
                .create(TypesConfig.class, System.getProperties());
        assertThat(config.getEnum()).isEqualTo(Browser.FIREFOX);
    }
}
