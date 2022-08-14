package com.alexlis.config;

import org.aeonbits.owner.Config;

public interface TypesConfig extends Config {

    @Key("integer")
    Integer getInteger();

    @Key("enum")
    Browser getEnum();

    @Key("double")
    Double getDouble();

    @Key("boolean")
    Boolean getBoolean();

}
