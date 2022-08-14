package com.alexlis.tests;

import com.alexlis.config.FruitsConfig;
import org.aeonbits.owner.ConfigFactory;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class FruitsTest {

    private FruitsConfig config;

    @Test
    public void testList() {
        System.setProperty("fruits.list", "banana,orange,apple");

        config = ConfigFactory.create(FruitsConfig.class, System.getProperties());
        Assertions.assertThat(config.getFruitsList())
                .contains("banana", "orange", "apple");
    }

    @Test
    public void testArray() {
        System.setProperty("fruits.array", "banana;orange;apple");

        config = ConfigFactory.create(FruitsConfig.class, System.getProperties());
        Assertions.assertThat(config.getFruitsArray())
                .contains("banana", "orange", "apple");
    }

    @Test
    public void testIds() {
        System.setProperty("fruits.ids", "1;2;3");

        config = ConfigFactory.create(FruitsConfig.class, System.getProperties());
        Assertions.assertThat(config.getFruitsIds())
                .contains(1, 2, 3);
    }
}
