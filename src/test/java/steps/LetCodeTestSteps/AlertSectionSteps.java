package steps.LetCodeTestSteps;

import pages.letCodePages.AlertSectionPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AlertSectionSteps {

    AlertSectionPage alertSectionPage = new AlertSectionPage();
    @When("Click to Dialog button  in the Alert Section on the homepage")
    public void click_to_dialog_button_in_the_alert_section_on_the_homepage() {
        alertSectionPage.clickDialogBtn();
    }
    @When("Click to Simple Alert")
    public void click_to_simple_alert() {
        alertSectionPage.clickSimpleAlertBtn();
    }
    @When("Then Click OK! for close the alert box")
    public void then_click_ok_for_close_the_alert_box() {
        alertSectionPage.clickToCloseAlertBox();
    }
    @When("Click to Confirm Alert button")
    public void click_to_confirm_alert_button() {
        alertSectionPage.clickConfirmBtn();
    }
    @When("Click to prompt Alert button")
    public void click_to_prompt_alert_button() {
        alertSectionPage.clickPromptAlertBtn();
    }
    @When("Type your name and accept")
    public void type_your_name_and_accept() {
        alertSectionPage.typeToInputAlertBox();
    }
    @When("Click Sweet Alert Button")
    public void click_sweet_alert_button() {
        alertSectionPage.clickSweetAlertBtn();
    }
    @Then("Verify the text in the sweet box")
    public void verify_the_text_in_the_sweet_box() {
        alertSectionPage.verifyAndCloseModernAlert();
    }

}
