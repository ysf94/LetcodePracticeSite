package steps.LetCodeTestSteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.letCodePages.DragSectionPage;

public class DragSectionSteps {

    DragSectionPage dragPage = new DragSectionPage();

    @When("Click Auı Button in the Drag Section on the homepage")
    public void click_auı_button_in_the_drag_section_on_the_homepage() {
        dragPage.clickAUIBtn();
    }

    @And("Drag the Drag box")
    public void dragTheDragBox() {
        dragPage.dragToDown();
    }


}
