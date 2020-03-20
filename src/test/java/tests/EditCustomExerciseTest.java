package tests;

import org.testng.annotations.Test;

public class EditCustomExerciseTest extends BaseTest {

    @Test
    public void editCustomExersiceTest() {
        loginSteps
                .login(prop.get("username"), prop.get("password"));
        homePageSteps
                .verifyHomePageIsOpen()
                .openMyCustomExercises()
                .createCustomExercise()
                .editCustomExercise();
    }
}
