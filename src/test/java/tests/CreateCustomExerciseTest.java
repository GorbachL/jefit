package tests;

import org.testng.annotations.Test;

public class CreateCustomExerciseTest extends BaseTest {

    @Test(description = "Custom Exercise", groups = {"init"})
    public void createCustomExerciseTest() {
        loginSteps
                .login(prop.get("username"), prop.get("password"));
        homePageSteps
                .verifyHomePageIsOpen()
                .openMyCustomExercises();
        exerciseSteps
                .verifyExerciseIsOpen()
                .createCustomExercise();
    }
}
