package PruebasFeaturesSteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
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
    public void cerrarBrowser() {
        drvChrome.close();
    }

    @Given("accedo a la pagina http:\\/\\/automationpractice.com")
    public void accedoALaPaginaHttpAutomationpracticeCom() {
    }

    @And("Me  logueo con el usuario {string} y el password {string}")
    public void meLogueoConElUsuarioYElPassword(String arg0, String arg1) {
    }

    @Given("Selecciono barra de busqueda")
    public void seleccionoBarraDeBusqueda() {
    }

    @When("Escribo nombre del producto {string}")
    public void escriboNombreDelProducto(String arg0) {
    }

    @And("Valido que aparezca el nombre {string} en la pagina")
    public void validoQueAparezcaElNombreEnLaPagina(String arg0) {
    }

    @And("Doy click en el boton {string}")
    public void doyClickEnElBoton(String arg0) {
    }

    @And("Selecciono el primer articulo y doy click en el boton {string}")
    public void seleccionoElPrimerArticuloYDoyClickEnElBoton(String arg0) {
    }

    @And("Selecciono el segundo articulo y doy click en el boton {string}")
    public void seleccionoElSegundoArticuloYDoyClickEnElBoton(String arg0) {
    }

    @And("accedo a la pagina de comparacion y verifico que esten en los articulos")
    public void accedoALaPaginaDeComparacionYVerificoQueEstenEnLosArticulos() {
    }

    @Given("Accedo a la pagina {string}")
    public void accedoALaPagina(String arg0) {
    }

    @And("En el campo {string} selecciono la opcion {string}")
    public void enElCampoSeleccionoLaOpcion(String arg0, String arg1) {
    }

    @And("En el campo {string} escribo {string}")
    public void enElCampoEscribo(String arg0, String arg1) {
    }

    @Then("Presiono el boton {string}")
    public void presionoElBoton(String arg0) {
    }

    @And("Verifico que el mensaje sea enviado")
    public void verificoQueElMensajeSeaEnviado() {
    }
}

