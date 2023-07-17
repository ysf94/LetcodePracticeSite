package pages.letCodePages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


import static utilities.BrowserUtils.*;
import static utilities.Driver.driver;

public class DragSectionPage extends BasePage{

    @FindBy(xpath = "//a[contains(text(),'AUI - 1')]")
    private WebElement dragSectionAUIBtn;

    public void clickAUIBtn(){
        waitForClickability(dragSectionAUIBtn, 10).click();
        waitFor(5);
    }

    public void dragToDown(){
        waitFor(3);
        WebElement draggableBox = driver().findElement(By.xpath("//div[@id='sample-box']/h3"));
        Actions act = new Actions(driver());
        int x = draggableBox.getLocation().getX();
        int y = draggableBox.getLocation().getY();
        act.dragAndDropBy(draggableBox,x+30,y+45).perform();
        waitFor(3);
        //clickAndHold().dragAndDropBy(draggableBox,200,178).build()
    }


}
