package busqueda;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BusquedaFeatureSteps {
    WebDriver driver = new ChromeDriver();

    @Given("Accedo a la pag {string}")
    public void accedoALaPag(String url) {
        //  File f = new File("repositorioGit/BIOS/chromedriver.exe");
        System.getProperty("webdriver.chrome.driver", "C:\\Users\\fgarcia\\repositorioGit\\BIOSCucumberTest");
        driver.get(url);
    }

    @After
    public void closetBrowser() {
        driver.close();
    }

    @Test
    public void accessBrowser() throws InterruptedException {
        Assert.assertEquals("No existe la etiqueta en la pag", "SALE 70% OFF ALL PRODUCTS", driver.findElement(By.id("")).getText());
    }

    @Given("Selecciono barra de busqueda")
    public void selectSearch() throws InterruptedException {
        String search = driver.findElement(By.id("search_query_top")).getAccessibleName();
        Assert.assertEquals("No cargo correctamente la pag", "Search", search);
    }

    @When("Escribo nombre del produto {string}")
    public void escriboNombreDelProduto(String product) {
        driver.findElement(By.id("search_query_top")).sendKeys(product);
        driver.findElement(By.name("submit_search")).click();
    }

    @Then("Valido que aparezca {int} elemento encontrado")
    public void validoQueAparezcaElementoEncontrado(int quantity) {
        String resulBusqueda = driver.findElement(By.id("")).getAccessibleName();
        Assert.assertEquals("No se encontro elemento", resulBusqueda,quantity);
    }

    @Then("Valido que aparezca el nombre {string} en la pag")
    public void validoQueAparezcaElNombre(String result) {
        String resulBusqueda = driver.findElement(By.xpath("//div[@id='center_column']/h1/span")).getText().replace("\"", "");
        Assert.assertEquals("No se encontro elemento", resulBusqueda,result);
    }
}
