import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.CompareDresses;


import java.time.Duration;

public class TestCompareDresses {

    private WebDriver driver;
    private CompareDresses compareDresses;

    @BeforeClass
    public void initialize() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        compareDresses = new CompareDresses(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @AfterClass
    public void closeWebDriver() {
        driver.manage().deleteAllCookies();
        driver.close();
    }

    /**
     * This test compares different features for 2 dresses, when added to compare section
     * Test steps:
     * 1. Navigate to http://automationpractice.com/index.php?id_category=11&controller=category
     * 2. Assert the current URL equals to http://automationpractice.com/index.php?id_category=11&controller=category
     * 3. Add dresses to compare, by sending parameter/s "first" or "second"
     * 4. Click on compare button
     * 5. Assert that dress 1 name equals to dress 2 name
     * 6. Assert that dress 1 price is different than dress 2 price
     *
     */
    @Test
    public void testCompareDresses() throws InterruptedException {

        driver.navigate().to("http://automationpractice.com/index.php?id_category=11&controller=category");
        driver.manage().window().maximize();
        Assert.assertEquals(driver.getCurrentUrl(),"http://automationpractice.com/index.php?id_category=11&controller=category",
        "The current URL should be equal to http://automationpractice.com/index.php?id_category=11&controller=category");

        compareDresses.addDressToCompare("first");
        Thread.sleep(5000);
        compareDresses.addDressToCompare("second");
        compareDresses.clickOnCompareButton();

        String dress1Name = compareDresses.getDress1Name();
        String dress2Name = compareDresses.getDress2Name();
        Assert.assertTrue(dress1Name.equals(dress2Name),
                "Dress 1 and dress 2 both have the same name \"Summer dress\"");

        String price1 = compareDresses.getPrice1();
        String price2 = compareDresses.getPrice2();
        Assert.assertNotEquals(price2, price1, "Price of the first and second dress should be different.");


    }
}
