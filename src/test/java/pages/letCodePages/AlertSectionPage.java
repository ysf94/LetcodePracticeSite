package pages.letCodePages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static utilities.BrowserUtils.*;
import static utilities.Driver.driver;

public class AlertSectionPage extends BasePage{

    public AlertSectionPage(){
        PageFactory.initElements(driver(),this);
    }

    @FindBy(linkText = "Dialog")
    private WebElement alertDialogBtn;

    @FindBy(xpath = "//button[@class='button is-link']")
    private WebElement simpleAlertBtn;

    @FindBy(xpath = "//button[@class='button is-link is-outlined']")
    private WebElement confirmAlertBtn;

    @FindBy(xpath = "//button[@class='button is-primary']")
    private WebElement promptAlertBtn;

    @FindBy(xpath = "//button[@class='button is-success']")
    private WebElement modernAlertBtn;

    @FindBy(xpath = "//button[@class='modal-close is-large']")
    private WebElement closeModernAlert;

    public void clickDialogBtn(){
        waitForClickability(alertDialogBtn,10).click();
        waitFor(3);
    }

    public void clickSimpleAlertBtn(){
        waitForClickability(simpleAlertBtn,10).click();
        waitFor(5);
    }
    public void clickToCloseAlertBox(){
        driver().switchTo().alert().accept();
        waitFor(3);
    }

    public void clickConfirmBtn(){
        waitForClickability(confirmAlertBtn,10).click();
        waitFor(5);
        driver().switchTo().alert().dismiss();
        waitFor(3);
    }

    public void clickPromptAlertBtn(){
        waitForClickability(promptAlertBtn,10).click();
        waitFor(5);
    }
    public void typeToInputAlertBox(){
        driver().switchTo().alert().sendKeys("Ali Veli");
        waitFor(2);
        driver().switchTo().alert().accept();
        waitFor(3);
    }

    public void clickSweetAlertBtn(){
        waitForClickability(modernAlertBtn,10).click();
        waitFor(3);
    }
    public void verifyAndCloseModernAlert(){
        String actualSweetText = driver().findElement(By.xpath("//p[@class='title']")).getText();
        String expectedSweetText = "Modern Alert";
        waitFor(3);
        Assert.assertTrue(actualSweetText.contains(expectedSweetText));
        waitFor(3);
        waitForClickability(closeModernAlert,10).click();
        waitFor(2);
    }
}
