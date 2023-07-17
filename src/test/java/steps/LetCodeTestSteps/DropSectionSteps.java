package steps.LetCodeTestSteps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.letCodePages.DropSectionPage;

public class DropSectionSteps {

    DropSectionPage dropPage = new DropSectionPage();

    @When("Click DropAuı Button In The Drop Section On The Homepage")
    public void click_drop_auı_button_in_the_drop_section_on_the_homepage() {
        dropPage.clickAUI2Btn();
    }
    @When("Drag Source Box On Target Box")
    public void drag_source_box_on_target_box() {
        dropPage.dragAndDropSourceBox();
    }
    @Then("Verify that Where Is The Source Box")
    public void verify_that_where_is_the_source_box() {
    }


}
