package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.*;
import static io.appium.java_client.AppiumBy.accessibilityId;
import static io.appium.java_client.AppiumBy.id;

public class WikiPage {
    @Step("Нажимаем на строку поиска")
    public WikiPage clicSearchWikipedia(){
        $(accessibilityId("Search Wikipedia")).click();
        return this;
    }

    @Step("Ищем {searchElement}")
    public WikiPage searchElement(String searchElement){
        $(id("org.wikipedia.alpha:id/search_src_text")).sendKeys(searchElement);
        return this;
    }

    @Step("Проверяем что {searchElement} найден")
    public WikiPage checkElement(String searchElement){
        $$(id("org.wikipedia.alpha:id/page_list_item_title"))
                .shouldHave(sizeGreaterThan(0));
        return this;
    }
    @Step("Проверяем текст")
    public WikiPage checkText(String text){
        $(By.id("org.wikipedia.alpha:id/page_list_item_description")).shouldHave(exactText(text));
        return this;
    }
}
