import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class Solutions {

    @Test
    void enterprise() {
        open("https://github.com/");
        // выбор пункта меню Enterprise
        $(".header-menu-wrapper").$(byText("Solutions")).hover();
        $(withText("Enterprise")).click();

        // проверка: на странице Enterprise есть текст The AI-powered
        $("#hero-section-brand-heading").shouldHave(text("The AI-powered"));
    }
}
