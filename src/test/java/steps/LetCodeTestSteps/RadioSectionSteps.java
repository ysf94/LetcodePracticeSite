package steps.LetCodeTestSteps;

import pages.letCodePages.RadioSectionPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RadioSectionSteps {
    RadioSectionPage radioSectionPage = new RadioSectionPage();

    @When("Click to Toggle button in the Radio Section on the homepage")
    public void click_to_toggle_button_in_the_radio_section_on_the_homepage() {
        radioSectionPage.clickToggleBtn();
    }

    @And("Verify that go to radio section page")
    public void verifyThatGoToRadioSectionPage() {
        radioSectionPage.verifyGoToRadioButtonPage();
    }

    @When("Select any one")
    public void select_any_one() {
        radioSectionPage.clickAnyOneBtn();
        radioSectionPage.verifyAnyOneBtnIsSelected();
    }
    @When("Confirm you can select only one radio button")
    public void confirm_you_can_select_only_one_radio_button() {
        radioSectionPage.selectOnlyOneRadioButtonAndVerify();
    }
    @When("Find the bug")
    public void find_the_bug() {
        radioSectionPage.findTheBugBtn();
    }
    @When("Find which one is selected")
    public void find_which_one_is_selected() {
        radioSectionPage.whichOneIsSelected();
    }
    @And("Confirm last field is disabled")
    public void confirmLastFieldIsDisabled() {
        radioSectionPage.isDisabledBtn();
    }

    @When("Find if the checkbox is selected?")
    public void find_if_the_checkbox_is_selected() {
        radioSectionPage.checkboxIsSelected();
    }
    @When("Accept the T&C")
    public void accept_the_t_c() {
        radioSectionPage.clickAcceptTheT_C();
    }
    @Then("Verify that Something")
    public void verify_that_something() {

        radioSectionPage.verifyClickAcceptT_CBtn();
    }



}
