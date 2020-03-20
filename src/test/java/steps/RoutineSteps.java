package steps;

import io.qameta.allure.Step;
import pages.RoutinePage;

public class RoutineSteps {

    private RoutinePage routinePage;

    public RoutineSteps() {
        routinePage = new RoutinePage();
    }

    @Step("Open Routine Manager")
    public RoutineSteps openRoutineManagerTab() {
        routinePage
                .openRoutineManagerTab();
        return this;
    }

    @Step("Create New Routine")
    public RoutineSteps createNewRoutine() {
        routinePage
                .createNewRoutine();
        return this;
    }

    @Step("Set Current Routine")
    public void setAsCurrent() {
        routinePage
                .setAsCurrentRoutine();
    }

    @Step("Update Routine")
    public void updateRoutine() {
        routinePage
                .updateCreatedRoutine();
    }
}
