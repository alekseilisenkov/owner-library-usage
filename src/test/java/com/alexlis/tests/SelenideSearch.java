package com.alexlis.tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SelenideSearch {

    @Test
    void shouldFindSelenideRepositoryName() {
        open("https://github.com");
        $("[data-test-selector=nav-search-input]").setValue("selenide").pressEnter();
        $$(".repo-list").first().$("a").click();
        $("#repository-container-header").should(text("selenide / selenide"));
    }
}
