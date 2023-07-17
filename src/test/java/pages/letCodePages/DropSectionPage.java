package pages.letCodePages;

import org.junit.Assert;
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

    @FindBy(xpath = "//div/p[contains(text(),'Drop here')]")
    private WebElement dropHereText;

    @FindBy(xpath = "//div/p[contains(text(),'Dropped!')]")
    private WebElement droppedText;


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
    public void verifyDropHere(){
        waitFor(3);
        Assert.assertTrue(dropHereText.getText().contains("Drop here"));
        waitFor(3);
    }
    public void verifyThatDropped(){
        waitFor(3);
        Assert.assertTrue(droppedText.getText().contains("Dropped!"));
    }
}
