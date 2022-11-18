package pages.letCodePages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.BrowserUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static utilities.BrowserUtils.*;
import static utilities.Driver.*;


public class WindowSectionPage extends BasePage{

    @FindBy(xpath = "//div[@class = 'card']//a[@href='/windows']")
    private WebElement tabsBtn;

    @FindBy(xpath = "//button[@id='home']")
    private WebElement openGoToHomepageBtn;

    @FindBy(xpath = "//button[@id='multi']")
    private WebElement multipleWindowsBtn;


    public void clickTabsBtn(){
        waitForPageToLoad(10);
        scrollToElement(tabsBtn);
        clickWithJS(tabsBtn);
    }

    public void verifyWindowsPageTitle(){
        waitForPageToLoad(10);
        Assert.assertTrue(driver().getTitle().contains("Window"));
        waitFor(2);
    }
    public void clickOpenGoToHomepageBtn(){
       waitForClickability(openGoToHomepageBtn,10).click();

    }
    public void openNewTab(){
        String currentHandle = driver().getWindowHandle();
        Set<String> handles = driver().getWindowHandles();
        System.out.println("handles = " + handles);
        System.out.println("handle = " + currentHandle);

        for (String actual: handles){
            if (!actual.equalsIgnoreCase(currentHandle)){
                driver().switchTo().window(actual);
                waitFor(5);
            }
        }
    }
    public void currentPageTitle(){
        String currentPageTitle = driver().getTitle();

        System.out.println("currentPageTitle = " + currentPageTitle);
    }

    public void closeParentWindow(){
        String originalWindow = driver().getWindowHandle();
        Set<String> handles = driver().getWindowHandles();
        driver().getWindowHandles().add("");
        String currentHandle = driver().getWindowHandle();
        System.out.println("currentHandle = " + currentHandle);
        for (String handle : handles ){
            if (!handle.equalsIgnoreCase(currentHandle)){
               driver().switchTo().window(handle).close();
               driver().switchTo().window(originalWindow);
               clickTabsBtn();
               break;
            }
        }
    }

    public void closeChildWindow(){
        System.out.println("child tab i kapattim :-)");
        waitFor(5);
    }

    public void clickMultipleWindowBtn(){
        waitForClickability(multipleWindowsBtn, 15).click();
        waitFor(5);
    }
    List<String> allTitles = new ArrayList<>();

    public void getAllWindowTitles(){

        Set<String>  allHandles = driver().getWindowHandles();
        for (String handle : allHandles ){
            allTitles.add(driver().switchTo().window(handle).getTitle());
            waitFor(2);
        }
        for (String title : allTitles)
            System.out.println(title);

    }






}
