package domaci.tests;

import domaci.pages.Domaci;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestirajDomaci {

    private WebDriver driver;

    @BeforeClass
    public void initialize() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }

    @AfterClass
    public void closeWebDriver() {
        driver.manage().deleteAllCookies();
        driver.close();
    }

    @DataProvider(name = "input")
    public Object[][] input(){
        return new Object[][]{
                {"first name","email@neki.com","adresa prva adresa","adresa 112"},
                {"second name","email@drugi.com","adresa druga","adresa 221"},
                {"third name","email@sksks.com","adresa treca","adresa 333"},
                {"fourth name", "mail@yahoo.co", "cetvrta adresa","adressa 444"}
        };
    }

    @Test (dataProvider = "input")
    public void unesiPodatke(String name, String email, String current, String permanent){
        driver.navigate().to("https://demoqa.com/text-box");
        Domaci input = new Domaci(driver);
        input.unesiPodatke(name,email,current,permanent);

        System.out.println("Checking if data input is correct");

        Assert.assertTrue(driver.getPageSource().contains(name));
        Assert.assertTrue(driver.getPageSource().contains(email));
        Assert.assertTrue(driver.getPageSource().contains(current));
        Assert.assertTrue(driver.getPageSource().contains(permanent));

        System.out.println("All the data input is correct");
    }
}
