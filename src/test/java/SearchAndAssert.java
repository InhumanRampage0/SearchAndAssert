import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SearchAndAssert {


    @Test
    void selenideSearchTest() {
        open("https://github.com/selenide/selenide");

        $("[data-content=Wiki]").click();
        $(byText("Soft assertions")).shouldBe(visible).click();
        $(".markdown-body").shouldHave(text("Using JUnit5 extend test class"));

}
}
