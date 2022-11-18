package pages.letCodePages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import static utilities.BrowserUtils.*;
import static utilities.Driver.driver;

public class SelectSectionPage extends BasePage {

    @FindBy(xpath = "//a[text()='Drop-Down']")
    protected WebElement dropDown;

    @FindBy(css = "#fruits")
    protected WebElement selectFruitBtn;

    @FindBy(id = "superheros")
    protected WebElement mySuperHero;

//    @FindBy(xpath = "//select[@id='lang']")
//    protected WebElement selectLang;

    @FindBy(xpath = "//option[@value='py']")
    protected WebElement mySelectLang;

    @FindBy(id = "country")
    protected WebElement selectCountry;

    public void clickDrop_Down(){
        waitForClickability(dropDown,10).click();
        waitFor(5);
    }

    public void ClickSelectFruitBtn(){
        WebElement selectFruits = waitForClickability(selectFruitBtn,10);
        Select myFruits = new Select(selectFruits);
        myFruits.selectByVisibleText("Apple");
        waitFor(3);
    }

    public void clickMySelectHero(){
        Actions actions = new Actions(driver());
        WebElement antMan=driver().findElement(By.xpath("//option[@value='am']"));
        WebElement aquaMan=driver().findElement(By.xpath("//option[@value='ta']"));
        Select select = new Select(mySuperHero);
        select.selectByValue(antMan.getAttribute("value"));
        select.selectByValue(aquaMan.getAttribute("value"));


    }

    public void clickSelectLang(){
        waitFor(5);
       // waitForClickability(selectLang,10).click();
        waitForClickability(mySelectLang,10).click();
        waitFor(5);
    }

    public void selectedCountry(){
        Select country = new Select(selectCountry);
        country.selectByValue("India");
        Assert.assertTrue(country.getFirstSelectedOption().getText().contains("India"));
    }


}
