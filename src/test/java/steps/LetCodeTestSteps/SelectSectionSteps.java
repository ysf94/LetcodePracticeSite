package steps.LetCodeTestSteps;

import pages.letCodePages.SelectSectionPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static utilities.BrowserUtils.*;

public class SelectSectionSteps {
    SelectSectionPage selectSectionPage = new SelectSectionPage();

    @When("Click the Drop-Down button in the Select Section on the home page")
    public void click_the_drop_down_button_in_the_select_section_on_the_home_page() {
        selectSectionPage.clickDrop_Down();
        waitFor(3);
    }

    @When("Select the apple using visible text")
    public void select_the_apple_using_visible_text() {
        selectSectionPage.ClickSelectFruitBtn();
        waitFor(3);
    }

    @When("Select your super hero's")
    public void select_your_super_hero_s() {
        selectSectionPage.clickMySelectHero();
        waitFor(3);
    }

    @When("Select the last programming language and print all the options")
    public void select_the_last_programming_language_and_print_all_the_options() {
        selectSectionPage.clickSelectLang();
        waitFor(3);
    }

    @Then("Select India using value & print the selected value")
    public void select_india_using_value_print_the_selected_value() {
        selectSectionPage.selectedCountry();
        waitFor(3);
    }
}
