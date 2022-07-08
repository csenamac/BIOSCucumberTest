package PruebasFeaturesSteps;

import io.cucumber.java.en.Given;
import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ComprasFeatureSteps {
    WebDriver drvChrome = new ChromeDriver();

    @Given("accedo a la pagina {string}")
    public void accedoALaPaginaString(String url) {
        System.getProperty("webdriver.chrome.driver", "C:\\GitHub\\BIOSCucumberTest");
        drvChrome.get(url);
        Assert.assertTrue(true);
    }

    @After
    public void closetBrowser() {
        drvChrome.close();
    }
}

