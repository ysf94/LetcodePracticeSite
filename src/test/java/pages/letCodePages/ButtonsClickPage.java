package pages.letCodePages;

import org.junit.Assert;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import static utilities.BrowserUtils.waitFor;
import static utilities.BrowserUtils.waitForClickability;
import static utilities.Driver.driver;

public class ButtonsClickPage extends BasePage{

    @FindBy(xpath = "//a[contains(text(),'Click')]//..")
    private WebElement clickButtonPage;

    @FindBy(xpath = "//button[contains(text(),'Goto Home')]")
    private WebElement gotoHomeBtn;

    @FindBy(xpath = "//button[contains(text(),'Find Location')]")
    private WebElement findLocationBtn;

    @FindBy(xpath = "//button[contains(text(),'What is my color?')]")
    private WebElement buttonColor;

    @FindBy(xpath = "//button[contains(text(),'How tall & fat I am?')]")
    private WebElement heightAndWidthBtn;

    @FindBy(xpath = "//button[contains(text(),'Disabled')]")
    private WebElement disableBtn;

    @FindBy(xpath = "//button[@id='isDisabled']//h2" )
    private WebElement buttonHold;


    public void clickButtonHomepage(){
        waitForClickability(clickButtonPage,20).click();
        waitFor(5);
    }

    public void clickGotoHomepageBtn(){
        waitForClickability(gotoHomeBtn,10).click();
        driver().navigate().back();
        waitFor(5);
    }

    public void clickFindLocationBtn(){
        Point point = waitForClickability(findLocationBtn,10).getLocation();
        int x = point.getX();
        int y = point.y;
        System.out.println("x: " + x +"\ny: " + y);
    }

    public void clickButtonColor(){
        String color = buttonColor.getCssValue("background-color");
        System.out.println(color);
    }

    public void heightAndWidthBtn(){
        int h = heightAndWidthBtn.getSize().height;
        int w = heightAndWidthBtn.getSize().width;

        System.out.println("height: " + h + "\nWidth: "+ w );
    }

    public void verifyDisableBtn(){
        boolean isDisable = disableBtn.isEnabled();
        waitFor(5);
        Assert.assertFalse(isDisable);
    }
    public void clickButtonHold(){
        Actions actions = new Actions(driver());
        actions.clickAndHold(buttonHold).perform();
        Assert.assertTrue(buttonHold.isEnabled());
    }

}
