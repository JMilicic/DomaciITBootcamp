package domaci.tests;

import domaci.pages.DodajSobu;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestDodajSobu {

    private WebDriver driver;
    private DodajSobu dodajSobu;

    @BeforeClass
    public void initialize() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        dodajSobu = new DodajSobu(driver);
    }

    @AfterClass
    public void closeWebDriver() {
        driver.manage().deleteAllCookies();
        driver.close();
    }

    /**
     * This test verifies if negative values are accepted, when adding a room to an apartment
     * Test steps:
     * 1. Navigate to https://it-255-dz-06-andjela-bojic3972.vercel.app/
     * 2. Assert that current URL is equal to https://it-255-dz-06-andjela-bojic3972.vercel.app/
     * 3. Scroll to “dodaj sobu za apartman” and select “Apartman 2 lux” from the dropdown menu
     * 4. Input “spavaca” in tip sobe field
     * 5. Input "-14" in kvadratura sobe field
     * 6. Click on submit button
     * 7. Assert that the room you were trying to add doesn't appear in "Apartman 2 lux"
     */

    @Test
    public void testDodajSobuSaNegativnimVrednostima() {

        String pageUrl = "https://it-255-dz-06-andjela-bojic3972.vercel.app/";
        driver.navigate().to(pageUrl);
        driver.manage().window().maximize();

        Assert.assertEquals(driver.getCurrentUrl(), pageUrl,
                "The current URL should be equal to" + pageUrl);

        dodajSobu.izaberiApartman("Apartman 2 lux");
        dodajSobu.unesiTipSobe("spavaca");
        dodajSobu.unesiKvadraturu("-14");
        dodajSobu.clickOnSubmitButton();

        boolean proveraDaLiSobaPostoji = dodajSobu.proveriDaLiSobaPostojiUApartmanu();

        Assert.assertNotEquals(proveraDaLiSobaPostoji, true);

    }
}
