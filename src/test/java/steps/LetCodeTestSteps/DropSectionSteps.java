package steps.LetCodeTestSteps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.letCodePages.DropSectionPage;

public class DropSectionSteps {

    DropSectionPage dropPage = new DropSectionPage();

    @When("Click the drop page entry button")
    public void click_the_drop_page_entry_button() {
        dropPage.clickAUI2Btn();
    }
    @When("Drop here")
    public void dropHere() {
        dropPage.verifyDropHere();
    }
    @When("Drag and drop box doing transit")
    public void drag_and_drop_box_doing_transit() {
        dropPage.dragAndDropSourceBox();
    }


    @Then("Verify that the operation is correct")
    public void verifyThatTheOperationIsCorrect() {
        dropPage.verifyThatDropped();
    }



}