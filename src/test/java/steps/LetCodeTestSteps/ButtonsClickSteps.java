package steps.LetCodeTestSteps;

import pages.letCodePages.ButtonsClickPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ButtonsClickSteps {

    ButtonsClickPage buttonsClickPage = new ButtonsClickPage();

    @When("Click the Click button in the Button Section on the home page")
    public void click_the_click_button_in_the_button_section_on_the_home_page() {
        buttonsClickPage.clickButtonHomepage();
    }

    @When("Click the Go to Home button")
    public void click_the_go_to_home_button() {
        buttonsClickPage.clickGotoHomepageBtn();
    }

    @When("Come back using driver command")
    public void come_back_using_driver_command() {
        buttonsClickPage.clickFindLocationBtn();
    }

    @When("Get the X & Y co-ordinates")
    public void get_the_x_y_co_ordinates() {
        buttonsClickPage.clickFindLocationBtn();
    }

    @When("Find the color of the button")
    public void find_the_color_of_the_button() {
        buttonsClickPage.clickButtonColor();
    }

    @When("Find the height & width of the button")
    public void find_the_height_width_of_the_button() {
        buttonsClickPage.heightAndWidthBtn();
    }

    @When("Confirm button is disabled")
    public void confirm_button_is_disabled() {
        buttonsClickPage.verifyDisableBtn();
    }

    @Then("Click and Hold Button")
    public void click_and_hold_button() {
        buttonsClickPage.clickButtonHold();
    }
}
