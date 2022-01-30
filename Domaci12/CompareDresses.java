package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CompareDresses {

    WebDriver driver;

    @FindBy(xpath = "//img[contains(@src,'automationpractice.com/img/p/1/2/12-home_default.jpg')]")
    WebElement mouseHover1;

    @FindBy(xpath = "//img[contains(@src,'automationpractice.com/img/p/1/6/16-home_default.jpg')]")
    WebElement mouseHover2;

    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[3]/div[2]")
    WebElement addToCompareDress1;

    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[2]/div[1]/div[3]/div[2]/a[1]")
    WebElement addToCompareDress2;

    @FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/div[3]/div[1]/form[1]/button[1]/span[1]")
    WebElement compareButton;

    @FindBy(xpath = "//tbody/tr[1]/td[2]/h5[1]/a[1]")
    WebElement dress1name;

    @FindBy(xpath = "//tbody/tr[1]/td[3]/h5[1]/a[1]")
    WebElement dress2name;

    @FindBy(xpath = "//span[contains(text(),'$28.98')]")
    WebElement price1;

    @FindBy(xpath = "//span[contains(text(),'$30.50')]")
    WebElement price2;


    public CompareDresses(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    /**
     * This method adds dress to compare
     *
     * @param dress - choose "first" or "second" dress
     */
    public void addDressToCompare(String dress) {
        Actions actions = new Actions(driver);
        if (dress.equalsIgnoreCase("first")) {
            actions.moveToElement(mouseHover1).build().perform();
            addToCompareDress1.click();
        }
        if (dress.equalsIgnoreCase("second")) {
            actions.moveToElement(mouseHover2).build().perform();
            addToCompareDress2.click();
        }
    }

    public void clickOnCompareButton() {
        compareButton.click();
    }

    public String getDress1Name() {
        return dress1name.getText();
    }

    public String getDress2Name() {
        return dress2name.getText();
    }

    public String getPrice1() {
        return price1.getText();
    }

    public String getPrice2() {
        return price2.getText();
    }
}
