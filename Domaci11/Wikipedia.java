package DomaciSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Wikipedia {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",
                "//Users//bojanjovanovic//Downloads//chromedriver");

        WebDriver wd = new ChromeDriver();

        wd.get("https://www.wikipedia.org/");
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Select languageButton = new Select(wd.findElement(By.id("searchLanguage")));
        languageButton.selectByVisibleText("Српски / Srpski");
        wd.findElement(By.id("searchInput")).sendKeys("Java");
        wd.findElement(By.xpath("//body/div[3]/form[1]/fieldset[1]/div[1]/div[2]/div[1]/a[2]/div[1]/h3[1]")).click();
        wd.findElement(By.id("firstHeading"));

        if (wd.findElement(By.id("firstHeading")).getText().equals("Java (програмски језик)")){
            System.out.println("Naslov na otvorenoj stranici je odgovarajuci!");
        } else {
            System.out.println("Naslov nije odgovarajuci.");
        }

    }
}
