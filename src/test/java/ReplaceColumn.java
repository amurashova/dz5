import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.DragAndDropOptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;


public class ReplaceColumn {

    @Test
    void useActions() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        $("#column-a").hover();
        actions().clickAndHold().moveByOffset(200, 0).release().perform();
        $("#column-a").shouldHave(exactText("B"));
        $("#column-b").shouldHave(exactText("A"));
    }

    @Test
    void useDragAndDrop() {
        open("https://the-internet.herokuapp.com/drag_and_drop");

        $("#column-a").dragAndDrop(DragAndDropOptions.to("#column-b"));

        $("#column-a").shouldHave(exactText("B"));
        $("#column-b").shouldHave(exactText("A"));
    }

}
