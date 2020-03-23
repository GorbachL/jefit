package elements;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MajorMuscleGroupSelect {

    public void selectMajorMuscleGroup(String option) {

        String SELECTOR_LOCATOR = "[name=selectpart]";
        $(SELECTOR_LOCATOR).click();

        String OPTION_LOCATOR = "[value='%s']";
        By optionByLocator = By.cssSelector(String.format(OPTION_LOCATOR, option));
        $(optionByLocator).click();
    }
}
