package pages.letCodePages;

import com.github.javafaker.Faker;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Random;

import static utilities.BrowserUtils.*;


public class RadioSectionPage extends BasePage {

//    public RadioSectionPage() {
//        PageFactory.initElements(driver(), this);
//    }

    @FindBy(xpath = "//a[text()='Toggle']")
    private WebElement toggleBtn;

    @FindBy(xpath = "//div[@class='container']//h1")
    private WebElement radioPageH1Title;

    @FindBy(css = "input[id='yes']")
    private WebElement anyOneYes;

    @FindBy(css = "input[id='no']")
    private WebElement anyOneNo;

    @FindBy(css = "input[id='one']")
    private WebElement confirmSelectYes;

    @FindBy(css = "input[id='two']")
    private WebElement confirmSelectNo;

    @FindBy(css = "input[id='nobug']")
    private WebElement findTheBugYes;

    @FindBy(css = "input[id='two']")
    private WebElement findTheBugNo;

    @FindBy(css = "input[id='notfoo']")
    private WebElement findSelectBar;

    @FindBy(css = "input[id='foo']")
    private WebElement findSelectFoo;

    @FindBy(css = "input[id='going']")
    private WebElement lastFieldIsDisabledGoing;

    @FindBy(css = "input[id='notG']")
    private WebElement lastFieldIsDisabledNotGoing;

    @FindBy(css = "input[id='maybe']")
    private WebElement lastFieldIsDisabledMaybe;

    @FindBy(xpath = "//label[contains(text(),' Remember me')]//input")
    private WebElement rememberMe;

    @FindBy(xpath = "//label[text()='Accept the T&C']/following-sibling::label//input")
    private WebElement acceptTheT_C;

    public void clickToggleBtn() {
        waitFor(5);
        waitForClickability(toggleBtn, 10).click();
    }

    public void verifyGoToRadioButtonPage() {
        waitFor(5);
        Assert.assertTrue(radioPageH1Title.getText().contains("Radio & Checkbox"));
    }

    public void clickAnyOneBtn() {
        waitFor(5);
        Random random = new Random();
        int randomNumber = random.nextInt(10);

        if (randomNumber <= 4) {
            waitForClickability(anyOneYes, 10).click();
        } else {
            waitForClickability(anyOneNo, 10).click();
        }
    }

    public void verifyAnyOneBtnIsSelected() {
        waitFor(5);
        if (anyOneYes.isSelected()) {
            Assert.assertTrue(anyOneYes.isSelected());
        } else if (anyOneNo.isSelected()) {
            Assert.assertFalse(anyOneYes.isSelected());
        }
    }

    public void selectOnlyOneRadioButtonAndVerify() {
        waitFor(5);
        Faker faker = new Faker();
        int randomFakerNumber = faker.random().nextInt(100);

        if (randomFakerNumber <= 49) {
            waitForClickability(confirmSelectYes, 10).click();
        } else {
            waitForClickability(confirmSelectNo, 10).click();
        }

        boolean yesBtnIsSelected = confirmSelectYes.isSelected() && !(confirmSelectNo.isSelected());
        boolean noBtnIsSelected = !(confirmSelectYes.isSelected()) && confirmSelectNo.isSelected();

        if (yesBtnIsSelected) {
            Assert.assertFalse(noBtnIsSelected);
        } else if (noBtnIsSelected) {
           Assert.assertFalse(yesBtnIsSelected);
        }
    }

    public void findTheBugBtn() {
        Faker faker = new Faker();
        Integer randomNumber = faker.random().nextInt(0,10);

        if (randomNumber <= 4) {
            waitForClickability(findTheBugYes, 10).click();
        } else if (randomNumber > 4) {
            waitForClickability(findTheBugNo,10).click();
        }
        waitFor(6);
        if (findTheBugYes.isSelected()){
            waitForClickability(findTheBugNo, 10).click();
        } else if (findTheBugNo.isSelected()) {
            waitFor(5);
            waitForClickability(findTheBugYes, 10).click();
        }

        waitFor(5);
        boolean thereIsBug = findTheBugYes.isSelected() && findTheBugNo.isSelected();

        try {
            Assert.assertTrue(thereIsBug);
            System.out.println("There is a Bug");
        } catch (Exception e) {
            System.out.println("There is not a bug");
        }
    }

    public void whichOneIsSelected() {
        waitFor(5);

        boolean barBtn = findSelectBar.isSelected();
        boolean fooBtn = findSelectFoo.isSelected();

        if (barBtn) {
            System.out.println("Bar btn is selected");
            Assert.assertFalse(fooBtn);
        } else if (fooBtn) {
            System.out.println("Foo btn is selected");
            Assert.assertFalse(barBtn);
        }
    }

    public void isDisabledBtn() {
        waitFor(5);

        boolean goingBtn = !(lastFieldIsDisabledGoing.isEnabled());
        boolean notGoingBtn = !(lastFieldIsDisabledNotGoing.isEnabled());
        boolean maybeBtn = !(lastFieldIsDisabledMaybe.isEnabled());
        if (goingBtn) {
            System.out.println("Going button is disabled");
        } else if (notGoingBtn) {
            System.out.println("Not going button is disabled");
        } else if (maybeBtn) {
            System.out.println("Maybe button is disabled");
        }
    }

    public void checkboxIsSelected() {
        waitFor(5);
        Assert.assertTrue(waitForClickability(rememberMe, 10).isSelected());
    }

    public void clickAcceptTheT_C() {
        waitForClickability(acceptTheT_C, 10).click();
    }
    public void verifyClickAcceptT_CBtn(){
        waitFor(5);
        Assert.assertTrue(acceptTheT_C.isSelected());
    }
}
