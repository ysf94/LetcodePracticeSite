package steps.LetCodeTestSteps;

import pages.letCodePages.InputAppPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class InputPagePracticesSteps {
    InputAppPage inputAppPage = new InputAppPage();

    @And("Use sendkeys to type your full name")
    public void useSendkeysToTypeYourFullName() {
        String fullName = "Yusuf Ali";
        inputAppPage.typeInputFullName(fullName);
    }

    @When("use keyboard TAB and go to type in next box")
    public void use_keyboard_tab_and_go_to_type_in_next_box() {
        inputAppPage.clickTabAppendAText();
    }

    @When("Verify that what is inside the text box")
    public void verify_that_what_is_inside_the_text_box() {
        inputAppPage.VerifyScopeOfTheText();
    }

    @When("Clear the next box and verify that the box is empty")
    public void clear_the_next_box_and_verify_that_the_box_is_empty() {
        inputAppPage.clearTheText();
    }

    @When("Confirm edit field is disabled")
    public void confirm_edit_field_is_disabled() {
        inputAppPage.verifyEditingIsEnabled();
    }

    @Then("Confirm text is readonly")
    public void confirm_text_is_readonly() {
        inputAppPage.verifyIsReadonly();
    }


}
