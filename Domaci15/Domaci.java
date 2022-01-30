package domaci.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Domaci {

    WebDriver driver;
    JavascriptExecutor js;

    @FindBy(xpath = "//input[@id='userName']")
    WebElement fullName;
    @FindBy(xpath = "//input[@id='userEmail']")
    WebElement mail;
    @FindBy(xpath = "//textarea[@id='currentAddress']")
    WebElement currentAdd;
    @FindBy(xpath = "//textarea[@id='permanentAddress']")
    WebElement permanentAdd;
    @FindBy(xpath = "//button[@id='submit']")
    WebElement submit;

    public Domaci(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public void unesiPodatke(String name, String email, String current, String permanent){
        fullName.sendKeys(name);
        mail.sendKeys(email);
        currentAdd.sendKeys(current);
        permanentAdd.sendKeys(permanent);
        clickOnSubmit();
    }

    public void clickOnSubmit(){
        js = (JavascriptExecutor) driver;
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",submit);
    }
}