package steps.LetCodeTestSteps;

import pages.letCodePages.WindowSectionPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WindowSectionSteps {
    WindowSectionPage windowSectionPage = new WindowSectionPage();

    @When("Click the Tabs Button in the Window Section on the homepage")
    public void click_the_tabs_button_in_the_window_section_on_the_homepage() {
        windowSectionPage.clickTabsBtn();
        windowSectionPage.verifyWindowsPageTitle();
    }

    @When("Click on the home button")
    public void click_on_the_home_button() {
        windowSectionPage.clickOpenGoToHomepageBtn();
    }

    @When("Goto the newly opened tab")
    public void goto_the_newly_opened_tab() {
        windowSectionPage.openNewTab();
    }

    @When("Print the title of the page")
    public void print_the_title_of_the_page() {
        windowSectionPage.currentPageTitle();
    }

    @When("Close the parent window")
    public void close_the_parent_window() {
        windowSectionPage.closeParentWindow();
    }

    @When("Close the child window")
    public void close_the_child_window() {
        windowSectionPage.closeChildWindow();
    }

    @When("Click on the Multiple windows button")
    public void click_on_the_multiple_windows_button() {
        windowSectionPage.clickMultipleWindowBtn();
    }

    @When("Print all the window title")
    public void print_all_the_window_title() {
        windowSectionPage.getAllWindowTitles();
    }

    @Then("Close all the windows")
    public void close_all_the_windows() {
    }
}
