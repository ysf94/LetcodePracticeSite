package steps.LetCodeTestSteps;

import pages.letCodePages.*;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static utilities.BrowserUtils.*;

public class InputAppSteps extends BasePage {
    InputAppPage inputAppPage = new InputAppPage();

    @Given("Login to LetCode test homepage")
    public void login_to_let_code_test_homepage() {
        goToUrl("https://letcode.in/test");
    }

    @When("Click Edit button on Input Section on the homepage")
    public void click_edit_button_on_input_section_on_the_homepage() {
        inputAppPage.clickEditBtn();
    }

    @Then("Verify that login to Input page")
    public void verify_that_login_to_input_page() {
        inputAppPage.verifyInputPage();

    }

}
