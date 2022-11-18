package pages.letCodePages;

import org.openqa.selenium.support.PageFactory;

import static utilities.Driver.driver;

public abstract class BasePage {

    public BasePage(){
        PageFactory.initElements(driver(),this);
    }


}
