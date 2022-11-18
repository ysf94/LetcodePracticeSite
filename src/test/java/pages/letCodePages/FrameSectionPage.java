package pages.letCodePages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static utilities.BrowserUtils.*;
import static utilities.Driver.driver;

public class FrameSectionPage extends BasePage{

    public FrameSectionPage(){
        PageFactory.initElements(driver(),this);
    }

    @FindBy(xpath = "//a[@href='/frame']")
    private WebElement innerHTMLBtn;

    @FindBy(name =  "fname")
    private WebElement firstName;

    @FindBy(xpath = "//input[@name='lname']")
    private WebElement lastName;

    @FindBy(name = "email")
    private WebElement inputEmail;

    @FindBy(css = "#firstFr")
    private WebElement namesIframe;

    @FindBy(css = "[src='innerFrame']")
    private WebElement emailIframe;


    public void clickInnerHTMLBtn(){
        waitForClickability(innerHTMLBtn,10).click();
    }
    public void typeFirstName(){
        driver().switchTo().defaultContent();
        driver().switchTo().frame(namesIframe);
        waitForClickability(firstName,10).sendKeys("Yusuf");
        driver().switchTo().defaultContent();
    }

    public void enterEmail(){
        driver().switchTo().defaultContent();
        driver().switchTo().frame(namesIframe);
        driver().switchTo().frame(emailIframe);
        waitForClickability(inputEmail,10).sendKeys("yy@gmil.com");
        driver().switchTo().defaultContent();
    }

    public void typeLastName(){
        driver().switchTo().defaultContent();
        driver().switchTo().frame(namesIframe);
        waitForClickability(lastName,10).sendKeys("YY");
        driver().switchTo().defaultContent();
    }


}
