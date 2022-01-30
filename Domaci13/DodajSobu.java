package domaci.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DodajSobu {

    private WebDriver driver;
    private JavascriptExecutor js;

    @FindBy(id = "smestaj")
    WebElement dodajSobuZaApartmanDropdown;

    @FindBy(id = "tip")
    WebElement tipSobe;

    @FindBy(id = "kvadratura")
    WebElement kvadraturaSobe;

    @FindBy(xpath = "/html/body/app-root/div/div/div[1]/form-dodaj-sobu/form/div[4]/button")
    WebElement submitButton;

    @FindBy(xpath = "/html/body/app-root/div/div/div[2]/lista-smestaja-component/div/smestaj-component[2]/div/div/ul/li[3]")
    WebElement dodataSoba;


    public DodajSobu(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void izaberiApartman(String value){
        Select select = new Select(dodajSobuZaApartmanDropdown);
        select.selectByValue(value);
    }

    public void unesiTipSobe(String tip){
        tipSobe.sendKeys(tip);
    }

    public void unesiKvadraturu(String negativnaVrednost){
        kvadraturaSobe.sendKeys(negativnaVrednost);
    }

    public void clickOnSubmitButton(){
        js = (JavascriptExecutor) driver;
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",submitButton);
    }

    public boolean proveriDaLiSobaPostojiUApartmanu(){
        if (dodataSoba.isDisplayed()) return true;
        else return false;
    }

}
