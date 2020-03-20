package tests;

import org.testng.annotations.Test;

public class CreateCustomExerciseTest extends BaseTest {

    @Test
    public void createCustomExerciseTest() {
        loginSteps
                .login(prop.get("username"), prop.get("password"));
        homePageSteps
                .verifyHomePageIsOpen()
                .openMyCustomExercises()
                .createCustomExercise();
    }
}
