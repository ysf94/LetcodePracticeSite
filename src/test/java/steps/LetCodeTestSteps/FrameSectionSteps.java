package steps.LetCodeTestSteps;

import pages.letCodePages.FrameSectionPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static utilities.BrowserUtils.refreshPage;

public class FrameSectionSteps {

    FrameSectionPage frameSectionPage = new FrameSectionPage();

    @When("Click to Inner HTML button in the Frame Section on the homepage")
    public void click_to_inner_html_button_in_the_frame_section_on_the_homepage() {
        frameSectionPage.clickInnerHTMLBtn();
    }

    @When("Type to First Name Box")
    public void type_to_first_name_box() {
        frameSectionPage.typeFirstName();
    }

    @When("Type to email box")
    public void type_to_email_box() {
        frameSectionPage.enterEmail();
    }
    @When("Type to Last Name Box")
    public void type_to_last_name_box() {
        frameSectionPage.typeLastName();
    }
    @Then("Refresh to page")
    public void refresh_the_page() {
        refreshPage();
    }

}
