package steps.LetCodeTestSteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.letCodePages.ElementsSectionPage;

public class ElementsSectionSteps {

    ElementsSectionPage elementsSectionPage = new ElementsSectionPage();

    @When("Click Find Elements Button in the Elements Section on the homepage")
    public void click_find_elements_button_in_the_elements_section_on_the_homepage() {
        elementsSectionPage.clickLoginElementsSectionBtn();
    }
    @When("Click username input box")
    public void click_username_input_box() {
        elementsSectionPage.clickUsernameBox();
    }
    @When("Type and Enter your Github username {string}")
    public void type_and_enter_your_github_username(String username) {
        elementsSectionPage.typeUsername(username);
    }
    @When("Click search button")
    public void click_search_button() {
        elementsSectionPage.clickSearchBtn();
    }
    @When("Verify that user has image")
    public void verify_that_user_has_image() {
        elementsSectionPage.verifyHasUserImage();
    }
    @When("Print the user name & other informations")
    public void print_the_user_name_other_informations() {
        elementsSectionPage.usernameAndInformation();
    }
    @Then("Verify that no.of public repositories are listed correctly")
    public void verify_that_no_of_public_repositories_are_listed_correctly() {
        elementsSectionPage.verifyThatPublicRepoIsListed();
    }

}
