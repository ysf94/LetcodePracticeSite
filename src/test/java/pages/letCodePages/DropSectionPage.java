package pages.letCodePages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import static utilities.BrowserUtils.waitFor;
import static utilities.BrowserUtils.waitForClickability;
import static utilities.Driver.driver;

public class DropSectionPage extends BasePage {

    @FindBy(xpath = "//a[contains(text(),'AUI - 2')]")
    private WebElement dropSectionAUI2Btn;

    @FindBy(xpath = "//div[@id=\"draggable\"]")
    private WebElement sourceBox;

    @FindBy(xpath = "//div[@id=\"droppable\"]")
    private WebElement targetBox;


    public void clickAUI2Btn() {
        waitForClickability(dropSectionAUI2Btn, 10).click();
        waitFor(5);
    }

    public void dragAndDropSourceBox(){
        waitFor(3);
        Actions act = new Actions(driver());
        act.dragAndDrop(sourceBox,targetBox).perform();
        waitFor(3);
    }
}
