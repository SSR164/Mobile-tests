package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.WikiPage;


public class SearchTests extends TestBase {
    WikiPage wikiPage =new WikiPage();
    String appiumElement = "Appium";
    String koreaElement = "Korea";
    String text= "Region in East Asia";

    @Test
    @DisplayName("Поиск {appiumElement}")
    @Tag("android")
    void successfulSearchTest() {
        wikiPage.clicSearchWikipedia();
        wikiPage.searchElement(appiumElement);
        wikiPage.checkElement(appiumElement);


    }


    @Test
    @DisplayName("Поиск {koreaElement}")
    @Tag("android")
    void searchKoreaTest() {
        wikiPage.clicSearchWikipedia();
        wikiPage.searchElement(koreaElement);
        wikiPage.checkText(text);


    }
}
