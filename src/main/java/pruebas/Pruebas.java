package pruebas;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Pruebas extends PruebasBase {

    @Given("accedo a la pagina {string}")
    public void accedoALaPaginaString(String url) {
        Assert.assertEquals(paginaInicio.getTituloPagina(), paginaInicio.getLocalizadorTituloPagina());
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

    @And("Accedo a la pagina de comparacion y verifico que esten en los articulos")
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

    @And("Accedo a la pagina de wishlist y verifico que esten en los articulos")
    public void accedoALaPaginaDeWishlistYVerificoQueEstenEnLosArticulos() {
    }


//    @And("Escribo la siguiente informacion en la pagina Contact us")
//    public void escriboLaSiguienteInformacionEnLaPaginaContactUs(OptionRequestData tabla) {
//        result = tabla.getSubjectHeading();
//        result = tabla.getMessage();
//        result = tabla.getSMailAddress();
//
//        for (int i = 0; i < result.length(); i++) {
//            if (drvChrome.findElement(By.xpath("")).getText().equals("-- Choose --")) {
//
//                switch (result) {
//                    case "subjectHeading":
//                        drvChrome.findElement(By.xpath("")).click();
//                        drvChrome.findElement(By.xpath("//p[contains(,'" + result + "')]")).click();
//                        break;
//                    case "eMailAddress":
//                        drvChrome.findElement(By.xpath("")).click();
//                        drvChrome.findElement(By.xpath("//p[contains(,'" + result + "')]")).sendKeys(result);
//                        break;
//                    case "message":
//                        drvChrome.findElement(By.xpath("")).click();
//                        drvChrome.findElement(By.xpath("//p[contains(,'" + result + "')]")).sendKeys(result);
//                        break;
//                }
//            }
//        }
//    }
}


