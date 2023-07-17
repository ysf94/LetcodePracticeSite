package pages.letCodePages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.BrowserUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utilities.BrowserUtils.*;
import static utilities.Driver.driver;

public class ElementsSectionPage extends BasePage {

    @FindBy(xpath = "//div[@class='card']//a[contains(text(),'Find Elements')]")
    private WebElement loginElementsSectionBtn;

    @FindBy(xpath = "//input[@name='username']")
    private WebElement usernameBox;

    @FindBy(xpath = "//button[@id='search']")
    private WebElement searchBtn;

    @FindBy(xpath = "//img[@class='is-rounded']")
    private WebElement imgPlace;


    @FindBy(xpath = "//span[contains(text(),'Public Repos')]/following-sibling::span")
    private WebElement reposPiece;

    private List<WebElement> userOtherInformation() {
        List<WebElement> information = driver().findElements(By.xpath("//span[@class='tag is-primary is-light']"));
        return information;
    }

    private List<WebElement> userOtherInfoPiece() {
        List<WebElement> informationPiece = driver().findElements(By.xpath("//span[@class='tag is-info']"));
        return informationPiece;
    }

    private String firstRepoUsernameText() {
        List<WebElement> repoUsername = driver().findElements(By.xpath("//div[@class='content']//a"));
        String repoUsernameStr = "";
        if (repoUsername.size() != 0) {
            repoUsernameStr = repoUsername.get(0).getText();
        }
        int firstIndex = repoUsernameStr.indexOf("com/");//firstIndex + 4 <---com/ --> 4 characters
        int lastIndex = repoUsernameStr.lastIndexOf("/");
        String username = repoUsernameStr.substring(firstIndex + 4, lastIndex);
        return username;
    }

    private List<WebElement> displayedReposPieceList() {
        List<WebElement> reposList = driver().findElements(By.xpath("//div[@class='content']//a"));
        return reposList;
    }

    public void clickLoginElementsSectionBtn() {
        scrollToElement(loginElementsSectionBtn);
        waitFor(1);
        clickWithJS(waitForClickability(loginElementsSectionBtn, 10));
    }

    public void clickUsernameBox() {
        waitForClickability(usernameBox, 10).click();
    }

    public void typeUsername(String username) {
        usernameBox.sendKeys(username);
    }

    public void clickSearchBtn() {
        waitForClickability(searchBtn, 10).click();
    }

    public void verifyHasUserImage() {
        assertTrue(waitForClickability(imgPlace, 10).isDisplayed());
    }

    public void usernameAndInformation() {
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < userOtherInformation().size(); i++) {
            map.put(userOtherInformation().get(i).getText(), userOtherInfoPiece().get(i).getText());
        }
        System.out.println("Username= " + firstRepoUsernameText() + ",\n Information= " + map);
    }

    public void verifyThatPublicRepoIsListed (){
        int repoListNum = displayedReposPieceList().size();//30
        int viewRepoNum = Integer.parseInt(userOtherInfoPiece().get(0).getText().trim());
        System.out.println("viewRepoNum = " + viewRepoNum);
        if (viewRepoNum > 30){
            System.out.println("30 pieces repo is displaying and "+ (viewRepoNum-repoListNum) + " pieces repo is not displayed");
            assertTrue(viewRepoNum>30);
        }else {
            assertEquals(repoListNum, viewRepoNum);
        }
    }


}
