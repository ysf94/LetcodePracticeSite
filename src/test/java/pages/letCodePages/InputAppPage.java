package pages.letCodePages;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import static utilities.BrowserUtils.*;
import static utilities.Driver.driver;
import static org.junit.Assert.assertTrue;

public class InputAppPage extends BasePage {


    Actions actions = new Actions(driver());

    @FindBy(xpath = "//a[contains(text(),'Edit')]")
    private WebElement editBtn;

    @FindBy(xpath = "//div[@class='hero-body']//h1")
    private WebElement inputPageInTitle;

    @FindBy(xpath = "//input[@id='fullName']")
    private WebElement inputFullName;

    @FindBy(xpath = "//input[@id='join']")
    private WebElement appendAText;

    @FindBy(xpath = "//input[@id='getMe']")
    private WebElement scopeOfTheText;

    @FindBy(xpath = "//input[@id='clearMe']")
    private WebElement clearTheText;

    @FindBy(xpath = "//input[@id='noEdit']")
    private WebElement editingIsDisabled;

    @FindBy(xpath = "//input[@id='dontwrite']")
    public WebElement isReadonly;

    public void verifyInputPage(){
        assertTrue(inputPageInTitle.isDisplayed());
    }

    public void typeInputFullName(String fullName){
        inputFullName.sendKeys(fullName);
    }
    public void clickEditBtn(){
        waitForClickability(editBtn,10).click();
    }
    public void verifyEditBtnDisplayed(){
        waitFor(10);
        assertTrue(editBtn.isDisplayed());
        editBtn.sendKeys(Keys.TAB);
        waitFor(3);
    }

    public void clickTabAppendAText(){
        waitFor(3);
        String actualValueText = appendAText.getAttribute("value");
        System.out.println(actualValueText);
        String expectedValueText = "I am good";
        waitFor(5);
        Assert.assertEquals(actualValueText,expectedValueText);
        waitFor(5);
        appendAText.sendKeys(Keys.TAB);
    }

    public void VerifyScopeOfTheText(){
        waitFor(3);
        String actualText = scopeOfTheText.getAttribute("value");
        String expectedText = "ortonikc";

        Assert.assertEquals(actualText,expectedText);
    }

    public void clearTheText(){
        clearTheText.clear();
        Assert.assertTrue(clearTheText.getText().isEmpty());
        waitFor(5);
    }

    public void verifyEditingIsEnabled(){
        Assert.assertFalse(editingIsDisabled.isEnabled());
    }

    public void verifyIsReadonly(){
        Assert.assertTrue(isReadonly.isEnabled());
    }










}
