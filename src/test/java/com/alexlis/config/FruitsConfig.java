package com.alexlis.config;

import org.aeonbits.owner.Config;

import java.util.List;

public interface FruitsConfig extends Config {

    @Separator(";")
    @Key("fruits.ids")
    List<Integer> getFruitsIds();

    @Separator(",")
    @Key("fruits.list")
    List<String> getFruitsList();

    @Separator(";")
    @Key("fruits.array")
    String[] getFruitsArray();

}
